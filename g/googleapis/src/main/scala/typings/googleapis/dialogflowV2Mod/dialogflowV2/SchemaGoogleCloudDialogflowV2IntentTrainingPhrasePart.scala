package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a part of a training phrase.
  */
trait SchemaGoogleCloudDialogflowV2IntentTrainingPhrasePart extends StObject {
  
  /**
    * Optional. The parameter name for the value extracted from the annotated
    * part of the example. This field is required for annotated parts of the
    * training phrase.
    */
  var alias: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The entity type name prefixed with `@`. This field is required
    * for annotated parts of the training phrase.
    */
  var entityType: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The text for this part.
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Indicates whether the text was manually annotated. This field
    * is set to true when the Dialogflow Console is used to manually annotate
    * the part. When creating an annotated part with the API, you must set this
    * to true.
    */
  var userDefined: js.UndefOr[Boolean] = js.undefined
}
object SchemaGoogleCloudDialogflowV2IntentTrainingPhrasePart {
  
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2IntentTrainingPhrasePart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2IntentTrainingPhrasePart]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2IntentTrainingPhrasePartMutableBuilder[Self <: SchemaGoogleCloudDialogflowV2IntentTrainingPhrasePart] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    @scala.inline
    def setEntityType(value: String): Self = StObject.set(x, "entityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityTypeUndefined: Self = StObject.set(x, "entityType", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setUserDefined(value: Boolean): Self = StObject.set(x, "userDefined", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserDefinedUndefined: Self = StObject.set(x, "userDefined", js.undefined)
  }
}
