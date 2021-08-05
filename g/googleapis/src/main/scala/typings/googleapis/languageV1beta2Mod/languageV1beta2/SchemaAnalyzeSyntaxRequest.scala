package typings.googleapis.languageV1beta2Mod.languageV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The syntax analysis request message.
  */
trait SchemaAnalyzeSyntaxRequest extends StObject {
  
  /**
    * Input document.
    */
  var document: js.UndefOr[SchemaDocument] = js.undefined
  
  /**
    * The encoding type used by the API to calculate offsets.
    */
  var encodingType: js.UndefOr[String] = js.undefined
}
object SchemaAnalyzeSyntaxRequest {
  
  inline def apply(): SchemaAnalyzeSyntaxRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnalyzeSyntaxRequest]
  }
  
  extension [Self <: SchemaAnalyzeSyntaxRequest](x: Self) {
    
    inline def setDocument(value: SchemaDocument): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    inline def setEncodingType(value: String): Self = StObject.set(x, "encodingType", value.asInstanceOf[js.Any])
    
    inline def setEncodingTypeUndefined: Self = StObject.set(x, "encodingType", js.undefined)
  }
}
