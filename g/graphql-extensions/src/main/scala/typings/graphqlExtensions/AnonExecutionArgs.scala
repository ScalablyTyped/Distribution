package typings.graphqlExtensions

import typings.graphql.executeMod.ExecutionArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExecutionArgs extends js.Object {
  var executionArgs: ExecutionArgs
}

object AnonExecutionArgs {
  @scala.inline
  def apply(executionArgs: ExecutionArgs): AnonExecutionArgs = {
    val __obj = js.Dynamic.literal(executionArgs = executionArgs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonExecutionArgs]
  }
}

