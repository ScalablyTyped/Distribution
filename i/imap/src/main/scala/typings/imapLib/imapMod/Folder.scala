package typings
package imapLib.imapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Folder extends js.Object {
  /** mailbox attributes. An attribute of 'NOSELECT' indicates the mailbox cannot be opened */
  var attribs: js.Array[java.lang.String]
  /** an object containing another structure similar in format to this top level, otherwise null if no children */
  var children: MailBoxes
  /** hierarchy delimiter for accessing this mailbox's direct children. */
  var delimiter: java.lang.String
  /** pointer to parent mailbox, null if at the top level */
  var parent: Folder
}

object Folder {
  @scala.inline
  def apply(
    attribs: js.Array[java.lang.String],
    children: MailBoxes,
    delimiter: java.lang.String,
    parent: Folder
  ): Folder = {
    val __obj = js.Dynamic.literal(attribs = attribs, children = children, delimiter = delimiter, parent = parent)
  
    __obj.asInstanceOf[Folder]
  }
}

