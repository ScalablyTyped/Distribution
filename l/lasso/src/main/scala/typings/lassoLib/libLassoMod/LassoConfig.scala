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

