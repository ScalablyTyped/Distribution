package typings.graphqlTools.mod

import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsUtils.interfacesMod.IDirectiveResolvers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools", "attachDirectiveResolvers")
@js.native
object attachDirectiveResolvers extends js.Object {
  def apply(schema: GraphQLSchema, directiveResolvers: IDirectiveResolvers[_, _]): GraphQLSchema = js.native
}

