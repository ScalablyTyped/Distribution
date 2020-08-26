package typings.graphqlToolsStitch

import typings.graphql.astMod.FieldNode
import typings.graphql.astMod.SelectionSetNode
import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsStitch.typesMod.IStitchSchemasOptions
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/stitch", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def forwardArgsToSelectionSet(selectionSet: String): js.Function1[/* field */ FieldNode, SelectionSetNode] = js.native
  def forwardArgsToSelectionSet(selectionSet: String, mapping: Record[String, js.Array[String]]): js.Function1[/* field */ FieldNode, SelectionSetNode] = js.native
  def stitchSchemas(
    hasSubschemasTypesTypeDefsSchemasOnTypeConflictResolversSchemaDirectivesInheritResolversFromInterfacesMergeTypesMergeDirectivesLoggerAllowUndefinedInResolveResolverValidationOptionsDirectiveResolversSchemaTransformsParseOptionsPruningOptions: IStitchSchemasOptions[_]
  ): GraphQLSchema = js.native
}

