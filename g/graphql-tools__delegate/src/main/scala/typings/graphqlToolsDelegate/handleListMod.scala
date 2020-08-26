package typings.graphqlToolsDelegate

import typings.graphql.definitionMod.GraphQLList
import typings.graphql.definitionMod.GraphQLResolveInfo
import typings.graphql.mod.GraphQLError
import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsDelegate.typesMod.SubschemaConfig
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/delegate/results/handleList", JSImport.Namespace)
@js.native
object handleListMod extends js.Object {
  def handleList(
    `type`: GraphQLList[_],
    list: js.Array[_],
    errors: js.Array[GraphQLError],
    subschema: GraphQLSchema,
    context: Record[String, _],
    info: GraphQLResolveInfo
  ): js.Array[_] = js.native
  def handleList(
    `type`: GraphQLList[_],
    list: js.Array[_],
    errors: js.Array[GraphQLError],
    subschema: GraphQLSchema,
    context: Record[String, _],
    info: GraphQLResolveInfo,
    skipTypeMerging: Boolean
  ): js.Array[_] = js.native
  def handleList(
    `type`: GraphQLList[_],
    list: js.Array[_],
    errors: js.Array[GraphQLError],
    subschema: SubschemaConfig,
    context: Record[String, _],
    info: GraphQLResolveInfo
  ): js.Array[_] = js.native
  def handleList(
    `type`: GraphQLList[_],
    list: js.Array[_],
    errors: js.Array[GraphQLError],
    subschema: SubschemaConfig,
    context: Record[String, _],
    info: GraphQLResolveInfo,
    skipTypeMerging: Boolean
  ): js.Array[_] = js.native
}

