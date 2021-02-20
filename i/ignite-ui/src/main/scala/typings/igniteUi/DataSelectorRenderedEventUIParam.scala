package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSelectorRenderedEventUIParam extends StObject {
  
  /**
    * Gets a reference to the data selector.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object DataSelectorRenderedEventUIParam {
  
  @scala.inline
  def apply(): DataSelectorRenderedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSelectorRenderedEventUIParam]
  }
  
  @scala.inline
  implicit class DataSelectorRenderedEventUIParamMutableBuilder[Self <: DataSelectorRenderedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
