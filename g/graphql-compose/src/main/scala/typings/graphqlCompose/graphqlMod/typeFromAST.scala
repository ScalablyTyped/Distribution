package typings.graphqlCompose.graphqlMod

import typings.graphql.astMod.ListTypeNode
import typings.graphql.astMod.NamedTypeNode
import typings.graphql.astMod.NonNullTypeNode
import typings.graphql.definitionMod.GraphQLNamedType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/lib/graphql", "typeFromAST")
@js.native
object typeFromAST extends js.Object {
  def apply(schema: typings.graphql.schemaMod.GraphQLSchema, typeNode: ListTypeNode): js.UndefOr[typings.graphql.definitionMod.GraphQLList[_]] = js.native
  def apply(schema: typings.graphql.schemaMod.GraphQLSchema, typeNode: NamedTypeNode): js.UndefOr[GraphQLNamedType] = js.native
  def apply(schema: typings.graphql.schemaMod.GraphQLSchema, typeNode: NonNullTypeNode): js.UndefOr[typings.graphql.definitionMod.GraphQLNonNull[_]] = js.native
}

