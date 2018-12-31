package typings
package gulpDashRubyDashSassLib.gulpDashRubyDashSassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The interface includes all options that available for sass executable.
  * Options are converted from dashed to camelCase
  * @interface SassOptions
  */
trait SassOptions extends js.Object {
  var cacheLocation: js.UndefOr[java.lang.String] = js.undefined
  var check: js.UndefOr[scala.Boolean] = js.undefined
  var compass: js.UndefOr[scala.Boolean] = js.undefined
  var debugInfo: js.UndefOr[scala.Boolean] = js.undefined
  var defaultEncoding: js.UndefOr[java.lang.String] = js.undefined
  var force: js.UndefOr[scala.Boolean] = js.undefined
  var interactive: js.UndefOr[scala.Boolean] = js.undefined
  var lineComments: js.UndefOr[scala.Boolean] = js.undefined
  var lineNumbers: js.UndefOr[scala.Boolean] = js.undefined
  var loadPath: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var noCache: js.UndefOr[scala.Boolean] = js.undefined
  var precision: js.UndefOr[scala.Double] = js.undefined
  var quiet: js.UndefOr[scala.Boolean] = js.undefined
  var require: js.UndefOr[java.lang.String] = js.undefined
  var scss: js.UndefOr[scala.Boolean] = js.undefined
  // Actually, there should be a string. However due to ts spec, overriding member should be the same type or a subtype.
  // http://stackoverflow.com/questions/19605557/incompatible-static-properties-in-three-d-ts-with-latest-typescript
  // We need Options.soucemap to be boolean, so here 'any' is used instead of string.
  var sourcemap: js.UndefOr[js.Any] = js.undefined
  var stdin: js.UndefOr[scala.Boolean] = js.undefined
  var stopOnError: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[java.lang.String] = js.undefined
  var trace: js.UndefOr[scala.Boolean] = js.undefined
  var unixNewlines: js.UndefOr[scala.Boolean] = js.undefined
  var update: js.UndefOr[java.lang.String] = js.undefined
  // All listed below options are acceptable by the sass executable and potentially may be used from js.
  // However I doubt are there cases when it's meaningful
  var watch: js.UndefOr[java.lang.String] = js.undefined
}

