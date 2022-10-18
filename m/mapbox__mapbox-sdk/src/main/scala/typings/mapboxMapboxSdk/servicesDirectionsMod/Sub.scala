package typings.mapboxMapboxSdk.servicesDirectionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sub extends StObject {
  
  /**
    * Objects that, together, make up what should be displayed in the banner.
    * Includes additional information intended to be used to aid in visual layout
    */
  var components: js.Array[Component]
  
  /**
    * String that contains all the text that should be displayed.
    */
  var text: String
}
object Sub {
  
  inline def apply(components: js.Array[Component], text: String): Sub = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sub]
  }
  
  extension [Self <: Sub](x: Self) {
    
    inline def setComponents(value: js.Array[Component]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setComponentsVarargs(value: Component*): Self = StObject.set(x, "components", js.Array(value*))
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
