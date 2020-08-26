package typings.k6.anon

import org.scalablytyped.runtime.StringDictionary
import typings.k6.httpMod.RefinedParams
import typings.k6.httpMod.ResponseType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fields[RT /* <: js.UndefOr[ResponseType] */] extends js.Object {
  var fields: js.UndefOr[StringDictionary[String]] = js.native
  var formSelector: js.UndefOr[String] = js.native
  var params: js.UndefOr[RefinedParams[RT] | Null] = js.native
  var submitSelector: js.UndefOr[String] = js.native
}

object Fields {
  @scala.inline
  def apply[/* <: js.UndefOr[typings.k6.httpMod.ResponseType] */ RT](): Fields[RT] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fields[RT]]
  }
  @scala.inline
  implicit class FieldsOps[Self <: Fields[_], /* <: js.UndefOr[typings.k6.httpMod.ResponseType] */ RT] (val x: Self with Fields[RT]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFields(value: StringDictionary[String]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setFormSelector(value: String): Self = this.set("formSelector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormSelector: Self = this.set("formSelector", js.undefined)
    @scala.inline
    def setParams(value: RefinedParams[RT]): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    @scala.inline
    def setParamsNull: Self = this.set("params", null)
    @scala.inline
    def setSubmitSelector(value: String): Self = this.set("submitSelector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubmitSelector: Self = this.set("submitSelector", js.undefined)
  }
  
}

