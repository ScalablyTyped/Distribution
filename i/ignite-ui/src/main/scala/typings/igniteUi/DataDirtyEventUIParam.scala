package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataDirtyEventUIParam extends StObject {
  
  /**
    * Gets a reference to GridUpdating.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object DataDirtyEventUIParam {
  
  inline def apply(): DataDirtyEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataDirtyEventUIParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataDirtyEventUIParam] (val x: Self) extends AnyVal {
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
