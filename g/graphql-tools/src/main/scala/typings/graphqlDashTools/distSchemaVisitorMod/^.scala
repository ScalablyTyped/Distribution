package typings.graphqlDashTools.distSchemaVisitorMod

import typings.graphql.graphqlMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/schemaVisitor", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def healSchema(schema: GraphQLSchema): GraphQLSchema = js.native
  def visitSchema(
    schema: GraphQLSchema,
    visitorSelector: js.Function2[/* type */ VisitableSchemaType, /* methodName */ String, js.Array[SchemaVisitor]]
  ): GraphQLSchema = js.native
}

