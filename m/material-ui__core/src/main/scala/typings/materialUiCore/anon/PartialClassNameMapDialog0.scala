package typings.materialUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/styles.@material-ui/styles/withStyles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/DialogTitle/DialogTitle.DialogTitleClassKey>> */
trait PartialClassNameMapDialog0 extends StObject {
  
  var root: js.UndefOr[String] = js.undefined
}
object PartialClassNameMapDialog0 {
  
  inline def apply(): PartialClassNameMapDialog0 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapDialog0]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialClassNameMapDialog0] (val x: Self) extends AnyVal {
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
