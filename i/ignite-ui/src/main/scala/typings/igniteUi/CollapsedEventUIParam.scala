package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollapsedEventUIParam extends StObject {
  
  /**
    * Used to get a reference the igSplitButton.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}
object CollapsedEventUIParam {
  
  inline def apply(): CollapsedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollapsedEventUIParam]
  }
  
  extension [Self <: CollapsedEventUIParam](x: Self) {
    
    inline def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
