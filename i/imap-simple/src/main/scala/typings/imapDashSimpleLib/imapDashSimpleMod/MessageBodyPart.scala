package typings
package imapDashSimpleLib.imapDashSimpleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MessageBodyPart
  extends imapLib.imapMod.ConnectionNs.ImapMessageBodyInfo {
  /** string type where which=='TEXT', complex Object where which=='HEADER' */
  var body: js.Any
}

