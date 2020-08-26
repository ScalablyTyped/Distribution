package typings.graphqlToolsDelegate

import typings.graphqlToolsDelegate.typesMod.DelegationContext
import typings.graphqlToolsUtils.interfacesMod.Transform
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/delegate/delegationBindings", JSImport.Namespace)
@js.native
object delegationBindingsMod extends js.Object {
  def defaultDelegationBinding(delegationContext: DelegationContext): js.Array[Transform[Record[String, _]]] = js.native
}

