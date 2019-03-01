package typings
package imapLib.imapMod.ConnectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImapMessageBodyInfo extends js.Object {
  /** The size of this body in bytes. */
  var size: scala.Double
  /** The specifier for this body (e.g. 'TEXT', 'HEADER.FIELDS (TO FROM SUBJECT)', etc). */
  var which: java.lang.String
}

object ImapMessageBodyInfo {
  @scala.inline
  def apply(size: scala.Double, which: java.lang.String): ImapMessageBodyInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("which")(which)
    __obj.asInstanceOf[ImapMessageBodyInfo]
  }
}

