package typings.googleapis.gmailV1Mod.gmailV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message matching criteria.
  */
@js.native
trait SchemaFilterCriteria extends js.Object {
  /**
    * Whether the response should exclude chats.
    */
  var excludeChats: js.UndefOr[Boolean] = js.native
  /**
    * The sender&#39;s display name or email address.
    */
  var from: js.UndefOr[String] = js.native
  /**
    * Whether the message has any attachment.
    */
  var hasAttachment: js.UndefOr[Boolean] = js.native
  /**
    * Only return messages not matching the specified query. Supports the same
    * query format as the Gmail search box. For example,
    * &quot;from:someuser@example.com rfc822msgid: is:unread&quot;.
    */
  var negatedQuery: js.UndefOr[String] = js.native
  /**
    * Only return messages matching the specified query. Supports the same
    * query format as the Gmail search box. For example,
    * &quot;from:someuser@example.com rfc822msgid: is:unread&quot;.
    */
  var query: js.UndefOr[String] = js.native
  /**
    * The size of the entire RFC822 message in bytes, including all headers and
    * attachments.
    */
  var size: js.UndefOr[Double] = js.native
  /**
    * How the message size in bytes should be in relation to the size field.
    */
  var sizeComparison: js.UndefOr[String] = js.native
  /**
    * Case-insensitive phrase found in the message&#39;s subject. Trailing and
    * leading whitespace are be trimmed and adjacent spaces are collapsed.
    */
  var subject: js.UndefOr[String] = js.native
  /**
    * The recipient&#39;s display name or email address. Includes recipients in
    * the &quot;to&quot;, &quot;cc&quot;, and &quot;bcc&quot; header fields.
    * You can use simply the local part of the email address. For example,
    * &quot;example&quot; and &quot;example@&quot; both match
    * &quot;example@gmail.com&quot;. This field is case-insensitive.
    */
  var to: js.UndefOr[String] = js.native
}

object SchemaFilterCriteria {
  @scala.inline
  def apply(
    excludeChats: js.UndefOr[Boolean] = js.undefined,
    from: String = null,
    hasAttachment: js.UndefOr[Boolean] = js.undefined,
    negatedQuery: String = null,
    query: String = null,
    size: Int | Double = null,
    sizeComparison: String = null,
    subject: String = null,
    to: String = null
  ): SchemaFilterCriteria = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(excludeChats)) __obj.updateDynamic("excludeChats")(excludeChats.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (!js.isUndefined(hasAttachment)) __obj.updateDynamic("hasAttachment")(hasAttachment.asInstanceOf[js.Any])
    if (negatedQuery != null) __obj.updateDynamic("negatedQuery")(negatedQuery.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (sizeComparison != null) __obj.updateDynamic("sizeComparison")(sizeComparison.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFilterCriteria]
  }
}

