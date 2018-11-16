package typings
package graphqlDashRelayLib.graphqlDashRelayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-relay", JSImport.Namespace)
@js.native
object graphqlDashRelayModMembers extends js.Object {
  val backwardConnectionArgs: graphqlLib.typeDefinitionMod.GraphQLFieldConfigArgumentMap with graphqlDashRelayLib.Anon_Last = js.native
  val connectionArgs: graphqlLib.typeDefinitionMod.GraphQLFieldConfigArgumentMap with ForwardConnectionArgs with BackwardConnectionArgs = js.native
  val forwardConnectionArgs: graphqlLib.typeDefinitionMod.GraphQLFieldConfigArgumentMap with graphqlDashRelayLib.Anon_After = js.native
  def connectionDefinitions(config: ConnectionConfig): GraphQLConnectionDefinitions = js.native
  def connectionFromArray[T](data: js.Array[T], args: ConnectionArguments): Connection[T] = js.native
  def connectionFromArraySlice[T](arraySlice: js.Array[T], args: ConnectionArguments, meta: ArraySliceMetaInfo): Connection[T] = js.native
  def connectionFromPromisedArray[T](dataPromise: stdLib.Promise[js.Array[T]], args: ConnectionArguments): stdLib.Promise[Connection[T]] = js.native
  def connectionFromPromisedArraySlice[T](dataPromise: stdLib.Promise[js.Array[T]], args: ConnectionArguments, arrayInfo: ArraySliceMetaInfo): stdLib.Promise[Connection[T]] = js.native
  def cursorForObjectInConnection[T](data: js.Array[T], `object`: T): ConnectionCursor = js.native
  def cursorToOffset(cursor: ConnectionCursor): scala.Double = js.native
  def fromGlobalId(globalId: java.lang.String): ResolvedGlobalId = js.native
  def getOffsetWithDefault(): scala.Double = js.native
  def getOffsetWithDefault(cursor: ConnectionCursor): scala.Double = js.native
  def getOffsetWithDefault(cursor: ConnectionCursor, defaultOffset: scala.Double): scala.Double = js.native
  def getOffsetWithDefault(cursor: scala.Null, defaultOffset: scala.Double): scala.Double = js.native
  def globalIdField(): graphqlLib.typeDefinitionMod.GraphQLFieldConfig[_, _, ScalablyTyped.runtime.StringDictionary[_]] = js.native
  def globalIdField(typeName: java.lang.String): graphqlLib.typeDefinitionMod.GraphQLFieldConfig[_, _, ScalablyTyped.runtime.StringDictionary[_]] = js.native
  def globalIdField(
    typeName: java.lang.String,
    idFetcher: js.Function3[
      /* object */ js.Any, 
      /* context */ js.Any, 
      /* info */ graphqlLib.typeDefinitionMod.GraphQLResolveInfo, 
      java.lang.String
    ]
  ): graphqlLib.typeDefinitionMod.GraphQLFieldConfig[_, _, ScalablyTyped.runtime.StringDictionary[_]] = js.native
  def mutationWithClientMutationId(config: MutationConfig): graphqlLib.typeDefinitionMod.GraphQLFieldConfig[_, _, ScalablyTyped.runtime.StringDictionary[_]] = js.native
  def nodeDefinitions[TContext](
    idFetcher: js.Function3[
      /* id */ java.lang.String, 
      /* context */ TContext, 
      /* info */ graphqlLib.typeDefinitionMod.GraphQLResolveInfo, 
      _
    ]
  ): GraphQLNodeDefinitions = js.native
  def nodeDefinitions[TContext](
    idFetcher: js.Function3[
      /* id */ java.lang.String, 
      /* context */ TContext, 
      /* info */ graphqlLib.typeDefinitionMod.GraphQLResolveInfo, 
      _
    ],
    typeResolver: graphqlLib.typeDefinitionMod.GraphQLTypeResolver[_, TContext]
  ): GraphQLNodeDefinitions = js.native
  def offsetToCursor(offset: scala.Double): ConnectionCursor = js.native
  def pluralIdentifyingRootField(config: PluralIdentifyingRootFieldConfig): graphqlLib.typeDefinitionMod.GraphQLFieldConfig[_, _, ScalablyTyped.runtime.StringDictionary[_]] = js.native
  def toGlobalId(`type`: java.lang.String, id: java.lang.String): java.lang.String = js.native
}

