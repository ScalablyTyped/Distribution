package typings
package gulpDashRubyDashSassLib.gulpDashRubyDashSassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The interface includes the node-ruby-sass only options.
  * Attention: sourcemap option type differs from the same SassOption's type.
  * @interface Options
  * @extends SassOptions
  */
trait Options extends SassOptions {
  var bundleExec: js.UndefOr[scala.Boolean] = js.undefined
  var container: js.UndefOr[java.lang.String] = js.undefined
  @JSName("sourcemap")
  var sourcemap_Options: js.UndefOr[scala.Boolean] = js.undefined
  var verbose: js.UndefOr[scala.Boolean] = js.undefined
}

