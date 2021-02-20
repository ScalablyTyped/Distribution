package typings.jsqrcode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetectorResult extends StObject {
  
  var bits: BitMatrix = js.native
  
  var points: (js.Tuple3[DetectorResult, DetectorResult, DetectorResult]) | (js.Tuple4[DetectorResult, DetectorResult, DetectorResult, DetectorResult]) = js.native
}
object DetectorResult {
  
  @scala.inline
  def apply(
    bits: BitMatrix,
    points: (js.Tuple3[DetectorResult, DetectorResult, DetectorResult]) | (js.Tuple4[DetectorResult, DetectorResult, DetectorResult, DetectorResult])
  ): DetectorResult = {
    val __obj = js.Dynamic.literal(bits = bits.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectorResult]
  }
  
  @scala.inline
  implicit class DetectorResultMutableBuilder[Self <: DetectorResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBits(value: BitMatrix): Self = StObject.set(x, "bits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoints(
      value: (js.Tuple3[DetectorResult, DetectorResult, DetectorResult]) | (js.Tuple4[DetectorResult, DetectorResult, DetectorResult, DetectorResult])
    ): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
  }
}
