package typings.jsqrcode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReedSolomonDecoder extends StObject {
  
  def decode(received: GF256, twoS: js.Array[Double]): Unit = js.native
  
  var field: GF256 = js.native
  
  def findErrorLocations(errorLocator: GF256Poly): js.Array[Double] = js.native
  
  def findErrorMagnitudes(errorEvaluator: GF256Poly, errorLocations: js.Array[Double], dataMatrix: Boolean): js.Array[Double] = js.native
  
  def runEuclideanAlgorithm(a: GF256Poly, b: GF256Poly, R: Double): js.Tuple2[GF256Poly, GF256Poly] = js.native
}
object ReedSolomonDecoder {
  
  @scala.inline
  def apply(
    decode: (GF256, js.Array[Double]) => Unit,
    field: GF256,
    findErrorLocations: GF256Poly => js.Array[Double],
    findErrorMagnitudes: (GF256Poly, js.Array[Double], Boolean) => js.Array[Double],
    runEuclideanAlgorithm: (GF256Poly, GF256Poly, Double) => js.Tuple2[GF256Poly, GF256Poly]
  ): ReedSolomonDecoder = {
    val __obj = js.Dynamic.literal(decode = js.Any.fromFunction2(decode), field = field.asInstanceOf[js.Any], findErrorLocations = js.Any.fromFunction1(findErrorLocations), findErrorMagnitudes = js.Any.fromFunction3(findErrorMagnitudes), runEuclideanAlgorithm = js.Any.fromFunction3(runEuclideanAlgorithm))
    __obj.asInstanceOf[ReedSolomonDecoder]
  }
  
  @scala.inline
  implicit class ReedSolomonDecoderMutableBuilder[Self <: ReedSolomonDecoder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDecode(value: (GF256, js.Array[Double]) => Unit): Self = StObject.set(x, "decode", js.Any.fromFunction2(value))
    
    @scala.inline
    def setField(value: GF256): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindErrorLocations(value: GF256Poly => js.Array[Double]): Self = StObject.set(x, "findErrorLocations", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFindErrorMagnitudes(value: (GF256Poly, js.Array[Double], Boolean) => js.Array[Double]): Self = StObject.set(x, "findErrorMagnitudes", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRunEuclideanAlgorithm(value: (GF256Poly, GF256Poly, Double) => js.Tuple2[GF256Poly, GF256Poly]): Self = StObject.set(x, "runEuclideanAlgorithm", js.Any.fromFunction3(value))
  }
}
