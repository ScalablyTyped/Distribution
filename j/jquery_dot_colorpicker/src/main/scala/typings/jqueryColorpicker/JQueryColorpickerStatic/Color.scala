package typings.jqueryColorpicker.JQueryColorpickerStatic

import typings.jqueryColorpicker.anon.A
import typings.jqueryColorpicker.anon.Cmyk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Color extends js.Object {
  var set: Boolean = js.native
  def copy(): Color = js.native
  def distance(color: Color): Double = js.native
  def equals(color: Color): Boolean = js.native
  def getAlpha(): Double = js.native
  def getCMYK(): CMYK = js.native
  def getChannels(): A = js.native
  def getHSL(): HSL = js.native
  def getHSV(): HSV = js.native
  def getLAB(): LAB = js.native
  def getRGB(): RGB = js.native
  def getSpaces(): Cmyk = js.native
  def limit(steps: Double): Unit = js.native
  def normalize(): Color = js.native
  def setAlpha(a: Double): Color = js.native
  def setCMYK(c: Double, m: Double, y: Double, k: Double): Color = js.native
  def setHSL(h: Double, s: Double, l: Double): Color = js.native
  def setHSV(h: Double, s: Double, v: Double): Color = js.native
  def setLAB(l: Double, a: Double, b: Double): Color = js.native
  def setRGB(r: Double, g: Double, b: Double): Color = js.native
  def setSpaces(new_spaces: js.Any): Color = js.native
  def toCSS(): String = js.native
  def toHEX(): String = js.native
}

object Color {
  @scala.inline
  def apply(
    copy: () => Color,
    distance: Color => Double,
    equals: Color => Boolean,
    getAlpha: () => Double,
    getCMYK: () => CMYK,
    getChannels: () => A,
    getHSL: () => HSL,
    getHSV: () => HSV,
    getLAB: () => LAB,
    getRGB: () => RGB,
    getSpaces: () => Cmyk,
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
  @scala.inline
  implicit class ColorOps[Self <: Color] (val x: Self) extends AnyVal {
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
    def setCopy(value: () => Color): Self = this.set("copy", js.Any.fromFunction0(value))
    @scala.inline
    def setDistance(value: Color => Double): Self = this.set("distance", js.Any.fromFunction1(value))
    @scala.inline
    def setEquals(value: Color => Boolean): Self = this.set("equals", js.Any.fromFunction1(value))
    @scala.inline
    def setGetAlpha(value: () => Double): Self = this.set("getAlpha", js.Any.fromFunction0(value))
    @scala.inline
    def setGetCMYK(value: () => CMYK): Self = this.set("getCMYK", js.Any.fromFunction0(value))
    @scala.inline
    def setGetChannels(value: () => A): Self = this.set("getChannels", js.Any.fromFunction0(value))
    @scala.inline
    def setGetHSL(value: () => HSL): Self = this.set("getHSL", js.Any.fromFunction0(value))
    @scala.inline
    def setGetHSV(value: () => HSV): Self = this.set("getHSV", js.Any.fromFunction0(value))
    @scala.inline
    def setGetLAB(value: () => LAB): Self = this.set("getLAB", js.Any.fromFunction0(value))
    @scala.inline
    def setGetRGB(value: () => RGB): Self = this.set("getRGB", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSpaces(value: () => Cmyk): Self = this.set("getSpaces", js.Any.fromFunction0(value))
    @scala.inline
    def setLimit(value: Double => Unit): Self = this.set("limit", js.Any.fromFunction1(value))
    @scala.inline
    def setNormalize(value: () => Color): Self = this.set("normalize", js.Any.fromFunction0(value))
    @scala.inline
    def setSet(value: Boolean): Self = this.set("set", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetAlpha(value: Double => Color): Self = this.set("setAlpha", js.Any.fromFunction1(value))
    @scala.inline
    def setSetCMYK(value: (Double, Double, Double, Double) => Color): Self = this.set("setCMYK", js.Any.fromFunction4(value))
    @scala.inline
    def setSetHSL(value: (Double, Double, Double) => Color): Self = this.set("setHSL", js.Any.fromFunction3(value))
    @scala.inline
    def setSetHSV(value: (Double, Double, Double) => Color): Self = this.set("setHSV", js.Any.fromFunction3(value))
    @scala.inline
    def setSetLAB(value: (Double, Double, Double) => Color): Self = this.set("setLAB", js.Any.fromFunction3(value))
    @scala.inline
    def setSetRGB(value: (Double, Double, Double) => Color): Self = this.set("setRGB", js.Any.fromFunction3(value))
    @scala.inline
    def setSetSpaces(value: js.Any => Color): Self = this.set("setSpaces", js.Any.fromFunction1(value))
    @scala.inline
    def setToCSS(value: () => String): Self = this.set("toCSS", js.Any.fromFunction0(value))
    @scala.inline
    def setToHEX(value: () => String): Self = this.set("toHEX", js.Any.fromFunction0(value))
  }
  
}

