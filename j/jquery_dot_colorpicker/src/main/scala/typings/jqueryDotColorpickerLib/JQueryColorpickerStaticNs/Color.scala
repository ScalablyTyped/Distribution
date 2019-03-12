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
  def getChannels(): jqueryDotColorpickerLib.Anon_AB
  def getHSL(): HSL
  def getHSV(): HSV
  def getLAB(): LAB
  def getRGB(): RGB
  def getSpaces(): jqueryDotColorpickerLib.Anon_Cmyk
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

object Color {
  @scala.inline
  def apply(
    copy: () => Color,
    distance: Color => scala.Double,
    equals: Color => scala.Boolean,
    getAlpha: () => scala.Double,
    getCMYK: () => CMYK,
    getChannels: () => jqueryDotColorpickerLib.Anon_AB,
    getHSL: () => HSL,
    getHSV: () => HSV,
    getLAB: () => LAB,
    getRGB: () => RGB,
    getSpaces: () => jqueryDotColorpickerLib.Anon_Cmyk,
    limit: scala.Double => scala.Unit,
    normalize: () => Color,
    set: scala.Boolean,
    setAlpha: scala.Double => Color,
    setCMYK: (scala.Double, scala.Double, scala.Double, scala.Double) => Color,
    setHSL: (scala.Double, scala.Double, scala.Double) => Color,
    setHSV: (scala.Double, scala.Double, scala.Double) => Color,
    setLAB: (scala.Double, scala.Double, scala.Double) => Color,
    setRGB: (scala.Double, scala.Double, scala.Double) => Color,
    setSpaces: js.Any => Color,
    toCSS: () => java.lang.String,
    toHEX: () => java.lang.String
  ): Color = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction0(copy), distance = js.Any.fromFunction1(distance), equals = js.Any.fromFunction1(equals), getAlpha = js.Any.fromFunction0(getAlpha), getCMYK = js.Any.fromFunction0(getCMYK), getChannels = js.Any.fromFunction0(getChannels), getHSL = js.Any.fromFunction0(getHSL), getHSV = js.Any.fromFunction0(getHSV), getLAB = js.Any.fromFunction0(getLAB), getRGB = js.Any.fromFunction0(getRGB), getSpaces = js.Any.fromFunction0(getSpaces), limit = js.Any.fromFunction1(limit), normalize = js.Any.fromFunction0(normalize), set = set, setAlpha = js.Any.fromFunction1(setAlpha), setCMYK = js.Any.fromFunction4(setCMYK), setHSL = js.Any.fromFunction3(setHSL), setHSV = js.Any.fromFunction3(setHSV), setLAB = js.Any.fromFunction3(setLAB), setRGB = js.Any.fromFunction3(setRGB), setSpaces = js.Any.fromFunction1(setSpaces), toCSS = js.Any.fromFunction0(toCSS), toHEX = js.Any.fromFunction0(toHEX))
  
    __obj.asInstanceOf[Color]
  }
}

