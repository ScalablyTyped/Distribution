package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyTemplateVersionTagResponse extends StObject {
  
  /** All the tags in the TemplateVersion. */
  var tags: js.UndefOr[js.Array[String]] = js.undefined
}
object ModifyTemplateVersionTagResponse {
  
  inline def apply(): ModifyTemplateVersionTagResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyTemplateVersionTagResponse]
  }
  
  extension [Self <: ModifyTemplateVersionTagResponse](x: Self) {
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
