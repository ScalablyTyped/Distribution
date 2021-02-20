package typings.jspdf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Align extends StObject {
    
    var align: js.UndefOr[String] = js.native
    
    var name: String = js.native
    
    var padding: js.UndefOr[Double] = js.native
    
    var prompt: js.UndefOr[String] = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object Align {
    
    @scala.inline
    def apply(name: String): Align = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Align]
    }
    
    @scala.inline
    implicit class AlignMutableBuilder[Self <: Align] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait Arc extends StObject {
    
    def arc(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double, anticlockwise: js.Any): Unit = js.native
    
    def beginPath(): Unit = js.native
    
    def bezierCurveTo(x1: Double, y1: Double, x2: Double, y2: Double, x: Double, y: Double): Unit = js.native
    
    def clearRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
    
    def closePath(): Unit = js.native
    
    def drawImage(img: String, x: Double, y: Double, w: Double, h: Double): Unit = js.native
    def drawImage(
      img: String,
      x: Double,
      y: Double,
      w: Double,
      h: Double,
      x2: js.UndefOr[scala.Nothing],
      y2: js.UndefOr[scala.Nothing],
      w2: js.UndefOr[scala.Nothing],
      h2: Double
    ): Unit = js.native
    def drawImage(
      img: String,
      x: Double,
      y: Double,
      w: Double,
      h: Double,
      x2: js.UndefOr[scala.Nothing],
      y2: js.UndefOr[scala.Nothing],
      w2: Double
    ): Unit = js.native
    def drawImage(
      img: String,
      x: Double,
      y: Double,
      w: Double,
      h: Double,
      x2: js.UndefOr[scala.Nothing],
      y2: js.UndefOr[scala.Nothing],
      w2: Double,
      h2: Double
    ): Unit = js.native
    def drawImage(img: String, x: Double, y: Double, w: Double, h: Double, x2: js.UndefOr[scala.Nothing], y2: Double): Unit = js.native
    def drawImage(
      img: String,
      x: Double,
      y: Double,
      w: Double,
      h: Double,
      x2: js.UndefOr[scala.Nothing],
      y2: Double,
      w2: js.UndefOr[scala.Nothing],
      h2: Double
    ): Unit = js.native
    def drawImage(
      img: String,
      x: Double,
      y: Double,
      w: Double,
      h: Double,
      x2: js.UndefOr[scala.Nothing],
      y2: Double,
      w2: Double
    ): Unit = js.native
    def drawImage(
      img: String,
      x: Double,
      y: Double,
      w: Double,
      h: Double,
      x2: js.UndefOr[scala.Nothing],
      y2: Double,
      w2: Double,
      h2: Double
    ): Unit = js.native
    def drawImage(img: String, x: Double, y: Double, w: Double, h: Double, x2: Double): Unit = js.native
    def drawImage(
      img: String,
      x: Double,
      y: Double,
      w: Double,
      h: Double,
      x2: Double,
      y2: js.UndefOr[scala.Nothing],
      w2: js.UndefOr[scala.Nothing],
      h2: Double
    ): Unit = js.native
    def drawImage(
      img: String,
      x: Double,
      y: Double,
      w: Double,
      h: Double,
      x2: Double,
      y2: js.UndefOr[scala.Nothing],
      w2: Double
    ): Unit = js.native
    def drawImage(
      img: String,
      x: Double,
      y: Double,
      w: Double,
      h: Double,
      x2: Double,
      y2: js.UndefOr[scala.Nothing],
      w2: Double,
      h2: Double
    ): Unit = js.native
    def drawImage(img: String, x: Double, y: Double, w: Double, h: Double, x2: Double, y2: Double): Unit = js.native
    def drawImage(
      img: String,
      x: Double,
      y: Double,
      w: Double,
      h: Double,
      x2: Double,
      y2: Double,
      w2: js.UndefOr[scala.Nothing],
      h2: Double
    ): Unit = js.native
    def drawImage(img: String, x: Double, y: Double, w: Double, h: Double, x2: Double, y2: Double, w2: Double): Unit = js.native
    def drawImage(
      img: String,
      x: Double,
      y: Double,
      w: Double,
      h: Double,
      x2: Double,
      y2: Double,
      w2: Double,
      h2: Double
    ): Unit = js.native
    
    def f2(number: Double): Double = js.native
    
    def fill(): Unit = js.native
    
    def fillRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
    
    def fillText(text: String, x: Double, y: Double, maxWidth: Double): Unit = js.native
    def fillText(text: js.Array[String], x: Double, y: Double, maxWidth: Double): Unit = js.native
    
    def getTextBaseline(): String = js.native
    
    var lastBreak: Double = js.native
    
    def lineTo(x: Double, y: Double): Unit = js.native
    
    def measureText(text: String): Width = js.native
    
    def moveTo(x: Double, y: Double): Unit = js.native
    
    var pageBreaks: js.Array[_] = js.native
    
    var pageWrapX: Double = js.native
    
    var pageWrapXEnabled: Boolean = js.native
    
    var pageWrapY: Double = js.native
    
    var pageWrapYEnabled: Boolean = js.native
    
    def quadraticCurveTo(x1: Double, y1: Double, x: Double, y: Double): Unit = js.native
    
    def restore(): Unit = js.native
    
    def save(): Unit = js.native
    
    def setFillStyle(style: String): Unit = js.native
    
    def setFont(font: String): Unit = js.native
    
    def setLineCap(style: String): Unit = js.native
    
    def setLineJoin(style: String): Unit = js.native
    
    def setLineWidth(width: Double): Unit = js.native
    
    def setStrokeStyle(style: String): Unit = js.native
    
    def setTextBaseline(baseline: String): Unit = js.native
    
    def stroke(): Unit = js.native
    
    def strokeRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
    
    def strokeText(text: String, x: Double, y: Double, maxWidth: Double): Unit = js.native
    def strokeText(text: js.Array[String], x: Double, y: Double, maxWidth: Double): Unit = js.native
    
    def translate(x: Double, y: Double): Unit = js.native
  }
  
  @js.native
  trait Collections extends StObject {
    
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
    implicit class CollectionsMutableBuilder[Self <: Collections] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCollections(value: js.Any): Self = StObject.set(x, "collections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvents(value: js.Any): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setF2(value: Double => Double): Self = StObject.set(x, "f2", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetCoordinateString(value: Double => Double): Self = StObject.set(x, "getCoordinateString", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetCurrentPageInfo(value: () => js.Any): Self = StObject.set(x, "getCurrentPageInfo", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetFont(value: () => js.Any): Self = StObject.set(x, "getFont", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetFontSize(value: () => Double): Self = StObject.set(x, "getFontSize", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetLineHeight(value: () => Double): Self = StObject.set(x, "getLineHeight", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetNumberOfPages(value: () => Double): Self = StObject.set(x, "getNumberOfPages", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetPageInfo(value: Double => js.Any): Self = StObject.set(x, "getPageInfo", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetStyle(value: String => js.Any): Self = StObject.set(x, "getStyle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetVerticalCoordinateString(value: Double => Double): Self = StObject.set(x, "getVerticalCoordinateString", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNewAdditionalObject(value: () => js.Any): Self = StObject.set(x, "newAdditionalObject", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNewObject(value: () => Double): Self = StObject.set(x, "newObject", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNewObjectDeferred(value: () => Double): Self = StObject.set(x, "newObjectDeferred", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNewObjectDeferredBegin(value: Double => Unit): Self = StObject.set(x, "newObjectDeferredBegin", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOut(value: String => Unit): Self = StObject.set(x, "out", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOutput(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "output", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPageSize(value: GetHeight): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPages(value: js.Array[Double]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPagesVarargs(value: Double*): Self = StObject.set(x, "pages", js.Array(value :_*))
      
      @scala.inline
      def setPdfEscape(value: (String, js.Any) => js.Any): Self = StObject.set(x, "pdfEscape", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPutStream(value: String => Unit): Self = StObject.set(x, "putStream", js.Any.fromFunction1(value))
      
      @scala.inline
      def setScaleFactor(value: Double): Self = StObject.set(x, "scaleFactor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrite(value: String => js.Any): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait GetContext extends StObject {
    
    def getContext(): js.Any = js.native
    
    var style: js.Any = js.native
  }
  object GetContext {
    
    @scala.inline
    def apply(getContext: () => js.Any, style: js.Any): GetContext = {
      val __obj = js.Dynamic.literal(getContext = js.Any.fromFunction0(getContext), style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetContext]
    }
    
    @scala.inline
    implicit class GetContextMutableBuilder[Self <: GetContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetContext(value: () => js.Any): Self = StObject.set(x, "getContext", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetHeight extends StObject {
    
    def getHeight(): Double = js.native
    
    def getWidth(): Double = js.native
    
    var height: Double = js.native
    
    var width: Double = js.native
  }
  object GetHeight {
    
    @scala.inline
    def apply(getHeight: () => Double, getWidth: () => Double, height: Double, width: Double): GetHeight = {
      val __obj = js.Dynamic.literal(getHeight = js.Any.fromFunction0(getHeight), getWidth = js.Any.fromFunction0(getWidth), height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetHeight]
    }
    
    @scala.inline
    implicit class GetHeightMutableBuilder[Self <: GetHeight] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetHeight(value: () => Double): Self = StObject.set(x, "getHeight", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetWidth(value: () => Double): Self = StObject.set(x, "getWidth", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ReturnPromise extends StObject {
    
    var returnPromise: Boolean = js.native
  }
  object ReturnPromise {
    
    @scala.inline
    def apply(returnPromise: Boolean): ReturnPromise = {
      val __obj = js.Dynamic.literal(returnPromise = returnPromise.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReturnPromise]
    }
    
    @scala.inline
    implicit class ReturnPromiseMutableBuilder[Self <: ReturnPromise] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReturnPromise(value: Boolean): Self = StObject.set(x, "returnPromise", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Width extends StObject {
    
    var width: Double = js.native
  }
  object Width {
    
    @scala.inline
    def apply(width: Double): Width = {
      val __obj = js.Dynamic.literal(width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Width]
    }
    
    @scala.inline
    implicit class WidthMutableBuilder[Self <: Width] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
