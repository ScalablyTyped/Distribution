package typings.graphqlToolsUtils

import typings.graphql.definitionMod.GraphQLNamedType
import typings.graphql.mod.GraphQLDirective
import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsUtils.anon.SkipPruning
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/utils/heal", JSImport.Namespace)
@js.native
object healMod extends js.Object {
  def healSchema(schema: GraphQLSchema): GraphQLSchema = js.native
  def healTypes(originalTypeMap: Record[String, GraphQLNamedType | Null], directives: js.Array[GraphQLDirective]): Unit = js.native
  def healTypes(
    originalTypeMap: Record[String, GraphQLNamedType | Null],
    directives: js.Array[GraphQLDirective],
    config: SkipPruning
  ): Unit = js.native
}

