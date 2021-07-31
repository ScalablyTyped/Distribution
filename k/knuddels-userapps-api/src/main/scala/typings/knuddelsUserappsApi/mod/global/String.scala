package typings.knuddelsUserappsApi.mod.global

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * @see https://developer.knuddels.de/docs/classes/String.html
	 */
@js.native
trait String extends StObject {
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/String.html#method_capitalize
  		 * @since AppServer 92695
  		 */
  def capitalize(): java.lang.String = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/String.html#method_contains
  		 */
  def contains(needle: java.lang.String): Boolean = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/String.html#method_endsWith
  		 */
  def endsWith(suffix: java.lang.String): Boolean = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/String.html#method_escapeKCode
  		 */
  def escapeKCode(): java.lang.String = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/String.html#method_getPixelWidth
  		 */
  def getPixelWidth(fontSize: Double, isBold: Boolean): Double = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/String.html#method_hasOnlyAlphanumericalAndWhitespaceCharacters
  		 * @since AppServer 82271
  		 */
  def hasOnlyAlphanumericalAndWhitespaceCharacters(): Boolean = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/String.html#method_hasOnlyDigits
  		 * @since AppServer 82271
  		 */
  def hasOnlyDigits(): Boolean = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/String.html#method_hasOnlyNicknameCharacters
  		 * @since AppServer 82271
  		 */
  def hasOnlyNicknameCharacters(): Boolean = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/String.html#method_isEmpty
  		 * @since AppServer 92695
  		 */
  def isEmpty(): Boolean = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/String.html#method_isOk
  		 * @since ChatServer 82262, AppServer 82262
  		 */
  def isOk(): Boolean = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/String.html#method_limitString
  		 */
  def limitString(fontSize: Double, isBold: Boolean, maxPixelWidth: Double): java.lang.String = js.native
  def limitString(fontSize: Double, isBold: Boolean, maxPixelWidth: Double, abbreviationMarker: java.lang.String): java.lang.String = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/String.html#method_minimalConversionCost
  		 * @since AppServer 82271
  		 */
  def minimalConversionCost(otherString: java.lang.String): Double = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/String.html#method_replaceAll
  		 */
  def replaceAll(regexp: java.lang.String, replacement: java.lang.String): java.lang.String = js.native
  def replaceAll(regexp: RegExp, replacement: java.lang.String): java.lang.String = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/String.html#method_startsWith
  		 */
  def startsWith(prefix: java.lang.String): Boolean = js.native
  
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
