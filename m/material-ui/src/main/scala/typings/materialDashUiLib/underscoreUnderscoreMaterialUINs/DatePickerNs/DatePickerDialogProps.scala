package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs.DatePickerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatePickerDialogProps extends js.Object {
  // <Container/> is the element that get the 'other' properties
  var DateTimeFormat: js.UndefOr[stdLib.Anon_LocalesOptions] = js.undefined
  var animation: js.UndefOr[
    reactLib.reactMod.ReactNs.ComponentClass[
      materialDashUiLib.underscoreUnderscoreMaterialUINs.PopoverNs.PopoverAnimationProps, 
      reactLib.reactMod.ReactNs.ComponentState
    ]
  ] = js.undefined
  var autoOk: js.UndefOr[scala.Boolean] = js.undefined
  var cancelLabel: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var container: js.UndefOr[
    materialDashUiLib.materialDashUiLibStrings.dialog | materialDashUiLib.materialDashUiLibStrings.`inline`
  ] = js.undefined
  var disableYearSelection: js.UndefOr[scala.Boolean] = js.undefined
  var firstDayOfWeek: js.UndefOr[scala.Double] = js.undefined
  var initialDate: js.UndefOr[stdLib.Date] = js.undefined
  var locale: js.UndefOr[java.lang.String] = js.undefined
  var maxDate: js.UndefOr[stdLib.Date] = js.undefined
  var minDate: js.UndefOr[stdLib.Date] = js.undefined
  var mode: js.UndefOr[
    materialDashUiLib.materialDashUiLibStrings.portrait | materialDashUiLib.materialDashUiLibStrings.landscape
  ] = js.undefined
  var okLabel: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var onAccept: js.UndefOr[js.Function1[/* d */ stdLib.Date, scala.Unit]] = js.undefined
  var onDismiss: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onShow: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var shouldDisableDate: js.UndefOr[js.Function1[/* day */ stdLib.Date, scala.Boolean]] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var utils: js.UndefOr[materialDashUiLib.underscoreUnderscoreMaterialUINs.propTypesNs.utils] = js.undefined
}

