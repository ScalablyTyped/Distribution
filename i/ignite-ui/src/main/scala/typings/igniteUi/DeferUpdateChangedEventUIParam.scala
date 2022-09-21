package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeferUpdateChangedEventUIParam extends StObject {
  
  /**
    * Gets the defer update value.
    */
  var deferUpdate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets a reference to the data selector.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object DeferUpdateChangedEventUIParam {
  
  inline def apply(): DeferUpdateChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeferUpdateChangedEventUIParam]
  }
  
  extension [Self <: DeferUpdateChangedEventUIParam](x: Self) {
    
    inline def setDeferUpdate(value: Boolean): Self = StObject.set(x, "deferUpdate", value.asInstanceOf[js.Any])
    
    inline def setDeferUpdateUndefined: Self = StObject.set(x, "deferUpdate", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
