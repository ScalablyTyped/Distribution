package typings.humanizeDuration.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Humanizer_ extends js.Object {
  var languages: StringDictionary[UnitTranslationOptions] = js.native
  def apply(ms: Double): String = js.native
  def apply(ms: Double, options: Options): String = js.native
}

