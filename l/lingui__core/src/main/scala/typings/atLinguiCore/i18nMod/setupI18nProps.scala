package typings.atLinguiCore.i18nMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait setupI18nProps extends js.Object {
  var catalogs: js.UndefOr[Catalogs] = js.undefined
  var development: js.UndefOr[js.Object] = js.undefined
  var language: js.UndefOr[String] = js.undefined
  var locales: js.UndefOr[js.Array[String]] = js.undefined
  var missing: js.UndefOr[String | (js.Function2[/* language */ String, /* id */ String, String])] = js.undefined
}

object setupI18nProps {
  @scala.inline
  def apply(
    catalogs: Catalogs = null,
    development: js.Object = null,
    language: String = null,
    locales: js.Array[String] = null,
    missing: String | (js.Function2[/* language */ String, /* id */ String, String]) = null
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

