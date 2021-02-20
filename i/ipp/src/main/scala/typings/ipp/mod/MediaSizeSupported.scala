package typings.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaSizeSupported extends StObject {
  
  var `x-dimension`: js.UndefOr[Double | String] = js.native
  
  var `y-dimension`: js.UndefOr[Double | String] = js.native
}
object MediaSizeSupported {
  
  @scala.inline
  def apply(): MediaSizeSupported = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaSizeSupported]
  }
  
  @scala.inline
  implicit class MediaSizeSupportedMutableBuilder[Self <: MediaSizeSupported] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setX-dimension`(value: Double | String): Self = StObject.set(x, "x-dimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setX-dimensionUndefined`: Self = StObject.set(x, "x-dimension", js.undefined)
    
    @scala.inline
    def `setY-dimension`(value: Double | String): Self = StObject.set(x, "y-dimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setY-dimensionUndefined`: Self = StObject.set(x, "y-dimension", js.undefined)
  }
}
