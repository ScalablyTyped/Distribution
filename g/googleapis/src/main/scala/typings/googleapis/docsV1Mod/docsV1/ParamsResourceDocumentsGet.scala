package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceDocumentsGet
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the document to retrieve.
    */
  var documentId: js.UndefOr[String] = js.undefined
  
  /**
    * The suggestions view mode to apply to the document. This allows viewing the document with all suggestions inline, accepted or rejected. If one is not specified, DEFAULT_FOR_CURRENT_ACCESS is used.
    */
  var suggestionsViewMode: js.UndefOr[String] = js.undefined
}
object ParamsResourceDocumentsGet {
  
  inline def apply(): ParamsResourceDocumentsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDocumentsGet]
  }
  
  extension [Self <: ParamsResourceDocumentsGet](x: Self) {
    
    inline def setDocumentId(value: String): Self = StObject.set(x, "documentId", value.asInstanceOf[js.Any])
    
    inline def setDocumentIdUndefined: Self = StObject.set(x, "documentId", js.undefined)
    
    inline def setSuggestionsViewMode(value: String): Self = StObject.set(x, "suggestionsViewMode", value.asInstanceOf[js.Any])
    
    inline def setSuggestionsViewModeUndefined: Self = StObject.set(x, "suggestionsViewMode", js.undefined)
  }
}
