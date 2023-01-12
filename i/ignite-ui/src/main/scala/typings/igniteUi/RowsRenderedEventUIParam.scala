package typings.igniteUi

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowsRenderedEventUIParam extends StObject {
  
  /**
    * Gets a reference to the grid.
    */
  var owner: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets reference to the grid's table body.
    */
  var tbody: js.UndefOr[Element] = js.undefined
}
object RowsRenderedEventUIParam {
  
  inline def apply(): RowsRenderedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowsRenderedEventUIParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RowsRenderedEventUIParam] (val x: Self) extends AnyVal {
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setTbody(value: Element): Self = StObject.set(x, "tbody", value.asInstanceOf[js.Any])
    
    inline def setTbodyUndefined: Self = StObject.set(x, "tbody", js.undefined)
  }
}
