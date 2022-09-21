package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeneratePrimaryKeyValueEventUIParam extends StObject {
  
  /**
    * Gets a reference to GridUpdating.
    */
  var owner: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets the auto-generated primary key (the number of records in the data source + 1) or set a custom unique primary key for the new row.
    */
  var value: js.UndefOr[Any] = js.undefined
}
object GeneratePrimaryKeyValueEventUIParam {
  
  inline def apply(): GeneratePrimaryKeyValueEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeneratePrimaryKeyValueEventUIParam]
  }
  
  extension [Self <: GeneratePrimaryKeyValueEventUIParam](x: Self) {
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
