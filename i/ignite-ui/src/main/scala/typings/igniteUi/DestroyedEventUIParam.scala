package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DestroyedEventUIParam extends StObject {
  
  /**
    * Gets a reference to the grid.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}
object DestroyedEventUIParam {
  
  @scala.inline
  def apply(): DestroyedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestroyedEventUIParam]
  }
  
  @scala.inline
  implicit class DestroyedEventUIParamMutableBuilder[Self <: DestroyedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
