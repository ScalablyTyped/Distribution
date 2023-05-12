package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A TimelineEvent object represents a scheduled audio event to play for a
  * SonificationTimeline.
  */
trait SonificationTimelineEvent extends StObject {
  
  /**
    * Callback to call when playing the event.
    */
  var callback: js.UndefOr[js.Function] = js.undefined
  
  /**
    * Options for an instrument event to be played.
    */
  var instrumentEventOptions: js.UndefOr[
    typings.highcharts.modulesSonificationMod.highchartsAugmentingMod.SonificationInstrumentScheduledEventOptionsObject
  ] = js.undefined
  
  /**
    * The message to speak for speech events.
    */
  var message: js.UndefOr[String] = js.undefined
  
  /**
    * A reference to a data point related to the TimelineEvent. Populated
    * when sonifying points.
    */
  var relatedPoint: js.UndefOr[typings.highcharts.modulesSonificationMod.highchartsAugmentingMod.Point] = js.undefined
  
  /**
    * Options for a speech event to be played.
    */
  var speechOptions: js.UndefOr[
    typings.highcharts.modulesSonificationMod.highchartsAugmentingMod.SonificationSpeakerOptionsObject
  ] = js.undefined
  
  /**
    * Time is given in milliseconds, where 0 is now.
    */
  var time: Double
}
object SonificationTimelineEvent {
  
  inline def apply(time: Double): SonificationTimelineEvent = {
    val __obj = js.Dynamic.literal(time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[SonificationTimelineEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SonificationTimelineEvent] (val x: Self) extends AnyVal {
    
    inline def setCallback(value: js.Function): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setInstrumentEventOptions(
      value: typings.highcharts.modulesSonificationMod.highchartsAugmentingMod.SonificationInstrumentScheduledEventOptionsObject
    ): Self = StObject.set(x, "instrumentEventOptions", value.asInstanceOf[js.Any])
    
    inline def setInstrumentEventOptionsUndefined: Self = StObject.set(x, "instrumentEventOptions", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setRelatedPoint(value: typings.highcharts.modulesSonificationMod.highchartsAugmentingMod.Point): Self = StObject.set(x, "relatedPoint", value.asInstanceOf[js.Any])
    
    inline def setRelatedPointUndefined: Self = StObject.set(x, "relatedPoint", js.undefined)
    
    inline def setSpeechOptions(
      value: typings.highcharts.modulesSonificationMod.highchartsAugmentingMod.SonificationSpeakerOptionsObject
    ): Self = StObject.set(x, "speechOptions", value.asInstanceOf[js.Any])
    
    inline def setSpeechOptionsUndefined: Self = StObject.set(x, "speechOptions", js.undefined)
    
    inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}
