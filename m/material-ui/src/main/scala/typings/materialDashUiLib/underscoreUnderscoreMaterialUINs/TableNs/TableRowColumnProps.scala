package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs.TableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableRowColumnProps extends js.Object {
  // <td/> is element that get the 'other' properties
  var className: js.UndefOr[java.lang.String] = js.undefined
  // useful attributes passed to <td/>
  var colSpan: js.UndefOr[scala.Double] = js.undefined
  var columnNumber: js.UndefOr[scala.Double] = js.undefined
  var hoverable: js.UndefOr[scala.Boolean] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** @deprecated Instead, use event handler on Table */
  var onClick: js.UndefOr[
    js.Function2[
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[js.Object, reactLib.NativeMouseEvent], 
      /* column */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  /** @deprecated Instead, use event handler on Table */
  var onHover: js.UndefOr[
    js.Function2[
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[js.Object, reactLib.NativeMouseEvent], 
      /* column */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  /** @deprecated Instead, use event handler on Table */
  var onHoverExit: js.UndefOr[
    js.Function2[
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[js.Object, reactLib.NativeMouseEvent], 
      /* column */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  var rowSpan: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

