package typings.kendoUi.kendo.dataviz.diagram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShapeConnector extends StObject {
  
  var description: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var position: js.UndefOr[js.Function] = js.native
}
object ShapeConnector {
  
  @scala.inline
  def apply(): ShapeConnector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShapeConnector]
  }
  
  @scala.inline
  implicit class ShapeConnectorMutableBuilder[Self <: ShapeConnector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPosition(value: js.Function): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
