package typings.knockoutPaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutSlidingPageGenerator extends KnockoutPageGenerator {
  @JSName("windowSize")
  var windowSize_Original: KnockoutObservable[Double] = js.native
  def windowSize(): Double = js.native
  def windowSize(value: Double): Unit = js.native
}

