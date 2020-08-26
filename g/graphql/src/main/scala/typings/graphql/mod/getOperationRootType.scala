package typings.graphql.mod

import typings.graphql.astMod.OperationDefinitionNode
import typings.graphql.astMod.OperationTypeDefinitionNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "getOperationRootType")
@js.native
object getOperationRootType extends js.Object {
  def apply(schema: typings.graphql.schemaMod.GraphQLSchema, operation: OperationDefinitionNode): typings.graphql.definitionMod.GraphQLObjectType[_, _] = js.native
  def apply(schema: typings.graphql.schemaMod.GraphQLSchema, operation: OperationTypeDefinitionNode): typings.graphql.definitionMod.GraphQLObjectType[_, _] = js.native
}

