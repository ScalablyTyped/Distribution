package typings.lasso.lassoMod

import typings.lasso.dependenciesMod.Bundle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LassoConfig extends js.Object {
  var baseDir: js.UndefOr[String] = js.undefined
  var bundles: js.UndefOr[js.Array[Bundle]] = js.undefined
  var bundlingEnabled: js.UndefOr[Boolean] = js.undefined
  var cspNonceProvider: js.UndefOr[js.Function1[/* out */ js.Any, String]] = js.undefined
  var fingerprintInlineCode: js.UndefOr[js.Function1[/* code */ js.Any, String]] = js.undefined
  var fingerprintsEnabled: js.UndefOr[Boolean] = js.undefined
  var includeSlotNames: js.UndefOr[Boolean] = js.undefined
  var minify: js.UndefOr[Boolean] = js.undefined
  var minifyCSS: js.UndefOr[Boolean] = js.undefined
  var minifyInlineCSSOnly: js.UndefOr[Boolean] = js.undefined
  var minifyInlineJSOnly: js.UndefOr[Boolean] = js.undefined
  var minifyInlineOnly: js.UndefOr[Boolean] = js.undefined
  var minifyJS: js.UndefOr[Boolean] = js.undefined
  var noConflict: js.UndefOr[String] = js.undefined
  var outputDir: js.UndefOr[String] = js.undefined
  var plugins: js.UndefOr[js.Array[CustomPlugin | String]] = js.undefined
  var relativeUrlsEnabled: js.UndefOr[Boolean] = js.undefined
  var require: js.UndefOr[js.Any] = js.undefined
  var resolveCssUrls: js.UndefOr[Boolean] = js.undefined
  var urlPrefix: js.UndefOr[String] = js.undefined
}

object LassoConfig {
  @scala.inline
  def apply(
    baseDir: String = null,
    bundles: js.Array[Bundle] = null,
    bundlingEnabled: js.UndefOr[Boolean] = js.undefined,
    cspNonceProvider: /* out */ js.Any => String = null,
    fingerprintInlineCode: /* code */ js.Any => String = null,
    fingerprintsEnabled: js.UndefOr[Boolean] = js.undefined,
    includeSlotNames: js.UndefOr[Boolean] = js.undefined,
    minify: js.UndefOr[Boolean] = js.undefined,
    minifyCSS: js.UndefOr[Boolean] = js.undefined,
    minifyInlineCSSOnly: js.UndefOr[Boolean] = js.undefined,
    minifyInlineJSOnly: js.UndefOr[Boolean] = js.undefined,
    minifyInlineOnly: js.UndefOr[Boolean] = js.undefined,
    minifyJS: js.UndefOr[Boolean] = js.undefined,
    noConflict: String = null,
    outputDir: String = null,
    plugins: js.Array[CustomPlugin | String] = null,
    relativeUrlsEnabled: js.UndefOr[Boolean] = js.undefined,
    require: js.Any = null,
    resolveCssUrls: js.UndefOr[Boolean] = js.undefined,
    urlPrefix: String = null
  ): LassoConfig = {
    val __obj = js.Dynamic.literal()
    if (baseDir != null) __obj.updateDynamic("baseDir")(baseDir.asInstanceOf[js.Any])
    if (bundles != null) __obj.updateDynamic("bundles")(bundles.asInstanceOf[js.Any])
    if (!js.isUndefined(bundlingEnabled)) __obj.updateDynamic("bundlingEnabled")(bundlingEnabled.asInstanceOf[js.Any])
    if (cspNonceProvider != null) __obj.updateDynamic("cspNonceProvider")(js.Any.fromFunction1(cspNonceProvider))
    if (fingerprintInlineCode != null) __obj.updateDynamic("fingerprintInlineCode")(js.Any.fromFunction1(fingerprintInlineCode))
    if (!js.isUndefined(fingerprintsEnabled)) __obj.updateDynamic("fingerprintsEnabled")(fingerprintsEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(includeSlotNames)) __obj.updateDynamic("includeSlotNames")(includeSlotNames.asInstanceOf[js.Any])
    if (!js.isUndefined(minify)) __obj.updateDynamic("minify")(minify.asInstanceOf[js.Any])
    if (!js.isUndefined(minifyCSS)) __obj.updateDynamic("minifyCSS")(minifyCSS.asInstanceOf[js.Any])
    if (!js.isUndefined(minifyInlineCSSOnly)) __obj.updateDynamic("minifyInlineCSSOnly")(minifyInlineCSSOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(minifyInlineJSOnly)) __obj.updateDynamic("minifyInlineJSOnly")(minifyInlineJSOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(minifyInlineOnly)) __obj.updateDynamic("minifyInlineOnly")(minifyInlineOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(minifyJS)) __obj.updateDynamic("minifyJS")(minifyJS.asInstanceOf[js.Any])
    if (noConflict != null) __obj.updateDynamic("noConflict")(noConflict.asInstanceOf[js.Any])
    if (outputDir != null) __obj.updateDynamic("outputDir")(outputDir.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (!js.isUndefined(relativeUrlsEnabled)) __obj.updateDynamic("relativeUrlsEnabled")(relativeUrlsEnabled.asInstanceOf[js.Any])
    if (require != null) __obj.updateDynamic("require")(require.asInstanceOf[js.Any])
    if (!js.isUndefined(resolveCssUrls)) __obj.updateDynamic("resolveCssUrls")(resolveCssUrls.asInstanceOf[js.Any])
    if (urlPrefix != null) __obj.updateDynamic("urlPrefix")(urlPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[LassoConfig]
  }
}

