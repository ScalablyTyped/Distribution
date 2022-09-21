package typings.googleapis.healthcareV1Mod.healthcareV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAnalyzeEntitiesRequest extends StObject {
  
  /**
    * document_content is a document to be annotated.
    */
  var documentContent: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of licensed vocabularies to use in the request, in addition to the default unlicensed vocabularies.
    */
  var licensedVocabularies: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaAnalyzeEntitiesRequest {
  
  inline def apply(): SchemaAnalyzeEntitiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnalyzeEntitiesRequest]
  }
  
  extension [Self <: SchemaAnalyzeEntitiesRequest](x: Self) {
    
    inline def setDocumentContent(value: String): Self = StObject.set(x, "documentContent", value.asInstanceOf[js.Any])
    
    inline def setDocumentContentNull: Self = StObject.set(x, "documentContent", null)
    
    inline def setDocumentContentUndefined: Self = StObject.set(x, "documentContent", js.undefined)
    
    inline def setLicensedVocabularies(value: js.Array[String]): Self = StObject.set(x, "licensedVocabularies", value.asInstanceOf[js.Any])
    
    inline def setLicensedVocabulariesNull: Self = StObject.set(x, "licensedVocabularies", null)
    
    inline def setLicensedVocabulariesUndefined: Self = StObject.set(x, "licensedVocabularies", js.undefined)
    
    inline def setLicensedVocabulariesVarargs(value: String*): Self = StObject.set(x, "licensedVocabularies", js.Array(value*))
  }
}
