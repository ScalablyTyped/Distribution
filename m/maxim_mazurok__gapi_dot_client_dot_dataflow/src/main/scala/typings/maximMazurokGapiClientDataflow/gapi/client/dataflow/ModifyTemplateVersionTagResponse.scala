package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyTemplateVersionTagResponse extends StObject {
  
  /** All the tags in the TemplateVersion. */
  var tags: js.UndefOr[js.Array[String]] = js.undefined
}
object ModifyTemplateVersionTagResponse {
  
  @scala.inline
  def apply(): ModifyTemplateVersionTagResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyTemplateVersionTagResponse]
  }
  
  @scala.inline
  implicit class ModifyTemplateVersionTagResponseMutableBuilder[Self <: ModifyTemplateVersionTagResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
