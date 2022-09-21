package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'hash'> */
trait PickMapOptionshash extends StObject {
  
  var hash: js.UndefOr[Boolean | String] = js.undefined
}
object PickMapOptionshash {
  
  inline def apply(): PickMapOptionshash = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickMapOptionshash]
  }
  
  extension [Self <: PickMapOptionshash](x: Self) {
    
    inline def setHash(value: Boolean | String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
  }
}
