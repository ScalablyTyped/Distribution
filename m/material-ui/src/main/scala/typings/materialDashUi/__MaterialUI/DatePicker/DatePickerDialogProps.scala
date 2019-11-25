package typings.materialDashUi.__MaterialUI.DatePicker

import typings.materialDashUi.Anon_Locales
import typings.materialDashUi.__MaterialUI.Popover.PopoverAnimationProps
import typings.materialDashUi.__MaterialUI.propTypes.utils
import typings.materialDashUi.materialDashUiStrings.`inline`
import typings.materialDashUi.materialDashUiStrings.dialog
import typings.materialDashUi.materialDashUiStrings.landscape
import typings.materialDashUi.materialDashUiStrings.portrait
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ReactNode
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatePickerDialogProps extends js.Object {
  // <Container/> is the element that get the 'other' properties
  var DateTimeFormat: js.UndefOr[Anon_Locales] = js.undefined
  var animation: js.UndefOr[ComponentClass[PopoverAnimationProps, ComponentState]] = js.undefined
  var autoOk: js.UndefOr[Boolean] = js.undefined
  var cancelLabel: js.UndefOr[ReactNode] = js.undefined
  var container: js.UndefOr[dialog | `inline`] = js.undefined
  var disableYearSelection: js.UndefOr[Boolean] = js.undefined
  var firstDayOfWeek: js.UndefOr[Double] = js.undefined
  var initialDate: js.UndefOr[Date] = js.undefined
  var locale: js.UndefOr[String] = js.undefined
  var maxDate: js.UndefOr[Date] = js.undefined
  var minDate: js.UndefOr[Date] = js.undefined
  var mode: js.UndefOr[portrait | landscape] = js.undefined
  var okLabel: js.UndefOr[ReactNode] = js.undefined
  var onAccept: js.UndefOr[js.Function1[/* d */ Date, Unit]] = js.undefined
  var onDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
  var shouldDisableDate: js.UndefOr[js.Function1[/* day */ Date, Boolean]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var utils: js.UndefOr[typings.materialDashUi.__MaterialUI.propTypes.utils] = js.undefined
}

object DatePickerDialogProps {
  @scala.inline
  def apply(
    DateTimeFormat: Anon_Locales = null,
    animation: ComponentClass[PopoverAnimationProps, ComponentState] = null,
    autoOk: js.UndefOr[Boolean] = js.undefined,
    cancelLabel: ReactNode = null,
    container: dialog | `inline` = null,
    disableYearSelection: js.UndefOr[Boolean] = js.undefined,
    firstDayOfWeek: Int | Double = null,
    initialDate: Date = null,
    locale: String = null,
    maxDate: Date = null,
    minDate: Date = null,
    mode: portrait | landscape = null,
    okLabel: ReactNode = null,
    onAccept: /* d */ Date => Unit = null,
    onDismiss: () => Unit = null,
    onShow: () => Unit = null,
    shouldDisableDate: /* day */ Date => Boolean = null,
    style: CSSProperties = null,
    utils: utils = null
  ): DatePickerDialogProps = {
    val __obj = js.Dynamic.literal()
    if (DateTimeFormat != null) __obj.updateDynamic("DateTimeFormat")(DateTimeFormat.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (!js.isUndefined(autoOk)) __obj.updateDynamic("autoOk")(autoOk.asInstanceOf[js.Any])
    if (cancelLabel != null) __obj.updateDynamic("cancelLabel")(cancelLabel.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(disableYearSelection)) __obj.updateDynamic("disableYearSelection")(disableYearSelection.asInstanceOf[js.Any])
    if (firstDayOfWeek != null) __obj.updateDynamic("firstDayOfWeek")(firstDayOfWeek.asInstanceOf[js.Any])
    if (initialDate != null) __obj.updateDynamic("initialDate")(initialDate.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (okLabel != null) __obj.updateDynamic("okLabel")(okLabel.asInstanceOf[js.Any])
    if (onAccept != null) __obj.updateDynamic("onAccept")(js.Any.fromFunction1(onAccept))
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction0(onDismiss))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction0(onShow))
    if (shouldDisableDate != null) __obj.updateDynamic("shouldDisableDate")(js.Any.fromFunction1(shouldDisableDate))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (utils != null) __obj.updateDynamic("utils")(utils.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatePickerDialogProps]
  }
}

