package typings.googleapis.languageV1Mod.languageV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFeatures extends StObject {
  
  /**
    * Classify the full document into categories.
    */
  var classifyText: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Extract document-level sentiment.
    */
  var extractDocumentSentiment: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Extract entities.
    */
  var extractEntities: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Extract entities and their associated sentiment.
    */
  var extractEntitySentiment: js.UndefOr[Boolean | Null] = js.undefined
  
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
    
    inline def setClassifyText(value: Boolean): Self = StObject.set(x, "classifyText", value.asInstanceOf[js.Any])
    
    inline def setClassifyTextNull: Self = StObject.set(x, "classifyText", null)
    
    inline def setClassifyTextUndefined: Self = StObject.set(x, "classifyText", js.undefined)
    
    inline def setExtractDocumentSentiment(value: Boolean): Self = StObject.set(x, "extractDocumentSentiment", value.asInstanceOf[js.Any])
    
    inline def setExtractDocumentSentimentNull: Self = StObject.set(x, "extractDocumentSentiment", null)
    
    inline def setExtractDocumentSentimentUndefined: Self = StObject.set(x, "extractDocumentSentiment", js.undefined)
    
    inline def setExtractEntities(value: Boolean): Self = StObject.set(x, "extractEntities", value.asInstanceOf[js.Any])
    
    inline def setExtractEntitiesNull: Self = StObject.set(x, "extractEntities", null)
    
    inline def setExtractEntitiesUndefined: Self = StObject.set(x, "extractEntities", js.undefined)
    
    inline def setExtractEntitySentiment(value: Boolean): Self = StObject.set(x, "extractEntitySentiment", value.asInstanceOf[js.Any])
    
    inline def setExtractEntitySentimentNull: Self = StObject.set(x, "extractEntitySentiment", null)
    
    inline def setExtractEntitySentimentUndefined: Self = StObject.set(x, "extractEntitySentiment", js.undefined)
    
    inline def setExtractSyntax(value: Boolean): Self = StObject.set(x, "extractSyntax", value.asInstanceOf[js.Any])
    
    inline def setExtractSyntaxNull: Self = StObject.set(x, "extractSyntax", null)
    
    inline def setExtractSyntaxUndefined: Self = StObject.set(x, "extractSyntax", js.undefined)
  }
}
