package typings.jsqrcode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlignmentPattern extends js.Object {
  val Count: Double
  val EstimatedModuleSize: Double
  val X: Double
  val Y: Double
  var count: Double
  var estimatedModuleSize: Double
  var x: Double
  var y: Double
  def aboutEquals(moduleSize: Double, i: Double, j: Double): Boolean
  def incrementCount(): Unit
}

object AlignmentPattern {
  @scala.inline
  def apply(
    Count: Double,
    EstimatedModuleSize: Double,
    X: Double,
    Y: Double,
    aboutEquals: (Double, Double, Double) => Boolean,
    count: Double,
    estimatedModuleSize: Double,
    incrementCount: () => Unit,
    x: Double,
    y: Double
  ): AlignmentPattern = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], EstimatedModuleSize = EstimatedModuleSize.asInstanceOf[js.Any], X = X.asInstanceOf[js.Any], Y = Y.asInstanceOf[js.Any], aboutEquals = js.Any.fromFunction3(aboutEquals), count = count.asInstanceOf[js.Any], estimatedModuleSize = estimatedModuleSize.asInstanceOf[js.Any], incrementCount = js.Any.fromFunction0(incrementCount), x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlignmentPattern]
  }
}

