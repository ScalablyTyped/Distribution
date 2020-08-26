package typings.graphqlTools.mod

import typings.graphql.definitionMod.GraphQLOutputType
import typings.graphql.definitionMod.GraphQLResolveInfo
import typings.graphql.mod.GraphQLError
import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsDelegate.typesMod.SubschemaConfig
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools", "handleResult")
@js.native
object handleResult extends js.Object {
  def apply(
    result: js.Any,
    errors: js.Array[GraphQLError],
    subschema: GraphQLSchema,
    context: Record[String, _],
    info: GraphQLResolveInfo
  ): js.Any = js.native
  def apply(
    result: js.Any,
    errors: js.Array[GraphQLError],
    subschema: GraphQLSchema,
    context: Record[String, _],
    info: GraphQLResolveInfo,
    returnType: js.UndefOr[GraphQLOutputType],
    skipTypeMerging: Boolean
  ): js.Any = js.native
  def apply(
    result: js.Any,
    errors: js.Array[GraphQLError],
    subschema: GraphQLSchema,
    context: Record[String, _],
    info: GraphQLResolveInfo,
    returnType: GraphQLOutputType
  ): js.Any = js.native
  def apply(
    result: js.Any,
    errors: js.Array[GraphQLError],
    subschema: SubschemaConfig,
    context: Record[String, _],
    info: GraphQLResolveInfo
  ): js.Any = js.native
  def apply(
    result: js.Any,
    errors: js.Array[GraphQLError],
    subschema: SubschemaConfig,
    context: Record[String, _],
    info: GraphQLResolveInfo,
    returnType: js.UndefOr[GraphQLOutputType],
    skipTypeMerging: Boolean
  ): js.Any = js.native
  def apply(
    result: js.Any,
    errors: js.Array[GraphQLError],
    subschema: SubschemaConfig,
    context: Record[String, _],
    info: GraphQLResolveInfo,
    returnType: GraphQLOutputType
  ): js.Any = js.native
}

