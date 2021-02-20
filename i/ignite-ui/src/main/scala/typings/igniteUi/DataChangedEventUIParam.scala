package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataChangedEventUIParam extends StObject {
  
  /**
    * Used to obtain the new data.
    */
  var newData: js.UndefOr[js.Any] = js.native
  
  /**
    * Used to obtain reference to the barcode widget.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object DataChangedEventUIParam {
  
  @scala.inline
  def apply(): DataChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataChangedEventUIParam]
  }
  
  @scala.inline
  implicit class DataChangedEventUIParamMutableBuilder[Self <: DataChangedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewData(value: js.Any): Self = StObject.set(x, "newData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewDataUndefined: Self = StObject.set(x, "newData", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
