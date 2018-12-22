package typings
package atMaterialDashUiCoreLib.swipeabledrawerSwipeableDrawerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Lifted 1 members from Set(std.Pick) */ @js.native
trait SwipeableDrawerProps extends js.Object {
  var SwipeAreaProps: js.UndefOr[js.Object] = js.native
  var disableBackdropTransition: js.UndefOr[scala.Boolean] = js.native
  var disableDiscovery: js.UndefOr[scala.Boolean] = js.native
  var disableSwipeToOpen: js.UndefOr[scala.Boolean] = js.native
  var hysteresis: js.UndefOr[scala.Double] = js.native
  var minFlingVelocity: js.UndefOr[scala.Double] = js.native
  @JSName("onClose")
  var onClose_Original: reactLib.reactMod.ReactNs.ReactEventHandler[js.Object] = js.native
  @JSName("onOpen")
  var onOpen_Original: reactLib.reactMod.ReactNs.ReactEventHandler[js.Object] = js.native
  var open: scala.Boolean = js.native
  var swipeAreaWidth: js.UndefOr[scala.Double] = js.native
  def onClose(event: reactLib.reactMod.ReactNs.SyntheticEvent[js.Object, reactLib.Event]): scala.Unit = js.native
  def onOpen(event: reactLib.reactMod.ReactNs.SyntheticEvent[js.Object, reactLib.Event]): scala.Unit = js.native
}

