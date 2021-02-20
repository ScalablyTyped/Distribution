package typings.igniteUi

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CaptionRenderedEventUIParam extends StObject {
  
  /**
    * Gets a reference to the caption container.
    */
  var captionContainer: js.UndefOr[Element] = js.native
  
  /**
    * Gets a reference to the grid.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object CaptionRenderedEventUIParam {
  
  @scala.inline
  def apply(): CaptionRenderedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaptionRenderedEventUIParam]
  }
  
  @scala.inline
  implicit class CaptionRenderedEventUIParamMutableBuilder[Self <: CaptionRenderedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaptionContainer(value: Element): Self = StObject.set(x, "captionContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptionContainerUndefined: Self = StObject.set(x, "captionContainer", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
