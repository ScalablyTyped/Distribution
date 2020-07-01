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
    messagesTotal: js.UndefOr[Double] = js.undefined,
    threadsTotal: js.UndefOr[Double] = js.undefined
  ): SchemaProfile = {
    val __obj = js.Dynamic.literal()
    if (emailAddress != null) __obj.updateDynamic("emailAddress")(emailAddress.asInstanceOf[js.Any])
    if (historyId != null) __obj.updateDynamic("historyId")(historyId.asInstanceOf[js.Any])
    if (!js.isUndefined(messagesTotal)) __obj.updateDynamic("messagesTotal")(messagesTotal.get.asInstanceOf[js.Any])
    if (!js.isUndefined(threadsTotal)) __obj.updateDynamic("threadsTotal")(threadsTotal.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaProfile]
  }
}

