package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpandedEventUIParam extends StObject {
  
  /**
    * Used to get a reference the igSplitButton.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object ExpandedEventUIParam {
  
  inline def apply(): ExpandedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpandedEventUIParam]
  }
  
  extension [Self <: ExpandedEventUIParam](x: Self) {
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
