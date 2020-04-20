package typings.jqueryColorpicker.JQueryColorpickerStatic

import typings.jqueryColorpicker.AnonA
import typings.jqueryColorpicker.AnonCmyk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends js.Object {
  var set: Boolean
  def copy(): Color
  def distance(color: Color): Double
  def equals(color: Color): Boolean
  def getAlpha(): Double
  def getCMYK(): CMYK
  def getChannels(): AnonA
  def getHSL(): HSL
  def getHSV(): HSV
  def getLAB(): LAB
  def getRGB(): RGB
  def getSpaces(): AnonCmyk
  def limit(steps: Double): Unit
  def normalize(): Color
  def setAlpha(a: Double): Color
  def setCMYK(c: Double, m: Double, y: Double, k: Double): Color
  def setHSL(h: Double, s: Double, l: Double): Color
  def setHSV(h: Double, s: Double, v: Double): Color
  def setLAB(l: Double, a: Double, b: Double): Color
  def setRGB(r: Double, g: Double, b: Double): Color
  def setSpaces(new_spaces: js.Any): Color
  def toCSS(): String
  def toHEX(): String
}

object Color {
  @scala.inline
  def apply(
    copy: () => Color,
    distance: Color => Double,
    equals: Color => Boolean,
    getAlpha: () => Double,
    getCMYK: () => CMYK,
    getChannels: () => AnonA,
    getHSL: () => HSL,
    getHSV: () => HSV,
    getLAB: () => LAB,
    getRGB: () => RGB,
    getSpaces: () => AnonCmyk,
    limit: Double => Unit,
    normalize: () => Color,
    set: Boolean,
    setAlpha: Double => Color,
    setCMYK: (Double, Double, Double, Double) => Color,
    setHSL: (Double, Double, Double) => Color,
    setHSV: (Double, Double, Double) => Color,
    setLAB: (Double, Double, Double) => Color,
    setRGB: (Double, Double, Double) => Color,
    setSpaces: js.Any => Color,
    toCSS: () => String,
    toHEX: () => String
  ): Color = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction0(copy), distance = js.Any.fromFunction1(distance), equals = js.Any.fromFunction1(equals), getAlpha = js.Any.fromFunction0(getAlpha), getCMYK = js.Any.fromFunction0(getCMYK), getChannels = js.Any.fromFunction0(getChannels), getHSL = js.Any.fromFunction0(getHSL), getHSV = js.Any.fromFunction0(getHSV), getLAB = js.Any.fromFunction0(getLAB), getRGB = js.Any.fromFunction0(getRGB), getSpaces = js.Any.fromFunction0(getSpaces), limit = js.Any.fromFunction1(limit), normalize = js.Any.fromFunction0(normalize), set = set.asInstanceOf[js.Any], setAlpha = js.Any.fromFunction1(setAlpha), setCMYK = js.Any.fromFunction4(setCMYK), setHSL = js.Any.fromFunction3(setHSL), setHSV = js.Any.fromFunction3(setHSV), setLAB = js.Any.fromFunction3(setLAB), setRGB = js.Any.fromFunction3(setRGB), setSpaces = js.Any.fromFunction1(setSpaces), toCSS = js.Any.fromFunction0(toCSS), toHEX = js.Any.fromFunction0(toHEX))
    __obj.asInstanceOf[Color]
  }
}

