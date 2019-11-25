package typings.graphql.graphqlMod

import typings.graphql.languageAstMod.ListTypeNode
import typings.graphql.languageAstMod.NamedTypeNode
import typings.graphql.languageAstMod.NonNullTypeNode
import typings.graphql.typeDefinitionMod.GraphQLNamedType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "typeFromAST")
@js.native
object typeFromAST extends js.Object {
  def apply(schema: typings.graphql.typeSchemaMod.GraphQLSchema, typeNode: ListTypeNode): js.UndefOr[typings.graphql.typeDefinitionMod.GraphQLList[_]] = js.native
  def apply(schema: typings.graphql.typeSchemaMod.GraphQLSchema, typeNode: NamedTypeNode): js.UndefOr[GraphQLNamedType] = js.native
  def apply(schema: typings.graphql.typeSchemaMod.GraphQLSchema, typeNode: NonNullTypeNode): js.UndefOr[typings.graphql.typeDefinitionMod.GraphQLNonNull[_]] = js.native
}

