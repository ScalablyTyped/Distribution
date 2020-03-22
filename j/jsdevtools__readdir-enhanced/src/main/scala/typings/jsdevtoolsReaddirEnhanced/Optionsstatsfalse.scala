package typings.jsdevtoolsReaddirEnhanced

import typings.jsdevtoolsReaddirEnhanced.jsdevtoolsReaddirEnhancedBooleans.`false`
import typings.jsdevtoolsReaddirEnhanced.typesPublicMod.FilterFunction
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @jsdevtools/readdir-enhanced.@jsdevtools/readdir-enhanced/lib/types-public.Options & {  stats ? :false} */
trait Optionsstatsfalse extends js.Object {
  /**
    * The baase path to prefix results with.
    *
    * Defaults to an empty string, which means results will be relative to the directory path.
    */
  var basePath: js.UndefOr[String] = js.undefined
  /**
    * The depth to crawl. Can be `true` to crawl indefinitely, a number to crawl only to that
    * depth, or a filter (see the `filter` option) to crawl only directories that match the filter.
    *
    * Defaults to zero, which will not crawl subdirectories.
    */
  var deep: js.UndefOr[Boolean | Double | String | RegExp | FilterFunction] = js.undefined
  /**
    * Filter critiera. Can be a glob pattern, a regular expression, or a filter function.
    *
    * Defaults to returning all files.
    */
  var filter: js.UndefOr[Boolean | String | RegExp | FilterFunction] = js.undefined
  /**
    * Custom implementations of filesystem methods.
    *
    * Defaults to the Node "fs" module.
    */
  var fs: js.UndefOr[PartialFileSystem] = js.undefined
  /**
    * The path separator to use.
    *
    * Defaults to "\" on Windows and "/" on other platforms.
    */
  var sep: js.UndefOr[String] = js.undefined
  /**
    * Return `Stats` objects instead of just path strings.
    *
    * Defaults to `false`.
    */
  var stats: js.UndefOr[Boolean with `false`] = js.undefined
  /**
    * Alias for the `stats` option. This property is supported for compatibility with the Node.js
    * built-in `fs.readdir()` function.
    */
  var withFileTypes: js.UndefOr[Boolean] = js.undefined
}

object Optionsstatsfalse {
  @scala.inline
  def apply(
    basePath: String = null,
    deep: Boolean | Double | String | RegExp | FilterFunction = null,
    filter: Boolean | String | RegExp | FilterFunction = null,
    fs: PartialFileSystem = null,
    sep: String = null,
    stats: js.UndefOr[Boolean with `false`] = js.undefined,
    withFileTypes: js.UndefOr[Boolean] = js.undefined
  ): Optionsstatsfalse = {
    val __obj = js.Dynamic.literal()
    if (basePath != null) __obj.updateDynamic("basePath")(basePath.asInstanceOf[js.Any])
    if (deep != null) __obj.updateDynamic("deep")(deep.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (fs != null) __obj.updateDynamic("fs")(fs.asInstanceOf[js.Any])
    if (sep != null) __obj.updateDynamic("sep")(sep.asInstanceOf[js.Any])
    if (!js.isUndefined(stats)) __obj.updateDynamic("stats")(stats.asInstanceOf[js.Any])
    if (!js.isUndefined(withFileTypes)) __obj.updateDynamic("withFileTypes")(withFileTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Optionsstatsfalse]
  }
}

