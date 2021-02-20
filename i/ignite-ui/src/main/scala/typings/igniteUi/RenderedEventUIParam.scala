package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderedEventUIParam extends StObject {
  
  /**
    * Used to get a reference to the main/top combo element.
    */
  var element: js.UndefOr[js.Any] = js.native
  
  /**
    * Used to get a reference to the combo performing rendering.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object RenderedEventUIParam {
  
  @scala.inline
  def apply(): RenderedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderedEventUIParam]
  }
  
  @scala.inline
  implicit class RenderedEventUIParamMutableBuilder[Self <: RenderedEventUIParam] (val x: Self) extends AnyVal {
    
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
