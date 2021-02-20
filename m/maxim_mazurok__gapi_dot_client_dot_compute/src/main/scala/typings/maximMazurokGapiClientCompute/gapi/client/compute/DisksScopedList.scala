package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.maximMazurokGapiClientCompute.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisksScopedList extends StObject {
  
  /** [Output Only] A list of disks contained in this scope. */
  var disks: js.UndefOr[js.Array[Disk]] = js.native
  
  /** [Output Only] Informational warning which replaces the list of disks when the list is empty. */
  var warning: js.UndefOr[Code] = js.native
}
object DisksScopedList {
  
  @scala.inline
  def apply(): DisksScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisksScopedList]
  }
  
  @scala.inline
  implicit class DisksScopedListMutableBuilder[Self <: DisksScopedList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisks(value: js.Array[Disk]): Self = StObject.set(x, "disks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisksUndefined: Self = StObject.set(x, "disks", js.undefined)
    
    @scala.inline
    def setDisksVarargs(value: Disk*): Self = StObject.set(x, "disks", js.Array(value :_*))
    
    @scala.inline
    def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
