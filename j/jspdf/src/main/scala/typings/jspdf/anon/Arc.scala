package typings.jspdf.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Arc extends js.Object {
  var lastBreak: Double = js.native
  var pageBreaks: js.Array[_] = js.native
  var pageWrapX: Double = js.native
  var pageWrapXEnabled: Boolean = js.native
  var pageWrapY: Double = js.native
  var pageWrapYEnabled: Boolean = js.native
  def arc(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double, anticlockwise: js.Any): Unit = js.native
  def beginPath(): Unit = js.native
  def bezierCurveTo(x1: Double, y1: Double, x2: Double, y2: Double, x: Double, y: Double): Unit = js.native
  def clearRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
  def closePath(): Unit = js.native
  def drawImage(img: String, x: Double, y: Double, w: Double, h: Double): Unit = js.native
  def drawImage(img: String, x: Double, y: Double, w: Double, h: Double, x2: Double): Unit = js.native
  def drawImage(img: String, x: Double, y: Double, w: Double, h: Double, x2: Double, y2: Double): Unit = js.native
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
  def lineTo(x: Double, y: Double): Unit = js.native
  def measureText(text: String): Width = js.native
  def moveTo(x: Double, y: Double): Unit = js.native
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

