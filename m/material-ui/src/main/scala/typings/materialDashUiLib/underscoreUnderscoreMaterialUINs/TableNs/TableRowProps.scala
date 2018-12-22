package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs.TableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TableRowProps extends js.Object {
  // <tr/> is element that get the 'other' properties
  var className: js.UndefOr[java.lang.String] = js.undefined
  var displayBorder: js.UndefOr[scala.Boolean] = js.undefined
  var hoverable: js.UndefOr[scala.Boolean] = js.undefined
  var hovered: js.UndefOr[scala.Boolean] = js.undefined
  /** @deprecated Instead, use event handler on Table */
  var onCellClick: js.UndefOr[
    js.Function3[
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[js.Object, reactLib.NativeMouseEvent], 
      /* row */ scala.Double, 
      /* column */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  /** @deprecated Instead, use event handler on Table */
  var onCellHover: js.UndefOr[
    js.Function3[
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[js.Object, reactLib.NativeMouseEvent], 
      /* row */ scala.Double, 
      /* column */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  /** @deprecated Instead, use event handler on Table */
  var onCellHoverExit: js.UndefOr[
    js.Function3[
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[js.Object, reactLib.NativeMouseEvent], 
      /* row */ scala.Double, 
      /* column */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  /** @deprecated Instead, use event handler on Table */
  var onRowClick: js.UndefOr[
    js.Function2[
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[js.Object, reactLib.NativeMouseEvent], 
      /* row */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  /** @deprecated Instead, use event handler on Table */
  var onRowHover: js.UndefOr[
    js.Function2[
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[js.Object, reactLib.NativeMouseEvent], 
      /* row */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  /** @deprecated Instead, use event handler on Table */
  var onRowHoverExit: js.UndefOr[
    js.Function2[
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[js.Object, reactLib.NativeMouseEvent], 
      /* row */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  var rowNumber: js.UndefOr[scala.Double] = js.undefined
  var selectable: js.UndefOr[scala.Boolean] = js.undefined
  var selected: js.UndefOr[scala.Boolean] = js.undefined
  var striped: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

