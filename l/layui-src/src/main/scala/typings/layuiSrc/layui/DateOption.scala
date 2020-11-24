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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateOption extends js.Object {
  
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
  implicit class DateOptionOps[Self <: DateOption] (val x: Self) extends AnyVal {
    
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
    def setBtnsVarargs(value: (clear | now | confirm)*): Self = this.set("btns", js.Array(value :_*))
    
    @scala.inline
    def setBtns(value: js.Array[clear | now | confirm]): Self = this.set("btns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBtns: Self = this.set("btns", js.undefined)
    
    @scala.inline
    def setCalendar(value: Boolean): Self = this.set("calendar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalendar: Self = this.set("calendar", js.undefined)
    
    @scala.inline
    def setChange(value: (/* value */ String, /* date */ DateParam, /* endDate */ DateParam) => Unit): Self = this.set("change", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    
    @scala.inline
    def setDone(value: (/* value */ String, /* date */ DateParam, /* endDate */ DateParam) => Unit): Self = this.set("done", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteDone: Self = this.set("done", js.undefined)
    
    @scala.inline
    def setElem(value: String | HTMLElement): Self = this.set("elem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElem: Self = this.set("elem", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setIsInitValue(value: Boolean): Self = this.set("isInitValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsInitValue: Self = this.set("isInitValue", js.undefined)
    
    @scala.inline
    def setLang(value: cn | en): Self = this.set("lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    
    @scala.inline
    def setMark(value: js.Object): Self = this.set("mark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMark: Self = this.set("mark", js.undefined)
    
    @scala.inline
    def setMax(value: String | Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMin(value: String | Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setPosition(value: abolute | fixed | static): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setRange(value: String | Boolean): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    
    @scala.inline
    def setReady(value: /* date */ DateParam => Unit): Self = this.set("ready", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteReady: Self = this.set("ready", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    
    @scala.inline
    def setShowBottom(value: Boolean): Self = this.set("showBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowBottom: Self = this.set("showBottom", js.undefined)
    
    @scala.inline
    def setTheme(value: String | default | molv | grid): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setTrigger(value: String): Self = this.set("trigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrigger: Self = this.set("trigger", js.undefined)
    
    @scala.inline
    def setType(value: year | month | date | time | datetime): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setValue(value: String | Date): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
}
