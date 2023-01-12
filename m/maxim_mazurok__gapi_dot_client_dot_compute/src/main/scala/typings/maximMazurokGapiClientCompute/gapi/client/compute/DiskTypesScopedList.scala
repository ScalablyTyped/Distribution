package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.maximMazurokGapiClientCompute.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiskTypesScopedList extends StObject {
  
  /** [Output Only] A list of disk types contained in this scope. */
  var diskTypes: js.UndefOr[js.Array[DiskType]] = js.undefined
  
  /** [Output Only] Informational warning which replaces the list of disk types when the list is empty. */
  var warning: js.UndefOr[Code] = js.undefined
}
object DiskTypesScopedList {
  
  inline def apply(): DiskTypesScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiskTypesScopedList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DiskTypesScopedList] (val x: Self) extends AnyVal {
    
    inline def setDiskTypes(value: js.Array[DiskType]): Self = StObject.set(x, "diskTypes", value.asInstanceOf[js.Any])
    
    inline def setDiskTypesUndefined: Self = StObject.set(x, "diskTypes", js.undefined)
    
    inline def setDiskTypesVarargs(value: DiskType*): Self = StObject.set(x, "diskTypes", js.Array(value*))
    
    inline def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
