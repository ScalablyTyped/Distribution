package typings.leafletRoutingMachine.mod.Routing_

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItineraryBuilderOptions extends StObject {
  
  var containerClassName: String = js.native
}
object ItineraryBuilderOptions {
  
  @scala.inline
  def apply(containerClassName: String): ItineraryBuilderOptions = {
    val __obj = js.Dynamic.literal(containerClassName = containerClassName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItineraryBuilderOptions]
  }
  
  @scala.inline
  implicit class ItineraryBuilderOptionsMutableBuilder[Self <: ItineraryBuilderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerClassName(value: String): Self = StObject.set(x, "containerClassName", value.asInstanceOf[js.Any])
  }
}
