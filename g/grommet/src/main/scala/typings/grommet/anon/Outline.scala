package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Outline extends StObject {
  
  var border: js.UndefOr[`3`] = js.native
  
  var outline: js.UndefOr[ColorSize] = js.native
  
  var shadow: js.UndefOr[ColorSize] = js.native
}
object Outline {
  
  @scala.inline
  def apply(): Outline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Outline]
  }
  
  @scala.inline
  implicit class OutlineMutableBuilder[Self <: Outline] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorder(value: `3`): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    @scala.inline
    def setOutline(value: ColorSize): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
    
    @scala.inline
    def setShadow(value: ColorSize): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
  }
}
