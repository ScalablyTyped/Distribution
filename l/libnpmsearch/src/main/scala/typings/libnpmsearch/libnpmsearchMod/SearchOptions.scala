package typings.libnpmsearch.libnpmsearchMod

import typings.libnpmsearch.libnpmsearchStrings.maintenance
import typings.libnpmsearch.libnpmsearchStrings.optimal
import typings.libnpmsearch.libnpmsearchStrings.popularity
import typings.libnpmsearch.libnpmsearchStrings.quality
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchOptions extends js.Object {
  /**
    * If true, returns an object with `package`, `score`, and `searchScore`
    * fields, with `package` being what would usually be returned, and the
    * other two containing details about how that package scored. Useful
    * for UIs. Default: `false`
    */
  var detailed: js.UndefOr[Boolean] = js.undefined
  /**
    * Offset number for results. Used with `opts.limit` for pagination.
    * Default: `0`
    */
  var from: js.UndefOr[Double] = js.undefined
  /**
    * Number of results to limit the query to. Default: `20`
    */
  var limit: js.UndefOr[Double] = js.undefined
  /**
    * Decimal number between `0` and `1` that defines the weight of
    * `maintenance` metrics when scoring and sorting packages.
    * Default: `0.65` (same as `opts.sortBy: 'optimal'`)
    */
  var maintenance: js.UndefOr[Double] = js.undefined
  /**
    * Decimal number between `0` and `1` that defines the weight of
    * `popularity` metrics when scoring and sorting packages.
    * Default: `0.98` (same as `opts.sortBy: 'optimal'`)
    */
  var popularity: js.UndefOr[Double] = js.undefined
  /**
    * Decimal number between `0` and `1` that defines the weight of
    * `quality` metrics when scoring and sorting packages.
    * Default: `0.5` (same as `opts.sortBy: 'optimal'`)
    */
  var quality: js.UndefOr[Double] = js.undefined
  /**
    * Used as a shorthand to set `opts.quality`, `opts.maintenance`, and
    * `opts.popularity` with values that prioritize each one.
    */
  var sortBy: js.UndefOr[optimal | quality | maintenance | popularity] = js.undefined
}

object SearchOptions {
  @scala.inline
  def apply(
    detailed: js.UndefOr[Boolean] = js.undefined,
    from: Int | Double = null,
    limit: Int | Double = null,
    maintenance: Int | Double = null,
    popularity: Int | Double = null,
    quality: Int | Double = null,
    sortBy: optimal | quality | maintenance | popularity = null
  ): SearchOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(detailed)) __obj.updateDynamic("detailed")(detailed)
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (maintenance != null) __obj.updateDynamic("maintenance")(maintenance.asInstanceOf[js.Any])
    if (popularity != null) __obj.updateDynamic("popularity")(popularity.asInstanceOf[js.Any])
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (sortBy != null) __obj.updateDynamic("sortBy")(sortBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchOptions]
  }
}

