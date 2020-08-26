package typings.graphql.executeMod

import typings.graphql.formatErrorMod.GraphQLFormattedError
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormattedExecutionResult[TData, TExtensions] extends js.Object {
  // TS_SPECIFIC: TData. Motivation: https://github.com/graphql/graphql-js/pull/2490#issuecomment-639154229
  var data: js.UndefOr[TData | Null] = js.native
  var errors: js.UndefOr[js.Array[GraphQLFormattedError[Record[String, _]]]] = js.native
  var extensions: js.UndefOr[TExtensions] = js.native
}

object FormattedExecutionResult {
  @scala.inline
  def apply[TData, TExtensions](): FormattedExecutionResult[TData, TExtensions] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormattedExecutionResult[TData, TExtensions]]
  }
  @scala.inline
  implicit class FormattedExecutionResultOps[Self <: FormattedExecutionResult[_, _], TData, TExtensions] (val x: Self with (FormattedExecutionResult[TData, TExtensions])) extends AnyVal {
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
    def setData(value: TData): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDataNull: Self = this.set("data", null)
    @scala.inline
    def setErrorsVarargs(value: (GraphQLFormattedError[Record[String, js.Any]])*): Self = this.set("errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: js.Array[GraphQLFormattedError[Record[String, _]]]): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
    @scala.inline
    def setExtensions(value: TExtensions): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
  }
  
}

