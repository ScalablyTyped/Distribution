package typings.mapsjs.anon

import typings.mapsjs.mod.point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Distance extends StObject {
  
  var distance: Double = js.native
  
  var pt: point = js.native
  
  var ptIdx: Double = js.native
  
  var setIdx: Double = js.native
}
object Distance {
  
  @scala.inline
  def apply(distance: Double, pt: point, ptIdx: Double, setIdx: Double): Distance = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], pt = pt.asInstanceOf[js.Any], ptIdx = ptIdx.asInstanceOf[js.Any], setIdx = setIdx.asInstanceOf[js.Any])
    __obj.asInstanceOf[Distance]
  }
  
  @scala.inline
  implicit class DistanceMutableBuilder[Self <: Distance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPt(value: point): Self = StObject.set(x, "pt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPtIdx(value: Double): Self = StObject.set(x, "ptIdx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetIdx(value: Double): Self = StObject.set(x, "setIdx", value.asInstanceOf[js.Any])
  }
}
