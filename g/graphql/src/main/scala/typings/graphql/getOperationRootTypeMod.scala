package typings.graphql

import typings.graphql.astMod.OperationDefinitionNode
import typings.graphql.astMod.OperationTypeDefinitionNode
import typings.graphql.definitionMod.GraphQLObjectType
import typings.graphql.schemaMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/utilities/getOperationRootType", JSImport.Namespace)
@js.native
object getOperationRootTypeMod extends js.Object {
  def getOperationRootType(schema: GraphQLSchema, operation: OperationDefinitionNode): GraphQLObjectType[_, _] = js.native
  def getOperationRootType(schema: GraphQLSchema, operation: OperationTypeDefinitionNode): GraphQLObjectType[_, _] = js.native
}

