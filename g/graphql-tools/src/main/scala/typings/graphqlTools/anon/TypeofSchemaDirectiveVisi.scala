package typings.graphqlTools.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.graphql.mod.GraphQLDirective
import typings.graphql.mod.GraphQLSchema
import typings.graphqlTools.schemaVisitorMod.SchemaDirectiveVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofSchemaDirectiveVisi extends Instantiable1[/* config */ Args, SchemaDirectiveVisitor] {
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

