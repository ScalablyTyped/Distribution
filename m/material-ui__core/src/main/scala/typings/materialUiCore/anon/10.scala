package typings.materialUiCore.anon

import typings.materialUiCore.materialUiCoreStrings.p
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `10` extends StObject {
  
  var component: js.UndefOr[p] = js.undefined
}
object `10` {
  
  inline def apply(): `10` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`10`]
  }
  
  extension [Self <: `10`](x: Self) {
    
    inline def setComponent(value: p): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
  }
}
