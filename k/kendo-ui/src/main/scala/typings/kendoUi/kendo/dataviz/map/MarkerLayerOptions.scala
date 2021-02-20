package typings.kendoUi.kendo.dataviz.map

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarkerLayerOptions extends StObject {
  
  var name: js.UndefOr[String] = js.native
}
object MarkerLayerOptions {
  
  @scala.inline
  def apply(): MarkerLayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkerLayerOptions]
  }
  
  @scala.inline
  implicit class MarkerLayerOptionsMutableBuilder[Self <: MarkerLayerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
