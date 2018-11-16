package typings
package knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * @see https://developer.knuddels.de/docs/classes/String.html
	 */
@js.native
trait String extends js.Object {
  /**
  		 * @see https://developer.knuddels.de/docs/classes/String.html#method_capitalize
  		 * @since AppServer 92695
  		 */
  def capitalize(): java.lang.String = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/String.html#method_contains
  		 */
  def contains(needle: java.lang.String): scala.Boolean = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/String.html#method_endsWith
  		 */
  def endsWith(suffix: java.lang.String): scala.Boolean = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/String.html#method_escapeKCode
  		 */
  def escapeKCode(): java.lang.String = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/String.html#method_getPixelWidth
  		 */
  def getPixelWidth(fontSize: scala.Double, isBold: scala.Boolean): scala.Double = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/String.html#method_hasOnlyAlphanumericalAndWhitespaceCharacters
  		 * @since AppServer 82271
  		 */
  def hasOnlyAlphanumericalAndWhitespaceCharacters(): scala.Boolean = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/String.html#method_hasOnlyDigits
  		 * @since AppServer 82271
  		 */
  def hasOnlyDigits(): scala.Boolean = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/String.html#method_hasOnlyNicknameCharacters
  		 * @since AppServer 82271
  		 */
  def hasOnlyNicknameCharacters(): scala.Boolean = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/String.html#method_isEmpty
  		 * @since AppServer 92695
  		 */
  def isEmpty(): scala.Boolean = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/String.html#method_isOk
  		 * @since ChatServer 82262, AppServer 82262
  		 */
  def isOk(): scala.Boolean = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/String.html#method_limitString
  		 */
  def limitString(fontSize: scala.Double, isBold: scala.Boolean, maxPixelWidth: scala.Double): java.lang.String = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/String.html#method_limitString
  		 */
  def limitString(
    fontSize: scala.Double,
    isBold: scala.Boolean,
    maxPixelWidth: scala.Double,
    abbreviationMarker: java.lang.String
  ): java.lang.String = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/String.html#method_minimalConversionCost
  		 * @since AppServer 82271
  		 */
  def minimalConversionCost(otherString: java.lang.String): scala.Double = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/String.html#method_replaceAll
  		 */
  def replaceAll(search: java.lang.String, replacement: java.lang.String): java.lang.String = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/String.html#method_replaceAll
  		 */
  def replaceAll(search: stdLib.RegExp, replacement: java.lang.String): java.lang.String = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/String.html#method_startsWith
  		 */
  def startsWith(prefix: java.lang.String): scala.Boolean = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/String.html#method_stripKCode
  		 */
  def stripKCode(): java.lang.String = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/String.html#method_toCamelCase
  		 * @since AppServer 92695
  		 */
  def toCamelCase(): java.lang.String = js.native
}

