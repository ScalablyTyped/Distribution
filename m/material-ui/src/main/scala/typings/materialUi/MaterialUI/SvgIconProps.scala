package typings.materialUi.MaterialUI

import typings.react.mod.LegacyRef
import typings.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SvgIconProps
  extends StObject
     with SVGAttributes[js.Object] {
  
  var hoverColor: js.UndefOr[String] = js.undefined
  
  var ref: js.UndefOr[LegacyRef[SvgIcon]] = js.undefined
}
object SvgIconProps {
  
  inline def apply(): SvgIconProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SvgIconProps]
  }
  
  extension [Self <: SvgIconProps](x: Self) {
    
    inline def setHoverColor(value: String): Self = StObject.set(x, "hoverColor", value.asInstanceOf[js.Any])
    
    inline def setHoverColorUndefined: Self = StObject.set(x, "hoverColor", js.undefined)
    
    inline def setRef(value: LegacyRef[SvgIcon]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: /* instance */ SvgIcon | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}
