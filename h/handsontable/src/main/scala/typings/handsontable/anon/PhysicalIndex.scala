package typings.handsontable.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhysicalIndex extends StObject {
  
  var physicalIndex: Double
  
  var visualIndex: Double
}
object PhysicalIndex {
  
  inline def apply(physicalIndex: Double, visualIndex: Double): PhysicalIndex = {
    val __obj = js.Dynamic.literal(physicalIndex = physicalIndex.asInstanceOf[js.Any], visualIndex = visualIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhysicalIndex]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PhysicalIndex] (val x: Self) extends AnyVal {
    
    inline def setPhysicalIndex(value: Double): Self = StObject.set(x, "physicalIndex", value.asInstanceOf[js.Any])
    
    inline def setVisualIndex(value: Double): Self = StObject.set(x, "visualIndex", value.asInstanceOf[js.Any])
  }
}
