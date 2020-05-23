package typings.istanbulMiddleware.anon

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.istanbulMiddleware.mod.ClientMatcher
import typings.istanbulMiddleware.mod.PathTransformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Matcher extends js.Object {
  var matcher: js.UndefOr[ClientMatcher] = js.undefined
  var pathTransformer: js.UndefOr[PathTransformer] = js.undefined
  var verbose: js.UndefOr[Boolean] = js.undefined
}

object Matcher {
  @scala.inline
  def apply(
    matcher: /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query] => Boolean = null,
    pathTransformer: /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query] => String = null,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): Matcher = {
    val __obj = js.Dynamic.literal()
    if (matcher != null) __obj.updateDynamic("matcher")(js.Any.fromFunction1(matcher))
    if (pathTransformer != null) __obj.updateDynamic("pathTransformer")(js.Any.fromFunction1(pathTransformer))
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Matcher]
  }
}

