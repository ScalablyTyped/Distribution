package typings.graphqlDashCompose.esmMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.languageAstMod.FieldNode
import typings.graphql.languageAstMod.FragmentDefinitionNode
import typings.graphql.languageAstMod.InlineFragmentNode
import typings.graphql.typeDefinitionMod.GraphQLResolveInfo
import typings.graphqlDashCompose.esmGraphqlMod.GraphQLScalarType
import typings.graphqlDashCompose.esmUtilsDefinitionsMod.Thunk
import typings.graphqlDashCompose.esmUtilsFilterByDotPathsMod.FilterOpts
import typings.graphqlDashCompose.esmUtilsFilterByDotPathsMod.PathsFilter
import typings.graphqlDashCompose.esmUtilsProjectionMod.ProjectionType
import typings.graphqlDashCompose.esmUtilsToInputObjectTypeMod.ToInputObjectTypeOpts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/esm", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val GraphQLBuffer: GraphQLScalarType = js.native
  val GraphQLDate: GraphQLScalarType = js.native
  val GraphQLGeneric: GraphQLScalarType = js.native
  val GraphQLJSON: GraphQLScalarType = js.native
  val graphqlVersion: Double = js.native
  val sc: typings.graphqlDashCompose.esmSchemaComposerMod.SchemaComposer[js.Any] = js.native
  val schemaComposer: typings.graphqlDashCompose.esmSchemaComposerMod.SchemaComposer[js.Any] = js.native
  def camelCase(str: String): String = js.native
  def clearName(str: String): String = js.native
  def deepmerge(target: js.Any, src: js.Any): js.Any = js.native
  def filterByDotPaths(obj: js.Object): js.Object = js.native
  def filterByDotPaths(obj: js.Object, pathsFilter: Null, opts: FilterOpts): js.Object = js.native
  def filterByDotPaths(obj: js.Object, pathsFilter: PathsFilter): js.Object = js.native
  def filterByDotPaths(obj: js.Object, pathsFilter: PathsFilter, opts: FilterOpts): js.Object = js.native
  def forEachKey[V](arrayOrObject: StringDictionary[V], callback: js.Function2[/* value */ V, /* key */ String, Unit]): Unit = js.native
  def getFlatProjectionFromAST(info: GraphQLResolveInfo): StringDictionary[Boolean] = js.native
  def getFlatProjectionFromAST(info: GraphQLResolveInfo, fieldNodes: FieldNode): StringDictionary[Boolean] = js.native
  def getFlatProjectionFromAST(info: GraphQLResolveInfo, fieldNodes: FragmentDefinitionNode): StringDictionary[Boolean] = js.native
  def getFlatProjectionFromAST(info: GraphQLResolveInfo, fieldNodes: InlineFragmentNode): StringDictionary[Boolean] = js.native
  def getGraphqlVersion(): Double = js.native
  def getPluralName(name: String): String = js.native
  def getProjectionFromAST(info: GraphQLResolveInfo): ProjectionType = js.native
  def getProjectionFromAST(info: GraphQLResolveInfo, fieldNode: FieldNode): ProjectionType = js.native
  def getProjectionFromAST(info: GraphQLResolveInfo, fieldNode: FragmentDefinitionNode): ProjectionType = js.native
  def getProjectionFromAST(info: GraphQLResolveInfo, fieldNode: InlineFragmentNode): ProjectionType = js.native
  def inspect(value: js.Any): String = js.native
  def isComposeInputType(`type`: js.Any): Boolean = js.native
  def isComposeOutputType(`type`: js.Any): Boolean = js.native
  def isFunction(value: js.Any): /* is std.Function */ Boolean = js.native
  def isObject(value: js.Any): /* is object */ Boolean = js.native
  def isString(value: js.Any): /* is string */ Boolean = js.native
  def omit(obj: js.Object, keys: js.Array[String]): js.Object = js.native
  def only(obj: js.Object, keys: js.Array[String]): js.Object = js.native
  def pluralize(str: String): String = js.native
  def resolveMaybeThunk[T](thingOrThunk: Thunk[T]): T = js.native
  def toDottedObject(obj: js.Object): StringDictionary[js.Any] = js.native
  def toDottedObject(obj: js.Object, target: js.Object): StringDictionary[js.Any] = js.native
  def toDottedObject(obj: js.Object, target: js.Object, path: js.Array[String]): StringDictionary[js.Any] = js.native
  def toInputObjectType[TContext](tc: typings.graphqlDashCompose.esmInterfaceTypeComposerMod.InterfaceTypeComposer[_, TContext]): typings.graphqlDashCompose.esmInputTypeComposerMod.InputTypeComposer[TContext] = js.native
  def toInputObjectType[TContext](
    tc: typings.graphqlDashCompose.esmInterfaceTypeComposerMod.InterfaceTypeComposer[_, TContext],
    opts: ToInputObjectTypeOpts
  ): typings.graphqlDashCompose.esmInputTypeComposerMod.InputTypeComposer[TContext] = js.native
  def toInputObjectType[TContext](tc: typings.graphqlDashCompose.esmObjectTypeComposerMod.ObjectTypeComposer[_, TContext]): typings.graphqlDashCompose.esmInputTypeComposerMod.InputTypeComposer[TContext] = js.native
  def toInputObjectType[TContext](
    tc: typings.graphqlDashCompose.esmObjectTypeComposerMod.ObjectTypeComposer[_, TContext],
    opts: ToInputObjectTypeOpts
  ): typings.graphqlDashCompose.esmInputTypeComposerMod.InputTypeComposer[TContext] = js.native
  def upperFirst(str: String): String = js.native
}

