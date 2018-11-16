package typings
package knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global

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
  def this(knuddel: scala.Double) = this()
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelAmount.html#method_asNumber
  		 */
  def asNumber(): scala.Double = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelAmount.html#method_getKnuddelCents
  		 */
  def getKnuddelCents(): scala.Double = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelAmount.html#method_isNegative
  		 */
  def isNegative(): scala.Boolean = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelAmount.html#method_negate
  		 */
  def negate(): KnuddelAmount = js.native
}

/**
	 * @see https://developer.knuddels.de/docs/classes/KnuddelAmount.html
	 */
@JSGlobal("KnuddelAmount")
@js.native
object KnuddelAmount extends js.Object {
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelAmount.html#method_fromCents
  		 */
  def fromCents(knuddel: scala.Double): knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.KnuddelAmount = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/KnuddelAmount.html#method_fromKnuddel
  		 */
  def fromKnuddel(knuddel: scala.Double): knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.KnuddelAmount = js.native
}

