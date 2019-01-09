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
  def callURL(
    urlString: java.lang.String,
    parameters: knuddelsDashUserappsDashApiLib.Anon_DataExternalServerResponseGET
  ): scala.Unit = js.native
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
  def getURL(
    urlString: java.lang.String,
    parameters: knuddelsDashUserappsDashApiLib.Anon_ExternalServerResponse
  ): scala.Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/ExternalServerAccess.html#method_postURL
  		 */
  def postURL(urlString: java.lang.String): scala.Unit = js.native
  def postURL(
    urlString: java.lang.String,
    parameters: knuddelsDashUserappsDashApiLib.Anon_DataExternalServerResponse
  ): scala.Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/ExternalServerAccess.html#method_touchURL
  		 */
  def touchURL(urlString: java.lang.String): scala.Unit = js.native
  def touchURL(
    urlString: java.lang.String,
    parameters: knuddelsDashUserappsDashApiLib.Anon_ExternalServerResponse
  ): scala.Unit = js.native
}

