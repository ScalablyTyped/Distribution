package typings.kendoUi.kendo.dataviz.drawing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinearGradientOptions extends StObject {
  
  var name: js.UndefOr[String] = js.native
  
  var stops: js.UndefOr[js.Any] = js.native
}
object LinearGradientOptions {
  
  @scala.inline
  def apply(): LinearGradientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinearGradientOptions]
  }
  
  @scala.inline
  implicit class LinearGradientOptionsMutableBuilder[Self <: LinearGradientOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setStops(value: js.Any): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopsUndefined: Self = StObject.set(x, "stops", js.undefined)
  }
}
