package typings.k6.anon

import typings.k6.httpMod.RefinedParams
import typings.k6.httpMod.ResponseType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Params[RT /* <: js.UndefOr[ResponseType] */] extends js.Object {
  var params: js.UndefOr[RefinedParams[RT] | Null] = js.undefined
  var selector: js.UndefOr[String] = js.undefined
}

object Params {
  @scala.inline
  def apply[RT](params: js.UndefOr[Null | RefinedParams[RT]] = js.undefined, selector: String = null): Params[RT] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(params)) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[Params[RT]]
  }
}

