package typings.googleapis.gmailV1Mod.gmailV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaListLabelsResponse extends js.Object {
  
  /**
    * List of labels.
    */
  var labels: js.UndefOr[js.Array[SchemaLabel]] = js.native
}
object SchemaListLabelsResponse {
  
  @scala.inline
  def apply(): SchemaListLabelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListLabelsResponse]
  }
  
  @scala.inline
  implicit class SchemaListLabelsResponseOps[Self <: SchemaListLabelsResponse] (val x: Self) extends AnyVal {
    
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
    def setLabelsVarargs(value: SchemaLabel*): Self = this.set("labels", js.Array(value :_*))
    
    @scala.inline
    def setLabels(value: js.Array[SchemaLabel]): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
  }
}
