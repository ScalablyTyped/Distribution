package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3Intent extends StObject {
  
  /** Human readable description for better understanding an intent like its scope, content, result etc. Maximum character limit: 140 characters. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Required. The human-readable name of the intent, unique within the agent. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether this is a fallback intent. Currently only default fallback intent is allowed in the agent, which is added upon agent creation. Adding training phrases to fallback
    * intent is useful in the case of requests that are mistakenly matched, since training phrases assigned to fallback intents act as negative examples that triggers no-match event.
    */
  var isFallback: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The key/value metadata to label an intent. Labels can contain lowercase letters, digits and the symbols '-' and '_'. International characters are allowed, including letters from
    * unicase alphabets. Keys must start with a letter. Keys and values can be no longer than 63 characters and no more than 128 bytes. Prefix "sys-" is reserved for Dialogflow defined
    * labels. Currently allowed Dialogflow defined labels include: * sys-head * sys-contextual The above labels do not require value. "sys-head" means the intent is a head intent.
    * "sys.contextual" means the intent is a contextual intent.
    */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /**
    * The unique identifier of the intent. Required for the Intents.UpdateIntent method. Intents.CreateIntent populates the name automatically. Format:
    * `projects//locations//agents//intents/`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** The collection of parameters associated with the intent. */
  var parameters: js.UndefOr[js.Array[GoogleCloudDialogflowCxV3IntentParameter]] = js.undefined
  
  /**
    * The priority of this intent. Higher numbers represent higher priorities. - If the supplied value is unspecified or 0, the service translates the value to 500,000, which corresponds
    * to the `Normal` priority in the console. - If the supplied value is negative, the intent is ignored in runtime detect intent requests.
    */
  var priority: js.UndefOr[Double] = js.undefined
  
  /** The collection of training phrases the agent is trained on to identify the intent. */
  var trainingPhrases: js.UndefOr[js.Array[GoogleCloudDialogflowCxV3IntentTrainingPhrase]] = js.undefined
}
object GoogleCloudDialogflowCxV3Intent {
  
  inline def apply(): GoogleCloudDialogflowCxV3Intent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3Intent]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3Intent](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setIsFallback(value: Boolean): Self = StObject.set(x, "isFallback", value.asInstanceOf[js.Any])
    
    inline def setIsFallbackUndefined: Self = StObject.set(x, "isFallback", js.undefined)
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParameters(value: js.Array[GoogleCloudDialogflowCxV3IntentParameter]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setParametersVarargs(value: GoogleCloudDialogflowCxV3IntentParameter*): Self = StObject.set(x, "parameters", js.Array(value*))
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setTrainingPhrases(value: js.Array[GoogleCloudDialogflowCxV3IntentTrainingPhrase]): Self = StObject.set(x, "trainingPhrases", value.asInstanceOf[js.Any])
    
    inline def setTrainingPhrasesUndefined: Self = StObject.set(x, "trainingPhrases", js.undefined)
    
    inline def setTrainingPhrasesVarargs(value: GoogleCloudDialogflowCxV3IntentTrainingPhrase*): Self = StObject.set(x, "trainingPhrases", js.Array(value*))
  }
}
