package typings
package atLinguiCoreLib.i18nMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait setupI18nProps extends js.Object {
  var catalogs: js.UndefOr[Catalogs] = js.undefined
  var development: js.UndefOr[js.Object] = js.undefined
  var language: js.UndefOr[java.lang.String] = js.undefined
  var locales: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var missing: js.UndefOr[
    java.lang.String | (js.Function2[/* language */ java.lang.String, /* id */ java.lang.String, java.lang.String])
  ] = js.undefined
}

object setupI18nProps {
  @scala.inline
  def apply(
    catalogs: Catalogs = null,
    development: js.Object = null,
    language: java.lang.String = null,
    locales: js.Array[java.lang.String] = null,
    missing: java.lang.String | (js.Function2[/* language */ java.lang.String, /* id */ java.lang.String, java.lang.String]) = null
  ): setupI18nProps = {
    val __obj = js.Dynamic.literal()
    if (catalogs != null) __obj.updateDynamic("catalogs")(catalogs)
    if (development != null) __obj.updateDynamic("development")(development)
    if (language != null) __obj.updateDynamic("language")(language)
    if (locales != null) __obj.updateDynamic("locales")(locales)
    if (missing != null) __obj.updateDynamic("missing")(missing.asInstanceOf[js.Any])
    __obj.asInstanceOf[setupI18nProps]
  }
}

