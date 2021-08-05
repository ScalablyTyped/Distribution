package typings.hapi.anon

import typings.hapi.hapiBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  @JSName("apply")
  var apply: js.UndefOr[Boolean] = js.undefined
  
  var extend: `true`
}
object `0` {
  
  inline def apply(): `0` = {
    val __obj = js.Dynamic.literal(extend = true)
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setApply(value: Boolean): Self = StObject.set(x, "apply", value.asInstanceOf[js.Any])
    
    inline def setApplyUndefined: Self = StObject.set(x, "apply", js.undefined)
    
    inline def setExtend(value: `true`): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
  }
}
