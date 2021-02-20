package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridGroupableMessages extends StObject {
  
  var empty: js.UndefOr[String] = js.native
}
object GridGroupableMessages {
  
  @scala.inline
  def apply(): GridGroupableMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridGroupableMessages]
  }
  
  @scala.inline
  implicit class GridGroupableMessagesMutableBuilder[Self <: GridGroupableMessages] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmpty(value: String): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
  }
}
