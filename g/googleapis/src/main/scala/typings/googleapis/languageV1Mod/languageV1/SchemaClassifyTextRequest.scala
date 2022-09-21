package typings.googleapis.languageV1Mod.languageV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaClassifyTextRequest extends StObject {
  
  /**
    * Required. Input document.
    */
  var document: js.UndefOr[SchemaDocument] = js.undefined
}
object SchemaClassifyTextRequest {
  
  inline def apply(): SchemaClassifyTextRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClassifyTextRequest]
  }
  
  extension [Self <: SchemaClassifyTextRequest](x: Self) {
    
    inline def setDocument(value: SchemaDocument): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
  }
}
