package typings
package immerLib.immerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImmerState[T] extends js.Object {
  var assigned: /* import warning: ImportType.apply Failed type conversion: {[prop: string] : boolean, [index: number] : boolean} */ js.Any
  var base: T
  var copy: T
  var parent: js.UndefOr[ImmerState[_]] = js.undefined
}

object ImmerState {
  @scala.inline
  def apply[T](
    assigned: /* import warning: ImportType.apply Failed type conversion: {[prop: string] : boolean, [index: number] : boolean} */ js.Any,
    base: T,
    copy: T,
    parent: ImmerState[_] = null
  ): ImmerState[T] = {
    val __obj = js.Dynamic.literal(assigned = assigned, base = base.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[ImmerState[T]]
  }
}

