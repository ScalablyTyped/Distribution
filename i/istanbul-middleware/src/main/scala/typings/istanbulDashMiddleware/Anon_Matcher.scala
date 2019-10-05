package typings.istanbulDashMiddleware

import typings.express.expressMod.Request
import typings.istanbulDashMiddleware.istanbulDashMiddlewareMod.ClientMatcher
import typings.istanbulDashMiddleware.istanbulDashMiddlewareMod.PathTransformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Matcher extends js.Object {
  var matcher: js.UndefOr[ClientMatcher] = js.undefined
  var pathTransformer: js.UndefOr[PathTransformer] = js.undefined
  var verbose: js.UndefOr[Boolean] = js.undefined
}

object Anon_Matcher {
  @scala.inline
  def apply(
    matcher: /* req */ Request => Boolean = null,
    pathTransformer: /* req */ Request => String = null,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): Anon_Matcher = {
    val __obj = js.Dynamic.literal()
    if (matcher != null) __obj.updateDynamic("matcher")(js.Any.fromFunction1(matcher))
    if (pathTransformer != null) __obj.updateDynamic("pathTransformer")(js.Any.fromFunction1(pathTransformer))
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose)
    __obj.asInstanceOf[Anon_Matcher]
  }
}

