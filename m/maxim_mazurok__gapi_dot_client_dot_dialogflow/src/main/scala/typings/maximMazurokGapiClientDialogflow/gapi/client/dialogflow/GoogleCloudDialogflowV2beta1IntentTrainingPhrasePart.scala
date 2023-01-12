package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2beta1IntentTrainingPhrasePart extends StObject {
  
  /** Optional. The parameter name for the value extracted from the annotated part of the example. This field is required for annotated parts of the training phrase. */
  var alias: js.UndefOr[String] = js.undefined
  
  /** Optional. The entity type name prefixed with `@`. This field is required for annotated parts of the training phrase. */
  var entityType: js.UndefOr[String] = js.undefined
  
  /** Required. The text for this part. */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Indicates whether the text was manually annotated. This field is set to true when the Dialogflow Console is used to manually annotate the part. When creating an annotated
    * part with the API, you must set this to true.
    */
  var userDefined: js.UndefOr[Boolean] = js.undefined
}
object GoogleCloudDialogflowV2beta1IntentTrainingPhrasePart {
  
  inline def apply(): GoogleCloudDialogflowV2beta1IntentTrainingPhrasePart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2beta1IntentTrainingPhrasePart]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDialogflowV2beta1IntentTrainingPhrasePart] (val x: Self) extends AnyVal {
    
    inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    inline def setEntityType(value: String): Self = StObject.set(x, "entityType", value.asInstanceOf[js.Any])
    
    inline def setEntityTypeUndefined: Self = StObject.set(x, "entityType", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setUserDefined(value: Boolean): Self = StObject.set(x, "userDefined", value.asInstanceOf[js.Any])
    
    inline def setUserDefinedUndefined: Self = StObject.set(x, "userDefined", js.undefined)
  }
}
