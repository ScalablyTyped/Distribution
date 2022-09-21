package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEntityMention extends StObject {
  
  /**
    * The certainty assessment of the entity mention. Its value is one of: LIKELY, SOMEWHAT_LIKELY, UNCERTAIN, SOMEWHAT_UNLIKELY, UNLIKELY, CONDITIONAL
    */
  var certaintyAssessment: js.UndefOr[SchemaFeature] = js.undefined
  
  /**
    * The model's confidence in this entity mention annotation. A number between 0 and 1.
    */
  var confidence: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * linked_entities are candidate ontological concepts that this entity mention may refer to. They are sorted by decreasing confidence.it
    */
  var linkedEntities: js.UndefOr[js.Array[SchemaLinkedEntity]] = js.undefined
  
  /**
    * mention_id uniquely identifies each entity mention in a single response.
    */
  var mentionId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The subject this entity mention relates to. Its value is one of: PATIENT, FAMILY_MEMBER, OTHER
    */
  var subject: js.UndefOr[SchemaFeature] = js.undefined
  
  /**
    * How this entity mention relates to the subject temporally. Its value is one of: CURRENT, CLINICAL_HISTORY, FAMILY_HISTORY, UPCOMING, ALLERGY
    */
  var temporalAssessment: js.UndefOr[SchemaFeature] = js.undefined
  
  /**
    * text is the location of the entity mention in the document.
    */
  var text: js.UndefOr[SchemaTextSpan] = js.undefined
  
  /**
    * The semantic type of the entity: UNKNOWN_ENTITY_TYPE, ALONE, ANATOMICAL_STRUCTURE, ASSISTED_LIVING, BF_RESULT, BM_RESULT, BM_UNIT, BM_VALUE, BODY_FUNCTION, BODY_MEASUREMENT, COMPLIANT, DOESNOT_FOLLOWUP, FAMILY, FOLLOWSUP, LABORATORY_DATA, LAB_RESULT, LAB_UNIT, LAB_VALUE, MEDICAL_DEVICE, MEDICINE, MED_DOSE, MED_DURATION, MED_FORM, MED_FREQUENCY, MED_ROUTE, MED_STATUS, MED_STRENGTH, MED_TOTALDOSE, MED_UNIT, NON_COMPLIANT, OTHER_LIVINGSTATUS, PROBLEM, PROCEDURE, PROCEDURE_RESULT, PROC_METHOD, REASON_FOR_NONCOMPLIANCE, SEVERITY, SUBSTANCE_ABUSE, UNCLEAR_FOLLOWUP.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaEntityMention {
  
  inline def apply(): SchemaEntityMention = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEntityMention]
  }
  
  extension [Self <: SchemaEntityMention](x: Self) {
    
    inline def setCertaintyAssessment(value: SchemaFeature): Self = StObject.set(x, "certaintyAssessment", value.asInstanceOf[js.Any])
    
    inline def setCertaintyAssessmentUndefined: Self = StObject.set(x, "certaintyAssessment", js.undefined)
    
    inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceNull: Self = StObject.set(x, "confidence", null)
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    inline def setLinkedEntities(value: js.Array[SchemaLinkedEntity]): Self = StObject.set(x, "linkedEntities", value.asInstanceOf[js.Any])
    
    inline def setLinkedEntitiesUndefined: Self = StObject.set(x, "linkedEntities", js.undefined)
    
    inline def setLinkedEntitiesVarargs(value: SchemaLinkedEntity*): Self = StObject.set(x, "linkedEntities", js.Array(value*))
    
    inline def setMentionId(value: String): Self = StObject.set(x, "mentionId", value.asInstanceOf[js.Any])
    
    inline def setMentionIdNull: Self = StObject.set(x, "mentionId", null)
    
    inline def setMentionIdUndefined: Self = StObject.set(x, "mentionId", js.undefined)
    
    inline def setSubject(value: SchemaFeature): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setTemporalAssessment(value: SchemaFeature): Self = StObject.set(x, "temporalAssessment", value.asInstanceOf[js.Any])
    
    inline def setTemporalAssessmentUndefined: Self = StObject.set(x, "temporalAssessment", js.undefined)
    
    inline def setText(value: SchemaTextSpan): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
