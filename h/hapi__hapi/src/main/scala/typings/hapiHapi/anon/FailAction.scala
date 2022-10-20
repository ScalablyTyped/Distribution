package typings.hapiHapi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailAction extends StObject {
  
  var failAction: js.UndefOr[typings.hapiHapi.mod.Lifecycle.FailAction] = js.undefined
  
  var parse: js.UndefOr[Boolean] = js.undefined
}
object FailAction {
  
  inline def apply(): FailAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailAction]
  }
  
  extension [Self <: FailAction](x: Self) {
    
    inline def setFailAction(value: typings.hapiHapi.mod.Lifecycle.FailAction): Self = StObject.set(x, "failAction", value.asInstanceOf[js.Any])
    
    inline def setFailActionUndefined: Self = StObject.set(x, "failAction", js.undefined)
    
    inline def setParse(value: Boolean): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
    
    inline def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
  }
}
