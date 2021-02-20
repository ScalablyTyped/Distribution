package typings.leaflet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PanInsideOptions extends StObject {
  
  var padding: js.UndefOr[PointExpression] = js.native
  
  var paddingBottomRight: js.UndefOr[PointExpression] = js.native
  
  var paddingTopLeft: js.UndefOr[PointExpression] = js.native
}
object PanInsideOptions {
  
  @scala.inline
  def apply(): PanInsideOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PanInsideOptions]
  }
  
  @scala.inline
  implicit class PanInsideOptionsMutableBuilder[Self <: PanInsideOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPadding(value: PointExpression): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingBottomRight(value: PointExpression): Self = StObject.set(x, "paddingBottomRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingBottomRightUndefined: Self = StObject.set(x, "paddingBottomRight", js.undefined)
    
    @scala.inline
    def setPaddingTopLeft(value: PointExpression): Self = StObject.set(x, "paddingTopLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingTopLeftUndefined: Self = StObject.set(x, "paddingTopLeft", js.undefined)
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
  }
}
