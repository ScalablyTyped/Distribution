package typings.graphqlToolsDelegate

import typings.graphqlToolsDelegate.typesMod.DelegationBinding
import typings.graphqlToolsDelegate.typesMod.DelegationContext
import typings.graphqlToolsUtils.interfacesMod.ExecutionResult
import typings.graphqlToolsUtils.interfacesMod.Request
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/delegate/Transformer", JSImport.Namespace)
@js.native
object transformerMod extends js.Object {
  @js.native
  class Transformer protected () extends js.Object {
    def this(context: DelegationContext) = this()
    def this(context: DelegationContext, binding: DelegationBinding) = this()
    var addTransform: js.Any = js.native
    var delegationContext: js.Any = js.native
    var transformations: js.Any = js.native
    def transformRequest(originalRequest: Request): Request = js.native
    def transformResult(originalResult: ExecutionResult[Record[String, _]]): ExecutionResult[Record[String, _]] = js.native
  }
  
}

