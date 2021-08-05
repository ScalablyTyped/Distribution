package typings.googleapis.languageV1beta1Mod.languageV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * All available features for sentiment, syntax, and semantic analysis.
  * Setting each one to true will enable that specific analysis for the input.
  */
trait SchemaFeatures extends StObject {
  
  /**
    * Extract document-level sentiment.
    */
  var extractDocumentSentiment: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Extract entities.
    */
  var extractEntities: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Extract syntax information.
    */
  var extractSyntax: js.UndefOr[Boolean] = js.undefined
}
object SchemaFeatures {
  
  inline def apply(): SchemaFeatures = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFeatures]
  }
  
  extension [Self <: SchemaFeatures](x: Self) {
    
    inline def setExtractDocumentSentiment(value: Boolean): Self = StObject.set(x, "extractDocumentSentiment", value.asInstanceOf[js.Any])
    
    inline def setExtractDocumentSentimentUndefined: Self = StObject.set(x, "extractDocumentSentiment", js.undefined)
    
    inline def setExtractEntities(value: Boolean): Self = StObject.set(x, "extractEntities", value.asInstanceOf[js.Any])
    
    inline def setExtractEntitiesUndefined: Self = StObject.set(x, "extractEntities", js.undefined)
    
    inline def setExtractSyntax(value: Boolean): Self = StObject.set(x, "extractSyntax", value.asInstanceOf[js.Any])
    
    inline def setExtractSyntaxUndefined: Self = StObject.set(x, "extractSyntax", js.undefined)
  }
}
