package typings.graphqlTools.anon

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.mod.GraphQLSchema
import typings.graphqlTools.schemaVisitorMod.VisitableSchemaType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Args extends js.Object {
  var args: StringDictionary[js.Any]
  var context: StringDictionary[js.Any]
  var name: String
  var schema: GraphQLSchema
  var visitedType: VisitableSchemaType
}

object Args {
  @scala.inline
  def apply(
    args: StringDictionary[js.Any],
    context: StringDictionary[js.Any],
    name: String,
    schema: GraphQLSchema,
    visitedType: VisitableSchemaType
  ): Args = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], visitedType = visitedType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Args]
  }
}

