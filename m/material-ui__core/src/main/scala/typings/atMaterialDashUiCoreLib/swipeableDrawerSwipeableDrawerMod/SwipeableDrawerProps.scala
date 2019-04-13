package typings
package atMaterialDashUiCoreLib.swipeableDrawerSwipeableDrawerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof @material-ui/core.@material-ui/core/Drawer/Drawer.DrawerProps, 'onClose' | 'open'> ]: @material-ui/core.@material-ui/core/Drawer/Drawer.DrawerProps[P]} */ @js.native
trait SwipeableDrawerProps extends js.Object {
  var SwipeAreaProps: js.UndefOr[js.Object] = js.native
  var disableBackdropTransition: js.UndefOr[scala.Boolean] = js.native
  var disableDiscovery: js.UndefOr[scala.Boolean] = js.native
  var disableSwipeToOpen: js.UndefOr[scala.Boolean] = js.native
  var hysteresis: js.UndefOr[scala.Double] = js.native
  var minFlingVelocity: js.UndefOr[scala.Double] = js.native
  @JSName("onClose")
  var onClose_Original: reactLib.reactMod.ReactEventHandler[js.Object] = js.native
  @JSName("onOpen")
  var onOpen_Original: reactLib.reactMod.ReactEventHandler[js.Object] = js.native
  var open: scala.Boolean = js.native
  var swipeAreaWidth: js.UndefOr[scala.Double] = js.native
  def onClose(event: reactLib.reactMod.SyntheticEvent[js.Object, reactLib.Event]): scala.Unit = js.native
  def onOpen(event: reactLib.reactMod.SyntheticEvent[js.Object, reactLib.Event]): scala.Unit = js.native
}

