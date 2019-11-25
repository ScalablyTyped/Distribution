package typings.graphqlDashRelay.graphqlDashRelayMod

import org.scalablytyped.runtime.TopLevel
import typings.graphql.typeDefinitionMod.GraphQLFieldConfigArgumentMap
import typings.graphqlDashRelay.Anon_Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForwardConnectionArgs extends js.Object {
  var after: Anon_Type
  var first: Anon_Type
}

object ForwardConnectionArgs {
  @scala.inline
  def apply(after: Anon_Type, first: Anon_Type): ForwardConnectionArgs = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ForwardConnectionArgs]
  }
}

@JSImport("graphql-relay", "forwardConnectionArgs")
@js.native
object forwardConnectionArgs extends TopLevel[GraphQLFieldConfigArgumentMap with ForwardConnectionArgs]

