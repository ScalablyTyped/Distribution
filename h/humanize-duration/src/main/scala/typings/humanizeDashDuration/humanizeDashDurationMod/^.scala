package typings.humanizeDashDuration.humanizeDashDurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("humanize-duration", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(ms: Double): String = js.native
  def apply(ms: Double, options: Options): String = js.native
  /**
    * This function won't return any new languages you define; it will only return the defaults supported by the library.
    */
  def getSupportedLanguages(): js.Array[LanguageCode] = js.native
  def humanizer(): Humanizer = js.native
  def humanizer(options: HumanizerOptions): Humanizer = js.native
}

