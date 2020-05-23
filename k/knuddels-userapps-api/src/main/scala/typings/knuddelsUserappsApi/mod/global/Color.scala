package typings.knuddelsUserappsApi.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see https://developer.knuddels.de/docs/classes/Color.html
  */
@JSGlobal("Color")
@js.native
class Color () extends js.Object {
  /**
    * @see https://developer.knuddels.de/docs/classes/Color.html#method_asNumber
    */
  def asNumber(): Double = js.native
  /**
    * @see https://developer.knuddels.de/docs/classes/Color.html#method_getAlpha
    */
  def getAlpha(): Double = js.native
  /**
    * @see https://developer.knuddels.de/docs/classes/Color.html#method_getBlue
    */
  def getBlue(): Double = js.native
  /**
    * @see https://developer.knuddels.de/docs/classes/Color.html#method_getGreen
    */
  def getGreen(): Double = js.native
  /**
    * @see https://developer.knuddels.de/docs/classes/Color.html#method_getRed
    */
  def getRed(): Double = js.native
  /**
    * @see https://developer.knuddels.de/docs/classes/Color.html#method_toKCode
    */
  def toKCode(): java.lang.String = js.native
}

/* static members */
@JSGlobal("Color")
@js.native
object Color extends js.Object {
  /**
    * @see https://developer.knuddels.de/docs/classes/Color.html#method_fromNumber
    */
  def fromNumber(value: Double): Color = js.native
  /**
    * @see https://developer.knuddels.de/docs/classes/Color.html#method_fromRGB
    */
  def fromRGB(red: Double, green: Double, blue: Double): Color = js.native
  /**
    * @see https://developer.knuddels.de/docs/classes/Color.html#method_fromRGBA
    */
  def fromRGBA(red: Double, green: Double, blue: Double, alpha: Double): Color = js.native
}

