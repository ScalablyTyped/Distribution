package typings
package inkLib.inkMod.Global.JSXNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntrinsicClassAttributes[T] extends js.Object {
  var ref: js.UndefOr[js.Function1[/* ref */ T | scala.Null, scala.Unit]] = js.undefined
}

object IntrinsicClassAttributes {
  @scala.inline
  def apply[T](ref: js.Function1[/* ref */ T | scala.Null, scala.Unit] = null): IntrinsicClassAttributes[T] = {
    val __obj = js.Dynamic.literal()
    if (ref != null) __obj.updateDynamic("ref")(ref)
    __obj.asInstanceOf[IntrinsicClassAttributes[T]]
  }
}

