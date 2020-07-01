package typings.graphqlToolsSchema

import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsUtils.interfacesMod.IDirectiveResolvers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/schema/attachDirectiveResolvers", JSImport.Namespace)
@js.native
object attachDirectiveResolversMod extends js.Object {
  def attachDirectiveResolvers(schema: GraphQLSchema, directiveResolvers: IDirectiveResolvers[_, _]): GraphQLSchema = js.native
}

