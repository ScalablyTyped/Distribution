package typings
package graphqlDashComposeLib.libResolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/lib/Resolver", "Resolver")
@js.native
class Resolver[TSource, TContext, TArgs] protected ()
  extends graphqlDashComposeLib.libTypeComposerMod._ComposeOutputType[TSource, TContext, TArgs] {
  def this(opts: ResolverOpts[TSource, TContext, TArgs]) = this()
  var args: graphqlDashComposeLib.libTypeComposerMod.ComposeFieldConfigArgumentMap[TArgs] = js.native
  var description: java.lang.String | scala.Null = js.native
  var displayName: java.lang.String | scala.Null = js.native
  var kind: ResolverKinds | scala.Null = js.native
  var name: java.lang.String = js.native
  var parent: (Resolver[TSource, TContext, TArgs]) | scala.Null = js.native
  @JSName("resolve")
  var resolve_Original: ResolverRpCb[TSource, TContext, TArgs] = js.native
  var schemaComposer: graphqlDashComposeLib.libSchemaComposerMod.SchemaComposer[TContext] = js.native
  var `type`: graphqlDashComposeLib.libTypeComposerMod.ComposeOutputType[TSource, TContext, _] = js.native
  def addArgs(newArgs: graphqlDashComposeLib.libTypeComposerMod.ComposeFieldConfigArgumentMap[_]): this.type = js.native
  def addFilterArg(opts: ResolverFilterArgConfig[TSource, TContext]): Resolver[TSource, TContext, _] = js.native
  def addSortArg(opts: ResolverSortArgConfig[TSource, TContext]): Resolver[TSource, TContext, _] = js.native
  def clone[TCloneSource, TCContext, TCArgs](opts: ResolverOpts[TSource, TContext, TCArgs]): Resolver[TCloneSource, TContext, TCArgs] = js.native
  def cloneArg(argName: java.lang.String, newTypeName: java.lang.String): this.type = js.native
  def debug(): Resolver[TSource, TContext, TArgs] = js.native
  def debug(filterDotPaths: graphqlDashComposeLib.Anon_Params): Resolver[TSource, TContext, TArgs] = js.native
  def debug(filterDotPaths: graphqlDashComposeLib.Anon_Params, opts: ResolveDebugOpts): Resolver[TSource, TContext, TArgs] = js.native
  def debugExecTime(): Resolver[TSource, TContext, TArgs] = js.native
  def debugParams(): Resolver[TSource, TContext, TArgs] = js.native
  def debugParams(filterPaths: java.lang.String): Resolver[TSource, TContext, TArgs] = js.native
  def debugParams(filterPaths: java.lang.String, opts: ResolveDebugOpts): Resolver[TSource, TContext, TArgs] = js.native
  def debugParams(filterPaths: js.Array[java.lang.String]): Resolver[TSource, TContext, TArgs] = js.native
  def debugParams(filterPaths: js.Array[java.lang.String], opts: ResolveDebugOpts): Resolver[TSource, TContext, TArgs] = js.native
  def debugParams(filterPaths: scala.Null, opts: ResolveDebugOpts): Resolver[TSource, TContext, TArgs] = js.native
  def debugPayload(): Resolver[TSource, TContext, TArgs] = js.native
  def debugPayload(filterPaths: java.lang.String): Resolver[TSource, TContext, TArgs] = js.native
  def debugPayload(filterPaths: java.lang.String, opts: ResolveDebugOpts): Resolver[TSource, TContext, TArgs] = js.native
  def debugPayload(filterPaths: js.Array[java.lang.String]): Resolver[TSource, TContext, TArgs] = js.native
  def debugPayload(filterPaths: js.Array[java.lang.String], opts: ResolveDebugOpts): Resolver[TSource, TContext, TArgs] = js.native
  def debugPayload(filterPaths: scala.Null, opts: ResolveDebugOpts): Resolver[TSource, TContext, TArgs] = js.native
  def extendArg(argName: java.lang.String, partialArgConfig: js.Any): this.type = js.native
  def get(path: java.lang.String): js.Any = js.native
  def get(path: js.Array[java.lang.String]): js.Any = js.native
  def getArg(argName: java.lang.String): graphqlDashComposeLib.libTypeComposerMod.ComposeArgumentConfig = js.native
  def getArgConfig(argName: java.lang.String): graphqlLib.typeDefinitionMod.GraphQLArgumentConfig = js.native
  def getArgNames(): js.Array[java.lang.String] = js.native
  def getArgTC(argName: java.lang.String): graphqlDashComposeLib.libInputTypeComposerMod.InputTypeComposer = js.native
  def getArgType(argName: java.lang.String): graphqlLib.typeDefinitionMod.GraphQLInputType = js.native
  def getArgs(): graphqlDashComposeLib.libTypeComposerMod.ComposeFieldConfigArgumentMap[TArgs] = js.native
  def getDescription(): java.lang.String | scala.Null = js.native
  // -----------------------------------------------
  // Misc methods
  // -----------------------------------------------
  def getFieldConfig(): graphqlLib.typeDefinitionMod.GraphQLFieldConfig[TSource, TContext, TArgs] = js.native
  def getFieldConfig(opts: graphqlDashComposeLib.Anon_Projection[TSource]): graphqlLib.typeDefinitionMod.GraphQLFieldConfig[TSource, TContext, TArgs] = js.native
  def getKind(): ResolverKinds | scala.Null = js.native
  // -----------------------------------------------
  // Debug methods
  // -----------------------------------------------
  def getNestedName(): java.lang.String = js.native
  // -----------------------------------------------
  // Resolve methods
  // -----------------------------------------------
  def getResolve(): ResolverRpCb[TSource, TContext, TArgs] = js.native
  // -----------------------------------------------
  // Output type methods
  // -----------------------------------------------
  def getType(): graphqlLib.typeDefinitionMod.GraphQLOutputType = js.native
  def getTypeComposer(): graphqlDashComposeLib.libTypeComposerMod.TypeComposer[TSource, TContext] = js.native
  // -----------------------------------------------
  // Args methods
  // -----------------------------------------------
  def hasArg(argName: java.lang.String): scala.Boolean = js.native
  def isRequired(argName: java.lang.String): scala.Boolean = js.native
  def makeOptional(argNameOrArray: java.lang.String): this.type = js.native
  def makeOptional(argNameOrArray: js.Array[java.lang.String]): this.type = js.native
  def makeRequired(argNameOrArray: java.lang.String): this.type = js.native
  def makeRequired(argNameOrArray: js.Array[java.lang.String]): this.type = js.native
  def removeArg(argNameOrArray: java.lang.String): this.type = js.native
  def removeArg(argNameOrArray: js.Array[java.lang.String]): this.type = js.native
  def removeOtherArgs(argNameOrArray: java.lang.String): this.type = js.native
  def removeOtherArgs(argNameOrArray: js.Array[java.lang.String]): this.type = js.native
  def reorderArgs(names: js.Array[java.lang.String]): this.type = js.native
  def resolve(resolveParams: stdLib.Partial[ResolveParams[TSource, TContext, TArgs]]): js.Promise[_] | js.Any = js.native
  def setArg(
    argName: java.lang.String,
    argConfig: graphqlDashComposeLib.libTypeComposerMod.ComposeArgumentConfig
  ): this.type = js.native
  def setArgs(args: graphqlDashComposeLib.libTypeComposerMod.ComposeFieldConfigArgumentMap[_]): this.type = js.native
  def setDescription(description: java.lang.String): this.type = js.native
  def setDisplayName(name: java.lang.String): this.type = js.native
  def setKind(kind: java.lang.String): this.type = js.native
  def setResolve(resolve: ResolverRpCb[TSource, TContext, TArgs]): Resolver[TSource, TContext, TArgs] = js.native
  def setType(gqType: graphqlDashComposeLib.libTypeComposerMod.ComposeOutputType[TSource, TContext, _]): this.type = js.native
  def toDebugStructure(): js.Object = js.native
  def toDebugStructure(colors: scala.Boolean): js.Object = js.native
  def toString(colors: scala.Boolean): java.lang.String = js.native
  // -----------------------------------------------
  // Wrap methods
  // -----------------------------------------------
  def withMiddlewares(middlewares: js.Array[ResolverMiddleware[TSource, TContext, TArgs]]): Resolver[TSource, TContext, TArgs] = js.native
  def wrap[TCSource, TCArgs](): Resolver[TCSource, TContext, TCArgs] = js.native
  def wrap[TCSource, TCArgs](cb: ResolverWrapCb[TCSource, TSource, TContext, TCArgs, TArgs]): Resolver[TCSource, TContext, TCArgs] = js.native
  def wrap[TCSource, TCArgs](
    cb: ResolverWrapCb[TCSource, TSource, TContext, TCArgs, TArgs],
    newResolverOpts: ResolverOpts[TCSource, TContext, TArgs]
  ): Resolver[TCSource, TContext, TCArgs] = js.native
  def wrapArgs(cb: ResolverWrapArgsCb): Resolver[TSource, TContext, TArgs] = js.native
  def wrapArgs(cb: ResolverWrapArgsCb, wrapperName: java.lang.String): Resolver[TSource, TContext, TArgs] = js.native
  def wrapCloneArg[TCArgs](argName: java.lang.String, newTypeName: java.lang.String): Resolver[TSource, TContext, TCArgs] = js.native
  def wrapResolve[TCSource, TCArgs](cb: ResolverNextRpCb[TCSource, TContext, TCArgs]): Resolver[TCSource, TContext, TCArgs] = js.native
  def wrapResolve[TCSource, TCArgs](cb: ResolverNextRpCb[TCSource, TContext, TCArgs], wrapperName: java.lang.String): Resolver[TCSource, TContext, TCArgs] = js.native
  def wrapType(cb: ResolverWrapTypeCb): Resolver[TSource, TContext, TArgs] = js.native
  def wrapType(cb: ResolverWrapTypeCb, wrapperName: java.lang.String): Resolver[TSource, TContext, TArgs] = js.native
}

/* static members */
@JSImport("graphql-compose/lib/Resolver", "Resolver")
@js.native
object Resolver extends js.Object {
  var schemaComposer: graphqlDashComposeLib.libSchemaComposerMod.SchemaComposer[_] = js.native
}

