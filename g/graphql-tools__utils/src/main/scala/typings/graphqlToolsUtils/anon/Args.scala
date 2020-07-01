package typings.graphqlToolsUtils.anon

import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsUtils.interfacesMod.VisitableSchemaType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Args[TArgs, TContext] extends js.Object {
  var args: TArgs
  var context: TContext
  var name: String
  var schema: GraphQLSchema
  var visitedType: VisitableSchemaType
}

object Args {
  @scala.inline
  def apply[TArgs, TContext](
    args: TArgs,
    context: TContext,
    name: String,
    schema: GraphQLSchema,
    visitedType: VisitableSchemaType
  ): Args[TArgs, TContext] = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], visitedType = visitedType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Args[TArgs, TContext]]
  }
}

