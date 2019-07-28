package typings.graphql

import typings.graphql.languageAstMod.ListTypeNode
import typings.graphql.languageAstMod.NamedTypeNode
import typings.graphql.languageAstMod.NonNullTypeNode
import typings.graphql.typeDefinitionMod.GraphQLList
import typings.graphql.typeDefinitionMod.GraphQLNamedType
import typings.graphql.typeDefinitionMod.GraphQLNonNull
import typings.graphql.typeSchemaMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/utilities/typeFromAST", JSImport.Namespace)
@js.native
object utilitiesTypeFromASTMod extends js.Object {
  def typeFromAST(schema: GraphQLSchema, typeNode: ListTypeNode): js.UndefOr[GraphQLList[_]] = js.native
  def typeFromAST(schema: GraphQLSchema, typeNode: NamedTypeNode): js.UndefOr[GraphQLNamedType] = js.native
  def typeFromAST(schema: GraphQLSchema, typeNode: NonNullTypeNode): js.UndefOr[GraphQLNonNull[_]] = js.native
}

