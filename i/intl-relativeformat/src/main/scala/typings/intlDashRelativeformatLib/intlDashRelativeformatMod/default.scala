package typings
package intlDashRelativeformatLib.intlDashRelativeformatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intl-relativeformat", JSImport.Default)
@js.native
class default protected () extends IntlRelativeFormat {
  /**
    * To format a date to relative time, use the IntlRelativeFormat constructor.
    * The constructor takes two parameters:
    *
    * @param locales A string with a BCP 47 language tag, or an array of
    * such strings. If you do not provide a locale, the default locale will be used.
    * When an array of locales is provided, each item and its ancestor locales are checked
    * and the first one with registered locale data is returned. See: Locale Resolution
    * for more details.
    * @see https://github.com/yahoo/intl-relativeformat#locale-resolution
    *
    * @param optionas object with user defined options for format styles.
    * See: Custom Options for more details.
    * @see https://github.com/yahoo/intl-relativeformat#custom-options
    * Note: The rf instance should be enough for your entire application,
    * unless you want to use custom options.
    */
  def this(locales: java.lang.String) = this()
  def this(locales: js.Array[java.lang.String]) = this()
  def this(locales: java.lang.String, options: stdLib.IntlNs.DateTimeFormatOptions with intlDashRelativeformatLib.Anon_Units) = this()
  def this(locales: js.Array[java.lang.String], options: stdLib.IntlNs.DateTimeFormatOptions with intlDashRelativeformatLib.Anon_Units) = this()
}

