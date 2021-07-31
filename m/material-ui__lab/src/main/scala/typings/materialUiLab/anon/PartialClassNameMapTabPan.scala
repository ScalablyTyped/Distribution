package typings.materialUiLab.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/lab.@material-ui/lab/TabPanel/TabPanel.TabPanelClassKey>> */
trait PartialClassNameMapTabPan extends StObject {
  
  var root: js.UndefOr[String] = js.undefined
}
object PartialClassNameMapTabPan {
  
  @scala.inline
  def apply(): PartialClassNameMapTabPan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapTabPan]
  }
  
  @scala.inline
  implicit class PartialClassNameMapTabPanMutableBuilder[Self <: PartialClassNameMapTabPan] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
