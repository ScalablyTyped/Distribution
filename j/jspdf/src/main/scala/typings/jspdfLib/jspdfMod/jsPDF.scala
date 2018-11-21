package typings
package jspdfLib.jspdfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait jsPDF extends js.Object {
  var CapJoinStyles: js.Any = js.native
  // jsPDF plugin: Annotations
  var annotationPlugin: js.Any = js.native
  // jsPDF plugin: Canvas
  var canvas: jspdfLib.Anon_GetContext = js.native
  // jsPDF plugin: addImage
  var color_spaces: js.Any = js.native
  // jsPDF plugin: Context2D
  var context2d: jspdfLib.Anon_ClearRect = js.native
  var decode: js.Any = js.native
  var image_compression: js.Any = js.native
  var internal: jspdfLib.Anon_PageSize = js.native
  var version: java.lang.String = js.native
  def addFileToVFS(filename: java.lang.String, filecontent: java.lang.String): jsPDF = js.native
  def addFont(postScriptName: java.lang.String, fontName: java.lang.String, fontStyle: java.lang.String): java.lang.String = js.native
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
  def addHTML(element: js.Any, x: scala.Double, y: scala.Double, options: js.Any, callback: js.Function): jsPDF = js.native
  def addImage(
    imageData: js.UndefOr[js.Any],
    format: js.UndefOr[js.Any],
    x: js.UndefOr[scala.Double],
    y: js.UndefOr[scala.Double],
    w: js.UndefOr[scala.Double],
    h: js.UndefOr[scala.Double],
    alias: js.UndefOr[js.Any],
    compression: js.UndefOr[js.Any],
    rotation: js.UndefOr[js.Any]
  ): jsPDF = js.native
  // jsPDF plugin: JavaScript
  def addJS(txt: java.lang.String): jsPDF = js.native
  def addPage(): jsPDF = js.native
  def addPage(format: java.lang.String): jsPDF = js.native
  def addPage(format: js.Array[scala.Double]): jsPDF = js.native
  @JSName("addPage")
  def addPage_l(format: java.lang.String, orientation: jspdfLib.jspdfLibStrings.l): jsPDF = js.native
  @JSName("addPage")
  def addPage_l(format: js.Array[scala.Double], orientation: jspdfLib.jspdfLibStrings.l): jsPDF = js.native
  @JSName("addPage")
  def addPage_landscape(format: java.lang.String, orientation: jspdfLib.jspdfLibStrings.landscape): jsPDF = js.native
  @JSName("addPage")
  def addPage_landscape(format: js.Array[scala.Double], orientation: jspdfLib.jspdfLibStrings.landscape): jsPDF = js.native
  @JSName("addPage")
  def addPage_p(format: java.lang.String, orientation: jspdfLib.jspdfLibStrings.p): jsPDF = js.native
  @JSName("addPage")
  def addPage_p(format: js.Array[scala.Double], orientation: jspdfLib.jspdfLibStrings.p): jsPDF = js.native
  @JSName("addPage")
  def addPage_portrait(format: java.lang.String, orientation: jspdfLib.jspdfLibStrings.portrait): jsPDF = js.native
  @JSName("addPage")
  def addPage_portrait(format: js.Array[scala.Double], orientation: jspdfLib.jspdfLibStrings.portrait): jsPDF = js.native
  // jsPDF plugin: SVG
  def addSVG(svgtext: java.lang.String, x: scala.Double, y: scala.Double): jsPDF = js.native
  // jsPDF plugin: SVG
  def addSVG(svgtext: java.lang.String, x: scala.Double, y: scala.Double, w: scala.Double): jsPDF = js.native
  // jsPDF plugin: SVG
  def addSVG(svgtext: java.lang.String, x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double): jsPDF = js.native
  def arrayBufferToBase64(arrayBuffer: stdLib.ArrayBuffer): java.lang.String = js.native
  def arrayBufferToBinaryString(buffer: js.Any): java.lang.String = js.native
  def arrayMax(array: js.Array[_]): scala.Double = js.native
  def arrayMax(array: js.Array[_], comparisonFn: js.Function): scala.Double = js.native
  // jsPDF plugin: AutoPrint
  def autoPrint(): jsPDF = js.native
  def binaryStringToUint8Array(binary_string: java.lang.String): stdLib.Uint8Array = js.native
  def calculateLineHeight(headerNames: js.Array[java.lang.String], columnWidths: js.Array[scala.Double], model: js.Array[_]): scala.Double = js.native
  def cell(
    x: scala.Double,
    y: scala.Double,
    w: scala.Double,
    h: scala.Double,
    txt: java.lang.String,
    ln: scala.Double,
    align: java.lang.String
  ): jsPDF = js.native
  def cellAddPage(): scala.Unit = js.native
  def cellInitialize(): scala.Unit = js.native
  def circle(x: scala.Double, y: scala.Double, r: scala.Double, style: java.lang.String): jsPDF = js.native
  def clip(): scala.Unit = js.native
  def createAnnotation(options: js.Any): scala.Unit = js.native
  def createImageInfo(
    data: js.Any,
    wd: js.Any,
    ht: js.Any,
    cs: js.Any,
    bpc: js.Any,
    imageIndex: scala.Double,
    alias: js.Any
  ): js.Any = js.native
  def createImageInfo(
    data: js.Any,
    wd: js.Any,
    ht: js.Any,
    cs: js.Any,
    bpc: js.Any,
    imageIndex: scala.Double,
    alias: js.Any,
    f: js.Any
  ): js.Any = js.native
  def createImageInfo(
    data: js.Any,
    wd: js.Any,
    ht: js.Any,
    cs: js.Any,
    bpc: js.Any,
    imageIndex: scala.Double,
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
    imageIndex: scala.Double,
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
    imageIndex: scala.Double,
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
    imageIndex: scala.Double,
    alias: js.Any,
    f: js.Any,
    dp: js.Any,
    trns: js.Any,
    pal: js.Any,
    smask: js.Any
  ): js.Any = js.native
  def deletePage(n: scala.Double): jsPDF = js.native
  def ellipse(x: scala.Double, y: scala.Double, rx: scala.Double, ry: scala.Double): jsPDF = js.native
  def ellipse(x: scala.Double, y: scala.Double, rx: scala.Double, ry: scala.Double, style: java.lang.String): jsPDF = js.native
  // jsPDF plugin: vfs
  def existsFileInVFS(filename: java.lang.String): scala.Boolean = js.native
  def extractInfoFromBase64DataURI(dataURI: java.lang.String): js.Array[_] = js.native
  // jsPDF plugin: fromHTML
  def fromHTML(HTML: java.lang.String, x: scala.Double, y: scala.Double): jsPDF = js.native
  // jsPDF plugin: fromHTML
  def fromHTML(HTML: java.lang.String, x: scala.Double, y: scala.Double, settings: js.Any): jsPDF = js.native
  // jsPDF plugin: fromHTML
  def fromHTML(HTML: java.lang.String, x: scala.Double, y: scala.Double, settings: js.Any, callback: js.Function): jsPDF = js.native
  // jsPDF plugin: fromHTML
  def fromHTML(
    HTML: java.lang.String,
    x: scala.Double,
    y: scala.Double,
    settings: js.Any,
    callback: js.Function,
    margins: js.Any
  ): jsPDF = js.native
  // jsPDF plugin: fromHTML
  def fromHTML(HTML: stdLib.HTMLElement, x: scala.Double, y: scala.Double): jsPDF = js.native
  // jsPDF plugin: fromHTML
  def fromHTML(HTML: stdLib.HTMLElement, x: scala.Double, y: scala.Double, settings: js.Any): jsPDF = js.native
  // jsPDF plugin: fromHTML
  def fromHTML(
    HTML: stdLib.HTMLElement,
    x: scala.Double,
    y: scala.Double,
    settings: js.Any,
    callback: js.Function
  ): jsPDF = js.native
  // jsPDF plugin: fromHTML
  def fromHTML(
    HTML: stdLib.HTMLElement,
    x: scala.Double,
    y: scala.Double,
    settings: js.Any,
    callback: js.Function,
    margins: js.Any
  ): jsPDF = js.native
  // jsPDF plugin: split_text_to_size
  def getCharWidthsArray(text: java.lang.String): js.Array[_] = js.native
  // jsPDF plugin: split_text_to_size
  def getCharWidthsArray(text: java.lang.String, options: js.Any): js.Array[_] = js.native
  def getFileFromVFS(filename: java.lang.String): java.lang.String = js.native
  def getFontList(): js.Any = js.native
  def getLineHeight(): scala.Double = js.native
  def getStringUnitWidth(text: java.lang.String): scala.Double = js.native
  def getStringUnitWidth(text: java.lang.String, options: js.Any): scala.Double = js.native
  def getTextDimensions(txt: java.lang.String): js.Any = js.native
  def getTextWidth(text: java.lang.String): scala.Double = js.native
  def insertPage(beforePage: scala.Double): jsPDF = js.native
  def isArrayBuffer(`object`: js.Any): scala.Boolean = js.native
  def isArrayBufferView(`object`: js.Any): scala.Boolean = js.native
  def isString(`object`: js.Any): scala.Boolean = js.native
  def line(x1: scala.Double, y1: scala.Double, x2: scala.Double, y2: scala.Double): js.Any = js.native
  def lines(lines: js.Any, x: js.Any, y: js.Any): jsPDF = js.native
  def lines(lines: js.Any, x: js.Any, y: js.Any, scale: js.Any): jsPDF = js.native
  def lines(lines: js.Any, x: js.Any, y: js.Any, scale: js.Any, style: java.lang.String): jsPDF = js.native
  def lines(lines: js.Any, x: js.Any, y: js.Any, scale: js.Any, style: java.lang.String, closed: scala.Boolean): jsPDF = js.native
  def link(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double, options: js.Any): scala.Unit = js.native
  def lstext(text: java.lang.String, x: scala.Double, y: scala.Double, spacing: scala.Double): jsPDF = js.native
  def movePage(targetPage: scala.Double, beforePage: scala.Double): jsPDF = js.native
  def output(): js.Any = js.native
  def output(`type`: java.lang.String): js.Any = js.native
  def output(`type`: java.lang.String, options: js.Any): js.Any = js.native
  def printHeaderRow(lineNumber: scala.Double): scala.Unit = js.native
  def printHeaderRow(lineNumber: scala.Double, new_page: scala.Boolean): scala.Unit = js.native
  def processJPEG(data: js.Any, index: scala.Double, alias: js.Any): js.Any = js.native
  def processJPEG(data: js.Any, index: scala.Double, alias: js.Any, compression: js.Any): js.Any = js.native
  def processJPEG(
    data: js.Any,
    index: scala.Double,
    alias: js.Any,
    compression: js.Any,
    dataAsBinaryString: java.lang.String
  ): js.Any = js.native
  def processJPG(): js.Any = js.native
  // jsPDF plugin: PNG
  def processPNG(
    imageData: js.Any,
    imageIndex: scala.Double,
    alias: java.lang.String,
    compression: js.Any,
    dataAsBinaryString: java.lang.String
  ): js.Any = js.native
  // jsPDF plugin: total_pages
  def putTotalPages(pageExpression: java.lang.String): jsPDF = js.native
  def rect(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double): jsPDF = js.native
  def rect(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double, style: java.lang.String): jsPDF = js.native
  def roundedRect(
    x: scala.Double,
    y: scala.Double,
    w: scala.Double,
    h: scala.Double,
    rx: scala.Double,
    ry: scala.Double,
    style: java.lang.String
  ): jsPDF = js.native
  def sHashCode(str: java.lang.String): js.Any = js.native
  def save(filename: java.lang.String): jsPDF = js.native
  def setDisplayMode(): jsPDF = js.native
  def setDisplayMode(zoom: java.lang.String): jsPDF = js.native
  def setDisplayMode(zoom: java.lang.String, layout: java.lang.String): jsPDF = js.native
  def setDisplayMode(zoom: java.lang.String, layout: java.lang.String, pmode: java.lang.String): jsPDF = js.native
  def setDrawColor(ch1: java.lang.String): jsPDF = js.native
  def setDrawColor(ch1: java.lang.String, ch2: scala.Double): jsPDF = js.native
  def setDrawColor(ch1: java.lang.String, ch2: scala.Double, ch3: scala.Double): jsPDF = js.native
  def setDrawColor(ch1: java.lang.String, ch2: scala.Double, ch3: scala.Double, ch4: scala.Double): jsPDF = js.native
  def setDrawColor(ch1: scala.Double): jsPDF = js.native
  def setDrawColor(ch1: scala.Double, ch2: scala.Double): jsPDF = js.native
  def setDrawColor(ch1: scala.Double, ch2: scala.Double, ch3: scala.Double): jsPDF = js.native
  def setDrawColor(ch1: scala.Double, ch2: scala.Double, ch3: scala.Double, ch4: scala.Double): jsPDF = js.native
  def setFillColor(ch1: java.lang.String): jsPDF = js.native
  def setFillColor(ch1: java.lang.String, ch2: scala.Double): jsPDF = js.native
  def setFillColor(ch1: java.lang.String, ch2: scala.Double, ch3: scala.Double): jsPDF = js.native
  def setFillColor(ch1: java.lang.String, ch2: scala.Double, ch3: scala.Double, ch4: scala.Double): jsPDF = js.native
  def setFillColor(ch1: scala.Double): jsPDF = js.native
  def setFillColor(ch1: scala.Double, ch2: scala.Double): jsPDF = js.native
  def setFillColor(ch1: scala.Double, ch2: scala.Double, ch3: scala.Double): jsPDF = js.native
  def setFillColor(ch1: scala.Double, ch2: scala.Double, ch3: scala.Double, ch4: scala.Double): jsPDF = js.native
  def setFont(): jsPDF = js.native
  def setFont(fontName: java.lang.String): jsPDF = js.native
  def setFont(fontName: java.lang.String, fontStyle: java.lang.String): jsPDF = js.native
  def setFontSize(size: scala.Double): jsPDF = js.native
  def setFontStyle(style: java.lang.String): jsPDF = js.native
  def setFontType(style: java.lang.String): jsPDF = js.native
  // jsPDF plugin: Cell
  def setHeaderFunction(func: js.Function): scala.Unit = js.native
  def setLineCap(style: java.lang.String): jsPDF = js.native
  def setLineCap(style: scala.Double): jsPDF = js.native
  def setLineJoin(style: java.lang.String): jsPDF = js.native
  def setLineJoin(style: scala.Double): jsPDF = js.native
  def setLineWidth(width: scala.Double): jsPDF = js.native
  def setPage(n: scala.Double): jsPDF = js.native
  def setProperties(properties: js.Any): jsPDF = js.native
  def setTableHeaderRow(config: js.Array[_]): scala.Unit = js.native
  def setTextColor(): jsPDF = js.native
  def setTextColor(r: scala.Double): jsPDF = js.native
  def setTextColor(r: scala.Double, g: scala.Double): jsPDF = js.native
  def setTextColor(r: scala.Double, g: scala.Double, b: scala.Double): jsPDF = js.native
  def splitTextToSize(text: java.lang.String, maxlen: scala.Double): js.Any = js.native
  def splitTextToSize(text: java.lang.String, maxlen: scala.Double, options: js.Any): js.Any = js.native
  def supportsArrayBuffer(): scala.Boolean = js.native
  def table(
    x: scala.Double,
    y: scala.Double,
    data: js.Any,
    headers: js.Array[java.lang.String],
    config: js.Any
  ): jsPDF = js.native
  def text(text: js.Any, x: js.Any, y: js.Any): jsPDF = js.native
  def text(text: js.Any, x: js.Any, y: js.Any, flags: js.Any): jsPDF = js.native
  def text(text: js.Any, x: js.Any, y: js.Any, flags: js.Any, angle: js.Any): jsPDF = js.native
  def text(text: js.Any, x: js.Any, y: js.Any, flags: js.Any, angle: js.Any, align: js.Any): jsPDF = js.native
  def textWithLink(text: java.lang.String, x: scala.Double, y: scala.Double, options: js.Any): scala.Double = js.native
  def triangle(
    x1: scala.Double,
    y1: scala.Double,
    x2: scala.Double,
    y2: scala.Double,
    x3: scala.Double,
    y3: scala.Double,
    style: java.lang.String
  ): jsPDF = js.native
}

