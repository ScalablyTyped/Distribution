package typings.leafletGeosearch.mod

import typings.leafletGeosearch.leafletGeosearchNumbers.`-1`
import typings.leafletGeosearch.leafletGeosearchNumbers.`0`
import typings.leafletGeosearch.leafletGeosearchNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  key  :string,   adminDistrict ? :string,   includeNeighborhood ? :-1 | 0 | 1,   inclnb ? :-1 | 0 | 1,   include ? :string,   incl ? :string,   maxResults ? :number} & leaflet-geosearch.leaflet-geosearch.BingProviderCultureOptions & leaflet-geosearch.leaflet-geosearch.BingProviderUserContextOptions */
trait BingProviderOptions extends js.Object {
  var adminDistrict: js.UndefOr[String] = js.undefined
  var c: js.UndefOr[String] = js.undefined
  var culture: js.UndefOr[String] = js.undefined
  var incl: js.UndefOr[String] = js.undefined
  var inclnb: js.UndefOr[`-1` | `0` | `1`] = js.undefined
  var include: js.UndefOr[String] = js.undefined
  var includeNeighborhood: js.UndefOr[`-1` | `0` | `1`] = js.undefined
  var key: String
  var maxResults: js.UndefOr[Double] = js.undefined
  var ul: js.UndefOr[String] = js.undefined
  var umv: js.UndefOr[String] = js.undefined
  var ur: js.UndefOr[String] = js.undefined
  var userIp: js.UndefOr[String] = js.undefined
  var userLocation: js.UndefOr[String] = js.undefined
  var userMapView: js.UndefOr[String] = js.undefined
  var userRegion: js.UndefOr[String] = js.undefined
}

object BingProviderOptions {
  @scala.inline
  def apply(
    key: String,
    adminDistrict: String = null,
    c: String = null,
    culture: String = null,
    incl: String = null,
    inclnb: `-1` | `0` | `1` = null,
    include: String = null,
    includeNeighborhood: `-1` | `0` | `1` = null,
    maxResults: js.UndefOr[Double] = js.undefined,
    ul: String = null,
    umv: String = null,
    ur: String = null,
    userIp: String = null,
    userLocation: String = null,
    userMapView: String = null,
    userRegion: String = null
  ): BingProviderOptions = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (adminDistrict != null) __obj.updateDynamic("adminDistrict")(adminDistrict.asInstanceOf[js.Any])
    if (c != null) __obj.updateDynamic("c")(c.asInstanceOf[js.Any])
    if (culture != null) __obj.updateDynamic("culture")(culture.asInstanceOf[js.Any])
    if (incl != null) __obj.updateDynamic("incl")(incl.asInstanceOf[js.Any])
    if (inclnb != null) __obj.updateDynamic("inclnb")(inclnb.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (includeNeighborhood != null) __obj.updateDynamic("includeNeighborhood")(includeNeighborhood.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (ul != null) __obj.updateDynamic("ul")(ul.asInstanceOf[js.Any])
    if (umv != null) __obj.updateDynamic("umv")(umv.asInstanceOf[js.Any])
    if (ur != null) __obj.updateDynamic("ur")(ur.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    if (userLocation != null) __obj.updateDynamic("userLocation")(userLocation.asInstanceOf[js.Any])
    if (userMapView != null) __obj.updateDynamic("userMapView")(userMapView.asInstanceOf[js.Any])
    if (userRegion != null) __obj.updateDynamic("userRegion")(userRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[BingProviderOptions]
  }
}

