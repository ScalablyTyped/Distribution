package typings.layuiSrc.anon

import org.scalablytyped.runtime.StringDictionary
import typings.layuiSrc.Layui.DateParam
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
import typings.std.HTMLElement
import typings.std.Required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<layui-src.Layui.DateOption> */
trait RequiredDateOption extends StObject {
  
  var btns: js.Array[clear | now | confirm]
  
  var calendar: Boolean
  
  def change(value: String, date: DateParam, endDate: DateParam): Unit
  @JSName("change")
  var change_Original: js.ThisFunction3[
    /* this */ Required[this.type], 
    /* value */ String, 
    /* date */ DateParam, 
    /* endDate */ DateParam, 
    Unit
  ]
  
  var closeStop: String
  
  def done(value: String, date: DateParam, endDate: DateParam): Unit
  @JSName("done")
  var done_Original: js.Function3[/* value */ String, /* date */ DateParam, /* endDate */ DateParam, Unit]
  
  var elem: String | HTMLElement | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JQuery */ Any)
  
  var eventElem: String | HTMLElement | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JQuery */ Any)
  
  var format: String
  
  var isInitValue: Boolean
  
  var isPreview: Boolean
  
  var lang: cn | en
  
  var mark: StringDictionary[String]
  
  var max: String | Double
  
  var min: String | Double
  
  var position: abolute | fixed | static
  
  var range: String | Boolean | js.Array[Any]
  
  def ready(dateParam: DateParam): Unit
  @JSName("ready")
  var ready_Original: js.Function1[/* dateParam */ DateParam, Unit]
  
  var show: Boolean
  
  var showBottom: Boolean
  
  var theme: String | default | molv | grid
  
  var trigger: String
  
  var `type`: year | month | date | time | datetime
  
  var value: String | js.Date | Double
  
  var zIndex: Double
}
object RequiredDateOption {
  
  inline def apply(
    btns: js.Array[clear | now | confirm],
    calendar: Boolean,
    change: js.ThisFunction3[
      /* this */ Required[RequiredDateOption], 
      /* value */ String, 
      /* date */ DateParam, 
      /* endDate */ DateParam, 
      Unit
    ],
    closeStop: String,
    done: (/* value */ String, /* date */ DateParam, /* endDate */ DateParam) => Unit,
    elem: String | HTMLElement | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JQuery */ Any),
    eventElem: String | HTMLElement | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JQuery */ Any),
    format: String,
    isInitValue: Boolean,
    isPreview: Boolean,
    lang: cn | en,
    mark: StringDictionary[String],
    max: String | Double,
    min: String | Double,
    position: abolute | fixed | static,
    range: String | Boolean | js.Array[Any],
    ready: /* dateParam */ DateParam => Unit,
    show: Boolean,
    showBottom: Boolean,
    theme: String | default | molv | grid,
    trigger: String,
    `type`: year | month | date | time | datetime,
    value: String | js.Date | Double,
    zIndex: Double
  ): RequiredDateOption = {
    val __obj = js.Dynamic.literal(btns = btns.asInstanceOf[js.Any], calendar = calendar.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], closeStop = closeStop.asInstanceOf[js.Any], done = js.Any.fromFunction3(done), elem = elem.asInstanceOf[js.Any], eventElem = eventElem.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], isInitValue = isInitValue.asInstanceOf[js.Any], isPreview = isPreview.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], mark = mark.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], ready = js.Any.fromFunction1(ready), show = show.asInstanceOf[js.Any], showBottom = showBottom.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredDateOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequiredDateOption] (val x: Self) extends AnyVal {
    
    inline def setBtns(value: js.Array[clear | now | confirm]): Self = StObject.set(x, "btns", value.asInstanceOf[js.Any])
    
    inline def setBtnsVarargs(value: (clear | now | confirm)*): Self = StObject.set(x, "btns", js.Array(value*))
    
    inline def setCalendar(value: Boolean): Self = StObject.set(x, "calendar", value.asInstanceOf[js.Any])
    
    inline def setChange(
      value: js.ThisFunction3[
          /* this */ Required[RequiredDateOption], 
          /* value */ String, 
          /* date */ DateParam, 
          /* endDate */ DateParam, 
          Unit
        ]
    ): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
    
    inline def setCloseStop(value: String): Self = StObject.set(x, "closeStop", value.asInstanceOf[js.Any])
    
    inline def setDone(value: (/* value */ String, /* date */ DateParam, /* endDate */ DateParam) => Unit): Self = StObject.set(x, "done", js.Any.fromFunction3(value))
    
    inline def setElem(
      value: String | HTMLElement | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JQuery */ Any)
    ): Self = StObject.set(x, "elem", value.asInstanceOf[js.Any])
    
    inline def setEventElem(
      value: String | HTMLElement | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JQuery */ Any)
    ): Self = StObject.set(x, "eventElem", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setIsInitValue(value: Boolean): Self = StObject.set(x, "isInitValue", value.asInstanceOf[js.Any])
    
    inline def setIsPreview(value: Boolean): Self = StObject.set(x, "isPreview", value.asInstanceOf[js.Any])
    
    inline def setLang(value: cn | en): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setMark(value: StringDictionary[String]): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
    
    inline def setMax(value: String | Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: String | Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: abolute | fixed | static): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setRange(value: String | Boolean | js.Array[Any]): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeVarargs(value: Any*): Self = StObject.set(x, "range", js.Array(value*))
    
    inline def setReady(value: /* dateParam */ DateParam => Unit): Self = StObject.set(x, "ready", js.Any.fromFunction1(value))
    
    inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowBottom(value: Boolean): Self = StObject.set(x, "showBottom", value.asInstanceOf[js.Any])
    
    inline def setTheme(value: String | default | molv | grid): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setTrigger(value: String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    
    inline def setType(value: year | month | date | time | datetime): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String | js.Date | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
  }
}
