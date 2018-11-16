package typings
package jsqrcodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ReedSolomonDecoder")
@js.native
class ReedSolomonDecoder protected () extends js.Object {
  def this(field: GF256) = this()
  var field: GF256 = js.native
  def decode(received: GF256, twoS: js.Array[scala.Double]): scala.Unit = js.native
  def findErrorLocations(errorLocator: GF256Poly): js.Array[scala.Double] = js.native
  def findErrorMagnitudes(errorEvaluator: GF256Poly, errorLocations: js.Array[scala.Double], dataMatrix: scala.Boolean): js.Array[scala.Double] = js.native
  def runEuclideanAlgorithm(a: GF256Poly, b: GF256Poly, R: scala.Double): js.Tuple2[GF256Poly, GF256Poly] = js.native
}

