package typings.mapboxMapboxSdk.directionsMod

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
  
  @scala.inline
  def apply(components: js.Array[Component], text: String): Sub = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sub]
  }
  
  @scala.inline
  implicit class SubMutableBuilder[Self <: Sub] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponents(value: js.Array[Component]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentsVarargs(value: Component*): Self = StObject.set(x, "components", js.Array(value :_*))
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
