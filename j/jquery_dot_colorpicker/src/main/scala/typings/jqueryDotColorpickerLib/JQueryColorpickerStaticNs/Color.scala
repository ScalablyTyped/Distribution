package typings
package jqueryDotColorpickerLib.JQueryColorpickerStaticNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Color extends js.Object {
  var set: scala.Boolean
  def copy(): Color
  def distance(color: Color): scala.Double
  def equals(color: Color): scala.Boolean
  def getAlpha(): scala.Double
  def getCMYK(): CMYK
  def getChannels(): jqueryDotColorpickerLib.Anon_S
  def getHSL(): HSL
  def getHSV(): HSV
  def getLAB(): LAB
  def getRGB(): RGB
  def getSpaces(): jqueryDotColorpickerLib.Anon_Rgb
  def limit(steps: scala.Double): scala.Unit
  def normalize(): Color
  def setAlpha(a: scala.Double): Color
  def setCMYK(c: scala.Double, m: scala.Double, y: scala.Double, k: scala.Double): Color
  def setHSL(h: scala.Double, s: scala.Double, l: scala.Double): Color
  def setHSV(h: scala.Double, s: scala.Double, v: scala.Double): Color
  def setLAB(l: scala.Double, a: scala.Double, b: scala.Double): Color
  def setRGB(r: scala.Double, g: scala.Double, b: scala.Double): Color
  def setSpaces(new_spaces: js.Any): Color
  def toCSS(): java.lang.String
  def toHEX(): java.lang.String
}

