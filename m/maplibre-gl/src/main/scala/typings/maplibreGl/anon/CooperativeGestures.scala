package typings.maplibreGl.anon

import typings.maplibreGl.mod.GestureOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CooperativeGestures extends StObject {
  
  var clickTolerance: Double
  
  var cooperativeGestures: Boolean | GestureOptions
}
object CooperativeGestures {
  
  inline def apply(clickTolerance: Double, cooperativeGestures: Boolean | GestureOptions): CooperativeGestures = {
    val __obj = js.Dynamic.literal(clickTolerance = clickTolerance.asInstanceOf[js.Any], cooperativeGestures = cooperativeGestures.asInstanceOf[js.Any])
    __obj.asInstanceOf[CooperativeGestures]
  }
  
  extension [Self <: CooperativeGestures](x: Self) {
    
    inline def setClickTolerance(value: Double): Self = StObject.set(x, "clickTolerance", value.asInstanceOf[js.Any])
    
    inline def setCooperativeGestures(value: Boolean | GestureOptions): Self = StObject.set(x, "cooperativeGestures", value.asInstanceOf[js.Any])
  }
}
