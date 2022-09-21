package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'failIfMajorPerformanceCaveat'> */
trait PickMapOptionsfailIfMajor extends StObject {
  
  var failIfMajorPerformanceCaveat: js.UndefOr[Boolean] = js.undefined
}
object PickMapOptionsfailIfMajor {
  
  inline def apply(): PickMapOptionsfailIfMajor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickMapOptionsfailIfMajor]
  }
  
  extension [Self <: PickMapOptionsfailIfMajor](x: Self) {
    
    inline def setFailIfMajorPerformanceCaveat(value: Boolean): Self = StObject.set(x, "failIfMajorPerformanceCaveat", value.asInstanceOf[js.Any])
    
    inline def setFailIfMajorPerformanceCaveatUndefined: Self = StObject.set(x, "failIfMajorPerformanceCaveat", js.undefined)
  }
}
