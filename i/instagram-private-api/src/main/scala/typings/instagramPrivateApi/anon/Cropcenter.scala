package typings.instagramPrivateApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cropcenter extends StObject {
  
  var crop_center: js.Tuple2[Double, Double] = js.native
  
  var crop_original_size: js.Tuple2[Double, Double] = js.native
  
  var crop_zoom: Double = js.native
}
object Cropcenter {
  
  @scala.inline
  def apply(
    crop_center: js.Tuple2[Double, Double],
    crop_original_size: js.Tuple2[Double, Double],
    crop_zoom: Double
  ): Cropcenter = {
    val __obj = js.Dynamic.literal(crop_center = crop_center.asInstanceOf[js.Any], crop_original_size = crop_original_size.asInstanceOf[js.Any], crop_zoom = crop_zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cropcenter]
  }
  
  @scala.inline
  implicit class CropcenterMutableBuilder[Self <: Cropcenter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCrop_center(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "crop_center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrop_original_size(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "crop_original_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrop_zoom(value: Double): Self = StObject.set(x, "crop_zoom", value.asInstanceOf[js.Any])
  }
}
