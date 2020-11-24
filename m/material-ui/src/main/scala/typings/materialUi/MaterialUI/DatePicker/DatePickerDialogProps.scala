package typings.materialUi.MaterialUI.DatePicker

import typings.materialUi.MaterialUI.Popover.PopoverAnimationProps
import typings.materialUi.MaterialUI.propTypes.utils
import typings.materialUi.anon.Call
import typings.materialUi.materialUiStrings.`inline`
import typings.materialUi.materialUiStrings.dialog
import typings.materialUi.materialUiStrings.landscape
import typings.materialUi.materialUiStrings.portrait
import typings.react.mod.CSSProperties
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactNode
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatePickerDialogProps extends js.Object {
  
  // <Container/> is the element that get the 'other' properties
  var DateTimeFormat: js.UndefOr[Call] = js.native
  
  var animation: js.UndefOr[ComponentClass[PopoverAnimationProps, ComponentState]] = js.native
  
  var autoOk: js.UndefOr[Boolean] = js.native
  
  var cancelLabel: js.UndefOr[ReactNode] = js.native
  
  var container: js.UndefOr[dialog | `inline`] = js.native
  
  var disableYearSelection: js.UndefOr[Boolean] = js.native
  
  var firstDayOfWeek: js.UndefOr[Double] = js.native
  
  var initialDate: js.UndefOr[Date] = js.native
  
  var locale: js.UndefOr[String] = js.native
  
  var maxDate: js.UndefOr[Date] = js.native
  
  var minDate: js.UndefOr[Date] = js.native
  
  var mode: js.UndefOr[portrait | landscape] = js.native
  
  var okLabel: js.UndefOr[ReactNode] = js.native
  
  var onAccept: js.UndefOr[js.Function1[/* d */ Date, Unit]] = js.native
  
  var onDismiss: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onShow: js.UndefOr[js.Function0[Unit]] = js.native
  
  var shouldDisableDate: js.UndefOr[js.Function1[/* day */ Date, Boolean]] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var utils: js.UndefOr[typings.materialUi.MaterialUI.propTypes.utils] = js.native
}
object DatePickerDialogProps {
  
  @scala.inline
  def apply(): DatePickerDialogProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatePickerDialogProps]
  }
  
  @scala.inline
  implicit class DatePickerDialogPropsOps[Self <: DatePickerDialogProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDateTimeFormat(value: Call): Self = this.set("DateTimeFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateTimeFormat: Self = this.set("DateTimeFormat", js.undefined)
    
    @scala.inline
    def setAnimation(value: ComponentClass[PopoverAnimationProps, ComponentState]): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    
    @scala.inline
    def setAutoOk(value: Boolean): Self = this.set("autoOk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoOk: Self = this.set("autoOk", js.undefined)
    
    @scala.inline
    def setCancelLabel(value: ReactNode): Self = this.set("cancelLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelLabel: Self = this.set("cancelLabel", js.undefined)
    
    @scala.inline
    def setContainer(value: dialog | `inline`): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setDisableYearSelection(value: Boolean): Self = this.set("disableYearSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableYearSelection: Self = this.set("disableYearSelection", js.undefined)
    
    @scala.inline
    def setFirstDayOfWeek(value: Double): Self = this.set("firstDayOfWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstDayOfWeek: Self = this.set("firstDayOfWeek", js.undefined)
    
    @scala.inline
    def setInitialDate(value: Date): Self = this.set("initialDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialDate: Self = this.set("initialDate", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setMaxDate(value: Date): Self = this.set("maxDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDate: Self = this.set("maxDate", js.undefined)
    
    @scala.inline
    def setMinDate(value: Date): Self = this.set("minDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinDate: Self = this.set("minDate", js.undefined)
    
    @scala.inline
    def setMode(value: portrait | landscape): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setOkLabel(value: ReactNode): Self = this.set("okLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOkLabel: Self = this.set("okLabel", js.undefined)
    
    @scala.inline
    def setOnAccept(value: /* d */ Date => Unit): Self = this.set("onAccept", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnAccept: Self = this.set("onAccept", js.undefined)
    
    @scala.inline
    def setOnDismiss(value: () => Unit): Self = this.set("onDismiss", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnDismiss: Self = this.set("onDismiss", js.undefined)
    
    @scala.inline
    def setOnShow(value: () => Unit): Self = this.set("onShow", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnShow: Self = this.set("onShow", js.undefined)
    
    @scala.inline
    def setShouldDisableDate(value: /* day */ Date => Boolean): Self = this.set("shouldDisableDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteShouldDisableDate: Self = this.set("shouldDisableDate", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setUtils(value: utils): Self = this.set("utils", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUtils: Self = this.set("utils", js.undefined)
  }
}
