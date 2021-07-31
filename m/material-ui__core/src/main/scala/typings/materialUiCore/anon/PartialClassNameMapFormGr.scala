package typings.materialUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/FormGroup/FormGroup.FormGroupClassKey>> */
trait PartialClassNameMapFormGr extends StObject {
  
  var root: js.UndefOr[String] = js.undefined
  
  var row: js.UndefOr[String] = js.undefined
}
object PartialClassNameMapFormGr {
  
  @scala.inline
  def apply(): PartialClassNameMapFormGr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapFormGr]
  }
  
  @scala.inline
  implicit class PartialClassNameMapFormGrMutableBuilder[Self <: PartialClassNameMapFormGr] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    @scala.inline
    def setRow(value: String): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
  }
}
