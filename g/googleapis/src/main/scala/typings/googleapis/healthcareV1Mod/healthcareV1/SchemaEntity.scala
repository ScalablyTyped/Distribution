package typings.googleapis.healthcareV1Mod.healthcareV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEntity extends StObject {
  
  /**
    * entity_id is a first class field entity_id uniquely identifies this concept and its meta-vocabulary. For example, "UMLS/C0000970".
    */
  var entityId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * preferred_term is the preferred term for this concept. For example, "Acetaminophen". For ad hoc entities formed by normalization, this is the most popular unnormalized string.
    */
  var preferredTerm: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Vocabulary codes are first-class fields and differentiated from the concept unique identifier (entity_id). vocabulary_codes contains the representation of this concept in particular vocabularies, such as ICD-10, SNOMED-CT and RxNORM. These are prefixed by the name of the vocabulary, followed by the unique code within that vocabulary. For example, "RXNORM/A10334543".
    */
  var vocabularyCodes: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaEntity {
  
  inline def apply(): SchemaEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEntity]
  }
  
  extension [Self <: SchemaEntity](x: Self) {
    
    inline def setEntityId(value: String): Self = StObject.set(x, "entityId", value.asInstanceOf[js.Any])
    
    inline def setEntityIdNull: Self = StObject.set(x, "entityId", null)
    
    inline def setEntityIdUndefined: Self = StObject.set(x, "entityId", js.undefined)
    
    inline def setPreferredTerm(value: String): Self = StObject.set(x, "preferredTerm", value.asInstanceOf[js.Any])
    
    inline def setPreferredTermNull: Self = StObject.set(x, "preferredTerm", null)
    
    inline def setPreferredTermUndefined: Self = StObject.set(x, "preferredTerm", js.undefined)
    
    inline def setVocabularyCodes(value: js.Array[String]): Self = StObject.set(x, "vocabularyCodes", value.asInstanceOf[js.Any])
    
    inline def setVocabularyCodesNull: Self = StObject.set(x, "vocabularyCodes", null)
    
    inline def setVocabularyCodesUndefined: Self = StObject.set(x, "vocabularyCodes", js.undefined)
    
    inline def setVocabularyCodesVarargs(value: String*): Self = StObject.set(x, "vocabularyCodes", js.Array(value*))
  }
}
