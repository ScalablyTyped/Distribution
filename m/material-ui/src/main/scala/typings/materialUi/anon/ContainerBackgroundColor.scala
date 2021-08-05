package typings.materialUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerBackgroundColor extends StObject {
  
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  var containerBackgroundColor: js.UndefOr[String] = js.undefined
}
object ContainerBackgroundColor {
  
  inline def apply(): ContainerBackgroundColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerBackgroundColor]
  }
  
  extension [Self <: ContainerBackgroundColor](x: Self) {
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setContainerBackgroundColor(value: String): Self = StObject.set(x, "containerBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setContainerBackgroundColorUndefined: Self = StObject.set(x, "containerBackgroundColor", js.undefined)
  }
}
