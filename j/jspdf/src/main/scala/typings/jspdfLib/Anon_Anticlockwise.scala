package typings
package jspdfLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Anticlockwise extends js.Object {
  var lastBreak: scala.Double = js.native
  var pageBreaks: js.Array[_] = js.native
  var pageWrapX: scala.Double = js.native
  var pageWrapXEnabled: scala.Boolean = js.native
  var pageWrapY: scala.Double = js.native
  var pageWrapYEnabled: scala.Boolean = js.native
  def arc(
    x: scala.Double,
    y: scala.Double,
    radius: scala.Double,
    startAngle: scala.Double,
    endAngle: scala.Double,
    anticlockwise: js.Any
  ): scala.Unit = js.native
  def beginPath(): scala.Unit = js.native
  def bezierCurveTo(
    x1: scala.Double,
    y1: scala.Double,
    x2: scala.Double,
    y2: scala.Double,
    x: scala.Double,
    y: scala.Double
  ): scala.Unit = js.native
  def clearRect(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double): scala.Unit = js.native
  def closePath(): scala.Unit = js.native
  def drawImage(img: java.lang.String, x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double): scala.Unit = js.native
  def drawImage(
    img: java.lang.String,
    x: scala.Double,
    y: scala.Double,
    w: scala.Double,
    h: scala.Double,
    x2: scala.Double
  ): scala.Unit = js.native
  def drawImage(
    img: java.lang.String,
    x: scala.Double,
    y: scala.Double,
    w: scala.Double,
    h: scala.Double,
    x2: scala.Double,
    y2: scala.Double
  ): scala.Unit = js.native
  def drawImage(
    img: java.lang.String,
    x: scala.Double,
    y: scala.Double,
    w: scala.Double,
    h: scala.Double,
    x2: scala.Double,
    y2: scala.Double,
    w2: scala.Double
  ): scala.Unit = js.native
  def drawImage(
    img: java.lang.String,
    x: scala.Double,
    y: scala.Double,
    w: scala.Double,
    h: scala.Double,
    x2: scala.Double,
    y2: scala.Double,
    w2: scala.Double,
    h2: scala.Double
  ): scala.Unit = js.native
  def f2(number: scala.Double): scala.Double = js.native
  def fill(): scala.Unit = js.native
  def fillRect(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double): scala.Unit = js.native
  def fillText(text: java.lang.String, x: scala.Double, y: scala.Double, maxWidth: scala.Double): scala.Unit = js.native
  def fillText(text: js.Array[java.lang.String], x: scala.Double, y: scala.Double, maxWidth: scala.Double): scala.Unit = js.native
  def getTextBaseline(): java.lang.String = js.native
  def lineTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def measureText(text: java.lang.String): scala.Double = js.native
  def moveTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def quadraticCurveTo(x1: scala.Double, y1: scala.Double, x: scala.Double, y: scala.Double): scala.Unit = js.native
  def restore(): scala.Unit = js.native
  def save(): scala.Unit = js.native
  def setFillStyle(style: java.lang.String): scala.Unit = js.native
  def setFont(font: java.lang.String): scala.Unit = js.native
  def setLineCap(style: java.lang.String): scala.Unit = js.native
  def setLineJoin(style: java.lang.String): scala.Unit = js.native
  def setLineWidth(width: scala.Double): scala.Unit = js.native
  def setStrokeStyle(style: java.lang.String): scala.Unit = js.native
  def setTextBaseline(baseline: java.lang.String): scala.Unit = js.native
  def stroke(): scala.Unit = js.native
  def strokeRect(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double): scala.Unit = js.native
  def strokeText(text: java.lang.String, x: scala.Double, y: scala.Double, maxWidth: scala.Double): scala.Unit = js.native
  def strokeText(text: js.Array[java.lang.String], x: scala.Double, y: scala.Double, maxWidth: scala.Double): scala.Unit = js.native
  def translate(x: scala.Double, y: scala.Double): scala.Unit = js.native
}

