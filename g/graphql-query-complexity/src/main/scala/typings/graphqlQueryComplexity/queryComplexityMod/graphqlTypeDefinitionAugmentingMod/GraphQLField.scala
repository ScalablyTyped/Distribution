package typings.graphqlQueryComplexity.queryComplexityMod.graphqlTypeDefinitionAugmentingMod

import typings.graphqlQueryComplexity.queryComplexityMod.Complexity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLField[TSource, TContext, TArgs] extends js.Object {
  var complexity: js.UndefOr[Complexity] = js.native
}

object GraphQLField {
  @scala.inline
  def apply[TSource, TContext, TArgs](): GraphQLField[TSource, TContext, TArgs] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphQLField[TSource, TContext, TArgs]]
  }
  @scala.inline
  implicit class GraphQLFieldOps[Self <: GraphQLField[_, _, _], TSource, TContext, TArgs] (val x: Self with (GraphQLField[TSource, TContext, TArgs])) extends AnyVal {
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
    def setComplexity(value: Complexity): Self = this.set("complexity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComplexity: Self = this.set("complexity", js.undefined)
  }
  
}

