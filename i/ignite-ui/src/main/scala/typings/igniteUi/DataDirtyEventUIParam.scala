package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataDirtyEventUIParam extends StObject {
  
  /**
    * Gets a reference to GridUpdating.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}
object DataDirtyEventUIParam {
  
  inline def apply(): DataDirtyEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataDirtyEventUIParam]
  }
  
  extension [Self <: DataDirtyEventUIParam](x: Self) {
    
    inline def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
