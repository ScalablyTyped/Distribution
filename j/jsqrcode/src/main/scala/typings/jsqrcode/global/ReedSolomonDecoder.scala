package typings.jsqrcode.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ReedSolomonDecoder")
@js.native
class ReedSolomonDecoder protected ()
  extends typings.jsqrcode.ReedSolomonDecoder {
  def this(field: typings.jsqrcode.GF256) = this()
  /* CompleteClass */
  override var field: typings.jsqrcode.GF256 = js.native
  /* CompleteClass */
  override def decode(received: typings.jsqrcode.GF256, twoS: js.Array[Double]): Unit = js.native
  /* CompleteClass */
  override def findErrorLocations(errorLocator: typings.jsqrcode.GF256Poly): js.Array[Double] = js.native
  /* CompleteClass */
  override def findErrorMagnitudes(errorEvaluator: typings.jsqrcode.GF256Poly, errorLocations: js.Array[Double], dataMatrix: Boolean): js.Array[Double] = js.native
  /* CompleteClass */
  override def runEuclideanAlgorithm(a: typings.jsqrcode.GF256Poly, b: typings.jsqrcode.GF256Poly, R: Double): js.Tuple2[typings.jsqrcode.GF256Poly, typings.jsqrcode.GF256Poly] = js.native
}

