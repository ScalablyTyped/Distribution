package typings.highcharts.sonificationMod.highchartsAugmentingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OscillatorOptionsObject extends StObject {
  
  /**
    * The waveform shape to use for oscillator instruments. Defaults to
    * `sine`.
    */
  var waveformShape: js.UndefOr[String] = js.native
}
object OscillatorOptionsObject {
  
  @scala.inline
  def apply(): OscillatorOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OscillatorOptionsObject]
  }
  
  @scala.inline
  implicit class OscillatorOptionsObjectMutableBuilder[Self <: OscillatorOptionsObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWaveformShape(value: String): Self = StObject.set(x, "waveformShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaveformShapeUndefined: Self = StObject.set(x, "waveformShape", js.undefined)
  }
}
