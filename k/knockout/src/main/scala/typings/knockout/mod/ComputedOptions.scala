package typings.knockout.mod

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComputedOptions[T, TTarget] extends js.Object {
  var deferEvaluation: js.UndefOr[Boolean] = js.native
  var disposeWhen: js.UndefOr[js.Function0[Boolean]] = js.native
  var disposeWhenNodeIsRemoved: js.UndefOr[Node] = js.native
  var owner: js.UndefOr[TTarget] = js.native
  var pure: js.UndefOr[Boolean] = js.native
  var read: js.UndefOr[ComputedReadFunction[T, TTarget]] = js.native
  var write: js.UndefOr[ComputedWriteFunction[T, TTarget]] = js.native
}

object ComputedOptions {
  @scala.inline
  def apply[T, TTarget](): ComputedOptions[T, TTarget] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComputedOptions[T, TTarget]]
  }
  @scala.inline
  implicit class ComputedOptionsOps[Self <: ComputedOptions[_, _], T, TTarget] (val x: Self with (ComputedOptions[T, TTarget])) extends AnyVal {
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
    def setDeferEvaluation(value: Boolean): Self = this.set("deferEvaluation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeferEvaluation: Self = this.set("deferEvaluation", js.undefined)
    @scala.inline
    def setDisposeWhen(value: () => Boolean): Self = this.set("disposeWhen", js.Any.fromFunction0(value))
    @scala.inline
    def deleteDisposeWhen: Self = this.set("disposeWhen", js.undefined)
    @scala.inline
    def setDisposeWhenNodeIsRemoved(value: Node): Self = this.set("disposeWhenNodeIsRemoved", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisposeWhenNodeIsRemoved: Self = this.set("disposeWhenNodeIsRemoved", js.undefined)
    @scala.inline
    def setOwner(value: TTarget): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    @scala.inline
    def setPure(value: Boolean): Self = this.set("pure", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePure: Self = this.set("pure", js.undefined)
    @scala.inline
    def setRead(value: ComputedReadFunction[T, TTarget]): Self = this.set("read", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRead: Self = this.set("read", js.undefined)
    @scala.inline
    def setWrite(value: ComputedWriteFunction[T, TTarget]): Self = this.set("write", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrite: Self = this.set("write", js.undefined)
  }
  
}

