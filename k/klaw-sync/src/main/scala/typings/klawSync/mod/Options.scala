package typings.klawSync.mod

import typings.klawSync.AnonReaddirSync
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * @description The number of times to recurse before stopping.
    *              -1 for unlimited.
    * @default -1
    * @since v5.0.0
    */
  var depthLimit: js.UndefOr[Double] = js.undefined
  /**
    * @description function that gets one argument fn({path: '', stats: {}}) and returns true to include
    *              or false to exclude the item
    * @since v2.0.0
    */
  var filter: js.UndefOr[Filter] = js.undefined
  /**
    * @description Custom fs, useful when mocking fs object.
    * @default graceful-fs
    * @since v4.0.0
    */
  var fs: js.UndefOr[AnonReaddirSync] = js.undefined
  /**
    * @description True to only return files (ignore directories).
    *              Defaults to false if not specified.
    * @default false
    */
  var nodir: js.UndefOr[Boolean] = js.undefined
  /**
    * @description True to only return directories (ignore files).
    *              Defaults to false if not specified.
    * @default false
    */
  var nofile: js.UndefOr[Boolean] = js.undefined
  /**
    * @description traverse all subdirectories, regardless of `filter` option.
    *
    * When set to true, traverseAll produces similar behavior to the default
    * behavior prior to `v4.0.0`. The current default of `traverseAll: false`
    * is equivalent to the old `noRecurseOnFailedFilter: true`).
    *
    * @since v6.0.0
    */
  var traverseAll: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    depthLimit: Int | Double = null,
    filter: /* item */ Item => Boolean = null,
    fs: AnonReaddirSync = null,
    nodir: js.UndefOr[Boolean] = js.undefined,
    nofile: js.UndefOr[Boolean] = js.undefined,
    traverseAll: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (depthLimit != null) __obj.updateDynamic("depthLimit")(depthLimit.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (fs != null) __obj.updateDynamic("fs")(fs.asInstanceOf[js.Any])
    if (!js.isUndefined(nodir)) __obj.updateDynamic("nodir")(nodir.asInstanceOf[js.Any])
    if (!js.isUndefined(nofile)) __obj.updateDynamic("nofile")(nofile.asInstanceOf[js.Any])
    if (!js.isUndefined(traverseAll)) __obj.updateDynamic("traverseAll")(traverseAll.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

