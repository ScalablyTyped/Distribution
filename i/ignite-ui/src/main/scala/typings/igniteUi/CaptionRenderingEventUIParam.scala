package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaptionRenderingEventUIParam extends StObject {
  
  /**
    * Gets a reference to the grid.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}
object CaptionRenderingEventUIParam {
  
  @scala.inline
  def apply(): CaptionRenderingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaptionRenderingEventUIParam]
  }
  
  @scala.inline
  implicit class CaptionRenderingEventUIParamMutableBuilder[Self <: CaptionRenderingEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
