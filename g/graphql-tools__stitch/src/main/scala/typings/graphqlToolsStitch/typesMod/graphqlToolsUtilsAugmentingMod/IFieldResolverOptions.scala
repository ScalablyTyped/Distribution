package typings.graphqlToolsStitch.typesMod.graphqlToolsUtilsAugmentingMod

import typings.graphql.astMod.FieldNode
import typings.graphql.astMod.SelectionSetNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFieldResolverOptions[TSource, TContext, TArgs] extends js.Object {
  var fragment: js.UndefOr[String] = js.native
  var selectionSet: js.UndefOr[String | (js.Function1[/* node */ FieldNode, SelectionSetNode])] = js.native
}

object IFieldResolverOptions {
  @scala.inline
  def apply[TSource, TContext, TArgs](): IFieldResolverOptions[TSource, TContext, TArgs] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFieldResolverOptions[TSource, TContext, TArgs]]
  }
  @scala.inline
  implicit class IFieldResolverOptionsOps[Self <: IFieldResolverOptions[_, _, _], TSource, TContext, TArgs] (val x: Self with (IFieldResolverOptions[TSource, TContext, TArgs])) extends AnyVal {
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
    def setFragment(value: String): Self = this.set("fragment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFragment: Self = this.set("fragment", js.undefined)
    @scala.inline
    def setSelectionSetFunction1(value: /* node */ FieldNode => SelectionSetNode): Self = this.set("selectionSet", js.Any.fromFunction1(value))
    @scala.inline
    def setSelectionSet(value: String | (js.Function1[/* node */ FieldNode, SelectionSetNode])): Self = this.set("selectionSet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionSet: Self = this.set("selectionSet", js.undefined)
  }
  
}

