package typings.lonaSvgModel.svgTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGUseAttributes
  extends StObject
     with SVGBaseAttributes {
  
  var href: js.UndefOr[String] = js.undefined
  
  @JSName("xlink:href")
  var xlinkColonhref: js.UndefOr[String] = js.undefined
}
object SVGUseAttributes {
  
  inline def apply(): SVGUseAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGUseAttributes]
  }
  
  extension [Self <: SVGUseAttributes](x: Self) {
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    inline def setXlinkColonhref(value: String): Self = StObject.set(x, "xlink:href", value.asInstanceOf[js.Any])
    
    inline def setXlinkColonhrefUndefined: Self = StObject.set(x, "xlink:href", js.undefined)
  }
}
