package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeferUpdateChangedEventUIParam extends StObject {
  
  /**
    * Gets the defer update value.
    */
  var deferUpdate: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets a reference to the data selector.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object DeferUpdateChangedEventUIParam {
  
  @scala.inline
  def apply(): DeferUpdateChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeferUpdateChangedEventUIParam]
  }
  
  @scala.inline
  implicit class DeferUpdateChangedEventUIParamMutableBuilder[Self <: DeferUpdateChangedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeferUpdate(value: Boolean): Self = StObject.set(x, "deferUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferUpdateUndefined: Self = StObject.set(x, "deferUpdate", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
