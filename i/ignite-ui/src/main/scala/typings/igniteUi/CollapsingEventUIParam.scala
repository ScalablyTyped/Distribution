package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollapsingEventUIParam extends StObject {
  
  /**
    * Used to get a reference the igSplitButton.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object CollapsingEventUIParam {
  
  @scala.inline
  def apply(): CollapsingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollapsingEventUIParam]
  }
  
  @scala.inline
  implicit class CollapsingEventUIParamMutableBuilder[Self <: CollapsingEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
