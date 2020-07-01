package typings.k6.anon

import org.scalablytyped.runtime.StringDictionary
import typings.k6.httpMod.RefinedParams
import typings.k6.httpMod.ResponseType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fields[RT /* <: js.UndefOr[ResponseType] */] extends js.Object {
  var fields: js.UndefOr[StringDictionary[String]] = js.undefined
  var formSelector: js.UndefOr[String] = js.undefined
  var params: js.UndefOr[RefinedParams[RT] | Null] = js.undefined
  var submitSelector: js.UndefOr[String] = js.undefined
}

object Fields {
  @scala.inline
  def apply[/* <: js.UndefOr[typings.k6.httpMod.ResponseType] */ RT](
    fields: StringDictionary[String] = null,
    formSelector: String = null,
    params: js.UndefOr[Null | RefinedParams[RT]] = js.undefined,
    submitSelector: String = null
  ): Fields[RT] = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (formSelector != null) __obj.updateDynamic("formSelector")(formSelector.asInstanceOf[js.Any])
    if (!js.isUndefined(params)) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (submitSelector != null) __obj.updateDynamic("submitSelector")(submitSelector.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fields[RT]]
  }
}

