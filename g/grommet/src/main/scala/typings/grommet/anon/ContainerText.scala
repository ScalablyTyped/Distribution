package typings.grommet.anon

import typings.grommet.componentsBoxMod.BoxProps
import typings.grommet.componentsTextMod.TextProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerText extends StObject {
  
  var container: js.UndefOr[BoxProps] = js.undefined
  
  var text: js.UndefOr[TextProps] = js.undefined
}
object ContainerText {
  
  inline def apply(): ContainerText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerText]
  }
  
  extension [Self <: ContainerText](x: Self) {
    
    inline def setContainer(value: BoxProps): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setText(value: TextProps): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
