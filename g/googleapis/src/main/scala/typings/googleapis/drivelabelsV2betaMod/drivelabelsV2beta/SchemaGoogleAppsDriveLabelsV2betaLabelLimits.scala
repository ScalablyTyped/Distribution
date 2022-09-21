package typings.googleapis.drivelabelsV2betaMod.drivelabelsV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsDriveLabelsV2betaLabelLimits extends StObject {
  
  /**
    * The limits for Fields.
    */
  var fieldLimits: js.UndefOr[SchemaGoogleAppsDriveLabelsV2betaFieldLimits] = js.undefined
  
  /**
    * The maximum number of published Fields that can be deleted.
    */
  var maxDeletedFields: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The maximum number of characters allowed for the description.
    */
  var maxDescriptionLength: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The maximum number of draft revisions that will be kept before deleting old drafts.
    */
  var maxDraftRevisions: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The maximum number of Fields allowed within the label.
    */
  var maxFields: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The maximum number of characters allowed for the title.
    */
  var maxTitleLength: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Resource name.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAppsDriveLabelsV2betaLabelLimits {
  
  inline def apply(): SchemaGoogleAppsDriveLabelsV2betaLabelLimits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsDriveLabelsV2betaLabelLimits]
  }
  
  extension [Self <: SchemaGoogleAppsDriveLabelsV2betaLabelLimits](x: Self) {
    
    inline def setFieldLimits(value: SchemaGoogleAppsDriveLabelsV2betaFieldLimits): Self = StObject.set(x, "fieldLimits", value.asInstanceOf[js.Any])
    
    inline def setFieldLimitsUndefined: Self = StObject.set(x, "fieldLimits", js.undefined)
    
    inline def setMaxDeletedFields(value: Double): Self = StObject.set(x, "maxDeletedFields", value.asInstanceOf[js.Any])
    
    inline def setMaxDeletedFieldsNull: Self = StObject.set(x, "maxDeletedFields", null)
    
    inline def setMaxDeletedFieldsUndefined: Self = StObject.set(x, "maxDeletedFields", js.undefined)
    
    inline def setMaxDescriptionLength(value: Double): Self = StObject.set(x, "maxDescriptionLength", value.asInstanceOf[js.Any])
    
    inline def setMaxDescriptionLengthNull: Self = StObject.set(x, "maxDescriptionLength", null)
    
    inline def setMaxDescriptionLengthUndefined: Self = StObject.set(x, "maxDescriptionLength", js.undefined)
    
    inline def setMaxDraftRevisions(value: Double): Self = StObject.set(x, "maxDraftRevisions", value.asInstanceOf[js.Any])
    
    inline def setMaxDraftRevisionsNull: Self = StObject.set(x, "maxDraftRevisions", null)
    
    inline def setMaxDraftRevisionsUndefined: Self = StObject.set(x, "maxDraftRevisions", js.undefined)
    
    inline def setMaxFields(value: Double): Self = StObject.set(x, "maxFields", value.asInstanceOf[js.Any])
    
    inline def setMaxFieldsNull: Self = StObject.set(x, "maxFields", null)
    
    inline def setMaxFieldsUndefined: Self = StObject.set(x, "maxFields", js.undefined)
    
    inline def setMaxTitleLength(value: Double): Self = StObject.set(x, "maxTitleLength", value.asInstanceOf[js.Any])
    
    inline def setMaxTitleLengthNull: Self = StObject.set(x, "maxTitleLength", null)
    
    inline def setMaxTitleLengthUndefined: Self = StObject.set(x, "maxTitleLength", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
