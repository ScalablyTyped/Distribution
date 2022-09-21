package typings.googleapis.computeV1Mod.computeV1

import typings.googleapis.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDiskTypesScopedList extends StObject {
  
  /**
    * [Output Only] A list of disk types contained in this scope.
    */
  var diskTypes: js.UndefOr[js.Array[SchemaDiskType]] = js.undefined
  
  /**
    * [Output Only] Informational warning which replaces the list of disk types when the list is empty.
    */
  var warning: js.UndefOr[Code | Null] = js.undefined
}
object SchemaDiskTypesScopedList {
  
  inline def apply(): SchemaDiskTypesScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDiskTypesScopedList]
  }
  
  extension [Self <: SchemaDiskTypesScopedList](x: Self) {
    
    inline def setDiskTypes(value: js.Array[SchemaDiskType]): Self = StObject.set(x, "diskTypes", value.asInstanceOf[js.Any])
    
    inline def setDiskTypesUndefined: Self = StObject.set(x, "diskTypes", js.undefined)
    
    inline def setDiskTypesVarargs(value: SchemaDiskType*): Self = StObject.set(x, "diskTypes", js.Array(value*))
    
    inline def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningNull: Self = StObject.set(x, "warning", null)
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
