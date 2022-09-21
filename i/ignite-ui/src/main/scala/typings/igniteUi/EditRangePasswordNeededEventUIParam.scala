package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditRangePasswordNeededEventUIParam extends StObject {
  
  /**
    * Gets a reference to the spreadsheet widget.
    */
  var owner: js.UndefOr[Any] = js.undefined
  
  /**
    * Get an array of [protected range](ig.excel.WorksheetProtectedRange) objects that should be unlocked.
    */
  var ranges: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * Get a parameterless function that may be invoked to unlock the associated ranges.
    */
  var unprotect: js.UndefOr[Any] = js.undefined
}
object EditRangePasswordNeededEventUIParam {
  
  inline def apply(): EditRangePasswordNeededEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditRangePasswordNeededEventUIParam]
  }
  
  extension [Self <: EditRangePasswordNeededEventUIParam](x: Self) {
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setRanges(value: js.Array[Any]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    inline def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
    
    inline def setRangesVarargs(value: Any*): Self = StObject.set(x, "ranges", js.Array(value*))
    
    inline def setUnprotect(value: Any): Self = StObject.set(x, "unprotect", value.asInstanceOf[js.Any])
    
    inline def setUnprotectUndefined: Self = StObject.set(x, "unprotect", js.undefined)
  }
}
