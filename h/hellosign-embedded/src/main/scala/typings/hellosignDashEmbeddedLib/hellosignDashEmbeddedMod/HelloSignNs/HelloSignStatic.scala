package typings
package hellosignDashEmbeddedLib.hellosignDashEmbeddedMod.HelloSignNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HelloSignStatic extends js.Object {
  /**
    * The available client UI cultures
    */
  var CULTURES: ClientCultures
  /**
    * The user closed the iFrame before completing
    *
    * @default signature_request_canceled
    */
  var EVENT_CANCELED: java.lang.String
  /**
    * The signature request was declined
    *
    * @default signature_request_declined
    */
  var EVENT_DECLINED: java.lang.String
  /**
    * An error occurred in the iFrame
    *
    * @default error
    */
  var EVENT_ERROR: java.lang.String
  /**
    * The user sent a signature request
    *
    * @default signature_request_sent
    */
  var EVENT_SENT: java.lang.String
  /**
    * The signature request was signed
    *
    * @default signature_request_signed
    */
  var EVENT_SIGNED: java.lang.String
  /**
    * The template was created or edited
    *
    * @default template_created
    */
  var EVENT_TEMPLATE_CREATED: java.lang.String
  /**
    * Close the signing window.
    */
  def close(): scala.Unit
  /**
    * Initialize using your HelloSign API client ID.
    *
    * @param appClientId The API client ID the request is for.
    */
  def init(appClientId: java.lang.String): scala.Unit
  /**
    * Open the signing window.
    *
    * @param params The options to use when opening the signing window.
    */
  def open(params: OpenParameters): scala.Unit
}

