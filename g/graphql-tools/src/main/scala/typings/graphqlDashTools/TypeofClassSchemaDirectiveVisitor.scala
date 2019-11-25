package typings.graphqlDashTools

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.graphql.graphqlMod.GraphQLDirective
import typings.graphql.graphqlMod.GraphQLSchema
import typings.graphqlDashTools.distSchemaVisitorMod.SchemaDirectiveVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassSchemaDirectiveVisitor extends Instantiable1[/* config */ Anon_Args, SchemaDirectiveVisitor] {
  /* protected */ def getDeclaredDirectives(
    schema: GraphQLSchema,
    directiveVisitors: StringDictionary[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof SchemaDirectiveVisitor */ js.Any
    ]
  ): StringDictionary[GraphQLDirective] = js.native
  def getDirectiveDeclaration(directiveName: String, schema: GraphQLSchema): GraphQLDirective = js.native
  def visitSchemaDirectives(
    schema: GraphQLSchema,
    directiveVisitors: StringDictionary[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof SchemaDirectiveVisitor */ js.Any
    ]
  ): StringDictionary[js.Array[SchemaDirectiveVisitor]] = js.native
  def visitSchemaDirectives(
    schema: GraphQLSchema,
    directiveVisitors: StringDictionary[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof SchemaDirectiveVisitor */ js.Any
    ],
    context: StringDictionary[js.Any]
  ): StringDictionary[js.Array[SchemaDirectiveVisitor]] = js.native
}

