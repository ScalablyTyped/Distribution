package typings.googleapis.languageV1beta1Mod.languageV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFeatures extends StObject {
  
  /**
    * Extract document-level sentiment.
    */
  var extractDocumentSentiment: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Extract entities.
    */
  var extractEntities: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Extract syntax information.
    */
  var extractSyntax: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaFeatures {
  
  inline def apply(): SchemaFeatures = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFeatures]
  }
  
  extension [Self <: SchemaFeatures](x: Self) {
    
    inline def setExtractDocumentSentiment(value: Boolean): Self = StObject.set(x, "extractDocumentSentiment", value.asInstanceOf[js.Any])
    
    inline def setExtractDocumentSentimentNull: Self = StObject.set(x, "extractDocumentSentiment", null)
    
    inline def setExtractDocumentSentimentUndefined: Self = StObject.set(x, "extractDocumentSentiment", js.undefined)
    
    inline def setExtractEntities(value: Boolean): Self = StObject.set(x, "extractEntities", value.asInstanceOf[js.Any])
    
    inline def setExtractEntitiesNull: Self = StObject.set(x, "extractEntities", null)
    
    inline def setExtractEntitiesUndefined: Self = StObject.set(x, "extractEntities", js.undefined)
    
    inline def setExtractSyntax(value: Boolean): Self = StObject.set(x, "extractSyntax", value.asInstanceOf[js.Any])
    
    inline def setExtractSyntaxNull: Self = StObject.set(x, "extractSyntax", null)
    
    inline def setExtractSyntaxUndefined: Self = StObject.set(x, "extractSyntax", js.undefined)
  }
}
