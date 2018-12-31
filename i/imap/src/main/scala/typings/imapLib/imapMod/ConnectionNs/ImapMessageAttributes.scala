package typings
package imapLib.imapMod.ConnectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImapMessageAttributes extends js.Object {
  /** The internal server date for the message. */
  var date: stdLib.Date
  /** A list of flags currently set on this message. */
  var flags: js.Array[java.lang.String]
  /** The RFC822 message size (only set if requested with fetch()). */
  var size: js.UndefOr[scala.Double] = js.undefined
  /** The message's body structure (only set if requested with fetch()). */
  var struct: js.UndefOr[js.Array[_]] = js.undefined
  /** A 32-bit ID that uniquely identifies this message within its mailbox. */
  var uid: scala.Double
}

