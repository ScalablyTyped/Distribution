package typings
package graphqlDashComposeLib.esmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/esm", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val GraphQLBuffer: graphqlDashComposeLib.esmGraphqlMod.GraphQLScalarType = js.native
  val GraphQLDate: graphqlDashComposeLib.esmGraphqlMod.GraphQLScalarType = js.native
  val GraphQLGeneric: graphqlDashComposeLib.esmGraphqlMod.GraphQLScalarType = js.native
  val GraphQLJSON: graphqlDashComposeLib.esmGraphqlMod.GraphQLScalarType = js.native
  val graphqlVersion: scala.Double = js.native
  val sc: graphqlDashComposeLib.esmSchemaComposerMod.SchemaComposer[js.Any] = js.native
  val schemaComposer: graphqlDashComposeLib.esmSchemaComposerMod.SchemaComposer[js.Any] = js.native
  def camelCase(str: java.lang.String): java.lang.String = js.native
  def clearName(str: java.lang.String): java.lang.String = js.native
  def deepmerge(target: js.Any, src: js.Any): js.Any = js.native
  def filterByDotPaths(obj: js.Object): js.Object = js.native
  def filterByDotPaths(obj: js.Object, pathsFilter: graphqlDashComposeLib.esmUtilsFilterByDotPathsMod.PathsFilter): js.Object = js.native
  def filterByDotPaths(
    obj: js.Object,
    pathsFilter: graphqlDashComposeLib.esmUtilsFilterByDotPathsMod.PathsFilter,
    opts: graphqlDashComposeLib.esmUtilsFilterByDotPathsMod.FilterOpts
  ): js.Object = js.native
  def filterByDotPaths(
    obj: js.Object,
    pathsFilter: scala.Null,
    opts: graphqlDashComposeLib.esmUtilsFilterByDotPathsMod.FilterOpts
  ): js.Object = js.native
  def getFlatProjectionFromAST(context: graphqlLib.typeDefinitionMod.GraphQLResolveInfo): org.scalablytyped.runtime.StringDictionary[scala.Boolean] = js.native
  def getFlatProjectionFromAST(
    context: graphqlLib.typeDefinitionMod.GraphQLResolveInfo,
    fieldNodes: graphqlLib.languageAstMod.FieldNode
  ): org.scalablytyped.runtime.StringDictionary[scala.Boolean] = js.native
  def getFlatProjectionFromAST(
    context: graphqlLib.typeDefinitionMod.GraphQLResolveInfo,
    fieldNodes: graphqlLib.languageAstMod.FragmentDefinitionNode
  ): org.scalablytyped.runtime.StringDictionary[scala.Boolean] = js.native
  def getFlatProjectionFromAST(
    context: graphqlLib.typeDefinitionMod.GraphQLResolveInfo,
    fieldNodes: graphqlLib.languageAstMod.InlineFragmentNode
  ): org.scalablytyped.runtime.StringDictionary[scala.Boolean] = js.native
  def getGraphqlVersion(): scala.Double = js.native
  def getPluralName(name: java.lang.String): java.lang.String = js.native
  def getProjectionFromAST(context: graphqlLib.typeDefinitionMod.GraphQLResolveInfo): graphqlDashComposeLib.esmUtilsProjectionMod.ProjectionType = js.native
  def getProjectionFromAST(
    context: graphqlLib.typeDefinitionMod.GraphQLResolveInfo,
    fieldNode: graphqlLib.languageAstMod.FieldNode
  ): graphqlDashComposeLib.esmUtilsProjectionMod.ProjectionType = js.native
  def getProjectionFromAST(
    context: graphqlLib.typeDefinitionMod.GraphQLResolveInfo,
    fieldNode: graphqlLib.languageAstMod.FragmentDefinitionNode
  ): graphqlDashComposeLib.esmUtilsProjectionMod.ProjectionType = js.native
  def getProjectionFromAST(
    context: graphqlLib.typeDefinitionMod.GraphQLResolveInfo,
    fieldNode: graphqlLib.languageAstMod.InlineFragmentNode
  ): graphqlDashComposeLib.esmUtilsProjectionMod.ProjectionType = js.native
  def inspect(value: js.Any): java.lang.String = js.native
  def isComposeInputType(`type`: js.Any): scala.Boolean = js.native
  def isComposeOutputType(`type`: js.Any): scala.Boolean = js.native
  def isFunction(value: js.Any): /* is std.Function */ scala.Boolean = js.native
  def isObject(value: js.Any): /* is boolean */ scala.Boolean = js.native
  def isString(value: js.Any): /* is string */ scala.Boolean = js.native
  def omit(obj: js.Object, keys: js.Array[java.lang.String]): js.Object = js.native
  def only(obj: js.Object, keys: js.Array[java.lang.String]): js.Object = js.native
  def pluralize(str: java.lang.String): java.lang.String = js.native
  def resolveMaybeThunk[T](thingOrThunk: graphqlDashComposeLib.esmUtilsDefinitionsMod.Thunk[T]): T = js.native
  def toDottedObject(obj: js.Object): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def toDottedObject(obj: js.Object, target: js.Object): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def toDottedObject(obj: js.Object, target: js.Object, path: js.Array[java.lang.String]): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def toInputObjectType[TContext](tc: graphqlDashComposeLib.esmInterfaceTypeComposerMod.InterfaceTypeComposer[_, TContext]): graphqlDashComposeLib.esmInputTypeComposerMod.InputTypeComposer[TContext] = js.native
  def toInputObjectType[TContext](
    tc: graphqlDashComposeLib.esmInterfaceTypeComposerMod.InterfaceTypeComposer[_, TContext],
    opts: graphqlDashComposeLib.esmUtilsToInputObjectTypeMod.ToInputObjectTypeOpts
  ): graphqlDashComposeLib.esmInputTypeComposerMod.InputTypeComposer[TContext] = js.native
  def toInputObjectType[TContext](tc: graphqlDashComposeLib.esmObjectTypeComposerMod.ObjectTypeComposer[_, TContext]): graphqlDashComposeLib.esmInputTypeComposerMod.InputTypeComposer[TContext] = js.native
  def toInputObjectType[TContext](
    tc: graphqlDashComposeLib.esmObjectTypeComposerMod.ObjectTypeComposer[_, TContext],
    opts: graphqlDashComposeLib.esmUtilsToInputObjectTypeMod.ToInputObjectTypeOpts
  ): graphqlDashComposeLib.esmInputTypeComposerMod.InputTypeComposer[TContext] = js.native
  def upperFirst(str: java.lang.String): java.lang.String = js.native
}

