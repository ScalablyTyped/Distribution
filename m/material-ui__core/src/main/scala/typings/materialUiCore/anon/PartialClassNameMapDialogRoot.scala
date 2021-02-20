package typings.materialUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/DialogTitle/DialogTitle.DialogTitleClassKey>> */
@js.native
trait PartialClassNameMapDialogRoot extends StObject {
  
  var root: js.UndefOr[String] = js.native
}
object PartialClassNameMapDialogRoot {
  
  @scala.inline
  def apply(): PartialClassNameMapDialogRoot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapDialogRoot]
  }
  
  @scala.inline
  implicit class PartialClassNameMapDialogRootMutableBuilder[Self <: PartialClassNameMapDialogRoot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
