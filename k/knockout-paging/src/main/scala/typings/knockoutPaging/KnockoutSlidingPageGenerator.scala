package typings.knockoutPaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutSlidingPageGenerator extends KnockoutPageGenerator {
  
  def windowSize(): Double = js.native
  def windowSize(value: Double): Unit = js.native
  @JSName("windowSize")
  var windowSize_Original: KnockoutObservable[Double] = js.native
}
