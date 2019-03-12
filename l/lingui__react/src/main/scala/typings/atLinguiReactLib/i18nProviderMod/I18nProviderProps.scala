package typings
package atLinguiReactLib.i18nProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait I18nProviderProps extends js.Object {
  var catalogs: js.UndefOr[atLinguiCoreLib.i18nMod.Catalogs] = js.undefined
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var defaultRender: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var i18n: js.UndefOr[atLinguiCoreLib.atLinguiCoreMod.I18n] = js.undefined
  var language: java.lang.String
}

object I18nProviderProps {
  @scala.inline
  def apply(
    language: java.lang.String,
    catalogs: atLinguiCoreLib.i18nMod.Catalogs = null,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    defaultRender: reactLib.reactMod.ReactNs.ReactNode = null,
    i18n: atLinguiCoreLib.atLinguiCoreMod.I18n = null
  ): I18nProviderProps = {
    val __obj = js.Dynamic.literal(language = language)
    if (catalogs != null) __obj.updateDynamic("catalogs")(catalogs)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (defaultRender != null) __obj.updateDynamic("defaultRender")(defaultRender.asInstanceOf[js.Any])
    if (i18n != null) __obj.updateDynamic("i18n")(i18n)
    __obj.asInstanceOf[I18nProviderProps]
  }
}

