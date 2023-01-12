package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterDialogContentsRenderingEventUIParam extends StObject {
  
  /**
    * Gets reference to the filtering dialog DOM element.
    */
  var dialogElement: js.UndefOr[String] = js.undefined
  
  /**
    * Gets reference to GridFiltering.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object FilterDialogContentsRenderingEventUIParam {
  
  inline def apply(): FilterDialogContentsRenderingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterDialogContentsRenderingEventUIParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilterDialogContentsRenderingEventUIParam] (val x: Self) extends AnyVal {
    
    inline def setDialogElement(value: String): Self = StObject.set(x, "dialogElement", value.asInstanceOf[js.Any])
    
    inline def setDialogElementUndefined: Self = StObject.set(x, "dialogElement", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
