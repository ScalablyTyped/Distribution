package typings
package atLinguiReactLib.i18nProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait I18nProviderProps extends js.Object {
  var catalogs: js.UndefOr[atLinguiCoreLib.i18nMod.Catalogs] = js.undefined
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var defaultRender: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var i18n: js.UndefOr[atLinguiCoreLib.atLinguiCoreMod.I18n] = js.undefined
  var language: java.lang.String
  var locales: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var missing: js.UndefOr[
    java.lang.String | (js.Function2[/* language */ java.lang.String, /* id */ java.lang.String, java.lang.String])
  ] = js.undefined
}

object I18nProviderProps {
  @scala.inline
  def apply(
    language: java.lang.String,
    catalogs: atLinguiCoreLib.i18nMod.Catalogs = null,
    children: reactLib.reactMod.ReactNode = null,
    defaultRender: reactLib.reactMod.ReactNode = null,
    i18n: atLinguiCoreLib.atLinguiCoreMod.I18n = null,
    locales: java.lang.String | js.Array[java.lang.String] = null,
    missing: java.lang.String | (js.Function2[/* language */ java.lang.String, /* id */ java.lang.String, java.lang.String]) = null
  ): I18nProviderProps = {
    val __obj = js.Dynamic.literal(language = language)
    if (catalogs != null) __obj.updateDynamic("catalogs")(catalogs)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (defaultRender != null) __obj.updateDynamic("defaultRender")(defaultRender.asInstanceOf[js.Any])
    if (i18n != null) __obj.updateDynamic("i18n")(i18n)
    if (locales != null) __obj.updateDynamic("locales")(locales.asInstanceOf[js.Any])
    if (missing != null) __obj.updateDynamic("missing")(missing.asInstanceOf[js.Any])
    __obj.asInstanceOf[I18nProviderProps]
  }
}

