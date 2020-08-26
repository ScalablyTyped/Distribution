package typings.graphqlToolsUtils.anon

import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsUtils.interfacesMod.VisitableSchemaType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Args[TArgs, TContext] extends js.Object {
  var args: TArgs = js.native
  var context: TContext = js.native
  var name: String = js.native
  var schema: GraphQLSchema = js.native
  var visitedType: VisitableSchemaType = js.native
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
  @scala.inline
  implicit class ArgsOps[Self <: Args[_, _], TArgs, TContext] (val x: Self with (Args[TArgs, TContext])) extends AnyVal {
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
    def setArgs(value: TArgs): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def setContext(value: TContext): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchema(value: GraphQLSchema): Self = this.set("schema", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisitedType(value: VisitableSchemaType): Self = this.set("visitedType", value.asInstanceOf[js.Any])
  }
  
}

