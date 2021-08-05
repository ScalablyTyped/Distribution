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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateOption extends StObject {
  
  var btns: js.UndefOr[js.Array[clear | now | confirm]] = js.undefined
  
  var calendar: js.UndefOr[Boolean] = js.undefined
  
  var change: js.UndefOr[
    js.Function3[/* value */ String, /* date */ DateParam, /* endDate */ DateParam, Unit]
  ] = js.undefined
  
  var done: js.UndefOr[
    js.Function3[/* value */ String, /* date */ DateParam, /* endDate */ DateParam, Unit]
  ] = js.undefined
  
  var elem: js.UndefOr[String | HTMLElement] = js.undefined
  
  var format: js.UndefOr[String] = js.undefined
  
  var isInitValue: js.UndefOr[Boolean] = js.undefined
  
  var lang: js.UndefOr[cn | en] = js.undefined
  
  var mark: js.UndefOr[js.Object] = js.undefined
  
  var max: js.UndefOr[String | Double] = js.undefined
  
  var min: js.UndefOr[String | Double] = js.undefined
  
  var position: js.UndefOr[abolute | fixed | static] = js.undefined
  
  var range: js.UndefOr[String | Boolean] = js.undefined
  
  var ready: js.UndefOr[js.Function1[/* date */ DateParam, Unit]] = js.undefined
  
  var show: js.UndefOr[Boolean] = js.undefined
  
  var showBottom: js.UndefOr[Boolean] = js.undefined
  
  var theme: js.UndefOr[String | default | molv | grid] = js.undefined
  
  var trigger: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[year | month | date | time | datetime] = js.undefined
  
  var value: js.UndefOr[String | Date] = js.undefined
  
  var zIndex: js.UndefOr[Double] = js.undefined
}
object DateOption {
  
  inline def apply(): DateOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateOption]
  }
  
  extension [Self <: DateOption](x: Self) {
    
    inline def setBtns(value: js.Array[clear | now | confirm]): Self = StObject.set(x, "btns", value.asInstanceOf[js.Any])
    
    inline def setBtnsUndefined: Self = StObject.set(x, "btns", js.undefined)
    
    inline def setBtnsVarargs(value: (clear | now | confirm)*): Self = StObject.set(x, "btns", js.Array(value :_*))
    
    inline def setCalendar(value: Boolean): Self = StObject.set(x, "calendar", value.asInstanceOf[js.Any])
    
    inline def setCalendarUndefined: Self = StObject.set(x, "calendar", js.undefined)
    
    inline def setChange(value: (/* value */ String, /* date */ DateParam, /* endDate */ DateParam) => Unit): Self = StObject.set(x, "change", js.Any.fromFunction3(value))
    
    inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    inline def setDone(value: (/* value */ String, /* date */ DateParam, /* endDate */ DateParam) => Unit): Self = StObject.set(x, "done", js.Any.fromFunction3(value))
    
    inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
    
    inline def setElem(value: String | HTMLElement): Self = StObject.set(x, "elem", value.asInstanceOf[js.Any])
    
    inline def setElemUndefined: Self = StObject.set(x, "elem", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setIsInitValue(value: Boolean): Self = StObject.set(x, "isInitValue", value.asInstanceOf[js.Any])
    
    inline def setIsInitValueUndefined: Self = StObject.set(x, "isInitValue", js.undefined)
    
    inline def setLang(value: cn | en): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    inline def setMark(value: js.Object): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
    
    inline def setMarkUndefined: Self = StObject.set(x, "mark", js.undefined)
    
    inline def setMax(value: String | Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: String | Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setPosition(value: abolute | fixed | static): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setRange(value: String | Boolean): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setReady(value: /* date */ DateParam => Unit): Self = StObject.set(x, "ready", js.Any.fromFunction1(value))
    
    inline def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
    
    inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowBottom(value: Boolean): Self = StObject.set(x, "showBottom", value.asInstanceOf[js.Any])
    
    inline def setShowBottomUndefined: Self = StObject.set(x, "showBottom", js.undefined)
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    inline def setTheme(value: String | default | molv | grid): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setTrigger(value: String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    
    inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
    
    inline def setType(value: year | month | date | time | datetime): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: String | Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
