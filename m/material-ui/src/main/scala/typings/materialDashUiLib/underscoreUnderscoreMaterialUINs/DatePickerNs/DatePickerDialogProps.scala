package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs.DatePickerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatePickerDialogProps extends js.Object {
  // <Container/> is the element that get the 'other' properties
  var DateTimeFormat: js.UndefOr[stdLib.Anon_LocalesOptionsSupportedLocalesOfArray] = js.undefined
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

object DatePickerDialogProps {
  @scala.inline
  def apply(
    DateTimeFormat: stdLib.Anon_LocalesOptionsSupportedLocalesOfArray = null,
    animation: reactLib.reactMod.ReactNs.ComponentClass[
      materialDashUiLib.underscoreUnderscoreMaterialUINs.PopoverNs.PopoverAnimationProps, 
      reactLib.reactMod.ReactNs.ComponentState
    ] = null,
    autoOk: js.UndefOr[scala.Boolean] = js.undefined,
    cancelLabel: reactLib.reactMod.ReactNs.ReactNode = null,
    container: materialDashUiLib.materialDashUiLibStrings.dialog | materialDashUiLib.materialDashUiLibStrings.`inline` = null,
    disableYearSelection: js.UndefOr[scala.Boolean] = js.undefined,
    firstDayOfWeek: scala.Int | scala.Double = null,
    initialDate: stdLib.Date = null,
    locale: java.lang.String = null,
    maxDate: stdLib.Date = null,
    minDate: stdLib.Date = null,
    mode: materialDashUiLib.materialDashUiLibStrings.portrait | materialDashUiLib.materialDashUiLibStrings.landscape = null,
    okLabel: reactLib.reactMod.ReactNs.ReactNode = null,
    onAccept: js.Function1[/* d */ stdLib.Date, scala.Unit] = null,
    onDismiss: js.Function0[scala.Unit] = null,
    onShow: js.Function0[scala.Unit] = null,
    shouldDisableDate: js.Function1[/* day */ stdLib.Date, scala.Boolean] = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    utils: materialDashUiLib.underscoreUnderscoreMaterialUINs.propTypesNs.utils = null
  ): DatePickerDialogProps = {
    val __obj = js.Dynamic.literal()
    if (DateTimeFormat != null) __obj.updateDynamic("DateTimeFormat")(DateTimeFormat)
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (!js.isUndefined(autoOk)) __obj.updateDynamic("autoOk")(autoOk)
    if (cancelLabel != null) __obj.updateDynamic("cancelLabel")(cancelLabel.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(disableYearSelection)) __obj.updateDynamic("disableYearSelection")(disableYearSelection)
    if (firstDayOfWeek != null) __obj.updateDynamic("firstDayOfWeek")(firstDayOfWeek.asInstanceOf[js.Any])
    if (initialDate != null) __obj.updateDynamic("initialDate")(initialDate)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate)
    if (minDate != null) __obj.updateDynamic("minDate")(minDate)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (okLabel != null) __obj.updateDynamic("okLabel")(okLabel.asInstanceOf[js.Any])
    if (onAccept != null) __obj.updateDynamic("onAccept")(onAccept)
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(onDismiss)
    if (onShow != null) __obj.updateDynamic("onShow")(onShow)
    if (shouldDisableDate != null) __obj.updateDynamic("shouldDisableDate")(shouldDisableDate)
    if (style != null) __obj.updateDynamic("style")(style)
    if (utils != null) __obj.updateDynamic("utils")(utils)
    __obj.asInstanceOf[DatePickerDialogProps]
  }
}

