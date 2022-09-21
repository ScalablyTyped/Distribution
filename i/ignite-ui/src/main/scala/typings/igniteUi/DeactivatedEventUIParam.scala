package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeactivatedEventUIParam extends StObject {
  
  /**
    * Used to get reference to this igToolbarButton.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object DeactivatedEventUIParam {
  
  inline def apply(): DeactivatedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeactivatedEventUIParam]
  }
  
  extension [Self <: DeactivatedEventUIParam](x: Self) {
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
