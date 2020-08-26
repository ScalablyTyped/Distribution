package typings.graphqlToolsDelegate.typesMod

import typings.graphql.astMod.DocumentNode
import typings.graphql.definitionMod.GraphQLResolveInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecutionParams[TArgs, TContext] extends js.Object {
  var context: js.UndefOr[TContext] = js.native
  var document: DocumentNode = js.native
  var info: js.UndefOr[GraphQLResolveInfo] = js.native
  var variables: js.UndefOr[TArgs] = js.native
}

object ExecutionParams {
  @scala.inline
  def apply[TArgs, TContext](document: DocumentNode): ExecutionParams[TArgs, TContext] = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutionParams[TArgs, TContext]]
  }
  @scala.inline
  implicit class ExecutionParamsOps[Self <: ExecutionParams[_, _], TArgs, TContext] (val x: Self with (ExecutionParams[TArgs, TContext])) extends AnyVal {
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
    def setDocument(value: DocumentNode): Self = this.set("document", value.asInstanceOf[js.Any])
    @scala.inline
    def setContext(value: TContext): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setInfo(value: GraphQLResolveInfo): Self = this.set("info", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfo: Self = this.set("info", js.undefined)
    @scala.inline
    def setVariables(value: TArgs): Self = this.set("variables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariables: Self = this.set("variables", js.undefined)
  }
  
}

