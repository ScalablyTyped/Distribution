package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelAllClickedEventUIParam extends StObject {
  
  /**
    * Gets the igUpload widget object.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object CancelAllClickedEventUIParam {
  
  inline def apply(): CancelAllClickedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelAllClickedEventUIParam]
  }
  
  extension [Self <: CancelAllClickedEventUIParam](x: Self) {
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
