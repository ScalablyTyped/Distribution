package typings.kendoUi.kendo.dataviz.geometry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SizeOptions extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
}
object SizeOptions {
  
  @scala.inline
  def apply(): SizeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SizeOptions]
  }
  
  @scala.inline
  implicit class SizeOptionsMutableBuilder[Self <: SizeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
