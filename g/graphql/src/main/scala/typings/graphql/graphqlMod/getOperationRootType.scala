package typings.graphql.graphqlMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.languageAstMod.OperationDefinitionNode
import typings.graphql.languageAstMod.OperationTypeDefinitionNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "getOperationRootType")
@js.native
object getOperationRootType extends js.Object {
  def apply(schema: typings.graphql.typeSchemaMod.GraphQLSchema, operation: OperationDefinitionNode): typings.graphql.typeDefinitionMod.GraphQLObjectType[_, _, StringDictionary[_]] = js.native
  def apply(schema: typings.graphql.typeSchemaMod.GraphQLSchema, operation: OperationTypeDefinitionNode): typings.graphql.typeDefinitionMod.GraphQLObjectType[_, _, StringDictionary[_]] = js.native
}

