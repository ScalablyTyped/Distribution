package typings.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectSize extends StObject {
  
  var `x-dimension`: js.UndefOr[Double] = js.native
  
  var `y-dimension`: js.UndefOr[Double] = js.native
  
  var `z-dimension`: js.UndefOr[Double] = js.native
}
object ObjectSize {
  
  @scala.inline
  def apply(): ObjectSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectSize]
  }
  
  @scala.inline
  implicit class ObjectSizeMutableBuilder[Self <: ObjectSize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setX-dimension`(value: Double): Self = StObject.set(x, "x-dimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setX-dimensionUndefined`: Self = StObject.set(x, "x-dimension", js.undefined)
    
    @scala.inline
    def `setY-dimension`(value: Double): Self = StObject.set(x, "y-dimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setY-dimensionUndefined`: Self = StObject.set(x, "y-dimension", js.undefined)
    
    @scala.inline
    def `setZ-dimension`(value: Double): Self = StObject.set(x, "z-dimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setZ-dimensionUndefined`: Self = StObject.set(x, "z-dimension", js.undefined)
  }
}
