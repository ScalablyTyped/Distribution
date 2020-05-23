package typings.jsqrcode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReedSolomonDecoder extends js.Object {
  var field: GF256
  def decode(received: GF256, twoS: js.Array[Double]): Unit
  def findErrorLocations(errorLocator: GF256Poly): js.Array[Double]
  def findErrorMagnitudes(errorEvaluator: GF256Poly, errorLocations: js.Array[Double], dataMatrix: Boolean): js.Array[Double]
  def runEuclideanAlgorithm(a: GF256Poly, b: GF256Poly, R: Double): js.Tuple2[GF256Poly, GF256Poly]
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
}

