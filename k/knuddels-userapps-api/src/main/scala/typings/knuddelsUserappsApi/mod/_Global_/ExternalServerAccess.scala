package typings.knuddelsUserappsApi.mod._Global_

import typings.knuddelsUserappsApi.AnonDataExternalServerResponse
import typings.knuddelsUserappsApi.AnonDataExternalServerResponseGET
import typings.knuddelsUserappsApi.AnonExternalServerResponse
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
  def callURL(urlString: java.lang.String): Unit = js.native
  def callURL(urlString: java.lang.String, parameters: AnonDataExternalServerResponseGET): Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/ExternalServerAccess.html#method_canAccessURL
  		 */
  def canAccessURL(urlString: java.lang.String): Boolean = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/ExternalServerAccess.html#method_getAllAccessibleDomains
  		 */
  def getAllAccessibleDomains(): js.Array[Domain] = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/ExternalServerAccess.html#method_getURL
  		 */
  def getURL(urlString: java.lang.String): Unit = js.native
  def getURL(urlString: java.lang.String, parameters: AnonExternalServerResponse): Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/ExternalServerAccess.html#method_postURL
  		 */
  def postURL(urlString: java.lang.String): Unit = js.native
  def postURL(urlString: java.lang.String, parameters: AnonDataExternalServerResponse): Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/ExternalServerAccess.html#method_touchURL
  		 */
  def touchURL(urlString: java.lang.String): Unit = js.native
  def touchURL(urlString: java.lang.String, parameters: AnonExternalServerResponse): Unit = js.native
}

