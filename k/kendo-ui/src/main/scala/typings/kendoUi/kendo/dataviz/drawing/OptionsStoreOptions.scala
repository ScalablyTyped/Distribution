package typings.kendoUi.kendo.dataviz.drawing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsStoreOptions extends StObject {
  
  var name: js.UndefOr[String] = js.native
}
object OptionsStoreOptions {
  
  @scala.inline
  def apply(): OptionsStoreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsStoreOptions]
  }
  
  @scala.inline
  implicit class OptionsStoreOptionsMutableBuilder[Self <: OptionsStoreOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
