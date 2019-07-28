package typings.jquery

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @deprecated ​ Deprecated. Internal. See \`{@link https://github.com/jquery/api.jquery.com/issues/912 }\`.
  */
@js.native
trait JQueryEasingFunctions extends /* name */ StringDictionary[JQueryEasingFunction] {
  @JSName("linear")
  var linear_Original: JQueryEasingFunction = js.native
  @JSName("swing")
  var swing_Original: JQueryEasingFunction = js.native
  def linear(percent: Double): Double = js.native
  def swing(percent: Double): Double = js.native
}

