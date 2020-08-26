package typings.graphqlTools.mod

import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsMock.typesMod.IMockOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools", "addMocksToSchema")
@js.native
object addMocksToSchema extends js.Object {
  def apply(hasSchemaMocksPreserveResolvers: IMockOptions): GraphQLSchema = js.native
}

