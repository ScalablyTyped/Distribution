package typings.atLinguiReact.i18nProviderMod

import typings.atLinguiCore.atLinguiCoreMod.I18n
import typings.atLinguiCore.i18nMod.Catalogs
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait I18nProviderProps extends js.Object {
  var catalogs: js.UndefOr[Catalogs] = js.undefined
  var children: js.UndefOr[ReactNode] = js.undefined
  var defaultRender: js.UndefOr[ReactNode] = js.undefined
  var i18n: js.UndefOr[I18n] = js.undefined
  var language: String
  var locales: js.UndefOr[String | js.Array[String]] = js.undefined
  var missing: js.UndefOr[String | (js.Function2[/* language */ String, /* id */ String, String])] = js.undefined
}

object I18nProviderProps {
  @scala.inline
  def apply(
    language: String,
    catalogs: Catalogs = null,
    children: ReactNode = null,
    defaultRender: ReactNode = null,
    i18n: I18n = null,
    locales: String | js.Array[String] = null,
    missing: String | (js.Function2[/* language */ String, /* id */ String, String]) = null
  ): I18nProviderProps = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any])
    if (catalogs != null) __obj.updateDynamic("catalogs")(catalogs.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (defaultRender != null) __obj.updateDynamic("defaultRender")(defaultRender.asInstanceOf[js.Any])
    if (i18n != null) __obj.updateDynamic("i18n")(i18n.asInstanceOf[js.Any])
    if (locales != null) __obj.updateDynamic("locales")(locales.asInstanceOf[js.Any])
    if (missing != null) __obj.updateDynamic("missing")(missing.asInstanceOf[js.Any])
    __obj.asInstanceOf[I18nProviderProps]
  }
}

