package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataChangedEventUIParam extends StObject {
  
  /**
    * Used to obtain the new data.
    */
  var newData: js.UndefOr[Any] = js.undefined
  
  /**
    * Used to obtain reference to the barcode widget.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object DataChangedEventUIParam {
  
  inline def apply(): DataChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataChangedEventUIParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataChangedEventUIParam] (val x: Self) extends AnyVal {
    
    inline def setNewData(value: Any): Self = StObject.set(x, "newData", value.asInstanceOf[js.Any])
    
    inline def setNewDataUndefined: Self = StObject.set(x, "newData", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
