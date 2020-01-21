package typings.imap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchOptions extends js.Object {
  /** A string or Array of strings containing the body part section to fetch. Default: (none) Example sections: */
  var bodies: js.UndefOr[String | js.Array[String]] = js.undefined
  /** Fetch the message envelope. Default: false */
  var envelope: js.UndefOr[Boolean] = js.undefined
  /** Mark message(s) as read when fetched. Default: false */
  var markSeen: js.UndefOr[Boolean] = js.undefined
  /** Fetch modifiers defined by IMAP extensions. Default: (none) */
  var modifiers: js.UndefOr[js.Object] = js.undefined
  /** Fetch the RFC822 size. Default: false */
  var size: js.UndefOr[Boolean] = js.undefined
  /** Fetch the message structure. Default: false */
  var struct: js.UndefOr[Boolean] = js.undefined
}

object FetchOptions {
  @scala.inline
  def apply(
    bodies: String | js.Array[String] = null,
    envelope: js.UndefOr[Boolean] = js.undefined,
    markSeen: js.UndefOr[Boolean] = js.undefined,
    modifiers: js.Object = null,
    size: js.UndefOr[Boolean] = js.undefined,
    struct: js.UndefOr[Boolean] = js.undefined
  ): FetchOptions = {
    val __obj = js.Dynamic.literal()
    if (bodies != null) __obj.updateDynamic("bodies")(bodies.asInstanceOf[js.Any])
    if (!js.isUndefined(envelope)) __obj.updateDynamic("envelope")(envelope.asInstanceOf[js.Any])
    if (!js.isUndefined(markSeen)) __obj.updateDynamic("markSeen")(markSeen.asInstanceOf[js.Any])
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(struct)) __obj.updateDynamic("struct")(struct.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchOptions]
  }
}

