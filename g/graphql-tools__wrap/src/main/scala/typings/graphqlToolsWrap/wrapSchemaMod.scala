package typings.graphqlToolsWrap

import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsDelegate.typesMod.SubschemaConfig
import typings.graphqlToolsUtils.interfacesMod.Transform
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/wrap/wrapSchema", JSImport.Namespace)
@js.native
object wrapSchemaMod extends js.Object {
  def wrapSchema(subschemaOrSubschemaConfig: GraphQLSchema): GraphQLSchema = js.native
  def wrapSchema(subschemaOrSubschemaConfig: GraphQLSchema, transforms: js.Array[Transform[Record[String, _]]]): GraphQLSchema = js.native
  def wrapSchema(subschemaOrSubschemaConfig: SubschemaConfig): GraphQLSchema = js.native
  def wrapSchema(subschemaOrSubschemaConfig: SubschemaConfig, transforms: js.Array[Transform[Record[String, _]]]): GraphQLSchema = js.native
}

