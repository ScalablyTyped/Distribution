package typings.jointjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stubs extends StObject {
  
  var stubs: js.UndefOr[Double] = js.undefined
}
object Stubs {
  
  inline def apply(): Stubs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Stubs]
  }
  
  extension [Self <: Stubs](x: Self) {
    
    inline def setStubs(value: Double): Self = StObject.set(x, "stubs", value.asInstanceOf[js.Any])
    
    inline def setStubsUndefined: Self = StObject.set(x, "stubs", js.undefined)
  }
}
