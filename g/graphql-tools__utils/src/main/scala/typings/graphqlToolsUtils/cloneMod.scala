package typings.graphqlToolsUtils

import typings.graphql.definitionMod.GraphQLNamedType
import typings.graphql.mod.GraphQLDirective
import typings.graphql.mod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/utils/clone", JSImport.Namespace)
@js.native
object cloneMod extends js.Object {
  def cloneDirective(directive: GraphQLDirective): GraphQLDirective = js.native
  def cloneSchema(schema: GraphQLSchema): GraphQLSchema = js.native
  def cloneType(`type`: GraphQLNamedType): GraphQLNamedType = js.native
}

