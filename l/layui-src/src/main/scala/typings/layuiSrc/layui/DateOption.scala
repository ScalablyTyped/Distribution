package typings.layuiSrc.layui

import typings.layuiSrc.layuiSrcStrings.abolute
import typings.layuiSrc.layuiSrcStrings.clear
import typings.layuiSrc.layuiSrcStrings.cn
import typings.layuiSrc.layuiSrcStrings.confirm
import typings.layuiSrc.layuiSrcStrings.date
import typings.layuiSrc.layuiSrcStrings.datetime
import typings.layuiSrc.layuiSrcStrings.default
import typings.layuiSrc.layuiSrcStrings.en
import typings.layuiSrc.layuiSrcStrings.fixed
import typings.layuiSrc.layuiSrcStrings.grid
import typings.layuiSrc.layuiSrcStrings.molv
import typings.layuiSrc.layuiSrcStrings.month
import typings.layuiSrc.layuiSrcStrings.now
import typings.layuiSrc.layuiSrcStrings.static
import typings.layuiSrc.layuiSrcStrings.time
import typings.layuiSrc.layuiSrcStrings.year
import typings.std.Date
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateOption extends StObject {
  
  var btns: js.UndefOr[js.Array[clear | now | confirm]] = js.native
  
  var calendar: js.UndefOr[Boolean] = js.native
  
  var change: js.UndefOr[
    js.Function3[/* value */ String, /* date */ DateParam, /* endDate */ DateParam, Unit]
  ] = js.native
  
  var done: js.UndefOr[
    js.Function3[/* value */ String, /* date */ DateParam, /* endDate */ DateParam, Unit]
  ] = js.native
  
  var elem: js.UndefOr[String | HTMLElement] = js.native
  
  var format: js.UndefOr[String] = js.native
  
  var isInitValue: js.UndefOr[Boolean] = js.native
  
  var lang: js.UndefOr[cn | en] = js.native
  
  var mark: js.UndefOr[js.Object] = js.native
  
  var max: js.UndefOr[String | Double] = js.native
  
  var min: js.UndefOr[String | Double] = js.native
  
  var position: js.UndefOr[abolute | fixed | static] = js.native
  
  var range: js.UndefOr[String | Boolean] = js.native
  
  var ready: js.UndefOr[js.Function1[/* date */ DateParam, Unit]] = js.native
  
  var show: js.UndefOr[Boolean] = js.native
  
  var showBottom: js.UndefOr[Boolean] = js.native
  
  var theme: js.UndefOr[String | default | molv | grid] = js.native
  
  var trigger: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[year | month | date | time | datetime] = js.native
  
  var value: js.UndefOr[String | Date] = js.native
  
  var zIndex: js.UndefOr[Double] = js.native
}
object DateOption {
  
  @scala.inline
  def apply(): DateOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateOption]
  }
  
  @scala.inline
  implicit class DateOptionMutableBuilder[Self <: DateOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBtns(value: js.Array[clear | now | confirm]): Self = StObject.set(x, "btns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBtnsUndefined: Self = StObject.set(x, "btns", js.undefined)
    
    @scala.inline
    def setBtnsVarargs(value: (clear | now | confirm)*): Self = StObject.set(x, "btns", js.Array(value :_*))
    
    @scala.inline
    def setCalendar(value: Boolean): Self = StObject.set(x, "calendar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalendarUndefined: Self = StObject.set(x, "calendar", js.undefined)
    
    @scala.inline
    def setChange(value: (/* value */ String, /* date */ DateParam, /* endDate */ DateParam) => Unit): Self = StObject.set(x, "change", js.Any.fromFunction3(value))
    
    @scala.inline
    def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    @scala.inline
    def setDone(value: (/* value */ String, /* date */ DateParam, /* endDate */ DateParam) => Unit): Self = StObject.set(x, "done", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
    
    @scala.inline
    def setElem(value: String | HTMLElement): Self = StObject.set(x, "elem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElemUndefined: Self = StObject.set(x, "elem", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setIsInitValue(value: Boolean): Self = StObject.set(x, "isInitValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsInitValueUndefined: Self = StObject.set(x, "isInitValue", js.undefined)
    
    @scala.inline
    def setLang(value: cn | en): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    @scala.inline
    def setMark(value: js.Object): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkUndefined: Self = StObject.set(x, "mark", js.undefined)
    
    @scala.inline
    def setMax(value: String | Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: String | Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setPosition(value: abolute | fixed | static): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setRange(value: String | Boolean): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    @scala.inline
    def setReady(value: /* date */ DateParam => Unit): Self = StObject.set(x, "ready", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowBottom(value: Boolean): Self = StObject.set(x, "showBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowBottomUndefined: Self = StObject.set(x, "showBottom", js.undefined)
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    @scala.inline
    def setTheme(value: String | default | molv | grid): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    @scala.inline
    def setTrigger(value: String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
    
    @scala.inline
    def setType(value: year | month | date | time | datetime): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValue(value: String | Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
