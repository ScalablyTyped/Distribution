package typings.k6

import typings.k6.httpMod.RefinedParams
import typings.k6.httpMod.ResponseType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Params[RT /* <: js.UndefOr[ResponseType] */] extends js.Object {
  var params: js.UndefOr[RefinedParams[RT] | Null] = js.undefined
  var selector: js.UndefOr[String] = js.undefined
}

object Anon_Params {
  @scala.inline
  def apply[RT /* <: js.UndefOr[ResponseType] */](params: RefinedParams[RT] = null, selector: String = null): Anon_Params[RT] = {
    val __obj = js.Dynamic.literal()
    if (params != null) __obj.updateDynamic("params")(params)
    if (selector != null) __obj.updateDynamic("selector")(selector)
    __obj.asInstanceOf[Anon_Params[RT]]
  }
}

