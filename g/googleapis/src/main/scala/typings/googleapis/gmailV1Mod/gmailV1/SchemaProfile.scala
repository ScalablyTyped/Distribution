package typings.googleapis.gmailV1Mod.gmailV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Profile for a Gmail user.
  */
@js.native
trait SchemaProfile extends js.Object {
  /**
    * The user&#39;s email address.
    */
  var emailAddress: js.UndefOr[String] = js.native
  /**
    * The ID of the mailbox&#39;s current history record.
    */
  var historyId: js.UndefOr[String] = js.native
  /**
    * The total number of messages in the mailbox.
    */
  var messagesTotal: js.UndefOr[Double] = js.native
  /**
    * The total number of threads in the mailbox.
    */
  var threadsTotal: js.UndefOr[Double] = js.native
}

object SchemaProfile {
  @scala.inline
  def apply(
    emailAddress: String = null,
    historyId: String = null,
    messagesTotal: Int | Double = null,
    threadsTotal: Int | Double = null
  ): SchemaProfile = {
    val __obj = js.Dynamic.literal()
    if (emailAddress != null) __obj.updateDynamic("emailAddress")(emailAddress.asInstanceOf[js.Any])
    if (historyId != null) __obj.updateDynamic("historyId")(historyId.asInstanceOf[js.Any])
    if (messagesTotal != null) __obj.updateDynamic("messagesTotal")(messagesTotal.asInstanceOf[js.Any])
    if (threadsTotal != null) __obj.updateDynamic("threadsTotal")(threadsTotal.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaProfile]
  }
}

