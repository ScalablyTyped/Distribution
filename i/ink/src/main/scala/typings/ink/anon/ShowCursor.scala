package typings.ink.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShowCursor extends StObject {
  
  var showCursor: js.UndefOr[Boolean] = js.native
}
object ShowCursor {
  
  @scala.inline
  def apply(): ShowCursor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShowCursor]
  }
  
  @scala.inline
  implicit class ShowCursorMutableBuilder[Self <: ShowCursor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShowCursor(value: Boolean): Self = StObject.set(x, "showCursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowCursorUndefined: Self = StObject.set(x, "showCursor", js.undefined)
  }
}
