package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterDialogContentsRenderedEventUIParam extends StObject {
  
  /**
    * Gets reference to the filtering dialog DOM element.
    */
  var dialogElement: js.UndefOr[String] = js.undefined
  
  /**
    * Gets reference to GridFiltering.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}
object FilterDialogContentsRenderedEventUIParam {
  
  inline def apply(): FilterDialogContentsRenderedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterDialogContentsRenderedEventUIParam]
  }
  
  extension [Self <: FilterDialogContentsRenderedEventUIParam](x: Self) {
    
    inline def setDialogElement(value: String): Self = StObject.set(x, "dialogElement", value.asInstanceOf[js.Any])
    
    inline def setDialogElementUndefined: Self = StObject.set(x, "dialogElement", js.undefined)
    
    inline def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
