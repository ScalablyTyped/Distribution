package typings
package graphqlDashToolsLib.distSchemaVisitorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/schemaVisitor", "SchemaDirectiveVisitor")
@js.native
class SchemaDirectiveVisitor protected () extends SchemaVisitor {
  protected def this(config: graphqlDashToolsLib.Anon_Args) = this()
  var args: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  var context: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  var name: java.lang.String = js.native
  var visitedType: VisitableSchemaType = js.native
}

/* static members */
@JSImport("graphql-tools/dist/schemaVisitor", "SchemaDirectiveVisitor")
@js.native
object SchemaDirectiveVisitor extends js.Object {
  /* protected */ def getDeclaredDirectives(
    schema: graphqlLib.graphqlMod.GraphQLSchema,
    directiveVisitors: org.scalablytyped.runtime.StringDictionary[graphqlDashToolsLib.Anon_Config]
  ): org.scalablytyped.runtime.StringDictionary[graphqlLib.graphqlMod.GraphQLDirective] = js.native
  def getDirectiveDeclaration(directiveName: java.lang.String, schema: graphqlLib.graphqlMod.GraphQLSchema): graphqlLib.graphqlMod.GraphQLDirective = js.native
  def visitSchemaDirectives(
    schema: graphqlLib.graphqlMod.GraphQLSchema,
    directiveVisitors: org.scalablytyped.runtime.StringDictionary[graphqlDashToolsLib.Anon_Config]
  ): org.scalablytyped.runtime.StringDictionary[js.Array[graphqlDashToolsLib.distSchemaVisitorMod.SchemaDirectiveVisitor]] = js.native
  def visitSchemaDirectives(
    schema: graphqlLib.graphqlMod.GraphQLSchema,
    directiveVisitors: org.scalablytyped.runtime.StringDictionary[graphqlDashToolsLib.Anon_Config],
    context: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): org.scalablytyped.runtime.StringDictionary[js.Array[graphqlDashToolsLib.distSchemaVisitorMod.SchemaDirectiveVisitor]] = js.native
}

