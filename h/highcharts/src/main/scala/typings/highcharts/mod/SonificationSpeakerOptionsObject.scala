package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration for a SonificationSpeaker.
  */
trait SonificationSpeakerOptionsObject extends StObject {
  
  /**
    * The language of the voice synthesis. Defaults to `"en-US"`.
    */
  var language: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the voice synthesis to use. If not found, reverts to the
    * default voice for the language chosen.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The pitch modifier of the voice. Defaults to `1`. Set higher for a
    * higher voice pitch.
    */
  var pitch: js.UndefOr[Double] = js.undefined
  
  /**
    * The speech rate modifier. Defaults to `1`.
    */
  var rate: js.UndefOr[Double] = js.undefined
  
  /**
    * The speech volume, from 0 to 1. Defaults to `1`.
    */
  var volume: js.UndefOr[Double] = js.undefined
}
object SonificationSpeakerOptionsObject {
  
  inline def apply(): SonificationSpeakerOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SonificationSpeakerOptionsObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SonificationSpeakerOptionsObject] (val x: Self) extends AnyVal {
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPitch(value: Double): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
    
    inline def setPitchUndefined: Self = StObject.set(x, "pitch", js.undefined)
    
    inline def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
    
    inline def setRateUndefined: Self = StObject.set(x, "rate", js.undefined)
    
    inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
    
    inline def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
  }
}
