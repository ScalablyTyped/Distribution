package typings
package intlDashMessageformatLib.intlDashMessageformatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intl-messageformat", JSImport.Namespace)
@js.native
class namespaced protected () extends IntlMessageFormat {
  def this(message: java.lang.String, locales: java.lang.String) = this()
  def this(message: java.lang.String, locales: js.Array[java.lang.String]) = this()
  def this(message: java.lang.String, locales: java.lang.String, formats: js.Any) = this()
  def this(message: java.lang.String, locales: js.Array[java.lang.String], formats: js.Any) = this()
  /* CompleteClass */
  override def format(arg: js.Any): java.lang.String = js.native
  /* CompleteClass */
  override def resolvedOptions(): intlDashMessageformatLib.Anon_Locale = js.native
}

/* static members */
@JSImport("intl-messageformat", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  var default: js.Any = js.native
  var defaultLocale: java.lang.String = js.native
  var formats: intlDashMessageformatLib.Anon_Date = js.native
}

