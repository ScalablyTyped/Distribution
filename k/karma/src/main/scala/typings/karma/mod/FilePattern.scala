package typings.karma.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilePattern extends js.Object {
  /**
    * @default true
    * @description Should the files be included in the browser using <script> tag? Use false if you want to
    * load them manually, eg. using Require.js.
    */
  var included: js.UndefOr[Boolean] = js.undefined
  /**
    * @default false
    * @description Should the files be served from disk on each request by Karma's webserver?
    */
  var nocache: js.UndefOr[Boolean] = js.undefined
  /**
    * The pattern to use for matching.
    */
  var pattern: String
  /**
    * @default true
    * @description Should the files be served by Karma's webserver?
    */
  var served: js.UndefOr[Boolean] = js.undefined
  /**
    * Choose the type to use when including a file
    * @default 'js'
    * @description  The type determines the mechanism for including the file.
    * The css and html types create link elements; the js, dart, and module elements create script elements.
    * The dom type includes the file content in the page, used, for example, to test components combining HTML and JS.
    */
  var `type`: js.UndefOr[FilePatternTypes] = js.undefined
  /**
    * @default true
    * @description If <code>autoWatch</code> is true all files that have set watched to true will be watched
    * for changes.
    */
  var watched: js.UndefOr[Boolean] = js.undefined
}

object FilePattern {
  @scala.inline
  def apply(
    pattern: String,
    included: js.UndefOr[Boolean] = js.undefined,
    nocache: js.UndefOr[Boolean] = js.undefined,
    served: js.UndefOr[Boolean] = js.undefined,
    `type`: FilePatternTypes = null,
    watched: js.UndefOr[Boolean] = js.undefined
  ): FilePattern = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    if (!js.isUndefined(included)) __obj.updateDynamic("included")(included.asInstanceOf[js.Any])
    if (!js.isUndefined(nocache)) __obj.updateDynamic("nocache")(nocache.asInstanceOf[js.Any])
    if (!js.isUndefined(served)) __obj.updateDynamic("served")(served.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(watched)) __obj.updateDynamic("watched")(watched.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilePattern]
  }
}

