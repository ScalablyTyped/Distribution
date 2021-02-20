package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataRenderingEventUIParam extends StObject {
  
  /**
    * Gets a reference to the grid.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object DataRenderingEventUIParam {
  
  @scala.inline
  def apply(): DataRenderingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataRenderingEventUIParam]
  }
  
  @scala.inline
  implicit class DataRenderingEventUIParamMutableBuilder[Self <: DataRenderingEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
