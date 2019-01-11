package typings
package graphqlDashRelayLib.graphqlDashRelayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-relay", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val backwardConnectionArgs: graphqlLib.typeDefinitionMod.GraphQLFieldConfigArgumentMap with graphqlDashRelayLib.graphqlDashRelayMod.BackwardConnectionArgs = js.native
  val connectionArgs: graphqlLib.typeDefinitionMod.GraphQLFieldConfigArgumentMap with graphqlDashRelayLib.graphqlDashRelayMod.ForwardConnectionArgs with graphqlDashRelayLib.graphqlDashRelayMod.BackwardConnectionArgs = js.native
  val forwardConnectionArgs: graphqlLib.typeDefinitionMod.GraphQLFieldConfigArgumentMap with graphqlDashRelayLib.graphqlDashRelayMod.ForwardConnectionArgs = js.native
  def connectionDefinitions(config: graphqlDashRelayLib.graphqlDashRelayMod.ConnectionConfig): graphqlDashRelayLib.graphqlDashRelayMod.GraphQLConnectionDefinitions = js.native
  def connectionFromArray[T](data: js.Array[T], args: graphqlDashRelayLib.graphqlDashRelayMod.ConnectionArguments): graphqlDashRelayLib.graphqlDashRelayMod.Connection[T] = js.native
  def connectionFromArraySlice[T](
    arraySlice: js.Array[T],
    args: graphqlDashRelayLib.graphqlDashRelayMod.ConnectionArguments,
    meta: graphqlDashRelayLib.graphqlDashRelayMod.ArraySliceMetaInfo
  ): graphqlDashRelayLib.graphqlDashRelayMod.Connection[T] = js.native
  def connectionFromPromisedArray[T](
    dataPromise: js.Promise[js.Array[T]],
    args: graphqlDashRelayLib.graphqlDashRelayMod.ConnectionArguments
  ): js.Promise[graphqlDashRelayLib.graphqlDashRelayMod.Connection[T]] = js.native
  def connectionFromPromisedArraySlice[T](
    dataPromise: js.Promise[js.Array[T]],
    args: graphqlDashRelayLib.graphqlDashRelayMod.ConnectionArguments,
    arrayInfo: graphqlDashRelayLib.graphqlDashRelayMod.ArraySliceMetaInfo
  ): js.Promise[graphqlDashRelayLib.graphqlDashRelayMod.Connection[T]] = js.native
  def cursorForObjectInConnection[T](data: js.Array[T], `object`: T): graphqlDashRelayLib.graphqlDashRelayMod.ConnectionCursor = js.native
  def cursorToOffset(cursor: graphqlDashRelayLib.graphqlDashRelayMod.ConnectionCursor): scala.Double = js.native
  def fromGlobalId(globalId: java.lang.String): graphqlDashRelayLib.graphqlDashRelayMod.ResolvedGlobalId = js.native
  def getOffsetWithDefault(): scala.Double = js.native
  def getOffsetWithDefault(cursor: graphqlDashRelayLib.graphqlDashRelayMod.ConnectionCursor): scala.Double = js.native
  def getOffsetWithDefault(cursor: graphqlDashRelayLib.graphqlDashRelayMod.ConnectionCursor, defaultOffset: scala.Double): scala.Double = js.native
  def getOffsetWithDefault(cursor: scala.Null, defaultOffset: scala.Double): scala.Double = js.native
  def globalIdField(): graphqlLib.typeDefinitionMod.GraphQLFieldConfig[_, _, org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def globalIdField(typeName: java.lang.String): graphqlLib.typeDefinitionMod.GraphQLFieldConfig[_, _, org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def globalIdField(
    typeName: java.lang.String,
    idFetcher: js.Function3[
      /* object */ js.Any, 
      /* context */ js.Any, 
      /* info */ graphqlLib.typeDefinitionMod.GraphQLResolveInfo, 
      java.lang.String
    ]
  ): graphqlLib.typeDefinitionMod.GraphQLFieldConfig[_, _, org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def mutationWithClientMutationId(config: graphqlDashRelayLib.graphqlDashRelayMod.MutationConfig): graphqlLib.typeDefinitionMod.GraphQLFieldConfig[_, _, org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def nodeDefinitions[TContext](
    idFetcher: js.Function3[
      /* id */ java.lang.String, 
      /* context */ TContext, 
      /* info */ graphqlLib.typeDefinitionMod.GraphQLResolveInfo, 
      _
    ]
  ): graphqlDashRelayLib.graphqlDashRelayMod.GraphQLNodeDefinitions = js.native
  def nodeDefinitions[TContext](
    idFetcher: js.Function3[
      /* id */ java.lang.String, 
      /* context */ TContext, 
      /* info */ graphqlLib.typeDefinitionMod.GraphQLResolveInfo, 
      _
    ],
    typeResolver: graphqlLib.typeDefinitionMod.GraphQLTypeResolver[_, TContext]
  ): graphqlDashRelayLib.graphqlDashRelayMod.GraphQLNodeDefinitions = js.native
  def offsetToCursor(offset: scala.Double): graphqlDashRelayLib.graphqlDashRelayMod.ConnectionCursor = js.native
  def pluralIdentifyingRootField(config: graphqlDashRelayLib.graphqlDashRelayMod.PluralIdentifyingRootFieldConfig): graphqlLib.typeDefinitionMod.GraphQLFieldConfig[_, _, org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def toGlobalId(`type`: java.lang.String, id: java.lang.String): java.lang.String = js.native
}

