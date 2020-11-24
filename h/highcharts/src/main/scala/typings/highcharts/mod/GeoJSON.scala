package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeoJSON extends js.Object {
  
  /**
    * Full copyright note of the geographic data.
    */
  var copyright: js.UndefOr[String] = js.native
  
  /**
    * Short copyright note of the geographic data suitable for watermarks.
    */
  var copyrightShort: js.UndefOr[String] = js.native
  
  /**
    * Additional meta information based on the coordinate reference system.
    */
  var crs: js.UndefOr[Dictionary[_]] = js.native
  
  /**
    * Data sets of geographic features.
    */
  var features: js.Array[GeoJSONFeature] = js.native
  
  /**
    * Map projections and transformations to be used when calculating between
    * lat/lon and chart values. Required for lat/lon support on maps. Allows
    * resizing, rotating, and moving portions of a map within its projected
    * coordinate system while still retaining lat/lon support. If using lat/lon
    * on a portion of the map that does not match a `hitZone`, the definition
    * with the key `default` is used.
    */
  var `hc-transform`: js.UndefOr[Dictionary[GeoJSONTranslation]] = js.native
  
  /**
    * Title of the geographic data.
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * Type of the geographic data. Type of an optimized map collection is
    * `FeatureCollection`.
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * Version of the geographic data.
    */
  var version: js.UndefOr[String] = js.native
}
object GeoJSON {
  
  @scala.inline
  def apply(features: js.Array[GeoJSONFeature]): GeoJSON = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoJSON]
  }
  
  @scala.inline
  implicit class GeoJSONOps[Self <: GeoJSON] (val x: Self) extends AnyVal {
    
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
    def setFeaturesVarargs(value: GeoJSONFeature*): Self = this.set("features", js.Array(value :_*))
    
    @scala.inline
    def setFeatures(value: js.Array[GeoJSONFeature]): Self = this.set("features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyright(value: String): Self = this.set("copyright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopyright: Self = this.set("copyright", js.undefined)
    
    @scala.inline
    def setCopyrightShort(value: String): Self = this.set("copyrightShort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopyrightShort: Self = this.set("copyrightShort", js.undefined)
    
    @scala.inline
    def setCrs(value: Dictionary[_]): Self = this.set("crs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrs: Self = this.set("crs", js.undefined)
    
    @scala.inline
    def `setHc-transform`(value: Dictionary[GeoJSONTranslation]): Self = this.set("hc-transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteHc-transform`: Self = this.set("hc-transform", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
