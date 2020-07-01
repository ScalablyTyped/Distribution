package typings.graphqlToolsUtils

import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsUtils.interfacesMod.IResolvers
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/utils/getResolversFromSchema", JSImport.Namespace)
@js.native
object getResolversFromSchemaMod extends js.Object {
  def getResolversFromSchema(schema: GraphQLSchema): IResolvers[_, _, Record[String, _], _] = js.native
}

