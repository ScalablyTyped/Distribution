package typings.googleapis.computeV1Mod.computeV1

import typings.googleapis.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaDiskTypesScopedList extends StObject {
  
  /**
    * [Output Only] A list of disk types contained in this scope.
    */
  var diskTypes: js.UndefOr[js.Array[SchemaDiskType]] = js.native
  
  /**
    * [Output Only] Informational warning which replaces the list of disk types
    * when the list is empty.
    */
  var warning: js.UndefOr[Code] = js.native
}
object SchemaDiskTypesScopedList {
  
  @scala.inline
  def apply(): SchemaDiskTypesScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDiskTypesScopedList]
  }
  
  @scala.inline
  implicit class SchemaDiskTypesScopedListMutableBuilder[Self <: SchemaDiskTypesScopedList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDiskTypes(value: js.Array[SchemaDiskType]): Self = StObject.set(x, "diskTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiskTypesUndefined: Self = StObject.set(x, "diskTypes", js.undefined)
    
    @scala.inline
    def setDiskTypesVarargs(value: SchemaDiskType*): Self = StObject.set(x, "diskTypes", js.Array(value :_*))
    
    @scala.inline
    def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
