package typings.hippyReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndEdgePos extends StObject {
  
  var endEdgePos: Double
  
  var firstVisibleRowIndex: Double
  
  var lastVisibleRowIndex: Double
  
  var startEdgePos: Double
  
  var visibleRowFrames: js.Object
}
object EndEdgePos {
  
  inline def apply(
    endEdgePos: Double,
    firstVisibleRowIndex: Double,
    lastVisibleRowIndex: Double,
    startEdgePos: Double,
    visibleRowFrames: js.Object
  ): EndEdgePos = {
    val __obj = js.Dynamic.literal(endEdgePos = endEdgePos.asInstanceOf[js.Any], firstVisibleRowIndex = firstVisibleRowIndex.asInstanceOf[js.Any], lastVisibleRowIndex = lastVisibleRowIndex.asInstanceOf[js.Any], startEdgePos = startEdgePos.asInstanceOf[js.Any], visibleRowFrames = visibleRowFrames.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndEdgePos]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EndEdgePos] (val x: Self) extends AnyVal {
    
    inline def setEndEdgePos(value: Double): Self = StObject.set(x, "endEdgePos", value.asInstanceOf[js.Any])
    
    inline def setFirstVisibleRowIndex(value: Double): Self = StObject.set(x, "firstVisibleRowIndex", value.asInstanceOf[js.Any])
    
    inline def setLastVisibleRowIndex(value: Double): Self = StObject.set(x, "lastVisibleRowIndex", value.asInstanceOf[js.Any])
    
    inline def setStartEdgePos(value: Double): Self = StObject.set(x, "startEdgePos", value.asInstanceOf[js.Any])
    
    inline def setVisibleRowFrames(value: js.Object): Self = StObject.set(x, "visibleRowFrames", value.asInstanceOf[js.Any])
  }
}
