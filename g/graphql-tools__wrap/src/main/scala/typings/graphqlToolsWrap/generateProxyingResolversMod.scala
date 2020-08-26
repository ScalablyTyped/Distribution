package typings.graphqlToolsWrap

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.definitionMod.GraphQLFieldResolver
import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsDelegate.typesMod.ICreateProxyingResolverOptions
import typings.graphqlToolsDelegate.typesMod.SubschemaConfig
import typings.graphqlToolsUtils.interfacesMod.Transform
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/wrap/generateProxyingResolvers", JSImport.Namespace)
@js.native
object generateProxyingResolversMod extends js.Object {
  def defaultCreateProxyingResolver(hasSchemaOperationTransformsTransformedSchema: ICreateProxyingResolverOptions): GraphQLFieldResolver[_, _, StringDictionary[_]] = js.native
  def generateProxyingResolvers(subschemaOrSubschemaConfig: GraphQLSchema, transforms: js.Array[Transform[Record[String, _]]]): Record[String, Record[String, GraphQLFieldResolver[_, _, StringDictionary[_]]]] = js.native
  def generateProxyingResolvers(subschemaOrSubschemaConfig: SubschemaConfig, transforms: js.Array[Transform[Record[String, _]]]): Record[String, Record[String, GraphQLFieldResolver[_, _, StringDictionary[_]]]] = js.native
}

