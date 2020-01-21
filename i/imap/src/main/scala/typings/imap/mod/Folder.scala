package typings.imap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Folder extends js.Object {
  /** mailbox attributes. An attribute of 'NOSELECT' indicates the mailbox cannot be opened */
  var attribs: js.Array[String]
  /** an object containing another structure similar in format to this top level, otherwise null if no children */
  var children: MailBoxes
  /** hierarchy delimiter for accessing this mailbox's direct children. */
  var delimiter: String
  /** pointer to parent mailbox, null if at the top level */
  var parent: Folder
}

object Folder {
  @scala.inline
  def apply(attribs: js.Array[String], children: MailBoxes, delimiter: String, parent: Folder): Folder = {
    val __obj = js.Dynamic.literal(attribs = attribs.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], delimiter = delimiter.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Folder]
  }
}

