package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModalDialogGroupColumnEventUIParam extends StObject {
  
  /**
    * Gets a reference to the current groupedColumns.
    */
  var groupedColumns: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * The key of the column to be grouped.
    */
  var key: js.UndefOr[String] = js.undefined
  
  /**
    * Gets a reference to the current layout object, if any.
    */
  var layout: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets access the GroupBy widget object.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object ModalDialogGroupColumnEventUIParam {
  
  inline def apply(): ModalDialogGroupColumnEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModalDialogGroupColumnEventUIParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModalDialogGroupColumnEventUIParam] (val x: Self) extends AnyVal {
    
    inline def setGroupedColumns(value: js.Array[Any]): Self = StObject.set(x, "groupedColumns", value.asInstanceOf[js.Any])
    
    inline def setGroupedColumnsUndefined: Self = StObject.set(x, "groupedColumns", js.undefined)
    
    inline def setGroupedColumnsVarargs(value: Any*): Self = StObject.set(x, "groupedColumns", js.Array(value*))
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setLayout(value: Any): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
