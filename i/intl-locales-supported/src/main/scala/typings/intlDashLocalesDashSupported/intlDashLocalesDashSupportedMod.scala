package typings.intlDashLocalesDashSupported

import typings.intlDashLocalesDashSupported.intlDashLocalesDashSupportedMod.IntlConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intl-locales-supported", JSImport.Namespace)
@js.native
object intlDashLocalesDashSupportedMod extends js.Object {
  @js.native
  trait IntlConstructor extends js.Object {
    def supportedLocalesOf(locales: String): js.Array[String] = js.native
    def supportedLocalesOf(locales: String, options: js.Any): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String], options: js.Any): js.Array[String] = js.native
  }
  
  def default(locales: String): Boolean = js.native
  def default(locales: String, constructorsToCheck: js.Array[IntlConstructor]): Boolean = js.native
  def default(locales: js.Array[String]): Boolean = js.native
  def default(locales: js.Array[String], constructorsToCheck: js.Array[IntlConstructor]): Boolean = js.native
}

