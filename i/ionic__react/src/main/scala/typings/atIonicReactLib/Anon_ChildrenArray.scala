package typings
package atIonicReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenArray extends js.Object {
  var children: js.UndefOr[
    (js.Array[
      reactLib.reactMod.ReactElement[atIonicReactLib.distComponentsNavigationIonRouterOutletMod.ChildProps]
    ]) | reactLib.reactMod.ReactElement[atIonicReactLib.distComponentsNavigationIonRouterOutletMod.ChildProps]
  ] = js.undefined
}

object Anon_ChildrenArray {
  @scala.inline
  def apply(
    children: (js.Array[
      reactLib.reactMod.ReactElement[atIonicReactLib.distComponentsNavigationIonRouterOutletMod.ChildProps]
    ]) | reactLib.reactMod.ReactElement[atIonicReactLib.distComponentsNavigationIonRouterOutletMod.ChildProps] = null
  ): Anon_ChildrenArray = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ChildrenArray]
  }
}

