package typings.hippyReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayoutEvent extends StObject {
  
  /**
    * The event data of layout event
    */
  var layout: LayoutContent
}
object LayoutEvent {
  
  inline def apply(layout: LayoutContent): LayoutEvent = {
    val __obj = js.Dynamic.literal(layout = layout.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutEvent]
  }
  
  extension [Self <: LayoutEvent](x: Self) {
    
    inline def setLayout(value: LayoutContent): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
  }
}
