package typings
package atMaterialDashUiCoreLib.selectSelectInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SelectInputProps extends js.Object {
  var IconComponent: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
  var MenuProps: js.UndefOr[stdLib.Partial[atMaterialDashUiCoreLib.menuMenuMod.MenuProps]] = js.undefined
  var SelectDisplayProps: js.UndefOr[reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLDivElement]] = js.undefined
  var autoFocus: js.UndefOr[scala.Boolean] = js.undefined
  var autoWidth: scala.Boolean
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var inputRef: js.UndefOr[
    js.Function1[
      /* ref */ reactLib.HTMLSelectElement | atMaterialDashUiCoreLib.Anon_NodeValue, 
      scala.Unit
    ]
  ] = js.undefined
  var multiple: scala.Boolean
  var name: js.UndefOr[java.lang.String] = js.undefined
  var native: scala.Boolean
  var onBlur: js.UndefOr[reactLib.reactMod.ReactNs.FocusEventHandler[_]] = js.undefined
  var onChange: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.ChangeEvent[reactLib.HTMLSelectElement], 
      /* child */ reactLib.reactMod.ReactNs.ReactNode, 
      scala.Unit
    ]
  ] = js.undefined
  var onClose: js.UndefOr[
    js.Function1[/* event */ reactLib.reactMod.ReactNs.ChangeEvent[js.Object], scala.Unit]
  ] = js.undefined
  var onFocus: js.UndefOr[reactLib.reactMod.ReactNs.FocusEventHandler[_]] = js.undefined
  var onOpen: js.UndefOr[
    js.Function1[/* event */ reactLib.reactMod.ReactNs.ChangeEvent[js.Object], scala.Unit]
  ] = js.undefined
  var open: js.UndefOr[scala.Boolean] = js.undefined
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  var renderValue: js.UndefOr[
    js.Function1[
      /* value */ java.lang.String | scala.Double | scala.Boolean | (js.Array[java.lang.String | scala.Double | scala.Boolean]), 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ] = js.undefined
  var tabIndex: js.UndefOr[scala.Double] = js.undefined
  var value: java.lang.String | scala.Double | scala.Boolean | (js.Array[java.lang.String | scala.Double | scala.Boolean])
  var variant: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.standard | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.outlined | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.filled
  ] = js.undefined
}

