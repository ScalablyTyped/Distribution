package typings.graphqlToolsDelegate

import typings.graphql.astMod.FieldNode
import typings.graphql.definitionMod.GraphQLResolveInfo
import typings.graphqlToolsDelegate.typesMod.MergedTypeInfo
import typings.graphqlToolsDelegate.typesMod.SubschemaConfig
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/delegate/results/mergeFields", JSImport.Namespace)
@js.native
object mergeFieldsMod extends js.Object {
  def mergeFields(
    mergedTypeInfo: MergedTypeInfo,
    typeName: String,
    `object`: js.Any,
    fieldNodes: js.Array[FieldNode],
    sourceSubschemaOrSourceSubschemas: js.Array[SubschemaConfig],
    targetSubschemas: js.Array[SubschemaConfig],
    context: Record[String, _],
    info: GraphQLResolveInfo
  ): js.Any = js.native
  def mergeFields(
    mergedTypeInfo: MergedTypeInfo,
    typeName: String,
    `object`: js.Any,
    fieldNodes: js.Array[FieldNode],
    sourceSubschemaOrSourceSubschemas: SubschemaConfig,
    targetSubschemas: js.Array[SubschemaConfig],
    context: Record[String, _],
    info: GraphQLResolveInfo
  ): js.Any = js.native
}

