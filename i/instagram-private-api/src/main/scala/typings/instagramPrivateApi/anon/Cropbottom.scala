package typings.instagramPrivateApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cropbottom extends StObject {
  
  var crop_bottom: Double
  
  var crop_left: Double
  
  var crop_right: Double
  
  var crop_top: Double
}
object Cropbottom {
  
  inline def apply(crop_bottom: Double, crop_left: Double, crop_right: Double, crop_top: Double): Cropbottom = {
    val __obj = js.Dynamic.literal(crop_bottom = crop_bottom.asInstanceOf[js.Any], crop_left = crop_left.asInstanceOf[js.Any], crop_right = crop_right.asInstanceOf[js.Any], crop_top = crop_top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cropbottom]
  }
  
  extension [Self <: Cropbottom](x: Self) {
    
    inline def setCrop_bottom(value: Double): Self = StObject.set(x, "crop_bottom", value.asInstanceOf[js.Any])
    
    inline def setCrop_left(value: Double): Self = StObject.set(x, "crop_left", value.asInstanceOf[js.Any])
    
    inline def setCrop_right(value: Double): Self = StObject.set(x, "crop_right", value.asInstanceOf[js.Any])
    
    inline def setCrop_top(value: Double): Self = StObject.set(x, "crop_top", value.asInstanceOf[js.Any])
  }
}
