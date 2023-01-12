package typings.leafletRoutingMachine.leafletMod.Routing_

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItineraryBuilderOptions extends StObject {
  
  var containerClassName: String
}
object ItineraryBuilderOptions {
  
  inline def apply(containerClassName: String): ItineraryBuilderOptions = {
    val __obj = js.Dynamic.literal(containerClassName = containerClassName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItineraryBuilderOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ItineraryBuilderOptions] (val x: Self) extends AnyVal {
    
    inline def setContainerClassName(value: String): Self = StObject.set(x, "containerClassName", value.asInstanceOf[js.Any])
  }
}
