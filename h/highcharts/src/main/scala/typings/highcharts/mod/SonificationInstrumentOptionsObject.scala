package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration for a SonificationInstrument.
  */
trait SonificationInstrumentOptionsObject extends StObject {
  
  /**
    * Define additional capabilities for the instrument, such as panning,
    * filters, and tremolo effects.
    */
  var capabilities: js.UndefOr[
    typings.highcharts.modulesSonificationMod.highchartsAugmentingMod.SonificationInstrumentCapabilitiesOptionsObject
  ] = js.undefined
  
  /**
    * A track name to use for this instrument in MIDI export.
    */
  var midiTrackName: js.UndefOr[String] = js.undefined
  
  /**
    * The synth configuration for the instrument. Can be either a string,
    * referencing the instrument presets, or an actual SynthPatch
    * configuration.
    */
  var synthPatch: typings.highcharts.modulesSonificationMod.highchartsAugmentingMod.SonificationSynthPreset | SynthPatchOptionsObject
}
object SonificationInstrumentOptionsObject {
  
  inline def apply(
    synthPatch: typings.highcharts.modulesSonificationMod.highchartsAugmentingMod.SonificationSynthPreset | SynthPatchOptionsObject
  ): SonificationInstrumentOptionsObject = {
    val __obj = js.Dynamic.literal(synthPatch = synthPatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[SonificationInstrumentOptionsObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SonificationInstrumentOptionsObject] (val x: Self) extends AnyVal {
    
    inline def setCapabilities(
      value: typings.highcharts.modulesSonificationMod.highchartsAugmentingMod.SonificationInstrumentCapabilitiesOptionsObject
    ): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    inline def setCapabilitiesUndefined: Self = StObject.set(x, "capabilities", js.undefined)
    
    inline def setMidiTrackName(value: String): Self = StObject.set(x, "midiTrackName", value.asInstanceOf[js.Any])
    
    inline def setMidiTrackNameUndefined: Self = StObject.set(x, "midiTrackName", js.undefined)
    
    inline def setSynthPatch(
      value: typings.highcharts.modulesSonificationMod.highchartsAugmentingMod.SonificationSynthPreset | SynthPatchOptionsObject
    ): Self = StObject.set(x, "synthPatch", value.asInstanceOf[js.Any])
  }
}
