package typings.jspdf

import typings.jspdf.anon.Align
import typings.jspdf.anon.Arc
import typings.jspdf.anon.Collections
import typings.jspdf.anon.GetContext
import typings.jspdf.anon.ReturnPromise
import typings.jspdf.jspdfStrings.l
import typings.jspdf.jspdfStrings.landscape
import typings.jspdf.jspdfStrings.p
import typings.jspdf.jspdfStrings.portrait
import typings.std.ArrayBuffer
import typings.std.HTMLElement
import typings.std.Number
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jspdf", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with jsPDF {
    def this(orientation: js.Any) = this()
    def this(orientation: js.Any, unit: String) = this()
    def this(orientation: Unit, unit: String) = this()
    def this(orientation: js.Any, unit: String, format: String) = this()
    def this(orientation: js.Any, unit: String, format: js.Array[Number]) = this()
    def this(orientation: js.Any, unit: Unit, format: String) = this()
    def this(orientation: js.Any, unit: Unit, format: js.Array[Number]) = this()
    def this(orientation: Unit, unit: String, format: String) = this()
    def this(orientation: Unit, unit: String, format: js.Array[Number]) = this()
    def this(orientation: Unit, unit: Unit, format: String) = this()
    def this(orientation: Unit, unit: Unit, format: js.Array[Number]) = this()
    def this(orientation: js.Any, unit: String, format: String, compressPdf: Double) = this()
    def this(orientation: js.Any, unit: String, format: js.Array[Number], compressPdf: Double) = this()
    def this(orientation: js.Any, unit: String, format: Unit, compressPdf: Double) = this()
    def this(orientation: js.Any, unit: Unit, format: String, compressPdf: Double) = this()
    def this(orientation: js.Any, unit: Unit, format: js.Array[Number], compressPdf: Double) = this()
    def this(orientation: js.Any, unit: Unit, format: Unit, compressPdf: Double) = this()
    def this(orientation: Unit, unit: String, format: String, compressPdf: Double) = this()
    def this(orientation: Unit, unit: String, format: js.Array[Number], compressPdf: Double) = this()
    def this(orientation: Unit, unit: String, format: Unit, compressPdf: Double) = this()
    def this(orientation: Unit, unit: Unit, format: String, compressPdf: Double) = this()
    def this(orientation: Unit, unit: Unit, format: js.Array[Number], compressPdf: Double) = this()
    def this(orientation: Unit, unit: Unit, format: Unit, compressPdf: Double) = this()
  }
  
  @js.native
  trait jsPDF extends StObject {
    
    var CapJoinStyles: js.Any = js.native
    
    def addFileToVFS(filename: String, filecontent: String): jsPDF = js.native
    
    def addFont(postScriptName: String, fontName: String, fontStyle: String): String = js.native
    
    def addHTML(element: js.Any, callback: js.Function): jsPDF = js.native
    /**
      * jsPDF plugins below:
      *
      *  - AddHTML
      *  - AddImage
      *  - Annotations
      *  - AutoPrint
      *  - Canvas
      *  - Cell
      *  - Context2D
      *  - FromHTML
      *  - JavaScript
      *  - PNG
      *  - split_text_to_size
      *  - SVG
      *  - total_pages
      *  - vfs
      */
    // jsPDF plugin: addHTML
    def addHTML(element: js.Any, x: Double, y: Double, options: js.Any, callback: js.Function): jsPDF = js.native
    
    def addImage(
      imageData: js.UndefOr[js.Any],
      format: js.UndefOr[js.Any],
      x: js.UndefOr[Double],
      y: js.UndefOr[Double],
      w: js.UndefOr[Double],
      h: js.UndefOr[Double],
      alias: js.UndefOr[js.Any],
      compression: js.UndefOr[js.Any],
      rotation: js.UndefOr[js.Any]
    ): jsPDF = js.native
    
    // jsPDF plugin: JavaScript
    def addJS(txt: String): jsPDF = js.native
    
    def addPage(): jsPDF = js.native
    def addPage(format: String): jsPDF = js.native
    def addPage(format: js.Array[Double]): jsPDF = js.native
    @JSName("addPage")
    def addPage_l(format: String, orientation: l): jsPDF = js.native
    @JSName("addPage")
    def addPage_l(format: js.Array[Double], orientation: l): jsPDF = js.native
    @JSName("addPage")
    def addPage_l(format: Unit, orientation: l): jsPDF = js.native
    @JSName("addPage")
    def addPage_landscape(format: String, orientation: landscape): jsPDF = js.native
    @JSName("addPage")
    def addPage_landscape(format: js.Array[Double], orientation: landscape): jsPDF = js.native
    @JSName("addPage")
    def addPage_landscape(format: Unit, orientation: landscape): jsPDF = js.native
    @JSName("addPage")
    def addPage_p(format: String, orientation: p): jsPDF = js.native
    @JSName("addPage")
    def addPage_p(format: js.Array[Double], orientation: p): jsPDF = js.native
    @JSName("addPage")
    def addPage_p(format: Unit, orientation: p): jsPDF = js.native
    @JSName("addPage")
    def addPage_portrait(format: String, orientation: portrait): jsPDF = js.native
    @JSName("addPage")
    def addPage_portrait(format: js.Array[Double], orientation: portrait): jsPDF = js.native
    @JSName("addPage")
    def addPage_portrait(format: Unit, orientation: portrait): jsPDF = js.native
    
    // jsPDF plugin: SVG
    def addSVG(svgtext: String, x: Double, y: Double): jsPDF = js.native
    def addSVG(svgtext: String, x: Double, y: Double, w: Double): jsPDF = js.native
    def addSVG(svgtext: String, x: Double, y: Double, w: Double, h: Double): jsPDF = js.native
    def addSVG(svgtext: String, x: Double, y: Double, w: Unit, h: Double): jsPDF = js.native
    
    // jsPDF plugin: Annotations
    var annotationPlugin: js.Any = js.native
    
    def arrayBufferToBase64(arrayBuffer: ArrayBuffer): String = js.native
    
    def arrayBufferToBinaryString(buffer: js.Any): String = js.native
    
    def arrayMax(array: js.Array[js.Any]): Double = js.native
    def arrayMax(array: js.Array[js.Any], comparisonFn: js.Function): Double = js.native
    
    // jsPDF plugin: AutoPrint
    def autoPrint(): jsPDF = js.native
    
    def binaryStringToUint8Array(binary_string: String): Uint8Array = js.native
    
    def calculateLineHeight(headerNames: js.Array[String], columnWidths: js.Array[Double], model: js.Array[js.Any]): Double = js.native
    
    // jsPDF plugin: Canvas
    var canvas: GetContext = js.native
    
    def cell(x: Double, y: Double, w: Double, h: Double, txt: String, ln: Double, align: String): jsPDF = js.native
    
    def cellAddPage(): Unit = js.native
    
    def cellInitialize(): Unit = js.native
    
    def circle(x: Double, y: Double, r: Double, style: String): jsPDF = js.native
    
    def clip(): Unit = js.native
    
    // jsPDF plugin: addImage
    var color_spaces: js.Any = js.native
    
    // jsPDF plugin: Context2D
    var context2d: Arc = js.native
    
    def createAnnotation(options: js.Any): Unit = js.native
    
    def createImageInfo(data: js.Any, wd: js.Any, ht: js.Any, cs: js.Any, bpc: js.Any, imageIndex: Double, alias: js.Any): js.Any = js.native
    def createImageInfo(
      data: js.Any,
      wd: js.Any,
      ht: js.Any,
      cs: js.Any,
      bpc: js.Any,
      imageIndex: Double,
      alias: js.Any,
      f: js.Any
    ): js.Any = js.native
    def createImageInfo(
      data: js.Any,
      wd: js.Any,
      ht: js.Any,
      cs: js.Any,
      bpc: js.Any,
      imageIndex: Double,
      alias: js.Any,
      f: js.Any,
      dp: js.Any
    ): js.Any = js.native
    def createImageInfo(
      data: js.Any,
      wd: js.Any,
      ht: js.Any,
      cs: js.Any,
      bpc: js.Any,
      imageIndex: Double,
      alias: js.Any,
      f: js.Any,
      dp: js.Any,
      trns: js.Any
    ): js.Any = js.native
    def createImageInfo(
      data: js.Any,
      wd: js.Any,
      ht: js.Any,
      cs: js.Any,
      bpc: js.Any,
      imageIndex: Double,
      alias: js.Any,
      f: js.Any,
      dp: js.Any,
      trns: js.Any,
      pal: js.Any
    ): js.Any = js.native
    def createImageInfo(
      data: js.Any,
      wd: js.Any,
      ht: js.Any,
      cs: js.Any,
      bpc: js.Any,
      imageIndex: Double,
      alias: js.Any,
      f: js.Any,
      dp: js.Any,
      trns: js.Any,
      pal: js.Any,
      smask: js.Any
    ): js.Any = js.native
    def createImageInfo(
      data: js.Any,
      wd: js.Any,
      ht: js.Any,
      cs: js.Any,
      bpc: js.Any,
      imageIndex: Double,
      alias: js.Any,
      f: js.Any,
      dp: js.Any,
      trns: js.Any,
      pal: Unit,
      smask: js.Any
    ): js.Any = js.native
    def createImageInfo(
      data: js.Any,
      wd: js.Any,
      ht: js.Any,
      cs: js.Any,
      bpc: js.Any,
      imageIndex: Double,
      alias: js.Any,
      f: js.Any,
      dp: js.Any,
      trns: Unit,
      pal: js.Any
    ): js.Any = js.native
    def createImageInfo(
      data: js.Any,
      wd: js.Any,
      ht: js.Any,
      cs: js.Any,
      bpc: js.Any,
      imageIndex: Double,
      alias: js.Any,
      f: js.Any,
      dp: js.Any,
      trns: Unit,
      pal: js.Any,
      smask: js.Any
    ): js.Any = js.native
    def createImageInfo(
      data: js.Any,
      wd: js.Any,
      ht: js.Any,
      cs: js.Any,
      bpc: js.Any,
      imageIndex: Double,
      alias: js.Any,
      f: js.Any,
      dp: js.Any,
      trns: Unit,
      pal: Unit,
      smask: js.Any
    ): js.Any = js.native
    def createImageInfo(
      data: js.Any,
      wd: js.Any,
      ht: js.Any,
      cs: js.Any,
      bpc: js.Any,
      imageIndex: Double,
      alias: js.Any,
      f: js.Any,
      dp: Unit,
      trns: js.Any
    ): js.Any = js.native
    def createImageInfo(
      data: js.Any,
      wd: js.Any,
      ht: js.Any,
      cs: js.Any,
      bpc: js.Any,
      imageIndex: Double,
      alias: js.Any,
      f: js.Any,
      dp: Unit,
      trns: js.Any,
      pal: js.Any
    ): js.Any = js.native
    def createImageInfo(
      data: js.Any,
      wd: js.Any,
      ht: js.Any,
      cs: js.Any,
      bpc: js.Any,
      imageIndex: Double,
      alias: js.Any,
      f: js.Any,
      dp: Unit,
      trns: js.Any,
      pal: js.Any,
      smask: js.Any
    ): js.Any = js.native
    def createImageInfo(
      data: js.Any,
      wd: js.Any,
      ht: js.Any,
      cs: js.Any,
      bpc: js.Any,
      imageIndex: Double,
      alias: js.Any,
      f: js.Any,
      dp: Unit,
      trns: js.Any,
      pal: Unit,
      smask: js.Any
    ): js.Any = js.native
    def createImageInfo(
      data: js.Any,
      wd: js.Any,
      ht: js.Any,
      cs: js.Any,
      bpc: js.Any,
      imageIndex: Double,
      alias: js.Any,
      f: js.Any,
      dp: Unit,
      trns: Unit,
      pal: js.Any
    ): js.Any = js.native
    def createImageInfo(
      data: js.Any,
      wd: js.Any,
      ht: js.Any,
      cs: js.Any,
      bpc: js.Any,
      imageIndex: Double,
      alias: js.Any,
      f: js.Any,
      dp: Unit,
      trns: Unit,
      pal: js.Any,
      smask: js.Any
    ): js.Any = js.native
    def createImageInfo(
      data: js.Any,
      wd: js.Any,
      ht: js.Any,
      cs: js.Any,
      bpc: js.Any,
      imageIndex: Double,
      alias: js.Any,
      f: js.Any,
      dp: Unit,
      trns: Unit,
      pal: Unit,
      smask: js.Any
    ): js.Any = js.native
    def createImageInfo(
      data: js.Any,
      wd: js.Any,
      ht: js.Any,
      cs: js.Any,
      bpc: js.Any,
      imageIndex: Double,
      alias: js.Any,
      f: Unit,
      dp: js.Any
    ): js.Any = js.native
    def createImageInfo(
      data: js.Any,
      wd: js.Any,
      ht: js.Any,
      cs: js.Any,
      bpc: js.Any,
      imageIndex: Double,
      alias: js.Any,
      f: Unit,
      dp: js.Any,
      trns: js.Any
    ): js.Any = js.native
    def createImageInfo(
      data: js.Any,
      wd: js.Any,
      ht: js.Any,
      cs: js.Any,
      bpc: js.Any,
      imageIndex: Double,
      alias: js.Any,
      f: Unit,
      dp: js.Any,
      trns: js.Any,
      pal: js.Any
    ): js.Any = js.native
    def createImageInfo(
      data: js.Any,
      wd: js.Any,
      ht: js.Any,
      cs: js.Any,
      bpc: js.Any,
      imageIndex: Double,
      alias: js.Any,
      f: Unit,
      dp: js.Any,
      trns: js.Any,
      pal: js.Any,
      smask: js.Any
    ): js.Any = js.native
    def createImageInfo(
      data: js.Any,
      wd: js.Any,
      ht: js.Any,
      cs: js.Any,
      bpc: js.Any,
      imageIndex: Double,
      alias: js.Any,
      f: Unit,
      dp: js.Any,
      trns: js.Any,
      pal: Unit,
      smask: js.Any
    ): js.Any = js.native
    def createImageInfo(
      data: js.Any,
      wd: js.Any,
      ht: js.Any,
      cs: js.Any,
      bpc: js.Any,
      imageIndex: Double,
      alias: js.Any,
      f: Unit,
      dp: js.Any,
      trns: Unit,
      pal: js.Any
    ): js.Any = js.native
    def createImageInfo(
      data: js.Any,
      wd: js.Any,
      ht: js.Any,
      cs: js.Any,
      bpc: js.Any,
      imageIndex: Double,
      alias: js.Any,
      f: Unit,
      dp: js.Any,
      trns: Unit,
      pal: js.Any,
      smask: js.Any
    ): js.Any = js.native
    def createImageInfo(
      data: js.Any,
      wd: js.Any,
      ht: js.Any,
      cs: js.Any,
      bpc: js.Any,
      imageIndex: Double,
      alias: js.Any,
      f: Unit,
      dp: js.Any,
      trns: Unit,
      pal: Unit,
      smask: js.Any
    ): js.Any = js.native
    def createImageInfo(
      data: js.Any,
      wd: js.Any,
      ht: js.Any,
      cs: js.Any,
      bpc: js.Any,
      imageIndex: Double,
      alias: js.Any,
      f: Unit,
      dp: Unit,
      trns: js.Any
    ): js.Any = js.native
    def createImageInfo(
      data: js.Any,
      wd: js.Any,
      ht: js.Any,
      cs: js.Any,
      bpc: js.Any,
      imageIndex: Double,
      alias: js.Any,
      f: Unit,
      dp: Unit,
      trns: js.Any,
      pal: js.Any
    ): js.Any = js.native
    def createImageInfo(
      data: js.Any,
      wd: js.Any,
      ht: js.Any,
      cs: js.Any,
      bpc: js.Any,
      imageIndex: Double,
      alias: js.Any,
      f: Unit,
      dp: Unit,
      trns: js.Any,
      pal: js.Any,
      smask: js.Any
    ): js.Any = js.native
    def createImageInfo(
      data: js.Any,
      wd: js.Any,
      ht: js.Any,
      cs: js.Any,
      bpc: js.Any,
      imageIndex: Double,
      alias: js.Any,
      f: Unit,
      dp: Unit,
      trns: js.Any,
      pal: Unit,
      smask: js.Any
    ): js.Any = js.native
    def createImageInfo(
      data: js.Any,
      wd: js.Any,
      ht: js.Any,
      cs: js.Any,
      bpc: js.Any,
      imageIndex: Double,
      alias: js.Any,
      f: Unit,
      dp: Unit,
      trns: Unit,
      pal: js.Any
    ): js.Any = js.native
    def createImageInfo(
      data: js.Any,
      wd: js.Any,
      ht: js.Any,
      cs: js.Any,
      bpc: js.Any,
      imageIndex: Double,
      alias: js.Any,
      f: Unit,
      dp: Unit,
      trns: Unit,
      pal: js.Any,
      smask: js.Any
    ): js.Any = js.native
    def createImageInfo(
      data: js.Any,
      wd: js.Any,
      ht: js.Any,
      cs: js.Any,
      bpc: js.Any,
      imageIndex: Double,
      alias: js.Any,
      f: Unit,
      dp: Unit,
      trns: Unit,
      pal: Unit,
      smask: js.Any
    ): js.Any = js.native
    
    var decode: js.Any = js.native
    
    def deletePage(n: Double): jsPDF = js.native
    
    def ellipse(x: Double, y: Double, rx: Double, ry: Double): jsPDF = js.native
    def ellipse(x: Double, y: Double, rx: Double, ry: Double, style: String): jsPDF = js.native
    
    // jsPDF plugin: vfs
    def existsFileInVFS(filename: String): Boolean = js.native
    
    def extractInfoFromBase64DataURI(dataURI: String): js.Array[js.Any] = js.native
    
    // jsPDF plugin: fromHTML
    def fromHTML(HTML: String, x: Double, y: Double): jsPDF = js.native
    def fromHTML(HTML: String, x: Double, y: Double, settings: js.Any): jsPDF = js.native
    def fromHTML(HTML: String, x: Double, y: Double, settings: js.Any, callback: js.Function): jsPDF = js.native
    def fromHTML(HTML: String, x: Double, y: Double, settings: js.Any, callback: js.Function, margins: js.Any): jsPDF = js.native
    def fromHTML(HTML: String, x: Double, y: Double, settings: js.Any, callback: Unit, margins: js.Any): jsPDF = js.native
    def fromHTML(HTML: String, x: Double, y: Double, settings: Unit, callback: js.Function): jsPDF = js.native
    def fromHTML(HTML: String, x: Double, y: Double, settings: Unit, callback: js.Function, margins: js.Any): jsPDF = js.native
    def fromHTML(HTML: String, x: Double, y: Double, settings: Unit, callback: Unit, margins: js.Any): jsPDF = js.native
    def fromHTML(HTML: HTMLElement, x: Double, y: Double): jsPDF = js.native
    def fromHTML(HTML: HTMLElement, x: Double, y: Double, settings: js.Any): jsPDF = js.native
    def fromHTML(HTML: HTMLElement, x: Double, y: Double, settings: js.Any, callback: js.Function): jsPDF = js.native
    def fromHTML(HTML: HTMLElement, x: Double, y: Double, settings: js.Any, callback: js.Function, margins: js.Any): jsPDF = js.native
    def fromHTML(HTML: HTMLElement, x: Double, y: Double, settings: js.Any, callback: Unit, margins: js.Any): jsPDF = js.native
    def fromHTML(HTML: HTMLElement, x: Double, y: Double, settings: Unit, callback: js.Function): jsPDF = js.native
    def fromHTML(HTML: HTMLElement, x: Double, y: Double, settings: Unit, callback: js.Function, margins: js.Any): jsPDF = js.native
    def fromHTML(HTML: HTMLElement, x: Double, y: Double, settings: Unit, callback: Unit, margins: js.Any): jsPDF = js.native
    
    // jsPDF plugin: split_text_to_size
    def getCharWidthsArray(text: String): js.Array[js.Any] = js.native
    def getCharWidthsArray(text: String, options: js.Any): js.Array[js.Any] = js.native
    
    def getFileFromVFS(filename: String): String = js.native
    
    def getFontList(): js.Any = js.native
    
    def getLineHeight(): Double = js.native
    
    def getStringUnitWidth(text: String): Double = js.native
    def getStringUnitWidth(text: String, options: js.Any): Double = js.native
    
    def getTextDimensions(txt: String): js.Any = js.native
    
    def getTextWidth(text: String): Double = js.native
    
    var image_compression: js.Any = js.native
    
    def insertPage(beforePage: Double): jsPDF = js.native
    
    var internal: Collections = js.native
    
    def isArrayBuffer(`object`: js.Any): Boolean = js.native
    
    def isArrayBufferView(`object`: js.Any): Boolean = js.native
    
    def isString(`object`: js.Any): Boolean = js.native
    
    def line(x1: Double, y1: Double, x2: Double, y2: Double): js.Any = js.native
    
    def lines(lines: js.Any, x: js.Any, y: js.Any): jsPDF = js.native
    def lines(lines: js.Any, x: js.Any, y: js.Any, scale: js.Any): jsPDF = js.native
    def lines(lines: js.Any, x: js.Any, y: js.Any, scale: js.Any, style: String): jsPDF = js.native
    def lines(lines: js.Any, x: js.Any, y: js.Any, scale: js.Any, style: String, closed: Boolean): jsPDF = js.native
    def lines(lines: js.Any, x: js.Any, y: js.Any, scale: js.Any, style: Unit, closed: Boolean): jsPDF = js.native
    def lines(lines: js.Any, x: js.Any, y: js.Any, scale: Unit, style: String): jsPDF = js.native
    def lines(lines: js.Any, x: js.Any, y: js.Any, scale: Unit, style: String, closed: Boolean): jsPDF = js.native
    def lines(lines: js.Any, x: js.Any, y: js.Any, scale: Unit, style: Unit, closed: Boolean): jsPDF = js.native
    
    def link(x: Double, y: Double, w: Double, h: Double, options: js.Any): Unit = js.native
    
    def lstext(text: String, x: Double, y: Double, spacing: Double): jsPDF = js.native
    
    def movePage(targetPage: Double, beforePage: Double): jsPDF = js.native
    
    def output(): js.Any = js.native
    def output(`type`: String): js.Any = js.native
    def output(`type`: String, options: js.Any): js.Any = js.native
    def output(`type`: Unit, options: js.Any): js.Any = js.native
    
    def printHeaderRow(lineNumber: Double): Unit = js.native
    def printHeaderRow(lineNumber: Double, new_page: Boolean): Unit = js.native
    
    def processJPEG(data: js.Any, index: Double, alias: js.Any): js.Any = js.native
    def processJPEG(data: js.Any, index: Double, alias: js.Any, compression: js.Any): js.Any = js.native
    def processJPEG(data: js.Any, index: Double, alias: js.Any, compression: js.Any, dataAsBinaryString: String): js.Any = js.native
    def processJPEG(data: js.Any, index: Double, alias: js.Any, compression: Unit, dataAsBinaryString: String): js.Any = js.native
    
    def processJPG(): js.Any = js.native
    
    // jsPDF plugin: PNG
    def processPNG(
      imageData: js.Any,
      imageIndex: Double,
      alias: String,
      compression: js.Any,
      dataAsBinaryString: String
    ): js.Any = js.native
    
    // jsPDF plugin: total_pages
    def putTotalPages(pageExpression: String): jsPDF = js.native
    
    def rect(x: Double, y: Double, w: Double, h: Double): jsPDF = js.native
    def rect(x: Double, y: Double, w: Double, h: Double, style: String): jsPDF = js.native
    
    def roundedRect(x: Double, y: Double, w: Double, h: Double, rx: Double, ry: Double, style: String): jsPDF = js.native
    
    def sHashCode(str: String): js.Any = js.native
    
    def save(filename: String): Unit = js.native
    def save(filename: String, options: ReturnPromise): js.Promise[js.Any] = js.native
    
    def setDisplayMode(): jsPDF = js.native
    def setDisplayMode(zoom: String): jsPDF = js.native
    def setDisplayMode(zoom: String, layout: String): jsPDF = js.native
    def setDisplayMode(zoom: String, layout: String, pmode: String): jsPDF = js.native
    def setDisplayMode(zoom: String, layout: Unit, pmode: String): jsPDF = js.native
    def setDisplayMode(zoom: Unit, layout: String): jsPDF = js.native
    def setDisplayMode(zoom: Unit, layout: String, pmode: String): jsPDF = js.native
    def setDisplayMode(zoom: Unit, layout: Unit, pmode: String): jsPDF = js.native
    
    def setDrawColor(ch1: String): jsPDF = js.native
    def setDrawColor(ch1: Double): jsPDF = js.native
    def setDrawColor(ch1: Double, ch2: Double, ch3: Double): jsPDF = js.native
    def setDrawColor(ch1: Double, ch2: Double, ch3: Double, ch4: Double): jsPDF = js.native
    
    def setFillColor(ch1: String): jsPDF = js.native
    def setFillColor(ch1: Double): jsPDF = js.native
    def setFillColor(ch1: Double, ch2: Double, ch3: Double): jsPDF = js.native
    def setFillColor(ch1: Double, ch2: Double, ch3: Double, ch4: Double): jsPDF = js.native
    
    def setFont(): jsPDF = js.native
    def setFont(fontName: String): jsPDF = js.native
    def setFont(fontName: String, fontStyle: String): jsPDF = js.native
    def setFont(fontName: Unit, fontStyle: String): jsPDF = js.native
    
    def setFontSize(size: Double): jsPDF = js.native
    
    def setFontStyle(style: String): jsPDF = js.native
    
    def setFontType(style: String): jsPDF = js.native
    
    // jsPDF plugin: Cell
    def setHeaderFunction(func: js.Function): Unit = js.native
    
    def setLineCap(style: String): jsPDF = js.native
    def setLineCap(style: Double): jsPDF = js.native
    
    def setLineJoin(style: String): jsPDF = js.native
    def setLineJoin(style: Double): jsPDF = js.native
    
    def setLineWidth(width: Double): jsPDF = js.native
    
    def setPage(n: Double): jsPDF = js.native
    
    def setProperties(properties: js.Any): jsPDF = js.native
    
    def setTableHeaderRow(config: js.Array[js.Any]): Unit = js.native
    
    def setTextColor(ch1: String): jsPDF = js.native
    def setTextColor(ch1: Double): jsPDF = js.native
    def setTextColor(ch1: Double, ch2: Double, ch3: Double): jsPDF = js.native
    def setTextColor(ch1: Double, ch2: Double, ch3: Double, ch4: Double): jsPDF = js.native
    
    def splitTextToSize(text: String, maxlen: Double): js.Any = js.native
    def splitTextToSize(text: String, maxlen: Double, options: js.Any): js.Any = js.native
    
    def supportsArrayBuffer(): Boolean = js.native
    
    def table(x: Double, y: Double, data: js.Any, headers: js.Array[Align], config: js.Any): jsPDF = js.native
    
    def text(text: js.Any, x: js.Any, y: js.Any): jsPDF = js.native
    def text(text: js.Any, x: js.Any, y: js.Any, flags: js.Any): jsPDF = js.native
    def text(text: js.Any, x: js.Any, y: js.Any, flags: js.Any, angle: js.Any): jsPDF = js.native
    def text(text: js.Any, x: js.Any, y: js.Any, flags: js.Any, angle: js.Any, align: js.Any): jsPDF = js.native
    def text(text: js.Any, x: js.Any, y: js.Any, flags: js.Any, angle: Unit, align: js.Any): jsPDF = js.native
    def text(text: js.Any, x: js.Any, y: js.Any, flags: Unit, angle: js.Any): jsPDF = js.native
    def text(text: js.Any, x: js.Any, y: js.Any, flags: Unit, angle: js.Any, align: js.Any): jsPDF = js.native
    def text(text: js.Any, x: js.Any, y: js.Any, flags: Unit, angle: Unit, align: js.Any): jsPDF = js.native
    
    def textWithLink(text: String, x: Double, y: Double, options: js.Any): Double = js.native
    
    def triangle(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double, style: String): jsPDF = js.native
    
    var version: String = js.native
  }
}
