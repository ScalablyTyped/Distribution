package typings.googleapis.gmailV1Mod.gmailV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Vacation auto-reply settings for an account. These settings correspond to
  * the &quot;Vacation responder&quot; feature in the web interface.
  */
@js.native
trait SchemaVacationSettings extends js.Object {
  /**
    * Flag that controls whether Gmail automatically replies to messages.
    */
  var enableAutoReply: js.UndefOr[Boolean] = js.native
  /**
    * An optional end time for sending auto-replies (epoch ms). When this is
    * specified, Gmail will automatically reply only to messages that it
    * receives before the end time. If both startTime and endTime are
    * specified, startTime must precede endTime.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * Response body in HTML format. Gmail will sanitize the HTML before storing
    * it.
    */
  var responseBodyHtml: js.UndefOr[String] = js.native
  /**
    * Response body in plain text format.
    */
  var responseBodyPlainText: js.UndefOr[String] = js.native
  /**
    * Optional text to prepend to the subject line in vacation responses. In
    * order to enable auto-replies, either the response subject or the response
    * body must be nonempty.
    */
  var responseSubject: js.UndefOr[String] = js.native
  /**
    * Flag that determines whether responses are sent to recipients who are not
    * in the user&#39;s list of contacts.
    */
  var restrictToContacts: js.UndefOr[Boolean] = js.native
  /**
    * Flag that determines whether responses are sent to recipients who are
    * outside of the user&#39;s domain. This feature is only available for G
    * Suite users.
    */
  var restrictToDomain: js.UndefOr[Boolean] = js.native
  /**
    * An optional start time for sending auto-replies (epoch ms). When this is
    * specified, Gmail will automatically reply only to messages that it
    * receives after the start time. If both startTime and endTime are
    * specified, startTime must precede endTime.
    */
  var startTime: js.UndefOr[String] = js.native
}

object SchemaVacationSettings {
  @scala.inline
  def apply(
    enableAutoReply: js.UndefOr[Boolean] = js.undefined,
    endTime: String = null,
    responseBodyHtml: String = null,
    responseBodyPlainText: String = null,
    responseSubject: String = null,
    restrictToContacts: js.UndefOr[Boolean] = js.undefined,
    restrictToDomain: js.UndefOr[Boolean] = js.undefined,
    startTime: String = null
  ): SchemaVacationSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableAutoReply)) __obj.updateDynamic("enableAutoReply")(enableAutoReply.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (responseBodyHtml != null) __obj.updateDynamic("responseBodyHtml")(responseBodyHtml.asInstanceOf[js.Any])
    if (responseBodyPlainText != null) __obj.updateDynamic("responseBodyPlainText")(responseBodyPlainText.asInstanceOf[js.Any])
    if (responseSubject != null) __obj.updateDynamic("responseSubject")(responseSubject.asInstanceOf[js.Any])
    if (!js.isUndefined(restrictToContacts)) __obj.updateDynamic("restrictToContacts")(restrictToContacts.asInstanceOf[js.Any])
    if (!js.isUndefined(restrictToDomain)) __obj.updateDynamic("restrictToDomain")(restrictToDomain.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaVacationSettings]
  }
}

