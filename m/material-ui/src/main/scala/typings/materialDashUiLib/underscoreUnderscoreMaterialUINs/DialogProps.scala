package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(reactLib.reactMod.ReactNs.Props because Would inherit conflicting mutable fields List(children))*/

trait DialogProps
  extends reactLib.reactMod.ReactNs.DOMAttributes[js.Object] {
  /** @deprecated use a custom `actions` property instead */
  var actionFocus: js.UndefOr[java.lang.String] = js.undefined
  var actions: js.UndefOr[js.Array[DialogAction | reactLib.reactMod.ReactNs.ReactElement[_]]] = js.undefined
  var actionsContainerClassName: js.UndefOr[java.lang.String] = js.undefined
  var actionsContainerStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var autoDetectWindowHeight: js.UndefOr[scala.Boolean] = js.undefined
  var autoScrollBodyContent: js.UndefOr[scala.Boolean] = js.undefined
  var bodyClassName: js.UndefOr[java.lang.String] = js.undefined
  var bodyStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var contentClassName: js.UndefOr[java.lang.String] = js.undefined
  var contentStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var modal: js.UndefOr[scala.Boolean] = js.undefined
  var onRequestClose: js.UndefOr[js.Function1[/* buttonClicked */ scala.Boolean, scala.Unit]] = js.undefined
  var open: scala.Boolean
  var overlayClassName: js.UndefOr[java.lang.String] = js.undefined
  var overlayStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var paperClassName: js.UndefOr[java.lang.String] = js.undefined
  var paperProps: js.UndefOr[js.Any] = js.undefined
  var repositionOnUpdate: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var title: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var titleClassName: js.UndefOr[java.lang.String] = js.undefined
  var titleStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

