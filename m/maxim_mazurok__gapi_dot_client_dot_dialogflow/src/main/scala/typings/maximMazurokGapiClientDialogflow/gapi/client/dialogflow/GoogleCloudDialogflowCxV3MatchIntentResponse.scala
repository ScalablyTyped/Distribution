package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3MatchIntentResponse extends StObject {
  
  /** The current Page. Some, not all fields are filled in this message, including but not limited to `name` and `display_name`. */
  var currentPage: js.UndefOr[GoogleCloudDialogflowCxV3Page] = js.undefined
  
  /** Match results, if more than one, ordered descendingly by the confidence we have that the particular intent matches the query. */
  var matches: js.UndefOr[js.Array[GoogleCloudDialogflowCxV3Match]] = js.undefined
  
  /** If natural language text was provided as input, this field will contain a copy of the text. */
  var text: js.UndefOr[String] = js.undefined
  
  /** If natural language speech audio was provided as input, this field will contain the transcript for the audio. */
  var transcript: js.UndefOr[String] = js.undefined
  
  /** If an event was provided as input, this field will contain a copy of the event name. */
  var triggerEvent: js.UndefOr[String] = js.undefined
  
  /** If an intent was provided as input, this field will contain a copy of the intent identifier. Format: `projects//locations//agents//intents/`. */
  var triggerIntent: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowCxV3MatchIntentResponse {
  
  inline def apply(): GoogleCloudDialogflowCxV3MatchIntentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3MatchIntentResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDialogflowCxV3MatchIntentResponse] (val x: Self) extends AnyVal {
    
    inline def setCurrentPage(value: GoogleCloudDialogflowCxV3Page): Self = StObject.set(x, "currentPage", value.asInstanceOf[js.Any])
    
    inline def setCurrentPageUndefined: Self = StObject.set(x, "currentPage", js.undefined)
    
    inline def setMatches(value: js.Array[GoogleCloudDialogflowCxV3Match]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
    
    inline def setMatchesUndefined: Self = StObject.set(x, "matches", js.undefined)
    
    inline def setMatchesVarargs(value: GoogleCloudDialogflowCxV3Match*): Self = StObject.set(x, "matches", js.Array(value*))
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTranscript(value: String): Self = StObject.set(x, "transcript", value.asInstanceOf[js.Any])
    
    inline def setTranscriptUndefined: Self = StObject.set(x, "transcript", js.undefined)
    
    inline def setTriggerEvent(value: String): Self = StObject.set(x, "triggerEvent", value.asInstanceOf[js.Any])
    
    inline def setTriggerEventUndefined: Self = StObject.set(x, "triggerEvent", js.undefined)
    
    inline def setTriggerIntent(value: String): Self = StObject.set(x, "triggerIntent", value.asInstanceOf[js.Any])
    
    inline def setTriggerIntentUndefined: Self = StObject.set(x, "triggerIntent", js.undefined)
  }
}
