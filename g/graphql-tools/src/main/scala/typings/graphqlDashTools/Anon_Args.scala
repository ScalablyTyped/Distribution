package typings.graphqlDashTools

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.graphqlMod.GraphQLSchema
import typings.graphqlDashTools.distSchemaVisitorMod.VisitableSchemaType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Args extends js.Object {
  var args: StringDictionary[js.Any]
  var context: StringDictionary[js.Any]
  var name: String
  var schema: GraphQLSchema
  var visitedType: VisitableSchemaType
}

object Anon_Args {
  @scala.inline
  def apply(
    args: StringDictionary[js.Any],
    context: StringDictionary[js.Any],
    name: String,
    schema: GraphQLSchema,
    visitedType: VisitableSchemaType
  ): Anon_Args = {
    val __obj = js.Dynamic.literal(args = args, context = context, name = name, schema = schema, visitedType = visitedType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Args]
  }
}

