package typings.jest.mod.jest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MockOptions extends StObject {
  
  var virtual: js.UndefOr[Boolean] = js.undefined
}
object MockOptions {
  
  inline def apply(): MockOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MockOptions]
  }
  
  extension [Self <: MockOptions](x: Self) {
    
    inline def setVirtual(value: Boolean): Self = StObject.set(x, "virtual", value.asInstanceOf[js.Any])
    
    inline def setVirtualUndefined: Self = StObject.set(x, "virtual", js.undefined)
  }
}
