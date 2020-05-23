package typings.knuddelsUserappsApi.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see https://developer.knuddels.de/docs/classes/KnuddelAmount.html
  */
@JSGlobal("KnuddelAmount")
@js.native
class KnuddelAmount protected () extends js.Object {
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

/* static members */
@JSGlobal("KnuddelAmount")
@js.native
object KnuddelAmount extends js.Object {
  /**
    * @see https://developer.knuddels.de/docs/classes/KnuddelAmount.html#method_fromCents
    */
  def fromCents(knuddel: Double): KnuddelAmount = js.native
  /**
    * @see https://developer.knuddels.de/docs/classes/KnuddelAmount.html#method_fromKnuddel
    */
  def fromKnuddel(knuddel: Double): KnuddelAmount = js.native
}

