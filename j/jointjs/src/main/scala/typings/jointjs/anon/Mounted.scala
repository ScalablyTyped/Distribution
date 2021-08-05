package typings.jointjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mounted extends StObject {
  
  var mounted: Double
  
  var unmounted: Double
}
object Mounted {
  
  inline def apply(mounted: Double, unmounted: Double): Mounted = {
    val __obj = js.Dynamic.literal(mounted = mounted.asInstanceOf[js.Any], unmounted = unmounted.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mounted]
  }
  
  extension [Self <: Mounted](x: Self) {
    
    inline def setMounted(value: Double): Self = StObject.set(x, "mounted", value.asInstanceOf[js.Any])
    
    inline def setUnmounted(value: Double): Self = StObject.set(x, "unmounted", value.asInstanceOf[js.Any])
  }
}
