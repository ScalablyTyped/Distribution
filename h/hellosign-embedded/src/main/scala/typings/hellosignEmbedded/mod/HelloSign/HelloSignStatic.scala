package typings.hellosignEmbedded.mod.HelloSign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HelloSignStatic extends js.Object {
  /**
    * The available client UI cultures
    */
  var CULTURES: ClientCultures = js.native
  /**
    * The user closed the iFrame before completing
    *
    * @default signature_request_canceled
    */
  var EVENT_CANCELED: String = js.native
  /**
    * The signature request was declined
    *
    * @default signature_request_declined
    */
  var EVENT_DECLINED: String = js.native
  /**
    * An error occurred in the iFrame
    *
    * @default error
    */
  var EVENT_ERROR: String = js.native
  /**
    * The user sent a signature request
    *
    * @default signature_request_sent
    */
  var EVENT_SENT: String = js.native
  /**
    * The signature request was signed
    *
    * @default signature_request_signed
    */
  var EVENT_SIGNED: String = js.native
  /**
    * The template was created or edited
    *
    * @default template_created
    */
  var EVENT_TEMPLATE_CREATED: String = js.native
  /**
    * Close the signing window.
    */
  def close(): Unit = js.native
  /**
    * Initialize using your HelloSign API client ID.
    *
    * @param appClientId The API client ID the request is for.
    */
  def init(appClientId: String): Unit = js.native
  /**
    * Open the signing window.
    *
    * @param params The options to use when opening the signing window.
    */
  def open(params: OpenParameters): Unit = js.native
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
  @scala.inline
  implicit class HelloSignStaticOps[Self <: HelloSignStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCULTURES(value: ClientCultures): Self = this.set("CULTURES", value.asInstanceOf[js.Any])
    @scala.inline
    def setEVENT_CANCELED(value: String): Self = this.set("EVENT_CANCELED", value.asInstanceOf[js.Any])
    @scala.inline
    def setEVENT_DECLINED(value: String): Self = this.set("EVENT_DECLINED", value.asInstanceOf[js.Any])
    @scala.inline
    def setEVENT_ERROR(value: String): Self = this.set("EVENT_ERROR", value.asInstanceOf[js.Any])
    @scala.inline
    def setEVENT_SENT(value: String): Self = this.set("EVENT_SENT", value.asInstanceOf[js.Any])
    @scala.inline
    def setEVENT_SIGNED(value: String): Self = this.set("EVENT_SIGNED", value.asInstanceOf[js.Any])
    @scala.inline
    def setEVENT_TEMPLATE_CREATED(value: String): Self = this.set("EVENT_TEMPLATE_CREATED", value.asInstanceOf[js.Any])
    @scala.inline
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    @scala.inline
    def setInit(value: String => Unit): Self = this.set("init", js.Any.fromFunction1(value))
    @scala.inline
    def setOpen(value: OpenParameters => Unit): Self = this.set("open", js.Any.fromFunction1(value))
  }
  
}

