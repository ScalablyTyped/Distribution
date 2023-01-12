package typings.leaflet.mod

import typings.leaflet.leafletBooleans.`false`
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DivIconOptions
  extends StObject
     with BaseIconOptions {
  
  var bgPos: js.UndefOr[PointExpression] = js.undefined
  
  var html: js.UndefOr[String | HTMLElement | `false`] = js.undefined
}
object DivIconOptions {
  
  inline def apply(): DivIconOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DivIconOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DivIconOptions] (val x: Self) extends AnyVal {
    
    inline def setBgPos(value: PointExpression): Self = StObject.set(x, "bgPos", value.asInstanceOf[js.Any])
    
    inline def setBgPosUndefined: Self = StObject.set(x, "bgPos", js.undefined)
    
    inline def setHtml(value: String | HTMLElement | `false`): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
  }
}
