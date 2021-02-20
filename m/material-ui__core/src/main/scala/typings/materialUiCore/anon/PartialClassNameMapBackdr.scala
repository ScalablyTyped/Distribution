package typings.materialUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Backdrop/Backdrop.BackdropClassKey>> */
@js.native
trait PartialClassNameMapBackdr extends StObject {
  
  var invisible: js.UndefOr[String] = js.native
  
  var root: js.UndefOr[String] = js.native
}
object PartialClassNameMapBackdr {
  
  @scala.inline
  def apply(): PartialClassNameMapBackdr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapBackdr]
  }
  
  @scala.inline
  implicit class PartialClassNameMapBackdrMutableBuilder[Self <: PartialClassNameMapBackdr] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInvisible(value: String): Self = StObject.set(x, "invisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvisibleUndefined: Self = StObject.set(x, "invisible", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
