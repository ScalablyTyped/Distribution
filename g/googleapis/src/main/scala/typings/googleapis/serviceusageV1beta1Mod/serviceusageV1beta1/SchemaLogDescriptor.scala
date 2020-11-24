package typings.googleapis.serviceusageV1beta1Mod.serviceusageV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A description of a log type. Example in YAML format:      - name:
  * library.googleapis.com/activity_history       description: The history of
  * borrowing and returning library items.       display_name: Activity labels:
  * - key: /customer_id         description: Identifier of a library customer
  */
@js.native
trait SchemaLogDescriptor extends js.Object {
  
  /**
    * A human-readable description of this log. This information appears in the
    * documentation and can contain details.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The human-readable name for this log. This information appears on the
    * user interface and should be concise.
    */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * The set of labels that are available to describe a specific log entry.
    * Runtime requests that contain labels not specified here are considered
    * invalid.
    */
  var labels: js.UndefOr[js.Array[SchemaLabelDescriptor]] = js.native
  
  /**
    * The name of the log. It must be less than 512 characters long and can
    * include the following characters: upper- and lower-case alphanumeric
    * characters [A-Za-z0-9], and punctuation characters including slash,
    * underscore, hyphen, period [/_-.].
    */
  var name: js.UndefOr[String] = js.native
}
object SchemaLogDescriptor {
  
  @scala.inline
  def apply(): SchemaLogDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLogDescriptor]
  }
  
  @scala.inline
  implicit class SchemaLogDescriptorOps[Self <: SchemaLogDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setLabelsVarargs(value: SchemaLabelDescriptor*): Self = this.set("labels", js.Array(value :_*))
    
    @scala.inline
    def setLabels(value: js.Array[SchemaLabelDescriptor]): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
