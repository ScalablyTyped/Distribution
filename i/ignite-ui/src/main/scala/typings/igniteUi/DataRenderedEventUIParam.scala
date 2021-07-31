package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataRenderedEventUIParam extends StObject {
  
  /**
    * Gets a reference to the grid.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}
object DataRenderedEventUIParam {
  
  @scala.inline
  def apply(): DataRenderedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataRenderedEventUIParam]
  }
  
  @scala.inline
  implicit class DataRenderedEventUIParamMutableBuilder[Self <: DataRenderedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
