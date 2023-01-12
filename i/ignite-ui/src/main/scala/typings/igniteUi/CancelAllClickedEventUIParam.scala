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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CancelAllClickedEventUIParam] (val x: Self) extends AnyVal {
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
