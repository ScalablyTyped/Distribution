package typings.graphqlToolsUtils

import typings.graphql.definitionMod.GraphQLNamedType
import typings.graphql.mod.GraphQLDirective
import typings.graphqlToolsUtils.anon.Directives
import typings.graphqlToolsUtils.anon.SkipPruning
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/utils/rewire", JSImport.Namespace)
@js.native
object rewireMod extends js.Object {
  def rewireTypes(originalTypeMap: Record[String, GraphQLNamedType | Null], directives: js.Array[GraphQLDirective]): Directives = js.native
  def rewireTypes(
    originalTypeMap: Record[String, GraphQLNamedType | Null],
    directives: js.Array[GraphQLDirective],
    options: SkipPruning
  ): Directives = js.native
}

