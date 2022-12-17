package typings.grommet.anon

import typings.grommet.componentsBoxMod.BoxProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Footer extends StObject {
  
  var body: js.UndefOr[BoxProps] = js.undefined
  
  var container: js.UndefOr[BoxProps | `8`] = js.undefined
  
  var footer: js.UndefOr[BoxProps] = js.undefined
  
  var header: js.UndefOr[BoxProps] = js.undefined
  
  var hover: js.UndefOr[Container] = js.undefined
}
object Footer {
  
  inline def apply(): Footer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Footer]
  }
  
  extension [Self <: Footer](x: Self) {
    
    inline def setBody(value: BoxProps): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setContainer(value: BoxProps | `8`): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setFooter(value: BoxProps): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    inline def setHeader(value: BoxProps): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setHover(value: Container): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    inline def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
  }
}
