package typings.materialUi.MaterialUI

import typings.react.mod.HTMLAttributes
import typings.react.mod.LegacyRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontIconProps
  extends StObject
     with HTMLAttributes[js.Object] {
  
  var hoverColor: js.UndefOr[String] = js.undefined
  
  var ref: js.UndefOr[LegacyRef[FontIcon]] = js.undefined
}
object FontIconProps {
  
  inline def apply(): FontIconProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontIconProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FontIconProps] (val x: Self) extends AnyVal {
    
    inline def setHoverColor(value: String): Self = StObject.set(x, "hoverColor", value.asInstanceOf[js.Any])
    
    inline def setHoverColorUndefined: Self = StObject.set(x, "hoverColor", js.undefined)
    
    inline def setRef(value: LegacyRef[FontIcon]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: /* instance */ FontIcon | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}
