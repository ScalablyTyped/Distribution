package typings.koaEjs.mod

import typings.koaEjs.koaEjsBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Settings extends js.Object {
  /** When true, EJS will use an async function for rendering. Depends on async/await support in the JS runtime */
  var async: js.UndefOr[Boolean] = js.native
  /** Cache compiled templates */
  var cache: js.UndefOr[Boolean] = js.native
  /** Log debug messages. */
  var debug: js.UndefOr[Boolean] = js.native
  /** Character to use with angle brackets for open / close (default %). */
  var delimiter: js.UndefOr[String] = js.native
  /** Global layout file, default is layout, set false to disable layout. */
  var layout: js.UndefOr[String | `false`] = js.native
  /** View root directory */
  var root: String = js.native
  /** Filename extension for the views. Defaults to html. */
  var viewExt: js.UndefOr[String] = js.native
}

object Settings {
  @scala.inline
  def apply(root: String): Settings = {
    val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
  @scala.inline
  implicit class SettingsOps[Self <: Settings] (val x: Self) extends AnyVal {
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
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def setAsync(value: Boolean): Self = this.set("async", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsync: Self = this.set("async", js.undefined)
    @scala.inline
    def setCache(value: Boolean): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setDelimiter(value: String): Self = this.set("delimiter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelimiter: Self = this.set("delimiter", js.undefined)
    @scala.inline
    def setLayout(value: String | `false`): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    @scala.inline
    def setViewExt(value: String): Self = this.set("viewExt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewExt: Self = this.set("viewExt", js.undefined)
  }
  
}

