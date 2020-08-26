package typings.graphqlToolsDelegate

import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsDelegate.typesMod.CreateProxyingResolverFn
import typings.graphqlToolsDelegate.typesMod.Executor
import typings.graphqlToolsDelegate.typesMod.MergedTypeConfig
import typings.graphqlToolsDelegate.typesMod.SubschemaConfig
import typings.graphqlToolsDelegate.typesMod.Subscriber
import typings.graphqlToolsUtils.interfacesMod.Transform
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/delegate/Subschema", JSImport.Namespace)
@js.native
object subschemaMod extends js.Object {
  @js.native
  class Subschema protected () extends js.Object {
    def this(config: SubschemaConfig) = this()
    var createProxyingResolver: js.UndefOr[CreateProxyingResolverFn] = js.native
    var executor: js.UndefOr[Executor] = js.native
    var merge: js.UndefOr[Record[String, MergedTypeConfig]] = js.native
    var rootValue: js.UndefOr[Record[String, _]] = js.native
    var schema: GraphQLSchema = js.native
    var subscriber: js.UndefOr[Subscriber] = js.native
    var transformedSchema: GraphQLSchema = js.native
    var transforms: js.Array[Transform[Record[String, _]]] = js.native
  }
  
  def getSubschema(result: js.Any, responseKey: String): GraphQLSchema | SubschemaConfig = js.native
  def isSubschema(value: js.Any): /* is @graphql-tools/delegate.@graphql-tools/delegate/Subschema.Subschema */ Boolean = js.native
  def isSubschemaConfig(value: js.Any): Boolean = js.native
  def setObjectSubschema(result: js.Any, subschema: GraphQLSchema): Unit = js.native
  def setObjectSubschema(result: js.Any, subschema: SubschemaConfig): Unit = js.native
}

