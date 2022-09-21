package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModalDialogSortGroupedColumnEventUIParam extends StObject {
  
  /**
    * Gets whether column should be sorted ascending or descending.
    */
  var isAsc: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the key of the column to be grouped.
    */
  var key: js.UndefOr[String] = js.undefined
  
  /**
    * Get a reference to the current layout object, if any.
    */
  var layout: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets access the GroupBy widget object.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object ModalDialogSortGroupedColumnEventUIParam {
  
  inline def apply(): ModalDialogSortGroupedColumnEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModalDialogSortGroupedColumnEventUIParam]
  }
  
  extension [Self <: ModalDialogSortGroupedColumnEventUIParam](x: Self) {
    
    inline def setIsAsc(value: Boolean): Self = StObject.set(x, "isAsc", value.asInstanceOf[js.Any])
    
    inline def setIsAscUndefined: Self = StObject.set(x, "isAsc", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setLayout(value: Any): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
