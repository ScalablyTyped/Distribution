package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditRangePasswordNeededEventUIParam extends StObject {
  
  /**
    * Gets a reference to the spreadsheet widget.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Get an array of [protected range](ig.excel.WorksheetProtectedRange) objects that should be unlocked.
    */
  var ranges: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  /**
    * Get a parameterless function that may be invoked to unlock the associated ranges.
    */
  var unprotect: js.UndefOr[js.Any] = js.undefined
}
object EditRangePasswordNeededEventUIParam {
  
  @scala.inline
  def apply(): EditRangePasswordNeededEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditRangePasswordNeededEventUIParam]
  }
  
  @scala.inline
  implicit class EditRangePasswordNeededEventUIParamMutableBuilder[Self <: EditRangePasswordNeededEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setRanges(value: js.Array[js.Any]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
    
    @scala.inline
    def setRangesVarargs(value: js.Any*): Self = StObject.set(x, "ranges", js.Array(value :_*))
    
    @scala.inline
    def setUnprotect(value: js.Any): Self = StObject.set(x, "unprotect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnprotectUndefined: Self = StObject.set(x, "unprotect", js.undefined)
  }
}
