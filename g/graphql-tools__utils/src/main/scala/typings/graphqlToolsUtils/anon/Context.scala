package typings.graphqlToolsUtils.anon

import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsUtils.interfacesMod.VisitableSchemaType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var args: /* import warning: RewrittenClass.unapply cls was tparam TArgs */ js.Any
  var context: /* import warning: RewrittenClass.unapply cls was tparam TContext */ js.Any
  var name: String
  var schema: GraphQLSchema
  var visitedType: VisitableSchemaType
}

object Context {
  @scala.inline
  def apply(
    args: /* import warning: RewrittenClass.unapply cls was tparam TArgs */ js.Any,
    context: /* import warning: RewrittenClass.unapply cls was tparam TContext */ js.Any,
    name: String,
    schema: GraphQLSchema,
    visitedType: VisitableSchemaType
  ): Context = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], visitedType = visitedType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
}

