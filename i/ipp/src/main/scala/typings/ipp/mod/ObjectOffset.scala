package typings.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectOffset extends StObject {
  
  var `x-offset`: js.UndefOr[Double] = js.native
  
  var `y-offset`: js.UndefOr[Double] = js.native
  
  var `z-offset`: js.UndefOr[Double] = js.native
}
object ObjectOffset {
  
  @scala.inline
  def apply(): ObjectOffset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectOffset]
  }
  
  @scala.inline
  implicit class ObjectOffsetMutableBuilder[Self <: ObjectOffset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setX-offset`(value: Double): Self = StObject.set(x, "x-offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setX-offsetUndefined`: Self = StObject.set(x, "x-offset", js.undefined)
    
    @scala.inline
    def `setY-offset`(value: Double): Self = StObject.set(x, "y-offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setY-offsetUndefined`: Self = StObject.set(x, "y-offset", js.undefined)
    
    @scala.inline
    def `setZ-offset`(value: Double): Self = StObject.set(x, "z-offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setZ-offsetUndefined`: Self = StObject.set(x, "z-offset", js.undefined)
  }
}
