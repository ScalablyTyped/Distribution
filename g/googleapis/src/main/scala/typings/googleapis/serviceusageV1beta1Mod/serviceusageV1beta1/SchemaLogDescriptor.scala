package typings.googleapis.serviceusageV1beta1Mod.serviceusageV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A description of a log type. Example in YAML format:      - name:
  * library.googleapis.com/activity_history       description: The history of
  * borrowing and returning library items.       display_name: Activity labels:
  * - key: /customer_id         description: Identifier of a library customer
  */
trait SchemaLogDescriptor extends StObject {
  
  /**
    * A human-readable description of this log. This information appears in the
    * documentation and can contain details.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The human-readable name for this log. This information appears on the
    * user interface and should be concise.
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * The set of labels that are available to describe a specific log entry.
    * Runtime requests that contain labels not specified here are considered
    * invalid.
    */
  var labels: js.UndefOr[js.Array[SchemaLabelDescriptor]] = js.undefined
  
  /**
    * The name of the log. It must be less than 512 characters long and can
    * include the following characters: upper- and lower-case alphanumeric
    * characters [A-Za-z0-9], and punctuation characters including slash,
    * underscore, hyphen, period [/_-.].
    */
  var name: js.UndefOr[String] = js.undefined
}
object SchemaLogDescriptor {
  
  @scala.inline
  def apply(): SchemaLogDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLogDescriptor]
  }
  
  @scala.inline
  implicit class SchemaLogDescriptorMutableBuilder[Self <: SchemaLogDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setLabels(value: js.Array[SchemaLabelDescriptor]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setLabelsVarargs(value: SchemaLabelDescriptor*): Self = StObject.set(x, "labels", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
