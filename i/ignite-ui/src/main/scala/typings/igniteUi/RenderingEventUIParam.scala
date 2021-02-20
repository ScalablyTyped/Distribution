package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderingEventUIParam extends StObject {
  
  /**
    * Gets a reference to the editor element.
    */
  var element: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets a reference to the editor performing rendering.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object RenderingEventUIParam {
  
  @scala.inline
  def apply(): RenderingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderingEventUIParam]
  }
  
  @scala.inline
  implicit class RenderingEventUIParamMutableBuilder[Self <: RenderingEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
