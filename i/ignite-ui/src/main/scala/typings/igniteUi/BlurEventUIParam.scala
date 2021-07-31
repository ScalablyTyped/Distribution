package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlurEventUIParam extends StObject {
  
  /**
    * Gets a reference to the igDialog widget.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}
object BlurEventUIParam {
  
  @scala.inline
  def apply(): BlurEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlurEventUIParam]
  }
  
  @scala.inline
  implicit class BlurEventUIParamMutableBuilder[Self <: BlurEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
