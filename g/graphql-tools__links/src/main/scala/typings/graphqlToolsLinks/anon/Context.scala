package typings.graphqlToolsLinks.anon

import typings.graphql.astMod.DocumentNode
import typings.graphql.definitionMod.GraphQLResolveInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context[TArgs, TContext] extends js.Object {
  var context: TContext = js.native
  var document: DocumentNode = js.native
  var info: GraphQLResolveInfo = js.native
  var variables: TArgs = js.native
}

object Context {
  @scala.inline
  def apply[TArgs, TContext](context: TContext, document: DocumentNode, info: GraphQLResolveInfo, variables: TArgs): Context[TArgs, TContext] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], document = document.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context[TArgs, TContext]]
  }
  @scala.inline
  implicit class ContextOps[Self <: Context[_, _], TArgs, TContext] (val x: Self with (Context[TArgs, TContext])) extends AnyVal {
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
    def setContext(value: TContext): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setDocument(value: DocumentNode): Self = this.set("document", value.asInstanceOf[js.Any])
    @scala.inline
    def setInfo(value: GraphQLResolveInfo): Self = this.set("info", value.asInstanceOf[js.Any])
    @scala.inline
    def setVariables(value: TArgs): Self = this.set("variables", value.asInstanceOf[js.Any])
  }
  
}

