package typings
package graphqlDashComposeLib.graphqlDashComposeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val GQC: graphqlDashComposeLib.libSchemaComposerMod.SchemaComposer[js.Any] = js.native
  val GraphQLBuffer: graphqlDashComposeLib.libGraphqlMod.GraphQLScalarType = js.native
  val GraphQLDate: graphqlDashComposeLib.libGraphqlMod.GraphQLScalarType = js.native
  val GraphQLGeneric: graphqlDashComposeLib.libGraphqlMod.GraphQLScalarType = js.native
  val GraphQLJSON: graphqlDashComposeLib.libGraphqlMod.GraphQLScalarType = js.native
  val graphqlVersion: scala.Double = js.native
  val schemaComposer: graphqlDashComposeLib.libSchemaComposerMod.SchemaComposer[js.Any] = js.native
  def camelCase(str: java.lang.String): java.lang.String = js.native
  def clearName(str: java.lang.String): java.lang.String = js.native
  def deepmerge(target: js.Any, src: js.Any): js.Any = js.native
  def filterByDotPaths(obj: js.Object): js.Object = js.native
  def filterByDotPaths(obj: js.Object, pathsFilter: graphqlDashComposeLib.libUtilsFilterByDotPathsMod.PathsFilter): js.Object = js.native
  def filterByDotPaths(
    obj: js.Object,
    pathsFilter: graphqlDashComposeLib.libUtilsFilterByDotPathsMod.PathsFilter,
    opts: graphqlDashComposeLib.libUtilsFilterByDotPathsMod.FilterOpts
  ): js.Object = js.native
  def filterByDotPaths(
    obj: js.Object,
    pathsFilter: scala.Null,
    opts: graphqlDashComposeLib.libUtilsFilterByDotPathsMod.FilterOpts
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
  def getProjectionFromAST(context: graphqlLib.typeDefinitionMod.GraphQLResolveInfo): graphqlDashComposeLib.libUtilsProjectionMod.ProjectionType[_] = js.native
  def getProjectionFromAST(
    context: graphqlLib.typeDefinitionMod.GraphQLResolveInfo,
    fieldNode: graphqlLib.languageAstMod.FieldNode
  ): graphqlDashComposeLib.libUtilsProjectionMod.ProjectionType[_] = js.native
  def getProjectionFromAST(
    context: graphqlLib.typeDefinitionMod.GraphQLResolveInfo,
    fieldNode: graphqlLib.languageAstMod.FragmentDefinitionNode
  ): graphqlDashComposeLib.libUtilsProjectionMod.ProjectionType[_] = js.native
  def getProjectionFromAST(
    context: graphqlLib.typeDefinitionMod.GraphQLResolveInfo,
    fieldNode: graphqlLib.languageAstMod.InlineFragmentNode
  ): graphqlDashComposeLib.libUtilsProjectionMod.ProjectionType[_] = js.native
  def inspect(value: js.Any): java.lang.String = js.native
  def isFunction(): /* is std.Function */ scala.Boolean = js.native
  def isFunction(value: js.Function): /* is std.Function */ scala.Boolean = js.native
  def isObject(): scala.Boolean = js.native
  def isObject(value: js.Object): scala.Boolean = js.native
  def isString(): /* is string */ scala.Boolean = js.native
  def isString(value: java.lang.String): /* is string */ scala.Boolean = js.native
  def omit(obj: js.Object, keys: js.Array[java.lang.String]): js.Object = js.native
  def only(obj: js.Object, keys: js.Array[java.lang.String]): js.Object = js.native
  def resolveMaybeThunk[T](thingOrThunk: graphqlDashComposeLib.libUtilsDefinitionsMod.Thunk[T]): T = js.native
  def toDottedObject(obj: js.Object): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def toDottedObject(obj: js.Object, target: js.Object): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def toDottedObject(obj: js.Object, target: js.Object, path: js.Array[java.lang.String]): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def toInputObjectType(typeComposer: graphqlDashComposeLib.libTypeComposerMod.TypeComposer[_, _]): graphqlDashComposeLib.libInputTypeComposerMod.InputTypeComposer = js.native
  def toInputObjectType(
    typeComposer: graphqlDashComposeLib.libTypeComposerMod.TypeComposer[_, _],
    opts: graphqlDashComposeLib.libUtilsToInputObjectTypeMod.ToInputObjectTypeOpts
  ): graphqlDashComposeLib.libInputTypeComposerMod.InputTypeComposer = js.native
  def upperFirst(str: java.lang.String): java.lang.String = js.native
}

