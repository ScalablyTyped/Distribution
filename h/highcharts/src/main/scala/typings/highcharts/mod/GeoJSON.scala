package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoJSON extends js.Object {
  /**
    * Full copyright note of the geographic data.
    */
  var copyright: js.UndefOr[String] = js.undefined
  /**
    * Short copyright note of the geographic data suitable for watermarks.
    */
  var copyrightShort: js.UndefOr[String] = js.undefined
  /**
    * Additional meta information based on the coordinate reference system.
    */
  var crs: js.UndefOr[Dictionary[_]] = js.undefined
  /**
    * Data sets of geographic features.
    */
  var features: js.Array[GeoJSONFeature]
  /**
    * Map projections and transformations to be used when calculating between
    * lat/lon and chart values. Required for lat/lon support on maps. Allows
    * resizing, rotating, and moving portions of a map within its projected
    * coordinate system while still retaining lat/lon support. If using lat/lon
    * on a portion of the map that does not match a `hitZone`, the definition
    * with the key `default` is used.
    */
  var `hc-transform`: js.UndefOr[Dictionary[GeoJSONTranslation]] = js.undefined
  /**
    * Title of the geographic data.
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * Type of the geographic data. Type of an optimized map collection is
    * `FeatureCollection`.
    */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * Version of the geographic data.
    */
  var version: js.UndefOr[String] = js.undefined
}

object GeoJSON {
  @scala.inline
  def apply(
    features: js.Array[GeoJSONFeature],
    copyright: String = null,
    copyrightShort: String = null,
    crs: Dictionary[_] = null,
    `hc-transform`: Dictionary[GeoJSONTranslation] = null,
    title: String = null,
    `type`: String = null,
    version: String = null
  ): GeoJSON = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any])
    if (copyright != null) __obj.updateDynamic("copyright")(copyright.asInstanceOf[js.Any])
    if (copyrightShort != null) __obj.updateDynamic("copyrightShort")(copyrightShort.asInstanceOf[js.Any])
    if (crs != null) __obj.updateDynamic("crs")(crs.asInstanceOf[js.Any])
    if (`hc-transform` != null) __obj.updateDynamic("hc-transform")(`hc-transform`.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoJSON]
  }
}

