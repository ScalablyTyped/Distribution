package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModalDialogUngroupColumnEventUIParam extends StObject {
  
  /**
    * Gets a reference to the current groupedColumns.
    */
  var groupedColumns: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  /**
    * Gets the key of the column to be grouped.
    */
  var key: js.UndefOr[String] = js.undefined
  
  /**
    * Get a reference to the current layout object, if any.
    */
  var layout: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets access the GroupBy widget object.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}
object ModalDialogUngroupColumnEventUIParam {
  
  inline def apply(): ModalDialogUngroupColumnEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModalDialogUngroupColumnEventUIParam]
  }
  
  extension [Self <: ModalDialogUngroupColumnEventUIParam](x: Self) {
    
    inline def setGroupedColumns(value: js.Array[js.Any]): Self = StObject.set(x, "groupedColumns", value.asInstanceOf[js.Any])
    
    inline def setGroupedColumnsUndefined: Self = StObject.set(x, "groupedColumns", js.undefined)
    
    inline def setGroupedColumnsVarargs(value: js.Any*): Self = StObject.set(x, "groupedColumns", js.Array(value :_*))
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setLayout(value: js.Any): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
