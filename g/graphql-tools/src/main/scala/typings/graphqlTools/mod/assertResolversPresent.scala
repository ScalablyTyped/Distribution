package typings.graphqlTools.mod

import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsUtils.interfacesMod.IResolverValidationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools", "assertResolversPresent")
@js.native
object assertResolversPresent extends js.Object {
  def apply(schema: GraphQLSchema): Unit = js.native
  def apply(schema: GraphQLSchema, resolverValidationOptions: IResolverValidationOptions): Unit = js.native
}

