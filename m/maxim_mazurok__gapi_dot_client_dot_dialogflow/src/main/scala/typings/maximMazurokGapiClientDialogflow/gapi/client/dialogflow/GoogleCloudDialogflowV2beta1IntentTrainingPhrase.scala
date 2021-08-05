package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2beta1IntentTrainingPhrase extends StObject {
  
  /** Output only. The unique identifier of this training phrase. */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The ordered list of training phrase parts. The parts are concatenated in order to form the training phrase. Note: The API does not automatically annotate training phrases
    * like the Dialogflow Console does. Note: Do not forget to include whitespace at part boundaries, so the training phrase is well formatted when the parts are concatenated. If the
    * training phrase does not need to be annotated with parameters, you just need a single part with only the Part.text field set. If you want to annotate the training phrase, you must
    * create multiple parts, where the fields of each part are populated in one of two ways: - `Part.text` is set to a part of the phrase that has no parameters. - `Part.text` is set to a
    * part of the phrase that you want to annotate, and the `entity_type`, `alias`, and `user_defined` fields are all set.
    */
  var parts: js.UndefOr[js.Array[GoogleCloudDialogflowV2beta1IntentTrainingPhrasePart]] = js.undefined
  
  /** Optional. Indicates how many times this example was added to the intent. Each time a developer adds an existing sample by editing an intent or training, this counter is increased. */
  var timesAddedCount: js.UndefOr[Double] = js.undefined
  
  /** Required. The type of the training phrase. */
  var `type`: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2beta1IntentTrainingPhrase {
  
  inline def apply(): GoogleCloudDialogflowV2beta1IntentTrainingPhrase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2beta1IntentTrainingPhrase]
  }
  
  extension [Self <: GoogleCloudDialogflowV2beta1IntentTrainingPhrase](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParts(value: js.Array[GoogleCloudDialogflowV2beta1IntentTrainingPhrasePart]): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
    
    inline def setPartsUndefined: Self = StObject.set(x, "parts", js.undefined)
    
    inline def setPartsVarargs(value: GoogleCloudDialogflowV2beta1IntentTrainingPhrasePart*): Self = StObject.set(x, "parts", js.Array(value :_*))
    
    inline def setTimesAddedCount(value: Double): Self = StObject.set(x, "timesAddedCount", value.asInstanceOf[js.Any])
    
    inline def setTimesAddedCountUndefined: Self = StObject.set(x, "timesAddedCount", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
