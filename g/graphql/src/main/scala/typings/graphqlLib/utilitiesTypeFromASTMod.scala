package typings
package graphqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/utilities/typeFromAST", JSImport.Namespace)
@js.native
object utilitiesTypeFromASTMod extends js.Object {
  def typeFromAST(schema: graphqlLib.typeSchemaMod.GraphQLSchema, typeNode: graphqlLib.languageAstMod.ListTypeNode): js.UndefOr[graphqlLib.typeDefinitionMod.GraphQLList[_]] = js.native
  def typeFromAST(schema: graphqlLib.typeSchemaMod.GraphQLSchema, typeNode: graphqlLib.languageAstMod.NamedTypeNode): js.UndefOr[graphqlLib.typeDefinitionMod.GraphQLNamedType] = js.native
  def typeFromAST(
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    typeNode: graphqlLib.languageAstMod.NonNullTypeNode
  ): js.UndefOr[graphqlLib.typeDefinitionMod.GraphQLNonNull[_]] = js.native
}

