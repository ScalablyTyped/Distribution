package typings.imap.imapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImapMessageBodyInfo extends js.Object {
  /** The size of this body in bytes. */
  var size: Double
  /** The specifier for this body (e.g. 'TEXT', 'HEADER.FIELDS (TO FROM SUBJECT)', etc). */
  var which: String
}

object ImapMessageBodyInfo {
  @scala.inline
  def apply(size: Double, which: String): ImapMessageBodyInfo = {
    val __obj = js.Dynamic.literal(size = size, which = which)
  
    __obj.asInstanceOf[ImapMessageBodyInfo]
  }
}

