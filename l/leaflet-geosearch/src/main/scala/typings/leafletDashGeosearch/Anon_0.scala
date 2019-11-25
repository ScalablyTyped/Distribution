package typings.leafletDashGeosearch

import typings.leafletDashGeosearch.leafletDashGeosearchNumbers.`-1`
import typings.leafletDashGeosearch.leafletDashGeosearchNumbers.`0`
import typings.leafletDashGeosearch.leafletDashGeosearchNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_0 extends js.Object {
  var adminDistrict: js.UndefOr[String] = js.undefined
  var incl: js.UndefOr[String] = js.undefined
  var inclnb: js.UndefOr[`-1` | `0` | `1`] = js.undefined
  var include: js.UndefOr[String] = js.undefined
  var includeNeighborhood: js.UndefOr[`-1` | `0` | `1`] = js.undefined
  var key: String
  var maxResults: js.UndefOr[Double] = js.undefined
}

object Anon_0 {
  @scala.inline
  def apply(
    key: String,
    adminDistrict: String = null,
    incl: String = null,
    inclnb: `-1` | `0` | `1` = null,
    include: String = null,
    includeNeighborhood: `-1` | `0` | `1` = null,
    maxResults: Int | Double = null
  ): Anon_0 = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (adminDistrict != null) __obj.updateDynamic("adminDistrict")(adminDistrict.asInstanceOf[js.Any])
    if (incl != null) __obj.updateDynamic("incl")(incl.asInstanceOf[js.Any])
    if (inclnb != null) __obj.updateDynamic("inclnb")(inclnb.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (includeNeighborhood != null) __obj.updateDynamic("includeNeighborhood")(includeNeighborhood.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_0]
  }
}

