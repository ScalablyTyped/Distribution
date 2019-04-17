package typings
package humanizeDashDurationLib.humanizeDashDurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Humanizer extends js.Object {
  var languages: org.scalablytyped.runtime.StringDictionary[UnitTranslationOptions] = js.native
  def apply(ms: scala.Double): java.lang.String = js.native
  def apply(ms: scala.Double, options: Options): java.lang.String = js.native
}

