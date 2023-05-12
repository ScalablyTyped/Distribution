package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SynthPatchOptionsObject extends StObject {
  
  /**
    * Master EQ filters for the synth, affecting the overall sound.
    */
  @JSName("eq")
  var eq_FSynthPatchOptionsObject: js.UndefOr[js.Array[SynthPatchEQFilter]] = js.undefined
  
  /**
    * Volume envelope for the overall attack of a note - what happens to the
    * volume when a note first plays. If the volume goes to 0 in the attack
    * envelope, the synth will not be able to play the note continuously/
    * sustained, and the notes will be staccato.
    */
  var masterAttackEnvelope: js.UndefOr[SynthEnvelope] = js.undefined
  
  /**
    * Volume envelope for the overall release of a note - what happens to the
    * volume when a note stops playing. If the release envelope starts at a
    * higher volume than the attack envelope ends, the volume will first rise
    * to that volume before falling when releasing a note. If the note is
    * released while the attack envelope is still in effect, the attack
    * envelope is interrupted, and the release envelope plays instead.
    */
  var masterReleaseEnvelope: js.UndefOr[SynthEnvelope] = js.undefined
  
  /**
    * Global volume modifier for the synth. Defaults to 1. Note that if the
    * total volume of all oscillators is too high, the browser's audio engine
    * can distort.
    */
  var masterVolume: js.UndefOr[Double] = js.undefined
  
  /**
    * MIDI instrument ID for the synth. Used with MIDI export of Timelines to
    * have tracks open with a similar instrument loaded when imported into
    * other applications. Defaults to 1, "Acoustic Grand Piano".
    */
  var midiInstrument: js.UndefOr[Double] = js.undefined
  
  /**
    * Time in milliseconds to glide between notes. Causes a glissando effect.
    */
  var noteGlideDuration: js.UndefOr[Double] = js.undefined
  
  /**
    * Array of oscillators to add to the synth.
    */
  var oscillators: js.UndefOr[js.Array[SynthPatchOscillatorOptionsObject]] = js.undefined
}
object SynthPatchOptionsObject {
  
  inline def apply(): SynthPatchOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SynthPatchOptionsObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SynthPatchOptionsObject] (val x: Self) extends AnyVal {
    
    inline def setEq_(value: js.Array[SynthPatchEQFilter]): Self = StObject.set(x, "eq", value.asInstanceOf[js.Any])
    
    inline def setEq_Undefined: Self = StObject.set(x, "eq", js.undefined)
    
    inline def setEq_Varargs(value: SynthPatchEQFilter*): Self = StObject.set(x, "eq", js.Array(value*))
    
    inline def setMasterAttackEnvelope(value: SynthEnvelope): Self = StObject.set(x, "masterAttackEnvelope", value.asInstanceOf[js.Any])
    
    inline def setMasterAttackEnvelopeUndefined: Self = StObject.set(x, "masterAttackEnvelope", js.undefined)
    
    inline def setMasterAttackEnvelopeVarargs(value: SynthEnvelopePoint*): Self = StObject.set(x, "masterAttackEnvelope", js.Array(value*))
    
    inline def setMasterReleaseEnvelope(value: SynthEnvelope): Self = StObject.set(x, "masterReleaseEnvelope", value.asInstanceOf[js.Any])
    
    inline def setMasterReleaseEnvelopeUndefined: Self = StObject.set(x, "masterReleaseEnvelope", js.undefined)
    
    inline def setMasterReleaseEnvelopeVarargs(value: SynthEnvelopePoint*): Self = StObject.set(x, "masterReleaseEnvelope", js.Array(value*))
    
    inline def setMasterVolume(value: Double): Self = StObject.set(x, "masterVolume", value.asInstanceOf[js.Any])
    
    inline def setMasterVolumeUndefined: Self = StObject.set(x, "masterVolume", js.undefined)
    
    inline def setMidiInstrument(value: Double): Self = StObject.set(x, "midiInstrument", value.asInstanceOf[js.Any])
    
    inline def setMidiInstrumentUndefined: Self = StObject.set(x, "midiInstrument", js.undefined)
    
    inline def setNoteGlideDuration(value: Double): Self = StObject.set(x, "noteGlideDuration", value.asInstanceOf[js.Any])
    
    inline def setNoteGlideDurationUndefined: Self = StObject.set(x, "noteGlideDuration", js.undefined)
    
    inline def setOscillators(value: js.Array[SynthPatchOscillatorOptionsObject]): Self = StObject.set(x, "oscillators", value.asInstanceOf[js.Any])
    
    inline def setOscillatorsUndefined: Self = StObject.set(x, "oscillators", js.undefined)
    
    inline def setOscillatorsVarargs(value: SynthPatchOscillatorOptionsObject*): Self = StObject.set(x, "oscillators", js.Array(value*))
  }
}
