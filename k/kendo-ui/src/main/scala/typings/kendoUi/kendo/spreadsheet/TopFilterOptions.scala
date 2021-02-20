package typings.kendoUi.kendo.spreadsheet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopFilterOptions extends StObject {
  
  var name: js.UndefOr[String] = js.native
}
object TopFilterOptions {
  
  @scala.inline
  def apply(): TopFilterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopFilterOptions]
  }
  
  @scala.inline
  implicit class TopFilterOptionsMutableBuilder[Self <: TopFilterOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
