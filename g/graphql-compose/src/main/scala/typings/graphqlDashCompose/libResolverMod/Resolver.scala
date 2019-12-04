package typings.graphqlDashCompose.libResolverMod

import typings.graphql.typeDefinitionMod.GraphQLArgumentConfig
import typings.graphql.typeDefinitionMod.GraphQLFieldConfig
import typings.graphql.typeDefinitionMod.GraphQLInputType
import typings.graphql.typeDefinitionMod.GraphQLOutputType
import typings.graphqlDashCompose.Anon_Params
import typings.graphqlDashCompose.Anon_ProjectionProjectionType
import typings.graphqlDashCompose.libInputTypeComposerMod.InputTypeComposer
import typings.graphqlDashCompose.libObjectTypeComposerMod.ComposeArgumentConfig
import typings.graphqlDashCompose.libObjectTypeComposerMod.ComposeArgumentConfigAsObject
import typings.graphqlDashCompose.libObjectTypeComposerMod.ComposeFieldConfigArgumentMap
import typings.graphqlDashCompose.libObjectTypeComposerMod.ComposeOutputType
import typings.graphqlDashCompose.libObjectTypeComposerMod.ObjectTypeComposer
import typings.graphqlDashCompose.libSchemaComposerMod.SchemaComposer
import typings.graphqlDashCompose.libUtilsDefinitionsMod.Extensions
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/lib/Resolver", "Resolver")
@js.native
class Resolver[TSource, TContext, TArgs, TReturn] protected () extends js.Object {
  def this(opts: ResolverOpts[TSource, TContext, TArgs, _], schemaComposer: SchemaComposer[TContext]) = this()
  var args: ComposeFieldConfigArgumentMap[_] = js.native
  var description: String | Unit = js.native
  var displayName: String | Unit = js.native
  var extensions: js.UndefOr[Extensions] = js.native
  var kind: ResolverKinds | Unit = js.native
  var name: String = js.native
  var parent: (Resolver[TSource, TContext, _, _]) | Unit = js.native
  var schemaComposer: SchemaComposer[TContext] = js.native
  var `type`: ComposeOutputType[TReturn, TContext] = js.native
  def addArgs(newArgs: ComposeFieldConfigArgumentMap[TArgs]): this.type = js.native
  def addFilterArg(opts: ResolverFilterArgConfig[TSource, TContext, TArgs]): Resolver[TSource, TContext, TArgs, _] = js.native
  def addSortArg(opts: ResolverSortArgConfig[TSource, TContext, TArgs]): Resolver[TSource, TContext, TArgs, _] = js.native
  def clone[TNewSource, TNewArgs](opts: ResolverOpts[TNewSource, TContext, TNewArgs, _]): Resolver[TNewSource, TContext, TNewArgs, _] = js.native
  def cloneArg(argName: String, newTypeName: String): this.type = js.native
  def debug(): Resolver[TSource, TContext, TArgs, _] = js.native
  def debug(filterDotPaths: Anon_Params): Resolver[TSource, TContext, TArgs, _] = js.native
  def debug(filterDotPaths: Anon_Params, opts: ResolveDebugOpts): Resolver[TSource, TContext, TArgs, _] = js.native
  def debugExecTime(): Resolver[TSource, TContext, TArgs, _] = js.native
  def debugParams(): Resolver[TSource, TContext, TArgs, _] = js.native
  def debugParams(filterPaths: String): Resolver[TSource, TContext, TArgs, _] = js.native
  def debugParams(filterPaths: String, opts: ResolveDebugOpts): Resolver[TSource, TContext, TArgs, _] = js.native
  def debugParams(filterPaths: js.Array[String]): Resolver[TSource, TContext, TArgs, _] = js.native
  def debugParams(filterPaths: js.Array[String], opts: ResolveDebugOpts): Resolver[TSource, TContext, TArgs, _] = js.native
  def debugParams(filterPaths: Null, opts: ResolveDebugOpts): Resolver[TSource, TContext, TArgs, _] = js.native
  def debugPayload(): Resolver[TSource, TContext, TArgs, _] = js.native
  def debugPayload(filterPaths: String): Resolver[TSource, TContext, TArgs, _] = js.native
  def debugPayload(filterPaths: String, opts: ResolveDebugOpts): Resolver[TSource, TContext, TArgs, _] = js.native
  def debugPayload(filterPaths: js.Array[String]): Resolver[TSource, TContext, TArgs, _] = js.native
  def debugPayload(filterPaths: js.Array[String], opts: ResolveDebugOpts): Resolver[TSource, TContext, TArgs, _] = js.native
  def debugPayload(filterPaths: Null, opts: ResolveDebugOpts): Resolver[TSource, TContext, TArgs, _] = js.native
  def extendArg(argName: String, partialArgConfig: Partial[ComposeArgumentConfigAsObject]): this.type = js.native
  def get(path: String): js.Any = js.native
  def get(path: js.Array[String]): js.Any = js.native
  def getArg(argName: String): ComposeArgumentConfigAsObject = js.native
  def getArgConfig(argName: String): GraphQLArgumentConfig = js.native
  def getArgNames(): js.Array[String] = js.native
  def getArgTC(argName: String): InputTypeComposer[TContext] = js.native
  def getArgType(argName: String): GraphQLInputType = js.native
  def getArgs(): ComposeFieldConfigArgumentMap[TArgs] = js.native
  def getDescription(): String | Null = js.native
  /**
    *  -----------------------------------------------
    * Misc methods
    * -----------------------------------------------
    */
  def getFieldConfig(): GraphQLFieldConfig[TSource, TContext, TArgs] = js.native
  def getFieldConfig(opts: Anon_ProjectionProjectionType): GraphQLFieldConfig[TSource, TContext, TArgs] = js.native
  def getKind(): ResolverKinds | Unit = js.native
  /**
    * -----------------------------------------------
    * Debug methods
    * -----------------------------------------------
    */
  def getNestedName(): String = js.native
  /**
    *  -----------------------------------------------
    * Resolve methods
    * -----------------------------------------------
    */
  def getResolve(): ResolverRpCb[TSource, TContext, TArgs] = js.native
  /**
    * -----------------------------------------------
    * Output type methods
    * -----------------------------------------------
    */
  def getType(): GraphQLOutputType = js.native
  def getTypeComposer(): ObjectTypeComposer[TSource, TContext] = js.native
  /**
    *  -----------------------------------------------
    * Args methods
    * -----------------------------------------------
    */
  def hasArg(argName: String): Boolean = js.native
  def isRequired(argName: String): Boolean = js.native
  def makeOptional(argNameOrArray: String): this.type = js.native
  def makeOptional(argNameOrArray: js.Array[String]): this.type = js.native
  def makeRequired(argNameOrArray: String): this.type = js.native
  def makeRequired(argNameOrArray: js.Array[String]): this.type = js.native
  def removeArg(argNameOrArray: String): this.type = js.native
  def removeArg(argNameOrArray: js.Array[String]): this.type = js.native
  def removeOtherArgs(argNameOrArray: String): this.type = js.native
  def removeOtherArgs(argNameOrArray: js.Array[String]): this.type = js.native
  def reorderArgs(names: js.Array[String]): this.type = js.native
  def resolve(resolveParams: Partial[ResolveParams[TSource, TContext, TArgs]]): js.Promise[_] | js.Any = js.native
  def setArg(argName: String, argConfig: ComposeArgumentConfig): this.type = js.native
  def setArgs[TNewArgs](args: ComposeFieldConfigArgumentMap[TNewArgs]): Resolver[TSource, TContext, TNewArgs, _] = js.native
  def setDescription(description: String): this.type = js.native
  def setDescription(description: Unit): this.type = js.native
  def setDisplayName(name: String): this.type = js.native
  def setKind(kind: String): this.type = js.native
  def setResolve(resolve: ResolverRpCb[TSource, TContext, TArgs]): Resolver[TSource, TContext, TArgs, _] = js.native
  def setType[TNewReturn](gqType: ComposeOutputType[TNewReturn, TContext]): Resolver[TSource, TContext, TArgs, TNewReturn] = js.native
  def toDebugStructure(): js.Object = js.native
  def toDebugStructure(colors: Boolean): js.Object = js.native
  def toString(colors: Boolean): String = js.native
  /**
    * -----------------------------------------------
    * Wrap methods
    * -----------------------------------------------
    */
  /**
    * You may construct a new resolver with wrapped logic:
    *
    * @example
    *     const log = [];
    *
    *     const mw1 = async (resolve, source, args, context, info) => {
    *       log.push('m1.before');
    *       const res = await resolve(source, args, context, info);
    *       log.push('m1.after');
    *       return res;
    *     };
    *
    *     const mw2 = async (resolve, source, args, context, info) => {
    *       log.push('m2.before');
    *       const res = await resolve(source, args, context, info);
    *       log.push('m2.after');
    *       return res;
    *     };
    *
    *     const newResolver = Resolver.withMiddlewares([mw1, mw2]);
    *     await newResolver.resolve({});
    *
    *     expect(log).toEqual([
    *       'm1.before',
    *       'm2.before',
    *       'call resolve',
    *       'm2.after',
    *       'm1.after'
    *     ]);
    */
  def withMiddlewares(middlewares: js.Array[ResolverMiddleware[TSource, TContext, TArgs]]): Resolver[TSource, TContext, TArgs, _] = js.native
  def wrap[TNewSource, TNewArgs](): Resolver[TNewSource, TContext, TNewArgs, _] = js.native
  def wrap[TNewSource, TNewArgs](cb: ResolverWrapCb[TNewSource, TSource, TContext, TNewArgs, TArgs]): Resolver[TNewSource, TContext, TNewArgs, _] = js.native
  def wrap[TNewSource, TNewArgs](
    cb: ResolverWrapCb[TNewSource, TSource, TContext, TNewArgs, TArgs],
    newResolverOpts: ResolverOpts[TNewSource, TContext, TArgs, _]
  ): Resolver[TNewSource, TContext, TNewArgs, _] = js.native
  def wrapArgs[TCArgs](cb: ResolverWrapArgsCb[TCArgs]): Resolver[TSource, TContext, TCArgs, _] = js.native
  def wrapArgs[TCArgs](cb: ResolverWrapArgsCb[TCArgs], wrapperName: String): Resolver[TSource, TContext, TCArgs, _] = js.native
  def wrapCloneArg[TCArgs](argName: String, newTypeName: String): Resolver[TSource, TContext, TCArgs, _] = js.native
  def wrapResolve[TCSource, TCArgs](cb: ResolverNextRpCb[TCSource, TContext, TCArgs]): Resolver[TCSource, TContext, TCArgs, _] = js.native
  def wrapResolve[TCSource, TCArgs](cb: ResolverNextRpCb[TCSource, TContext, TCArgs], wrapperName: String): Resolver[TCSource, TContext, TCArgs, _] = js.native
  def wrapType(cb: ResolverWrapTypeCb[TContext, _]): Resolver[TSource, TContext, TArgs, _] = js.native
  def wrapType(cb: ResolverWrapTypeCb[TContext, _], wrapperName: String): Resolver[TSource, TContext, TArgs, _] = js.native
}

