package typings.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaSize extends StObject {
  
  var `x-dimension`: js.UndefOr[Double] = js.native
  
  var `y-dimension`: js.UndefOr[Double] = js.native
}
object MediaSize {
  
  @scala.inline
  def apply(): MediaSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaSize]
  }
  
  @scala.inline
  implicit class MediaSizeMutableBuilder[Self <: MediaSize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setX-dimension`(value: Double): Self = StObject.set(x, "x-dimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setX-dimensionUndefined`: Self = StObject.set(x, "x-dimension", js.undefined)
    
    @scala.inline
    def `setY-dimension`(value: Double): Self = StObject.set(x, "y-dimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setY-dimensionUndefined`: Self = StObject.set(x, "y-dimension", js.undefined)
  }
}
