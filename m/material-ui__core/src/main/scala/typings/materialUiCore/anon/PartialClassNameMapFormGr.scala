package typings.materialUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/styles.@material-ui/styles/withStyles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/FormGroup/FormGroup.FormGroupClassKey>> */
trait PartialClassNameMapFormGr extends StObject {
  
  var root: js.UndefOr[String] = js.undefined
  
  var row: js.UndefOr[String] = js.undefined
}
object PartialClassNameMapFormGr {
  
  inline def apply(): PartialClassNameMapFormGr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapFormGr]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialClassNameMapFormGr] (val x: Self) extends AnyVal {
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setRow(value: String): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
  }
}
