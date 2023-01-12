package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OscillatorOptionsObject extends StObject {
  
  /**
    * The waveform shape to use for oscillator instruments. Defaults to
    * `sine`.
    */
  var waveformShape: js.UndefOr[String] = js.undefined
}
object OscillatorOptionsObject {
  
  inline def apply(): OscillatorOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OscillatorOptionsObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OscillatorOptionsObject] (val x: Self) extends AnyVal {
    
    inline def setWaveformShape(value: String): Self = StObject.set(x, "waveformShape", value.asInstanceOf[js.Any])
    
    inline def setWaveformShapeUndefined: Self = StObject.set(x, "waveformShape", js.undefined)
  }
}
