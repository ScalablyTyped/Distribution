package typings.graphqlToolsDelegate

import typings.graphql.definitionMod.GraphQLCompositeType
import typings.graphql.definitionMod.GraphQLResolveInfo
import typings.graphql.mod.GraphQLError
import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsDelegate.typesMod.SubschemaConfig
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/delegate/results/handleObject", JSImport.Namespace)
@js.native
object handleObjectMod extends js.Object {
  def handleObject(
    `type`: GraphQLCompositeType,
    `object`: js.Any,
    errors: js.Array[GraphQLError],
    subschema: GraphQLSchema,
    context: Record[String, _],
    info: GraphQLResolveInfo
  ): js.Any = js.native
  def handleObject(
    `type`: GraphQLCompositeType,
    `object`: js.Any,
    errors: js.Array[GraphQLError],
    subschema: GraphQLSchema,
    context: Record[String, _],
    info: GraphQLResolveInfo,
    skipTypeMerging: Boolean
  ): js.Any = js.native
  def handleObject(
    `type`: GraphQLCompositeType,
    `object`: js.Any,
    errors: js.Array[GraphQLError],
    subschema: SubschemaConfig,
    context: Record[String, _],
    info: GraphQLResolveInfo
  ): js.Any = js.native
  def handleObject(
    `type`: GraphQLCompositeType,
    `object`: js.Any,
    errors: js.Array[GraphQLError],
    subschema: SubschemaConfig,
    context: Record[String, _],
    info: GraphQLResolveInfo,
    skipTypeMerging: Boolean
  ): js.Any = js.native
}

