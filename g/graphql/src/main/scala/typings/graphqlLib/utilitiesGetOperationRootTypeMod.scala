package typings
package graphqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/utilities/getOperationRootType", JSImport.Namespace)
@js.native
object utilitiesGetOperationRootTypeMod extends js.Object {
  def getOperationRootType(
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    operation: graphqlLib.languageAstMod.OperationDefinitionNode
  ): graphqlLib.typeDefinitionMod.GraphQLObjectType[_, _] = js.native
  def getOperationRootType(
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    operation: graphqlLib.languageAstMod.OperationTypeDefinitionNode
  ): graphqlLib.typeDefinitionMod.GraphQLObjectType[_, _] = js.native
}

