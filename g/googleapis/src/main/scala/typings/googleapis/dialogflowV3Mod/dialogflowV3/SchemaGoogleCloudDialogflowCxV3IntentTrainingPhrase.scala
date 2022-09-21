package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3IntentTrainingPhrase extends StObject {
  
  /**
    * Output only. The unique identifier of the training phrase.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The ordered list of training phrase parts. The parts are concatenated in order to form the training phrase. Note: The API does not automatically annotate training phrases like the Dialogflow Console does. Note: Do not forget to include whitespace at part boundaries, so the training phrase is well formatted when the parts are concatenated. If the training phrase does not need to be annotated with parameters, you just need a single part with only the Part.text field set. If you want to annotate the training phrase, you must create multiple parts, where the fields of each part are populated in one of two ways: - `Part.text` is set to a part of the phrase that has no parameters. - `Part.text` is set to a part of the phrase that you want to annotate, and the `parameter_id` field is set.
    */
  var parts: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowCxV3IntentTrainingPhrasePart]] = js.undefined
  
  /**
    * Indicates how many times this example was added to the intent.
    */
  var repeatCount: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3IntentTrainingPhrase {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3IntentTrainingPhrase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3IntentTrainingPhrase]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3IntentTrainingPhrase](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setParts(value: js.Array[SchemaGoogleCloudDialogflowCxV3IntentTrainingPhrasePart]): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
    
    inline def setPartsUndefined: Self = StObject.set(x, "parts", js.undefined)
    
    inline def setPartsVarargs(value: SchemaGoogleCloudDialogflowCxV3IntentTrainingPhrasePart*): Self = StObject.set(x, "parts", js.Array(value*))
    
    inline def setRepeatCount(value: Double): Self = StObject.set(x, "repeatCount", value.asInstanceOf[js.Any])
    
    inline def setRepeatCountNull: Self = StObject.set(x, "repeatCount", null)
    
    inline def setRepeatCountUndefined: Self = StObject.set(x, "repeatCount", js.undefined)
  }
}
