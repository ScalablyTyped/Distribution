package typings.graphqlToolsUtils

import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsUtils.interfacesMod.SchemaVisitorMap
import typings.graphqlToolsUtils.interfacesMod.VisitorSelector
import typings.graphqlToolsUtils.schemaVisitorMod.SchemaVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/utils/visitSchema", JSImport.Namespace)
@js.native
object visitSchemaMod extends js.Object {
  def visitSchema(schema: GraphQLSchema, visitorOrVisitorSelector: js.Array[SchemaVisitor | SchemaVisitorMap]): GraphQLSchema = js.native
  def visitSchema(schema: GraphQLSchema, visitorOrVisitorSelector: SchemaVisitorMap): GraphQLSchema = js.native
  def visitSchema(schema: GraphQLSchema, visitorOrVisitorSelector: VisitorSelector): GraphQLSchema = js.native
  def visitSchema(schema: GraphQLSchema, visitorOrVisitorSelector: SchemaVisitor): GraphQLSchema = js.native
}

