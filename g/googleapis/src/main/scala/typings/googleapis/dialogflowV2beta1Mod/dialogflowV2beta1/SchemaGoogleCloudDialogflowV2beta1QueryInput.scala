package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the query input. It can contain either:  1.  An audio config
  * which     instructs the speech recognizer how to process the speech audio.
  * 2.  A conversational query in the form of text,.  3.  An event that
  * specifies which intent to trigger.
  */
trait SchemaGoogleCloudDialogflowV2beta1QueryInput extends StObject {
  
  /**
    * Instructs the speech recognizer how to process the speech audio.
    */
  var audioConfig: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1InputAudioConfig] = js.undefined
  
  /**
    * The event to be processed.
    */
  var event: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1EventInput] = js.undefined
  
  /**
    * The natural language text to be processed.
    */
  var text: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1TextInput] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1QueryInput {
  
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2beta1QueryInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1QueryInput]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2beta1QueryInputMutableBuilder[Self <: SchemaGoogleCloudDialogflowV2beta1QueryInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudioConfig(value: SchemaGoogleCloudDialogflowV2beta1InputAudioConfig): Self = StObject.set(x, "audioConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioConfigUndefined: Self = StObject.set(x, "audioConfig", js.undefined)
    
    @scala.inline
    def setEvent(value: SchemaGoogleCloudDialogflowV2beta1EventInput): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    @scala.inline
    def setText(value: SchemaGoogleCloudDialogflowV2beta1TextInput): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
