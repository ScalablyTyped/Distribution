package typings.jspdf.mod

import typings.jspdf.jspdfStrings.`source-over`
import typings.jspdf.jspdfStrings.alphabetic
import typings.jspdf.jspdfStrings.bevel
import typings.jspdf.jspdfStrings.bottom
import typings.jspdf.jspdfStrings.butt
import typings.jspdf.jspdfStrings.center
import typings.jspdf.jspdfStrings.end
import typings.jspdf.jspdfStrings.hanging
import typings.jspdf.jspdfStrings.high
import typings.jspdf.jspdfStrings.ideographic
import typings.jspdf.jspdfStrings.left
import typings.jspdf.jspdfStrings.low
import typings.jspdf.jspdfStrings.middle
import typings.jspdf.jspdfStrings.miter
import typings.jspdf.jspdfStrings.right
import typings.jspdf.jspdfStrings.round
import typings.jspdf.jspdfStrings.square
import typings.jspdf.jspdfStrings.start
import typings.jspdf.jspdfStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Context2d extends StObject {
  
  def arc(
    x: Double,
    y: Double,
    radius: Double,
    startAngle: Double,
    endAngle: Double,
    counterclockwise: Boolean
  ): Unit = js.native
  
  def arcTo(x1: Double, y1: Double, x2: Double, y2: Double, radius: Double): Unit = js.native
  
  var autoPaging: Boolean = js.native
  
  def beginPath(): Unit = js.native
  
  def bezierCurveTo(cp1x: Double, cp1y: Double, cp2x: Double, cp2y: Double, x: Double, y: Double): Unit = js.native
  
  def clearRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
  
  def clip(): jsPDF = js.native
  
  def clipEvenOdd(): jsPDF = js.native
  
  def closePath(): Unit = js.native
  
  def createLinearGradient(x0: Double, y0: Double, x1: Double, y1: Double): Gradient = js.native
  
  def createPattern(): Gradient = js.native
  
  def createRadialGradient(): Gradient = js.native
  
  def drawImage(
    img: String,
    sx: Double,
    sy: Double,
    swidth: Double,
    sheight: Double,
    x: Double,
    y: Double,
    width: Double,
    height: Double
  ): Unit = js.native
  def drawImage(img: String, x: Double, y: Double, width: Double, height: Double): Unit = js.native
  
  def fill(): Unit = js.native
  
  def fillRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
  
  var fillStyle: String | Gradient = js.native
  
  def fillText(text: String, x: Double, y: Double): Unit = js.native
  def fillText(text: String, x: Double, y: Double, maxWidth: Double): Unit = js.native
  
  var filter: String = js.native
  
  var font: String = js.native
  
  var globalAlpha: Double = js.native
  
  var globalCompositeOperation: `source-over` = js.native
  
  var ignoreClearRect: Boolean = js.native
  
  var imageSmoothingEnabled: Boolean = js.native
  
  var imageSmoothingQuality: low | high = js.native
  
  var lastBreak: Double = js.native
  
  var lineCap: butt | round | square = js.native
  
  var lineDashOffset: Double = js.native
  
  var lineJoin: bevel | round | miter = js.native
  
  def lineTo(x: Double, y: Double): Unit = js.native
  
  var lineWidth: Double = js.native
  
  var margin: js.Array[Double] = js.native
  
  def measureText(text: String): Double = js.native
  
  var miterLimit: Double = js.native
  
  def moveTo(x: Double, y: Double): Unit = js.native
  
  var pageBreaks: js.Array[Double] = js.native
  
  var pageWrapXEnabled: Boolean = js.native
  
  var pageWrapYEnabled: Boolean = js.native
  
  var posX: Double = js.native
  
  var posY: Double = js.native
  
  def quadraticCurveTo(cpx: Double, cpy: Double, x: Double, y: Double): Unit = js.native
  
  def rect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
  
  def restore(): Unit = js.native
  
  def rotate(angle: Double): Unit = js.native
  
  def save(): Unit = js.native
  
  def scale(scalewidth: Double, scaleheight: Double): Unit = js.native
  
  def setTransform(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double): Unit = js.native
  
  var shadowBlur: Double = js.native
  
  var shadowColor: String = js.native
  
  var shadowOffsetX: Double = js.native
  
  var shadowOffsetY: Double = js.native
  
  def stroke(): Unit = js.native
  
  def strokeRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
  
  var strokeStyle: String | Gradient = js.native
  
  def strokeText(text: String, x: Double, y: Double): Unit = js.native
  def strokeText(text: String, x: Double, y: Double, maxWidth: Double): Unit = js.native
  
  var textAlign: right | end | center | left | start = js.native
  
  var textBaseline: alphabetic | bottom | top | hanging | middle | ideographic = js.native
  
  def transform(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double): Unit = js.native
  
  def translate(x: Double, y: Double): Unit = js.native
}
