package typings
package gulpDashPugDashI18nLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Default extends js.Object {
  var default: js.UndefOr[java.lang.String] = js.undefined
  var filename: js.UndefOr[java.lang.String] = js.undefined
  var locales: java.lang.String | js.Array[java.lang.String]
  var namespace: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

object Anon_Default {
  @scala.inline
  def apply(
    locales: java.lang.String | js.Array[java.lang.String],
    default: java.lang.String = null,
    filename: java.lang.String = null,
    namespace: java.lang.String = null
  ): Anon_Default = {
    val __obj = js.Dynamic.literal(locales = locales.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (namespace != null) __obj.updateDynamic("namespace")(namespace)
    __obj.asInstanceOf[Anon_Default]
  }
}

