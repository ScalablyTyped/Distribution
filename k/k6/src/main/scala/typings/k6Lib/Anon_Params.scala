package typings
package k6Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Params[RT /* <: js.UndefOr[k6Lib.httpMod.ResponseType] */] extends js.Object {
  var params: js.UndefOr[k6Lib.httpMod.RefinedParams[RT] | scala.Null] = js.undefined
  var selector: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Params {
  @scala.inline
  def apply[RT /* <: js.UndefOr[k6Lib.httpMod.ResponseType] */](params: k6Lib.httpMod.RefinedParams[RT] = null, selector: java.lang.String = null): Anon_Params[RT] = {
    val __obj = js.Dynamic.literal()
    if (params != null) __obj.updateDynamic("params")(params)
    if (selector != null) __obj.updateDynamic("selector")(selector)
    __obj.asInstanceOf[Anon_Params[RT]]
  }
}

