package typings.graphqlTools.mod

import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsUtils.interfacesMod.IResolvers
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools", "getResolversFromSchema")
@js.native
object getResolversFromSchema extends js.Object {
  def apply(schema: GraphQLSchema): IResolvers[_, _, Record[String, _], _] = js.native
}

