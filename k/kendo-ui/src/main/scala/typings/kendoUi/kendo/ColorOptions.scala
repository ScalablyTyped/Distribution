package typings.kendoUi.kendo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorOptions extends StObject {
  
  var name: js.UndefOr[String] = js.native
}
object ColorOptions {
  
  @scala.inline
  def apply(): ColorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorOptions]
  }
  
  @scala.inline
  implicit class ColorOptionsMutableBuilder[Self <: ColorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
