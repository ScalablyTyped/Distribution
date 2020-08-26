package typings.graphqlExtensions.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecutionArgs extends js.Object {
  var executionArgs: typings.graphql.executeMod.ExecutionArgs = js.native
}

object ExecutionArgs {
  @scala.inline
  def apply(executionArgs: typings.graphql.executeMod.ExecutionArgs): ExecutionArgs = {
    val __obj = js.Dynamic.literal(executionArgs = executionArgs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutionArgs]
  }
  @scala.inline
  implicit class ExecutionArgsOps[Self <: ExecutionArgs] (val x: Self) extends AnyVal {
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
    def setExecutionArgs(value: typings.graphql.executeMod.ExecutionArgs): Self = this.set("executionArgs", value.asInstanceOf[js.Any])
  }
  
}

