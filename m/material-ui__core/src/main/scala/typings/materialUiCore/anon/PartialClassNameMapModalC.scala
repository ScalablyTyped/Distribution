package typings.materialUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Modal/Modal.ModalClassKey>> */
trait PartialClassNameMapModalC extends StObject {
  
  var hidden: js.UndefOr[String] = js.undefined
  
  var root: js.UndefOr[String] = js.undefined
}
object PartialClassNameMapModalC {
  
  @scala.inline
  def apply(): PartialClassNameMapModalC = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapModalC]
  }
  
  @scala.inline
  implicit class PartialClassNameMapModalCMutableBuilder[Self <: PartialClassNameMapModalC] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
