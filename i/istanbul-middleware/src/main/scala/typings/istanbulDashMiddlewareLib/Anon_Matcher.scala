package typings
package istanbulDashMiddlewareLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Matcher extends js.Object {
  var matcher: js.UndefOr[istanbulDashMiddlewareLib.istanbulDashMiddlewareMod.ClientMatcher] = js.undefined
  var pathTransformer: js.UndefOr[istanbulDashMiddlewareLib.istanbulDashMiddlewareMod.PathTransformer] = js.undefined
  var verbose: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Matcher {
  @scala.inline
  def apply(
    matcher: istanbulDashMiddlewareLib.istanbulDashMiddlewareMod.ClientMatcher = null,
    pathTransformer: istanbulDashMiddlewareLib.istanbulDashMiddlewareMod.PathTransformer = null,
    verbose: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Matcher = {
    val __obj = js.Dynamic.literal()
    if (matcher != null) __obj.updateDynamic("matcher")(matcher)
    if (pathTransformer != null) __obj.updateDynamic("pathTransformer")(pathTransformer)
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose)
    __obj.asInstanceOf[Anon_Matcher]
  }
}

