package typings.knuddelsUserappsApi.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see https://developer.knuddels.de/docs/classes/Color.html
  */
@JSGlobal("Color")
@js.native
open class Color () extends StObject {
  
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
object Color {
  
  @JSGlobal("Color")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/Color.html#method_fromNumber
    */
  /* static member */
  inline def fromNumber(value: Double): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNumber")(value.asInstanceOf[js.Any]).asInstanceOf[Color]
  
  /**
    * @see https://developer.knuddels.de/docs/classes/Color.html#method_fromRGB
    */
  /* static member */
  inline def fromRGB(red: Double, green: Double, blue: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRGB")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any])).asInstanceOf[Color]
  
  /**
    * @see https://developer.knuddels.de/docs/classes/Color.html#method_fromRGBA
    */
  /* static member */
  inline def fromRGBA(red: Double, green: Double, blue: Double, alpha: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRGBA")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Color]
}
