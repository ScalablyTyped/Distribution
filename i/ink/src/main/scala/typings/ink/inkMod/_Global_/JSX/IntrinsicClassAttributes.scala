package typings.ink.inkMod._Global_.JSX

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntrinsicClassAttributes[T] extends js.Object {
  var ref: js.UndefOr[js.Function1[/* ref */ T | Null, Unit]] = js.undefined
}

object IntrinsicClassAttributes {
  @scala.inline
  def apply[T](ref: /* ref */ T | Null => Unit = null): IntrinsicClassAttributes[T] = {
    val __obj = js.Dynamic.literal()
    if (ref != null) __obj.updateDynamic("ref")(js.Any.fromFunction1(ref))
    __obj.asInstanceOf[IntrinsicClassAttributes[T]]
  }
}

