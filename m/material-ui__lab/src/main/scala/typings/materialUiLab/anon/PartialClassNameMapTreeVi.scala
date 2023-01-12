package typings.materialUiLab.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/styles.@material-ui/styles/withStyles/withStyles.ClassNameMap<@material-ui/lab.@material-ui/lab/TreeView/TreeView.TreeViewClassKey>> */
trait PartialClassNameMapTreeVi extends StObject {
  
  var root: js.UndefOr[String] = js.undefined
}
object PartialClassNameMapTreeVi {
  
  inline def apply(): PartialClassNameMapTreeVi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapTreeVi]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialClassNameMapTreeVi] (val x: Self) extends AnyVal {
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
