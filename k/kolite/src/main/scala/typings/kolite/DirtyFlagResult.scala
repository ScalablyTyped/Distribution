package typings.kolite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirtyFlagResult extends js.Object {
  var isDirty: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutComputed<boolean> */ js.Any = js.native
  def forceDirty(): Unit = js.native
  def reset(): Unit = js.native
}

object DirtyFlagResult {
  @scala.inline
  def apply(
    forceDirty: () => Unit,
    isDirty: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutComputed<boolean> */ js.Any,
    reset: () => Unit
  ): DirtyFlagResult = {
    val __obj = js.Dynamic.literal(forceDirty = js.Any.fromFunction0(forceDirty), isDirty = isDirty.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[DirtyFlagResult]
  }
  @scala.inline
  implicit class DirtyFlagResultOps[Self <: DirtyFlagResult] (val x: Self) extends AnyVal {
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
    def setForceDirty(value: () => Unit): Self = this.set("forceDirty", js.Any.fromFunction0(value))
    @scala.inline
    def setIsDirty(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutComputed<boolean> */ js.Any
    ): Self = this.set("isDirty", value.asInstanceOf[js.Any])
    @scala.inline
    def setReset(value: () => Unit): Self = this.set("reset", js.Any.fromFunction0(value))
  }
  
}

