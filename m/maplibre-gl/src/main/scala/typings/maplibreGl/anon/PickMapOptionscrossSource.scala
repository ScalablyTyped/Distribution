package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'crossSourceCollisions'> */
trait PickMapOptionscrossSource extends StObject {
  
  var crossSourceCollisions: js.UndefOr[Boolean] = js.undefined
}
object PickMapOptionscrossSource {
  
  inline def apply(): PickMapOptionscrossSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickMapOptionscrossSource]
  }
  
  extension [Self <: PickMapOptionscrossSource](x: Self) {
    
    inline def setCrossSourceCollisions(value: Boolean): Self = StObject.set(x, "crossSourceCollisions", value.asInstanceOf[js.Any])
    
    inline def setCrossSourceCollisionsUndefined: Self = StObject.set(x, "crossSourceCollisions", js.undefined)
  }
}
