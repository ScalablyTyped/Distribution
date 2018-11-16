package typings
package knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * @see https://developer.knuddels.de/docs/classes/ExternalServerAccess.html
	 */
@JSGlobal("ExternalServerAccess")
@js.native
class ExternalServerAccess () extends js.Object {
  /**
  		 * @see https://developer.knuddels.de/docs/classes/ExternalServerAccess.html#method_callURL
  		 */
  def callURL(urlString: java.lang.String): scala.Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/ExternalServerAccess.html#method_callURL
  		 */
  def callURL(urlString: java.lang.String, parameters: knuddelsDashUserappsDashApiLib.Anon_DataMethod): scala.Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/ExternalServerAccess.html#method_canAccessURL
  		 */
  def canAccessURL(urlString: java.lang.String): scala.Boolean = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/ExternalServerAccess.html#method_getAllAccessibleDomains
  		 */
  def getAllAccessibleDomains(): js.Array[Domain] = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/ExternalServerAccess.html#method_getURL
  		 */
  def getURL(urlString: java.lang.String): scala.Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/ExternalServerAccess.html#method_getURL
  		 */
  def getURL(urlString: java.lang.String, parameters: knuddelsDashUserappsDashApiLib.Anon_OnFailure): scala.Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/ExternalServerAccess.html#method_postURL
  		 */
  def postURL(urlString: java.lang.String): scala.Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/ExternalServerAccess.html#method_postURL
  		 */
  def postURL(urlString: java.lang.String, parameters: knuddelsDashUserappsDashApiLib.Anon_Data): scala.Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/ExternalServerAccess.html#method_touchURL
  		 */
  def touchURL(urlString: java.lang.String): scala.Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/ExternalServerAccess.html#method_touchURL
  		 */
  def touchURL(urlString: java.lang.String, parameters: knuddelsDashUserappsDashApiLib.Anon_OnFailure): scala.Unit = js.native
}

