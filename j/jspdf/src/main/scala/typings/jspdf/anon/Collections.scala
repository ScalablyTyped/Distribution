package typings.jspdf.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Collections extends js.Object {
  
  var collections: js.Any = js.native
  
  var events: js.Any = js.native
  
  def f2(number: Double): Double = js.native
  
  def getCoordinateString(value: Double): Double = js.native
  
  def getCurrentPageInfo(): js.Any = js.native
  
  def getFont(): js.Any = js.native
  
  def getFontSize(): Double = js.native
  
  def getLineHeight(): Double = js.native
  
  def getNumberOfPages(): Double = js.native
  
  def getPageInfo(pageNumberOneBased: Double): js.Any = js.native
  
  def getStyle(style: String): js.Any = js.native
  
  def getVerticalCoordinateString(value: Double): Double = js.native
  
  def newAdditionalObject(): js.Any = js.native
  
  def newObject(): Double = js.native
  
  def newObjectDeferred(): Double = js.native
  
  def newObjectDeferredBegin(oid: Double): Unit = js.native
  
  def out(string: String): Unit = js.native
  
  def output(`type`: js.Any, options: js.Any): js.Any = js.native
  
  var pageSize: GetHeight = js.native
  
  var pages: js.Array[Double] = js.native
  
  def pdfEscape(text: String, flags: js.Any): js.Any = js.native
  
  def putStream(str: String): Unit = js.native
  
  var scaleFactor: Double = js.native
  
  def write(string1: String): js.Any = js.native
}
object Collections {
  
  @scala.inline
  def apply(
    collections: js.Any,
    events: js.Any,
    f2: Double => Double,
    getCoordinateString: Double => Double,
    getCurrentPageInfo: () => js.Any,
    getFont: () => js.Any,
    getFontSize: () => Double,
    getLineHeight: () => Double,
    getNumberOfPages: () => Double,
    getPageInfo: Double => js.Any,
    getStyle: String => js.Any,
    getVerticalCoordinateString: Double => Double,
    newAdditionalObject: () => js.Any,
    newObject: () => Double,
    newObjectDeferred: () => Double,
    newObjectDeferredBegin: Double => Unit,
    out: String => Unit,
    output: (js.Any, js.Any) => js.Any,
    pageSize: GetHeight,
    pages: js.Array[Double],
    pdfEscape: (String, js.Any) => js.Any,
    putStream: String => Unit,
    scaleFactor: Double,
    write: String => js.Any
  ): Collections = {
    val __obj = js.Dynamic.literal(collections = collections.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], f2 = js.Any.fromFunction1(f2), getCoordinateString = js.Any.fromFunction1(getCoordinateString), getCurrentPageInfo = js.Any.fromFunction0(getCurrentPageInfo), getFont = js.Any.fromFunction0(getFont), getFontSize = js.Any.fromFunction0(getFontSize), getLineHeight = js.Any.fromFunction0(getLineHeight), getNumberOfPages = js.Any.fromFunction0(getNumberOfPages), getPageInfo = js.Any.fromFunction1(getPageInfo), getStyle = js.Any.fromFunction1(getStyle), getVerticalCoordinateString = js.Any.fromFunction1(getVerticalCoordinateString), newAdditionalObject = js.Any.fromFunction0(newAdditionalObject), newObject = js.Any.fromFunction0(newObject), newObjectDeferred = js.Any.fromFunction0(newObjectDeferred), newObjectDeferredBegin = js.Any.fromFunction1(newObjectDeferredBegin), out = js.Any.fromFunction1(out), output = js.Any.fromFunction2(output), pageSize = pageSize.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], pdfEscape = js.Any.fromFunction2(pdfEscape), putStream = js.Any.fromFunction1(putStream), scaleFactor = scaleFactor.asInstanceOf[js.Any], write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[Collections]
  }
  
  @scala.inline
  implicit class CollectionsOps[Self <: Collections] (val x: Self) extends AnyVal {
    
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
    def setCollections(value: js.Any): Self = this.set("collections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvents(value: js.Any): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setF2(value: Double => Double): Self = this.set("f2", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCoordinateString(value: Double => Double): Self = this.set("getCoordinateString", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCurrentPageInfo(value: () => js.Any): Self = this.set("getCurrentPageInfo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFont(value: () => js.Any): Self = this.set("getFont", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFontSize(value: () => Double): Self = this.set("getFontSize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLineHeight(value: () => Double): Self = this.set("getLineHeight", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNumberOfPages(value: () => Double): Self = this.set("getNumberOfPages", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPageInfo(value: Double => js.Any): Self = this.set("getPageInfo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetStyle(value: String => js.Any): Self = this.set("getStyle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetVerticalCoordinateString(value: Double => Double): Self = this.set("getVerticalCoordinateString", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNewAdditionalObject(value: () => js.Any): Self = this.set("newAdditionalObject", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewObject(value: () => Double): Self = this.set("newObject", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewObjectDeferred(value: () => Double): Self = this.set("newObjectDeferred", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewObjectDeferredBegin(value: Double => Unit): Self = this.set("newObjectDeferredBegin", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOut(value: String => Unit): Self = this.set("out", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOutput(value: (js.Any, js.Any) => js.Any): Self = this.set("output", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPageSize(value: GetHeight): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagesVarargs(value: Double*): Self = this.set("pages", js.Array(value :_*))
    
    @scala.inline
    def setPages(value: js.Array[Double]): Self = this.set("pages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPdfEscape(value: (String, js.Any) => js.Any): Self = this.set("pdfEscape", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPutStream(value: String => Unit): Self = this.set("putStream", js.Any.fromFunction1(value))
    
    @scala.inline
    def setScaleFactor(value: Double): Self = this.set("scaleFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrite(value: String => js.Any): Self = this.set("write", js.Any.fromFunction1(value))
  }
}
