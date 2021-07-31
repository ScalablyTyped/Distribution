package typings.igniteUi

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FooterRenderedEventUIParam extends StObject {
  
  /**
    * Gets a reference to the grid.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets a reference to footers table DOM element.
    */
  var table: js.UndefOr[Element] = js.undefined
}
object FooterRenderedEventUIParam {
  
  @scala.inline
  def apply(): FooterRenderedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FooterRenderedEventUIParam]
  }
  
  @scala.inline
  implicit class FooterRenderedEventUIParamMutableBuilder[Self <: FooterRenderedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setTable(value: Element): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
  }
}
