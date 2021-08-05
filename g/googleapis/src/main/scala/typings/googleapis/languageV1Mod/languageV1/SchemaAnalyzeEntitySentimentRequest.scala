package typings.googleapis.languageV1Mod.languageV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The entity-level sentiment analysis request message.
  */
trait SchemaAnalyzeEntitySentimentRequest extends StObject {
  
  /**
    * Input document.
    */
  var document: js.UndefOr[SchemaDocument] = js.undefined
  
  /**
    * The encoding type used by the API to calculate offsets.
    */
  var encodingType: js.UndefOr[String] = js.undefined
}
object SchemaAnalyzeEntitySentimentRequest {
  
  inline def apply(): SchemaAnalyzeEntitySentimentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnalyzeEntitySentimentRequest]
  }
  
  extension [Self <: SchemaAnalyzeEntitySentimentRequest](x: Self) {
    
    inline def setDocument(value: SchemaDocument): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    inline def setEncodingType(value: String): Self = StObject.set(x, "encodingType", value.asInstanceOf[js.Any])
    
    inline def setEncodingTypeUndefined: Self = StObject.set(x, "encodingType", js.undefined)
  }
}
