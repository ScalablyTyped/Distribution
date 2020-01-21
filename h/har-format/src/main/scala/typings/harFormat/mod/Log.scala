package typings.harFormat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Log extends js.Object {
  /** Name and version info of used browser. */
  var browser: js.UndefOr[Browser] = js.undefined
  /** A comment provided by the user or the application. */
  var comment: js.UndefOr[String] = js.undefined
  /** Name and version info of the log creator application. */
  var creator: Creator
  /** List of all exported (tracked) requests. */
  var entries: js.Array[Entry]
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
  var pages: js.UndefOr[js.Array[Page]] = js.undefined
  /**
    * Version number of the format.
    *
    * _If empty, string "1.1" is assumed by default._
    */
  var version: String
}

object Log {
  @scala.inline
  def apply(
    creator: Creator,
    entries: js.Array[Entry],
    version: String,
    browser: Browser = null,
    comment: String = null,
    pages: js.Array[Page] = null
  ): Log = {
    val __obj = js.Dynamic.literal(creator = creator.asInstanceOf[js.Any], entries = entries.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (browser != null) __obj.updateDynamic("browser")(browser.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (pages != null) __obj.updateDynamic("pages")(pages.asInstanceOf[js.Any])
    __obj.asInstanceOf[Log]
  }
}

