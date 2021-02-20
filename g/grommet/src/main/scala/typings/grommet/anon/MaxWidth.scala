package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaxWidth extends StObject {
  
  var height: js.UndefOr[String] = js.native
  
  var maxWidth: js.UndefOr[String] = js.native
  
  var size: js.UndefOr[String] = js.native
}
object MaxWidth {
  
  @scala.inline
  def apply(): MaxWidth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxWidth]
  }
  
  @scala.inline
  implicit class MaxWidthMutableBuilder[Self <: MaxWidth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: String): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
