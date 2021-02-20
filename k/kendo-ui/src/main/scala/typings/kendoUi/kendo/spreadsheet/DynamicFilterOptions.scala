package typings.kendoUi.kendo.spreadsheet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DynamicFilterOptions extends StObject {
  
  var name: js.UndefOr[String] = js.native
}
object DynamicFilterOptions {
  
  @scala.inline
  def apply(): DynamicFilterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DynamicFilterOptions]
  }
  
  @scala.inline
  implicit class DynamicFilterOptionsMutableBuilder[Self <: DynamicFilterOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
