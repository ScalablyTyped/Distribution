package typings
package lassoLib.libLassoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LassoConfig extends js.Object {
  var baseDir: js.UndefOr[java.lang.String] = js.undefined
  var bundles: js.UndefOr[js.Array[lassoLib.libDependenciesMod.Bundle]] = js.undefined
  var bundlingEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var cspNonceProvider: js.UndefOr[js.Function1[/* out */ js.Any, java.lang.String]] = js.undefined
  var fingerprintInlineCode: js.UndefOr[js.Function1[/* code */ js.Any, java.lang.String]] = js.undefined
  var fingerprintsEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var includeSlotNames: js.UndefOr[scala.Boolean] = js.undefined
  var minify: js.UndefOr[scala.Boolean] = js.undefined
  var minifyCSS: js.UndefOr[scala.Boolean] = js.undefined
  var minifyInlineCSSOnly: js.UndefOr[scala.Boolean] = js.undefined
  var minifyInlineJSOnly: js.UndefOr[scala.Boolean] = js.undefined
  var minifyInlineOnly: js.UndefOr[scala.Boolean] = js.undefined
  var minifyJS: js.UndefOr[scala.Boolean] = js.undefined
  var noConflict: js.UndefOr[java.lang.String] = js.undefined
  var outputDir: js.UndefOr[java.lang.String] = js.undefined
  var plugins: js.UndefOr[js.Array[java.lang.String] | js.Array[CustomPlugin]] = js.undefined
  var relativeUrlsEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var require: js.UndefOr[js.Any] = js.undefined
  var resolveCssUrls: js.UndefOr[scala.Boolean] = js.undefined
  var urlPrefix: js.UndefOr[java.lang.String] = js.undefined
}

object LassoConfig {
  @scala.inline
  def apply(
    baseDir: java.lang.String = null,
    bundles: js.Array[lassoLib.libDependenciesMod.Bundle] = null,
    bundlingEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    cspNonceProvider: js.Function1[/* out */ js.Any, java.lang.String] = null,
    fingerprintInlineCode: js.Function1[/* code */ js.Any, java.lang.String] = null,
    fingerprintsEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    includeSlotNames: js.UndefOr[scala.Boolean] = js.undefined,
    minify: js.UndefOr[scala.Boolean] = js.undefined,
    minifyCSS: js.UndefOr[scala.Boolean] = js.undefined,
    minifyInlineCSSOnly: js.UndefOr[scala.Boolean] = js.undefined,
    minifyInlineJSOnly: js.UndefOr[scala.Boolean] = js.undefined,
    minifyInlineOnly: js.UndefOr[scala.Boolean] = js.undefined,
    minifyJS: js.UndefOr[scala.Boolean] = js.undefined,
    noConflict: java.lang.String = null,
    outputDir: java.lang.String = null,
    plugins: js.Array[java.lang.String] | js.Array[CustomPlugin] = null,
    relativeUrlsEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    require: js.Any = null,
    resolveCssUrls: js.UndefOr[scala.Boolean] = js.undefined,
    urlPrefix: java.lang.String = null
  ): LassoConfig = {
    val __obj = js.Dynamic.literal()
    if (baseDir != null) __obj.updateDynamic("baseDir")(baseDir)
    if (bundles != null) __obj.updateDynamic("bundles")(bundles)
    if (!js.isUndefined(bundlingEnabled)) __obj.updateDynamic("bundlingEnabled")(bundlingEnabled)
    if (cspNonceProvider != null) __obj.updateDynamic("cspNonceProvider")(cspNonceProvider)
    if (fingerprintInlineCode != null) __obj.updateDynamic("fingerprintInlineCode")(fingerprintInlineCode)
    if (!js.isUndefined(fingerprintsEnabled)) __obj.updateDynamic("fingerprintsEnabled")(fingerprintsEnabled)
    if (!js.isUndefined(includeSlotNames)) __obj.updateDynamic("includeSlotNames")(includeSlotNames)
    if (!js.isUndefined(minify)) __obj.updateDynamic("minify")(minify)
    if (!js.isUndefined(minifyCSS)) __obj.updateDynamic("minifyCSS")(minifyCSS)
    if (!js.isUndefined(minifyInlineCSSOnly)) __obj.updateDynamic("minifyInlineCSSOnly")(minifyInlineCSSOnly)
    if (!js.isUndefined(minifyInlineJSOnly)) __obj.updateDynamic("minifyInlineJSOnly")(minifyInlineJSOnly)
    if (!js.isUndefined(minifyInlineOnly)) __obj.updateDynamic("minifyInlineOnly")(minifyInlineOnly)
    if (!js.isUndefined(minifyJS)) __obj.updateDynamic("minifyJS")(minifyJS)
    if (noConflict != null) __obj.updateDynamic("noConflict")(noConflict)
    if (outputDir != null) __obj.updateDynamic("outputDir")(outputDir)
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (!js.isUndefined(relativeUrlsEnabled)) __obj.updateDynamic("relativeUrlsEnabled")(relativeUrlsEnabled)
    if (require != null) __obj.updateDynamic("require")(require)
    if (!js.isUndefined(resolveCssUrls)) __obj.updateDynamic("resolveCssUrls")(resolveCssUrls)
    if (urlPrefix != null) __obj.updateDynamic("urlPrefix")(urlPrefix)
    __obj.asInstanceOf[LassoConfig]
  }
}

