package typings.igniteUi

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeaderCellRenderedEventUIParam extends StObject {
  
  /**
    * Gets the column key.
    */
  var columnKey: js.UndefOr[String] = js.native
  
  /**
    * Gets a reference to the grid.
    */
  var owner: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets a reference to header cell DOM element.
    */
  var th: js.UndefOr[Element] = js.native
}
object HeaderCellRenderedEventUIParam {
  
  @scala.inline
  def apply(): HeaderCellRenderedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeaderCellRenderedEventUIParam]
  }
  
  @scala.inline
  implicit class HeaderCellRenderedEventUIParamMutableBuilder[Self <: HeaderCellRenderedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnKey(value: String): Self = StObject.set(x, "columnKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnKeyUndefined: Self = StObject.set(x, "columnKey", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setTh(value: Element): Self = StObject.set(x, "th", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThUndefined: Self = StObject.set(x, "th", js.undefined)
  }
}
