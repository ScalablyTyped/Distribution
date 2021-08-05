package typings.instagramPrivateApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Croporiginalsize extends StObject {
  
  var crop_center: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  
  var crop_original_size: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  
  var crop_zoom: js.UndefOr[Double | String] = js.undefined
}
object Croporiginalsize {
  
  inline def apply(): Croporiginalsize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Croporiginalsize]
  }
  
  extension [Self <: Croporiginalsize](x: Self) {
    
    inline def setCrop_center(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "crop_center", value.asInstanceOf[js.Any])
    
    inline def setCrop_centerUndefined: Self = StObject.set(x, "crop_center", js.undefined)
    
    inline def setCrop_original_size(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "crop_original_size", value.asInstanceOf[js.Any])
    
    inline def setCrop_original_sizeUndefined: Self = StObject.set(x, "crop_original_size", js.undefined)
    
    inline def setCrop_zoom(value: Double | String): Self = StObject.set(x, "crop_zoom", value.asInstanceOf[js.Any])
    
    inline def setCrop_zoomUndefined: Self = StObject.set(x, "crop_zoom", js.undefined)
  }
}
