package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoJSON extends StObject {
  
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
  var crs: js.UndefOr[Dictionary[Any]] = js.undefined
  
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
  
  inline def apply(features: js.Array[GeoJSONFeature]): GeoJSON = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoJSON]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeoJSON] (val x: Self) extends AnyVal {
    
    inline def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
    
    inline def setCopyrightShort(value: String): Self = StObject.set(x, "copyrightShort", value.asInstanceOf[js.Any])
    
    inline def setCopyrightShortUndefined: Self = StObject.set(x, "copyrightShort", js.undefined)
    
    inline def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
    
    inline def setCrs(value: Dictionary[Any]): Self = StObject.set(x, "crs", value.asInstanceOf[js.Any])
    
    inline def setCrsUndefined: Self = StObject.set(x, "crs", js.undefined)
    
    inline def setFeatures(value: js.Array[GeoJSONFeature]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesVarargs(value: GeoJSONFeature*): Self = StObject.set(x, "features", js.Array(value*))
    
    inline def `setHc-transform`(value: Dictionary[GeoJSONTranslation]): Self = StObject.set(x, "hc-transform", value.asInstanceOf[js.Any])
    
    inline def `setHc-transformUndefined`: Self = StObject.set(x, "hc-transform", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
