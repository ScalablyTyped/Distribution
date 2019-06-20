package typings
package atIonicReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenArray extends js.Object {
  var children: js.UndefOr[js.Array[reactLib.reactMod.ReactElement] | reactLib.reactMod.ReactElement] = js.undefined
}

object Anon_ChildrenArray {
  @scala.inline
  def apply(children: js.Array[reactLib.reactMod.ReactElement] | reactLib.reactMod.ReactElement = null): Anon_ChildrenArray = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ChildrenArray]
  }
}

