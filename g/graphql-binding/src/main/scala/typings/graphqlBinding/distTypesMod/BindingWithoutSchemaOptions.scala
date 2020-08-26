package typings.graphqlBinding.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BindingWithoutSchemaOptions extends js.Object {
  var before: js.UndefOr[js.Function0[Unit]] = js.native
  var fragmentReplacements: js.UndefOr[js.Array[FragmentReplacement]] = js.native
}

object BindingWithoutSchemaOptions {
  @scala.inline
  def apply(): BindingWithoutSchemaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BindingWithoutSchemaOptions]
  }
  @scala.inline
  implicit class BindingWithoutSchemaOptionsOps[Self <: BindingWithoutSchemaOptions] (val x: Self) extends AnyVal {
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
    def setBefore(value: () => Unit): Self = this.set("before", js.Any.fromFunction0(value))
    @scala.inline
    def deleteBefore: Self = this.set("before", js.undefined)
    @scala.inline
    def setFragmentReplacementsVarargs(value: FragmentReplacement*): Self = this.set("fragmentReplacements", js.Array(value :_*))
    @scala.inline
    def setFragmentReplacements(value: js.Array[FragmentReplacement]): Self = this.set("fragmentReplacements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFragmentReplacements: Self = this.set("fragmentReplacements", js.undefined)
  }
  
}

