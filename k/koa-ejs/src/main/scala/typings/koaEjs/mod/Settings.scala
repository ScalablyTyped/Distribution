package typings.koaEjs.mod

import typings.koaEjs.koaEjsBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  /** When true, EJS will use an async function for rendering. Depends on async/await support in the JS runtime */
  var async: js.UndefOr[Boolean] = js.undefined
  /** Cache compiled templates */
  var cache: js.UndefOr[Boolean] = js.undefined
  /** Log debug messages. */
  var debug: js.UndefOr[Boolean] = js.undefined
  /** Character to use with angle brackets for open / close (default %). */
  var delimiter: js.UndefOr[String] = js.undefined
  /** Global layout file, default is layout, set false to disable layout. */
  var layout: js.UndefOr[String | `false`] = js.undefined
  /** View root directory */
  var root: String
  /** Filename extension for the views. Defaults to html. */
  var viewExt: js.UndefOr[String] = js.undefined
}

object Settings {
  @scala.inline
  def apply(
    root: String,
    async: js.UndefOr[Boolean] = js.undefined,
    cache: js.UndefOr[Boolean] = js.undefined,
    debug: js.UndefOr[Boolean] = js.undefined,
    delimiter: String = null,
    layout: String | `false` = null,
    viewExt: String = null
  ): Settings = {
    val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache.get.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (viewExt != null) __obj.updateDynamic("viewExt")(viewExt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
}

