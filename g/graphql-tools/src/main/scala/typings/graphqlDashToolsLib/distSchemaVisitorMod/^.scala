package typings
package graphqlDashToolsLib.distSchemaVisitorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/schemaVisitor", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def healSchema(schema: graphqlLib.graphqlMod.GraphQLSchema): graphqlLib.graphqlMod.GraphQLSchema = js.native
  def visitSchema(
    schema: graphqlLib.graphqlMod.GraphQLSchema,
    visitorSelector: js.Function2[
      /* type */ graphqlDashToolsLib.distSchemaVisitorMod.VisitableSchemaType, 
      /* methodName */ java.lang.String, 
      js.Array[graphqlDashToolsLib.distSchemaVisitorMod.SchemaVisitor]
    ]
  ): graphqlLib.graphqlMod.GraphQLSchema = js.native
}

