package typings.kendoUi.kendo.dataviz.map

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShapeLayerOptions extends StObject {
  
  var name: js.UndefOr[String] = js.native
}
object ShapeLayerOptions {
  
  @scala.inline
  def apply(): ShapeLayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShapeLayerOptions]
  }
  
  @scala.inline
  implicit class ShapeLayerOptionsMutableBuilder[Self <: ShapeLayerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
