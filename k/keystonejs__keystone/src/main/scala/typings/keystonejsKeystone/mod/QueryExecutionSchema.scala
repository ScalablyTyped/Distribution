package typings.keystonejsKeystone.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryExecutionSchema extends js.Object {
  var context: js.UndefOr[js.Any] = js.native
  var variables: js.UndefOr[js.Any] = js.native
}

object QueryExecutionSchema {
  @scala.inline
  def apply(): QueryExecutionSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryExecutionSchema]
  }
  @scala.inline
  implicit class QueryExecutionSchemaOps[Self <: QueryExecutionSchema] (val x: Self) extends AnyVal {
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
    def setContext(value: js.Any): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setVariables(value: js.Any): Self = this.set("variables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariables: Self = this.set("variables", js.undefined)
  }
  
}

