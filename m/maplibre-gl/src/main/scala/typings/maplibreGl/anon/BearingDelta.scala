package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BearingDelta extends StObject {
  
  var bearingDelta: Double
}
object BearingDelta {
  
  inline def apply(bearingDelta: Double): BearingDelta = {
    val __obj = js.Dynamic.literal(bearingDelta = bearingDelta.asInstanceOf[js.Any])
    __obj.asInstanceOf[BearingDelta]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BearingDelta] (val x: Self) extends AnyVal {
    
    inline def setBearingDelta(value: Double): Self = StObject.set(x, "bearingDelta", value.asInstanceOf[js.Any])
  }
}
