package typings.harFormat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Log extends js.Object {
  /** Name and version info of used browser. */
  var browser: js.UndefOr[Browser] = js.native
  /** A comment provided by the user or the application. */
  var comment: js.UndefOr[String] = js.native
  /** Name and version info of the log creator application. */
  var creator: Creator = js.native
  /** List of all exported (tracked) requests. */
  var entries: js.Array[Entry] = js.native
  /**
    * List of all exported (tracked) pages.
    *
    * _Leave out this field if the application
    * does not support grouping by pages._
    *
    * There is one `<page>` object for every exported web page and one
    * `<entry>` object for every HTTP request.
    * In case when an HTTP trace tool isn't able to group requests by a page,
    * the `<pages>` object is empty and individual requests doesn't have a
    * parent page.
    */
  var pages: js.UndefOr[js.Array[Page]] = js.native
  /**
    * Version number of the format.
    *
    * _If empty, string "1.1" is assumed by default._
    */
  var version: String = js.native
}

object Log {
  @scala.inline
  def apply(creator: Creator, entries: js.Array[Entry], version: String): Log = {
    val __obj = js.Dynamic.literal(creator = creator.asInstanceOf[js.Any], entries = entries.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Log]
  }
  @scala.inline
  implicit class LogOps[Self <: Log] (val x: Self) extends AnyVal {
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
    def setCreator(value: Creator): Self = this.set("creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setEntriesVarargs(value: Entry*): Self = this.set("entries", js.Array(value :_*))
    @scala.inline
    def setEntries(value: js.Array[Entry]): Self = this.set("entries", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def setBrowser(value: Browser): Self = this.set("browser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrowser: Self = this.set("browser", js.undefined)
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    @scala.inline
    def setPagesVarargs(value: Page*): Self = this.set("pages", js.Array(value :_*))
    @scala.inline
    def setPages(value: js.Array[Page]): Self = this.set("pages", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePages: Self = this.set("pages", js.undefined)
  }
  
}

