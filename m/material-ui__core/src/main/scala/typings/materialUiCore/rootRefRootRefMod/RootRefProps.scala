package typings.materialUiCore.rootRefRootRefMod

import typings.react.mod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RootRefProps[T] extends js.Object {
  var rootRef: js.UndefOr[(js.Function1[/* instance */ T | Null, Unit]) | RefObject[T]] = js.native
}

object RootRefProps {
  @scala.inline
  def apply[T](): RootRefProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RootRefProps[T]]
  }
  @scala.inline
  implicit class RootRefPropsOps[Self <: RootRefProps[_], T] (val x: Self with RootRefProps[T]) extends AnyVal {
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
    def setRootRefFunction1(value: /* instance */ T | Null => Unit): Self = this.set("rootRef", js.Any.fromFunction1(value))
    @scala.inline
    def setRootRef(value: (js.Function1[/* instance */ T | Null, Unit]) | RefObject[T]): Self = this.set("rootRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootRef: Self = this.set("rootRef", js.undefined)
  }
  
}

