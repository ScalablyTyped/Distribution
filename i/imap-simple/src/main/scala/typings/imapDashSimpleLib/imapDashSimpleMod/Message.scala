package typings
package imapDashSimpleLib.imapDashSimpleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Message extends js.Object {
  var attributes: imapLib.imapMod.ConnectionNs.ImapMessageAttributes
  var parts: js.Array[MessageBodyPart]
  var seqno: scala.Double
}

