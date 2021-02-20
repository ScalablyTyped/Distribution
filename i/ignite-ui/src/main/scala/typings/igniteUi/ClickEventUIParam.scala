package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClickEventUIParam extends StObject {
  
  /**
    * Used to get a reference the igSplitButton element.
    */
  var item: js.UndefOr[js.Any] = js.native
}
object ClickEventUIParam {
  
  @scala.inline
  def apply(): ClickEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClickEventUIParam]
  }
  
  @scala.inline
  implicit class ClickEventUIParamMutableBuilder[Self <: ClickEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItem(value: js.Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
  }
}
