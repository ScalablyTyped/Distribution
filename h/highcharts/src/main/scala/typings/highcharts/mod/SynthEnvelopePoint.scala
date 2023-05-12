package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<'t' | 'vol', number> */
trait SynthEnvelopePoint extends StObject {
  
  var t: Double
  
  var vol: Double
}
object SynthEnvelopePoint {
  
  inline def apply(t: Double, vol: Double): SynthEnvelopePoint = {
    val __obj = js.Dynamic.literal(t = t.asInstanceOf[js.Any], vol = vol.asInstanceOf[js.Any])
    __obj.asInstanceOf[SynthEnvelopePoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SynthEnvelopePoint] (val x: Self) extends AnyVal {
    
    inline def setT(value: Double): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
    
    inline def setVol(value: Double): Self = StObject.set(x, "vol", value.asInstanceOf[js.Any])
  }
}
