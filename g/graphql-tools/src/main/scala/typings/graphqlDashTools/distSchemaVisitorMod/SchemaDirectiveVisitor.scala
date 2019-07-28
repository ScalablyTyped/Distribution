package typings.graphqlDashTools.distSchemaVisitorMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.graphqlMod.GraphQLDirective
import typings.graphql.graphqlMod.GraphQLSchema
import typings.graphqlDashTools.Anon_Args
import typings.graphqlDashTools.TypeofClassSchemaDirectiveVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/schemaVisitor", "SchemaDirectiveVisitor")
@js.native
class SchemaDirectiveVisitor protected () extends SchemaVisitor {
  protected def this(config: Anon_Args) = this()
  var args: StringDictionary[js.Any] = js.native
  var context: StringDictionary[js.Any] = js.native
  var name: String = js.native
  var visitedType: VisitableSchemaType = js.native
}

/* static members */
@JSImport("graphql-tools/dist/schemaVisitor", "SchemaDirectiveVisitor")
@js.native
object SchemaDirectiveVisitor extends js.Object {
  /* protected */ def getDeclaredDirectives(schema: GraphQLSchema, directiveVisitors: StringDictionary[TypeofClassSchemaDirectiveVisitor]): StringDictionary[GraphQLDirective] = js.native
  def getDirectiveDeclaration(directiveName: String, schema: GraphQLSchema): GraphQLDirective = js.native
  def visitSchemaDirectives(schema: GraphQLSchema, directiveVisitors: StringDictionary[TypeofClassSchemaDirectiveVisitor]): StringDictionary[js.Array[SchemaDirectiveVisitor]] = js.native
  def visitSchemaDirectives(
    schema: GraphQLSchema,
    directiveVisitors: StringDictionary[TypeofClassSchemaDirectiveVisitor],
    context: StringDictionary[js.Any]
  ): StringDictionary[js.Array[SchemaDirectiveVisitor]] = js.native
}

