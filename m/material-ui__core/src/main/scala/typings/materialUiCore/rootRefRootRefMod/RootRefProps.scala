package typings.materialUiCore.rootRefRootRefMod

import typings.react.mod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RootRefProps[T] extends js.Object {
  var rootRef: js.UndefOr[(js.Function1[/* instance */ T | Null, Unit]) | RefObject[T]] = js.native
}

object RootRefProps {
  @scala.inline
  def apply[T](rootRef: (js.Function1[/* instance */ T | Null, Unit]) | RefObject[T] = null): RootRefProps[T] = {
    val __obj = js.Dynamic.literal()
    if (rootRef != null) __obj.updateDynamic("rootRef")(rootRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[RootRefProps[T]]
  }
}

