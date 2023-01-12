package typings.leaflet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TileLayerOptions
  extends StObject
     with GridLayerOptions {
  
  var accessToken: js.UndefOr[String] = js.undefined
  
  var crossOrigin: js.UndefOr[CrossOrigin | Boolean] = js.undefined
  
  var detectRetina: js.UndefOr[Boolean] = js.undefined
  
  var errorTileUrl: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var referrerPolicy: js.UndefOr[ReferrerPolicy | Boolean] = js.undefined
  
  var subdomains: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var tms: js.UndefOr[Boolean] = js.undefined
  
  var zoomOffset: js.UndefOr[Double] = js.undefined
  
  var zoomReverse: js.UndefOr[Boolean] = js.undefined
}
object TileLayerOptions {
  
  inline def apply(): TileLayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileLayerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TileLayerOptions] (val x: Self) extends AnyVal {
    
    inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    
    inline def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
    
    inline def setCrossOrigin(value: CrossOrigin | Boolean): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
    
    inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
    
    inline def setDetectRetina(value: Boolean): Self = StObject.set(x, "detectRetina", value.asInstanceOf[js.Any])
    
    inline def setDetectRetinaUndefined: Self = StObject.set(x, "detectRetina", js.undefined)
    
    inline def setErrorTileUrl(value: String): Self = StObject.set(x, "errorTileUrl", value.asInstanceOf[js.Any])
    
    inline def setErrorTileUrlUndefined: Self = StObject.set(x, "errorTileUrl", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setReferrerPolicy(value: ReferrerPolicy | Boolean): Self = StObject.set(x, "referrerPolicy", value.asInstanceOf[js.Any])
    
    inline def setReferrerPolicyUndefined: Self = StObject.set(x, "referrerPolicy", js.undefined)
    
    inline def setSubdomains(value: String | js.Array[String]): Self = StObject.set(x, "subdomains", value.asInstanceOf[js.Any])
    
    inline def setSubdomainsUndefined: Self = StObject.set(x, "subdomains", js.undefined)
    
    inline def setSubdomainsVarargs(value: String*): Self = StObject.set(x, "subdomains", js.Array(value*))
    
    inline def setTms(value: Boolean): Self = StObject.set(x, "tms", value.asInstanceOf[js.Any])
    
    inline def setTmsUndefined: Self = StObject.set(x, "tms", js.undefined)
    
    inline def setZoomOffset(value: Double): Self = StObject.set(x, "zoomOffset", value.asInstanceOf[js.Any])
    
    inline def setZoomOffsetUndefined: Self = StObject.set(x, "zoomOffset", js.undefined)
    
    inline def setZoomReverse(value: Boolean): Self = StObject.set(x, "zoomReverse", value.asInstanceOf[js.Any])
    
    inline def setZoomReverseUndefined: Self = StObject.set(x, "zoomReverse", js.undefined)
  }
}
