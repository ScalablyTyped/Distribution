package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeoJSON extends StObject {
  
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
  implicit class GeoJSONMutableBuilder[Self <: GeoJSON] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyrightShort(value: String): Self = StObject.set(x, "copyrightShort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyrightShortUndefined: Self = StObject.set(x, "copyrightShort", js.undefined)
    
    @scala.inline
    def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
    
    @scala.inline
    def setCrs(value: Dictionary[_]): Self = StObject.set(x, "crs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrsUndefined: Self = StObject.set(x, "crs", js.undefined)
    
    @scala.inline
    def setFeatures(value: js.Array[GeoJSONFeature]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeaturesVarargs(value: GeoJSONFeature*): Self = StObject.set(x, "features", js.Array(value :_*))
    
    @scala.inline
    def `setHc-transform`(value: Dictionary[GeoJSONTranslation]): Self = StObject.set(x, "hc-transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setHc-transformUndefined`: Self = StObject.set(x, "hc-transform", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
