package typings.knuddelsUserappBackendApi.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see https://developer.knuddels.de/docs/classes/KnuddelAmount.html
  */
@JSGlobal("KnuddelAmount")
@js.native
open class KnuddelAmount protected () extends StObject {
  /**
    * @see https://developer.knuddels.de/docs/classes/KnuddelAmount.html#method_KnuddelAmount
    */
  def this(knuddel: Double) = this()
  
  /**
    * @see https://developer.knuddels.de/docs/classes/KnuddelAmount.html#method_asNumber
    */
  def asNumber(): Double = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/KnuddelAmount.html#method_getKnuddelCents
    */
  def getKnuddelCents(): Double = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/KnuddelAmount.html#method_isNegative
    */
  def isNegative(): Boolean = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/KnuddelAmount.html#method_negate
    */
  def negate(): KnuddelAmount = js.native
}
object KnuddelAmount {
  
  @JSGlobal("KnuddelAmount")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/KnuddelAmount.html#method_fromCents
    */
  /* static member */
  inline def fromCents(knuddel: Double): KnuddelAmount = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCents")(knuddel.asInstanceOf[js.Any]).asInstanceOf[KnuddelAmount]
  
  /**
    * @see https://developer.knuddels.de/docs/classes/KnuddelAmount.html#method_fromKnuddel
    */
  /* static member */
  inline def fromKnuddel(knuddel: Double): KnuddelAmount = ^.asInstanceOf[js.Dynamic].applyDynamic("fromKnuddel")(knuddel.asInstanceOf[js.Any]).asInstanceOf[KnuddelAmount]
}
