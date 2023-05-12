package typings.highcharts.mod

import typings.highcharts.anon.RecordSonificationSynthPr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Collection of Sonification classes and objects.
  */
trait SonificationGlobalObject extends StObject {
  
  /**
    * SynthPatch presets
    */
  var InstrumentPresets: js.UndefOr[RecordSonificationSynthPr] = js.undefined
  
  /**
    * Musical scale presets
    */
  var Scales: js.UndefOr[
    typings.highcharts.modulesSonificationMod.highchartsAugmentingMod.SonificationScalePresetsObject
  ] = js.undefined
  
  /**
    * SonificationInstrument class
    */
  var SonificationInstrument: js.UndefOr[
    typings.highcharts.modulesSonificationMod.highchartsAugmentingMod.SonificationInstrument
  ] = js.undefined
  
  /**
    * SonificationSpeaker class
    */
  var SonificationSpeaker: js.UndefOr[
    typings.highcharts.modulesSonificationMod.highchartsAugmentingMod.SonificationSpeaker
  ] = js.undefined
  
  /**
    * SynthPatch class
    */
  var SynthPatch: js.UndefOr[typings.highcharts.modulesSonificationMod.highchartsAugmentingMod.SynthPatch] = js.undefined
}
object SonificationGlobalObject {
  
  inline def apply(): SonificationGlobalObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SonificationGlobalObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SonificationGlobalObject] (val x: Self) extends AnyVal {
    
    inline def setInstrumentPresets(value: RecordSonificationSynthPr): Self = StObject.set(x, "InstrumentPresets", value.asInstanceOf[js.Any])
    
    inline def setInstrumentPresetsUndefined: Self = StObject.set(x, "InstrumentPresets", js.undefined)
    
    inline def setScales(
      value: typings.highcharts.modulesSonificationMod.highchartsAugmentingMod.SonificationScalePresetsObject
    ): Self = StObject.set(x, "Scales", value.asInstanceOf[js.Any])
    
    inline def setScalesUndefined: Self = StObject.set(x, "Scales", js.undefined)
    
    inline def setSonificationInstrument(value: typings.highcharts.modulesSonificationMod.highchartsAugmentingMod.SonificationInstrument): Self = StObject.set(x, "SonificationInstrument", value.asInstanceOf[js.Any])
    
    inline def setSonificationInstrumentUndefined: Self = StObject.set(x, "SonificationInstrument", js.undefined)
    
    inline def setSonificationSpeaker(value: typings.highcharts.modulesSonificationMod.highchartsAugmentingMod.SonificationSpeaker): Self = StObject.set(x, "SonificationSpeaker", value.asInstanceOf[js.Any])
    
    inline def setSonificationSpeakerUndefined: Self = StObject.set(x, "SonificationSpeaker", js.undefined)
    
    inline def setSynthPatch(value: typings.highcharts.modulesSonificationMod.highchartsAugmentingMod.SynthPatch): Self = StObject.set(x, "SynthPatch", value.asInstanceOf[js.Any])
    
    inline def setSynthPatchUndefined: Self = StObject.set(x, "SynthPatch", js.undefined)
  }
}
