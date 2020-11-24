package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetadataRemovingEventUIParam extends js.Object {
  
  /**
    * Gets a reference to the data.
    */
  var metadata: js.UndefOr[js.Any] = js.native
  
  /**
    * A reference to the dragged element.
    */
  var targetElement: js.UndefOr[String] = js.native
}
object MetadataRemovingEventUIParam {
  
  @scala.inline
  def apply(): MetadataRemovingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetadataRemovingEventUIParam]
  }
  
  @scala.inline
  implicit class MetadataRemovingEventUIParamOps[Self <: MetadataRemovingEventUIParam] (val x: Self) extends AnyVal {
    
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
    def setMetadata(value: js.Any): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setTargetElement(value: String): Self = this.set("targetElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetElement: Self = this.set("targetElement", js.undefined)
  }
}
