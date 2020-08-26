package typings.imap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Folder extends js.Object {
  /** mailbox attributes. An attribute of 'NOSELECT' indicates the mailbox cannot be opened */
  var attribs: js.Array[String] = js.native
  /** an object containing another structure similar in format to this top level, otherwise null if no children */
  var children: MailBoxes = js.native
  /** hierarchy delimiter for accessing this mailbox's direct children. */
  var delimiter: String = js.native
  /** pointer to parent mailbox, null if at the top level */
  var parent: Folder = js.native
}

object Folder {
  @scala.inline
  def apply(attribs: js.Array[String], children: MailBoxes, delimiter: String, parent: Folder): Folder = {
    val __obj = js.Dynamic.literal(attribs = attribs.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], delimiter = delimiter.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Folder]
  }
  @scala.inline
  implicit class FolderOps[Self <: Folder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAttribsVarargs(value: String*): Self = this.set("attribs", js.Array(value :_*))
    @scala.inline
    def setAttribs(value: js.Array[String]): Self = this.set("attribs", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildren(value: MailBoxes): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelimiter(value: String): Self = this.set("delimiter", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: Folder): Self = this.set("parent", value.asInstanceOf[js.Any])
  }
  
}

