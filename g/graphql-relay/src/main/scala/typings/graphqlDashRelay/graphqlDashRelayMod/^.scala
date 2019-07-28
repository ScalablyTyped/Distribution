package typings.graphqlDashRelay.graphqlDashRelayMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.typeDefinitionMod.GraphQLFieldConfig
import typings.graphql.typeDefinitionMod.GraphQLFieldConfigArgumentMap
import typings.graphql.typeDefinitionMod.GraphQLResolveInfo
import typings.graphql.typeDefinitionMod.GraphQLTypeResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-relay", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val backwardConnectionArgs: GraphQLFieldConfigArgumentMap with BackwardConnectionArgs = js.native
  val connectionArgs: GraphQLFieldConfigArgumentMap with ForwardConnectionArgs with BackwardConnectionArgs = js.native
  val forwardConnectionArgs: GraphQLFieldConfigArgumentMap with ForwardConnectionArgs = js.native
  def connectionDefinitions(config: ConnectionConfig): GraphQLConnectionDefinitions = js.native
  def connectionFromArray[T](data: js.Array[T], args: ConnectionArguments): Connection[T] = js.native
  def connectionFromArraySlice[T](arraySlice: js.Array[T], args: ConnectionArguments, meta: ArraySliceMetaInfo): Connection[T] = js.native
  def connectionFromPromisedArray[T](dataPromise: js.Promise[js.Array[T]], args: ConnectionArguments): js.Promise[Connection[T]] = js.native
  def connectionFromPromisedArraySlice[T](dataPromise: js.Promise[js.Array[T]], args: ConnectionArguments, arrayInfo: ArraySliceMetaInfo): js.Promise[Connection[T]] = js.native
  def cursorForObjectInConnection[T](data: js.Array[T], `object`: T): ConnectionCursor = js.native
  def cursorToOffset(cursor: ConnectionCursor): Double = js.native
  def fromGlobalId(globalId: String): ResolvedGlobalId = js.native
  def getOffsetWithDefault(): Double = js.native
  def getOffsetWithDefault(cursor: Null, defaultOffset: Double): Double = js.native
  def getOffsetWithDefault(cursor: ConnectionCursor): Double = js.native
  def getOffsetWithDefault(cursor: ConnectionCursor, defaultOffset: Double): Double = js.native
  def globalIdField(): GraphQLFieldConfig[_, _, StringDictionary[_]] = js.native
  def globalIdField(typeName: String): GraphQLFieldConfig[_, _, StringDictionary[_]] = js.native
  def globalIdField(
    typeName: String,
    idFetcher: js.Function3[/* object */ js.Any, /* context */ js.Any, /* info */ GraphQLResolveInfo, String]
  ): GraphQLFieldConfig[_, _, StringDictionary[_]] = js.native
  def mutationWithClientMutationId(config: MutationConfig): GraphQLFieldConfig[_, _, StringDictionary[_]] = js.native
  def nodeDefinitions[TContext](idFetcher: js.Function3[/* id */ String, /* context */ TContext, /* info */ GraphQLResolveInfo, _]): GraphQLNodeDefinitions = js.native
  def nodeDefinitions[TContext](
    idFetcher: js.Function3[/* id */ String, /* context */ TContext, /* info */ GraphQLResolveInfo, _],
    typeResolver: GraphQLTypeResolver[_, TContext, StringDictionary[_]]
  ): GraphQLNodeDefinitions = js.native
  def offsetToCursor(offset: Double): ConnectionCursor = js.native
  def pluralIdentifyingRootField(config: PluralIdentifyingRootFieldConfig): GraphQLFieldConfig[_, _, StringDictionary[_]] = js.native
  def toGlobalId(`type`: String, id: String): String = js.native
}

