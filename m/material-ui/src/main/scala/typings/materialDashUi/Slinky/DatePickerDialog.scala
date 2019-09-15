package typings.materialDashUi.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typings.materialDashUi.Anon_Locales
import typings.materialDashUi.datePickerDatePickerDialogMod.default
import typings.materialDashUi.materialDashUiStrings.`inline`
import typings.materialDashUi.materialDashUiStrings.dialog
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.DatePickerNs.DatePickerDialogProps
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.PopoverNs.PopoverAnimationProps
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.propTypesNs.utils
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: style, mode */
object DatePickerDialog
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.materialDashUi.datePickerDatePickerDialogMod.default].asInstanceOf[String | js.Object]
  def apply(
    DateTimeFormat: Anon_Locales = null,
    animation: ReactComponentClass[PopoverAnimationProps] = null,
    autoOk: js.UndefOr[Boolean] = js.undefined,
    cancelLabel: TagMod[Any] = null,
    container: dialog | `inline` = null,
    disableYearSelection: js.UndefOr[Boolean] = js.undefined,
    firstDayOfWeek: Int | Double = null,
    initialDate: Date = null,
    locale: String = null,
    maxDate: Date = null,
    minDate: Date = null,
    okLabel: TagMod[Any] = null,
    onAccept: /* d */ Date => Unit = null,
    onDismiss: () => Unit = null,
    onShow: () => Unit = null,
    shouldDisableDate: /* day */ Date => Boolean = null,
    utils: utils = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (DateTimeFormat != null) __obj.updateDynamic("DateTimeFormat")(DateTimeFormat)
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (!js.isUndefined(autoOk)) __obj.updateDynamic("autoOk")(autoOk)
    if (cancelLabel != null) __obj.updateDynamic("cancelLabel")(cancelLabel)
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(disableYearSelection)) __obj.updateDynamic("disableYearSelection")(disableYearSelection)
    if (firstDayOfWeek != null) __obj.updateDynamic("firstDayOfWeek")(firstDayOfWeek.asInstanceOf[js.Any])
    if (initialDate != null) __obj.updateDynamic("initialDate")(initialDate)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate)
    if (minDate != null) __obj.updateDynamic("minDate")(minDate)
    if (okLabel != null) __obj.updateDynamic("okLabel")(okLabel)
    if (onAccept != null) __obj.updateDynamic("onAccept")(js.Any.fromFunction1(onAccept))
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction0(onDismiss))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction0(onShow))
    if (shouldDisableDate != null) __obj.updateDynamic("shouldDisableDate")(js.Any.fromFunction1(shouldDisableDate))
    if (utils != null) __obj.updateDynamic("utils")(utils)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = DatePickerDialogProps
}

