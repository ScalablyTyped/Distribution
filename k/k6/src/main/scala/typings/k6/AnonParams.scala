package typings.k6

import typings.k6.httpMod.RefinedParams
import typings.k6.httpMod.ResponseType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonParams[RT /* <: js.UndefOr[ResponseType] */] extends js.Object {
  var params: js.UndefOr[RefinedParams[RT] | Null] = js.undefined
  var selector: js.UndefOr[String] = js.undefined
}

object AnonParams {
  @scala.inline
  def apply[RT /* <: js.UndefOr[ResponseType] */](params: RefinedParams[RT] = null, selector: String = null): AnonParams[RT] = {
    val __obj = js.Dynamic.literal()
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonParams[RT]]
  }
}

