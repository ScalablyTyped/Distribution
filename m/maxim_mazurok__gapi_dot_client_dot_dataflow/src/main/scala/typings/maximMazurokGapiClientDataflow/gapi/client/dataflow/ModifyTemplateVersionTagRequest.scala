package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyTemplateVersionTagRequest extends StObject {
  
  /** The flag that indicates if the request is only for remove tag from TemplateVersion. */
  var removeOnly: js.UndefOr[Boolean] = js.undefined
  
  /** The tag for update. */
  var tag: js.UndefOr[String] = js.undefined
}
object ModifyTemplateVersionTagRequest {
  
  @scala.inline
  def apply(): ModifyTemplateVersionTagRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyTemplateVersionTagRequest]
  }
  
  @scala.inline
  implicit class ModifyTemplateVersionTagRequestMutableBuilder[Self <: ModifyTemplateVersionTagRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRemoveOnly(value: Boolean): Self = StObject.set(x, "removeOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveOnlyUndefined: Self = StObject.set(x, "removeOnly", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
