package typings.materialUiStyles.stylesProviderStylesProviderMod

import typings.jss.mod.GenerateId
import typings.jss.mod.Jss
import typings.jss.mod.Rule
import typings.jss.mod.StyleSheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StylesOptions extends js.Object {
  var disableGeneration: js.UndefOr[Boolean] = js.undefined
  var generateClassName: js.UndefOr[GenerateId] = js.undefined
  var injectFirst: js.UndefOr[Boolean] = js.undefined
  var jss: js.UndefOr[Jss] = js.undefined
  // TODO need info @oliviertassinari
  var sheetsCache: js.UndefOr[js.Object] = js.undefined
  // TODO need info @oliviertassinari
  var sheetsManager: js.UndefOr[js.Object] = js.undefined
  // TODO need info @oliviertassinari
  var sheetsRegistry: js.UndefOr[js.Object] = js.undefined
}

object StylesOptions {
  @scala.inline
  def apply(
    disableGeneration: js.UndefOr[Boolean] = js.undefined,
    generateClassName: (/* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String]]) => String = null,
    injectFirst: js.UndefOr[Boolean] = js.undefined,
    jss: Jss = null,
    sheetsCache: js.Object = null,
    sheetsManager: js.Object = null,
    sheetsRegistry: js.Object = null
  ): StylesOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disableGeneration)) __obj.updateDynamic("disableGeneration")(disableGeneration.asInstanceOf[js.Any])
    if (generateClassName != null) __obj.updateDynamic("generateClassName")(js.Any.fromFunction2(generateClassName))
    if (!js.isUndefined(injectFirst)) __obj.updateDynamic("injectFirst")(injectFirst.asInstanceOf[js.Any])
    if (jss != null) __obj.updateDynamic("jss")(jss.asInstanceOf[js.Any])
    if (sheetsCache != null) __obj.updateDynamic("sheetsCache")(sheetsCache.asInstanceOf[js.Any])
    if (sheetsManager != null) __obj.updateDynamic("sheetsManager")(sheetsManager.asInstanceOf[js.Any])
    if (sheetsRegistry != null) __obj.updateDynamic("sheetsRegistry")(sheetsRegistry.asInstanceOf[js.Any])
    __obj.asInstanceOf[StylesOptions]
  }
}

