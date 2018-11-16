package typings
package imapLib.imapMod.ConnectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FetchOptions extends js.Object {
  /** A string or Array of strings containing the body part section to fetch. Default: (none) Example sections: */
  var bodies: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /** Fetch the message envelope. Default: false */
  var envelope: js.UndefOr[scala.Boolean] = js.undefined
  /** Mark message(s) as read when fetched. Default: false */
  var markSeen: js.UndefOr[scala.Boolean] = js.undefined
  /** Fetch modifiers defined by IMAP extensions. Default: (none) */
  var modifiers: js.UndefOr[js.Object] = js.undefined
  /** Fetch the RFC822 size. Default: false */
  var size: js.UndefOr[scala.Boolean] = js.undefined
  /** Fetch the message structure. Default: false */
  var struct: js.UndefOr[scala.Boolean] = js.undefined
}

