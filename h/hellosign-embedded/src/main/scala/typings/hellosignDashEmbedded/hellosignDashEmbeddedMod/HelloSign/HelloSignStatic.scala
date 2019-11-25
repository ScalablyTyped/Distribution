package typings.hellosignDashEmbedded.hellosignDashEmbeddedMod.HelloSign

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
  var EVENT_CANCELED: String
  /**
    * The signature request was declined
    *
    * @default signature_request_declined
    */
  var EVENT_DECLINED: String
  /**
    * An error occurred in the iFrame
    *
    * @default error
    */
  var EVENT_ERROR: String
  /**
    * The user sent a signature request
    *
    * @default signature_request_sent
    */
  var EVENT_SENT: String
  /**
    * The signature request was signed
    *
    * @default signature_request_signed
    */
  var EVENT_SIGNED: String
  /**
    * The template was created or edited
    *
    * @default template_created
    */
  var EVENT_TEMPLATE_CREATED: String
  /**
    * Close the signing window.
    */
  def close(): Unit
  /**
    * Initialize using your HelloSign API client ID.
    *
    * @param appClientId The API client ID the request is for.
    */
  def init(appClientId: String): Unit
  /**
    * Open the signing window.
    *
    * @param params The options to use when opening the signing window.
    */
  def open(params: OpenParameters): Unit
}

object HelloSignStatic {
  @scala.inline
  def apply(
    CULTURES: ClientCultures,
    EVENT_CANCELED: String,
    EVENT_DECLINED: String,
    EVENT_ERROR: String,
    EVENT_SENT: String,
    EVENT_SIGNED: String,
    EVENT_TEMPLATE_CREATED: String,
    close: () => Unit,
    init: String => Unit,
    open: OpenParameters => Unit
  ): HelloSignStatic = {
    val __obj = js.Dynamic.literal(CULTURES = CULTURES.asInstanceOf[js.Any], EVENT_CANCELED = EVENT_CANCELED.asInstanceOf[js.Any], EVENT_DECLINED = EVENT_DECLINED.asInstanceOf[js.Any], EVENT_ERROR = EVENT_ERROR.asInstanceOf[js.Any], EVENT_SENT = EVENT_SENT.asInstanceOf[js.Any], EVENT_SIGNED = EVENT_SIGNED.asInstanceOf[js.Any], EVENT_TEMPLATE_CREATED = EVENT_TEMPLATE_CREATED.asInstanceOf[js.Any], close = js.Any.fromFunction0(close), init = js.Any.fromFunction1(init), open = js.Any.fromFunction1(open))
  
    __obj.asInstanceOf[HelloSignStatic]
  }
}

