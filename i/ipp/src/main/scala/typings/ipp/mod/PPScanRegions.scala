package typings.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PPScanRegions extends StObject {
  
  var `x-dimension`: js.UndefOr[Double] = js.native
  
  var `x-origin`: js.UndefOr[Double] = js.native
  
  var `y-dimension`: js.UndefOr[Double] = js.native
  
  var `y-origin`: js.UndefOr[Double] = js.native
}
object PPScanRegions {
  
  @scala.inline
  def apply(): PPScanRegions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PPScanRegions]
  }
  
  @scala.inline
  implicit class PPScanRegionsMutableBuilder[Self <: PPScanRegions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setX-dimension`(value: Double): Self = StObject.set(x, "x-dimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setX-dimensionUndefined`: Self = StObject.set(x, "x-dimension", js.undefined)
    
    @scala.inline
    def `setX-origin`(value: Double): Self = StObject.set(x, "x-origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setX-originUndefined`: Self = StObject.set(x, "x-origin", js.undefined)
    
    @scala.inline
    def `setY-dimension`(value: Double): Self = StObject.set(x, "y-dimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setY-dimensionUndefined`: Self = StObject.set(x, "y-dimension", js.undefined)
    
    @scala.inline
    def `setY-origin`(value: Double): Self = StObject.set(x, "y-origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setY-originUndefined`: Self = StObject.set(x, "y-origin", js.undefined)
  }
}
