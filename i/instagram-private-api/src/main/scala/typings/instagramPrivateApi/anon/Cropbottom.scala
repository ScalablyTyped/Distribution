package typings.instagramPrivateApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cropbottom extends StObject {
  
  var crop_bottom: Double = js.native
  
  var crop_left: Double = js.native
  
  var crop_right: Double = js.native
  
  var crop_top: Double = js.native
}
object Cropbottom {
  
  @scala.inline
  def apply(crop_bottom: Double, crop_left: Double, crop_right: Double, crop_top: Double): Cropbottom = {
    val __obj = js.Dynamic.literal(crop_bottom = crop_bottom.asInstanceOf[js.Any], crop_left = crop_left.asInstanceOf[js.Any], crop_right = crop_right.asInstanceOf[js.Any], crop_top = crop_top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cropbottom]
  }
  
  @scala.inline
  implicit class CropbottomMutableBuilder[Self <: Cropbottom] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCrop_bottom(value: Double): Self = StObject.set(x, "crop_bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrop_left(value: Double): Self = StObject.set(x, "crop_left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrop_right(value: Double): Self = StObject.set(x, "crop_right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrop_top(value: Double): Self = StObject.set(x, "crop_top", value.asInstanceOf[js.Any])
  }
}
