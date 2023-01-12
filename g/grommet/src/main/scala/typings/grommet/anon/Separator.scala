package typings.grommet.anon

import typings.grommet.componentsBoxMod.BoxProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Separator extends StObject {
  
  var container: js.UndefOr[BoxProps] = js.undefined
  
  var separator: js.UndefOr[ColorPad] = js.undefined
}
object Separator {
  
  inline def apply(): Separator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Separator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Separator] (val x: Self) extends AnyVal {
    
    inline def setContainer(value: BoxProps): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setSeparator(value: ColorPad): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
  }
}
