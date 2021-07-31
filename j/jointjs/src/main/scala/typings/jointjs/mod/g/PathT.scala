package typings.jointjs.mod.g

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathT extends StObject {
  
  var segmentIndex: Double
  
  var value: Double
}
object PathT {
  
  @scala.inline
  def apply(segmentIndex: Double, value: Double): PathT = {
    val __obj = js.Dynamic.literal(segmentIndex = segmentIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathT]
  }
  
  @scala.inline
  implicit class PathTMutableBuilder[Self <: PathT] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSegmentIndex(value: Double): Self = StObject.set(x, "segmentIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
