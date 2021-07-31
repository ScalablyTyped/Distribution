package typings.kendoUi.kendo.dataviz.map

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayerOptions extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
}
object LayerOptions {
  
  @scala.inline
  def apply(): LayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayerOptions]
  }
  
  @scala.inline
  implicit class LayerOptionsMutableBuilder[Self <: LayerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
