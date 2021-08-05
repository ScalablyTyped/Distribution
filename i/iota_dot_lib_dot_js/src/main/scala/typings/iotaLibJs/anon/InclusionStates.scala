package typings.iotaLibJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InclusionStates extends StObject {
  
  var end: js.UndefOr[Double] = js.undefined
  
  var inclusionStates: js.UndefOr[Boolean] = js.undefined
  
  var security: js.UndefOr[typings.iotaLibJs.mod.Security] = js.undefined
  
  var start: js.UndefOr[Double] = js.undefined
}
object InclusionStates {
  
  inline def apply(): InclusionStates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InclusionStates]
  }
  
  extension [Self <: InclusionStates](x: Self) {
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setInclusionStates(value: Boolean): Self = StObject.set(x, "inclusionStates", value.asInstanceOf[js.Any])
    
    inline def setInclusionStatesUndefined: Self = StObject.set(x, "inclusionStates", js.undefined)
    
    inline def setSecurity(value: typings.iotaLibJs.mod.Security): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
    
    inline def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
