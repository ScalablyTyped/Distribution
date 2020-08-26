package typings.graphqlBinding.distTypesMod

import typings.graphql.mod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BindingOptions extends js.Object {
  var before: js.UndefOr[js.Function0[Unit]] = js.native
  var disableCache: js.UndefOr[Boolean] = js.native
  var fragmentReplacements: js.UndefOr[js.Array[FragmentReplacement]] = js.native
  var schema: GraphQLSchema = js.native
}

object BindingOptions {
  @scala.inline
  def apply(schema: GraphQLSchema): BindingOptions = {
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindingOptions]
  }
  @scala.inline
  implicit class BindingOptionsOps[Self <: BindingOptions] (val x: Self) extends AnyVal {
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
    def setSchema(value: GraphQLSchema): Self = this.set("schema", value.asInstanceOf[js.Any])
    @scala.inline
    def setBefore(value: () => Unit): Self = this.set("before", js.Any.fromFunction0(value))
    @scala.inline
    def deleteBefore: Self = this.set("before", js.undefined)
    @scala.inline
    def setDisableCache(value: Boolean): Self = this.set("disableCache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableCache: Self = this.set("disableCache", js.undefined)
    @scala.inline
    def setFragmentReplacementsVarargs(value: FragmentReplacement*): Self = this.set("fragmentReplacements", js.Array(value :_*))
    @scala.inline
    def setFragmentReplacements(value: js.Array[FragmentReplacement]): Self = this.set("fragmentReplacements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFragmentReplacements: Self = this.set("fragmentReplacements", js.undefined)
  }
  
}

