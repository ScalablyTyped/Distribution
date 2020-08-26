package typings.knockoutPaging

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutComputedDefine[T] extends js.Object {
  var deferEvaluation: js.UndefOr[Boolean] = js.native
  var disposeWhen: js.UndefOr[js.Function0[Boolean]] = js.native
  var disposeWhenNodeIsRemoved: js.UndefOr[Node] = js.native
  var owner: js.UndefOr[js.Any] = js.native
  var pure: js.UndefOr[Boolean] = js.native
  var write: js.UndefOr[js.Function1[/* value */ T, Unit]] = js.native
  def read(): T = js.native
}

object KnockoutComputedDefine {
  @scala.inline
  def apply[T](read: () => T): KnockoutComputedDefine[T] = {
    val __obj = js.Dynamic.literal(read = js.Any.fromFunction0(read))
    __obj.asInstanceOf[KnockoutComputedDefine[T]]
  }
  @scala.inline
  implicit class KnockoutComputedDefineOps[Self <: KnockoutComputedDefine[_], T] (val x: Self with KnockoutComputedDefine[T]) extends AnyVal {
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
    def setRead(value: () => T): Self = this.set("read", js.Any.fromFunction0(value))
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
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    @scala.inline
    def setPure(value: Boolean): Self = this.set("pure", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePure: Self = this.set("pure", js.undefined)
    @scala.inline
    def setWrite(value: /* value */ T => Unit): Self = this.set("write", js.Any.fromFunction1(value))
    @scala.inline
    def deleteWrite: Self = this.set("write", js.undefined)
  }
  
}

