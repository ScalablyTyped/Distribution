package typings.k6

import org.scalablytyped.runtime.StringDictionary
import typings.k6.httpMod.RefinedParams
import typings.k6.httpMod.ResponseType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fields[RT /* <: js.UndefOr[ResponseType] */] extends js.Object {
  var fields: js.UndefOr[StringDictionary[String]] = js.undefined
  var formSelector: js.UndefOr[String] = js.undefined
  var params: js.UndefOr[RefinedParams[RT] | Null] = js.undefined
  var submitSelector: js.UndefOr[String] = js.undefined
}

object Anon_Fields {
  @scala.inline
  def apply[RT /* <: js.UndefOr[ResponseType] */](
    fields: StringDictionary[String] = null,
    formSelector: String = null,
    params: RefinedParams[RT] = null,
    submitSelector: String = null
  ): Anon_Fields[RT] = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (formSelector != null) __obj.updateDynamic("formSelector")(formSelector)
    if (params != null) __obj.updateDynamic("params")(params)
    if (submitSelector != null) __obj.updateDynamic("submitSelector")(submitSelector)
    __obj.asInstanceOf[Anon_Fields[RT]]
  }
}

