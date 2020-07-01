package typings.graphqlToolsSchema

import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsUtils.interfacesMod.IResolverValidationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/schema/assertResolversPresent", JSImport.Namespace)
@js.native
object assertResolversPresentMod extends js.Object {
  def assertResolversPresent(schema: GraphQLSchema): Unit = js.native
  def assertResolversPresent(schema: GraphQLSchema, resolverValidationOptions: IResolverValidationOptions): Unit = js.native
}

