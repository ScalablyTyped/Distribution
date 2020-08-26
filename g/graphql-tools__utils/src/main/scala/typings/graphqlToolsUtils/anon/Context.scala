package typings.graphqlToolsUtils.anon

import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsUtils.interfacesMod.VisitableSchemaType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context extends js.Object {
  var args: /* import warning: RewrittenClass.unapply cls was tparam TArgs */ js.Any = js.native
  var context: /* import warning: RewrittenClass.unapply cls was tparam TContext */ js.Any = js.native
  var name: String = js.native
  var schema: GraphQLSchema = js.native
  var visitedType: VisitableSchemaType = js.native
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
  @scala.inline
  implicit class ContextOps[Self <: Context] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArgs(value: /* import warning: RewrittenClass.unapply cls was tparam TArgs */ js.Any): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def setContext(value: /* import warning: RewrittenClass.unapply cls was tparam TContext */ js.Any): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchema(value: GraphQLSchema): Self = this.set("schema", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisitedType(value: VisitableSchemaType): Self = this.set("visitedType", value.asInstanceOf[js.Any])
  }
  
}

