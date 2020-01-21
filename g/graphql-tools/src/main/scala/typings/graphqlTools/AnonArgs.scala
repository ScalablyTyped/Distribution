package typings.graphqlTools

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.mod.GraphQLSchema
import typings.graphqlTools.schemaVisitorMod.VisitableSchemaType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArgs extends js.Object {
  var args: StringDictionary[js.Any]
  var context: StringDictionary[js.Any]
  var name: String
  var schema: GraphQLSchema
  var visitedType: VisitableSchemaType
}

object AnonArgs {
  @scala.inline
  def apply(
    args: StringDictionary[js.Any],
    context: StringDictionary[js.Any],
    name: String,
    schema: GraphQLSchema,
    visitedType: VisitableSchemaType
  ): AnonArgs = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], visitedType = visitedType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonArgs]
  }
}

