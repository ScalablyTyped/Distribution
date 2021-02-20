package typings.materialUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Tabs/TabIndicator.TabIndicatorClassKey>> */
@js.native
trait PartialClassNameMapTabInd extends StObject {
  
  var colorPrimary: js.UndefOr[String] = js.native
  
  var colorSecondary: js.UndefOr[String] = js.native
  
  var root: js.UndefOr[String] = js.native
}
object PartialClassNameMapTabInd {
  
  @scala.inline
  def apply(): PartialClassNameMapTabInd = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapTabInd]
  }
  
  @scala.inline
  implicit class PartialClassNameMapTabIndMutableBuilder[Self <: PartialClassNameMapTabInd] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColorPrimary(value: String): Self = StObject.set(x, "colorPrimary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorPrimaryUndefined: Self = StObject.set(x, "colorPrimary", js.undefined)
    
    @scala.inline
    def setColorSecondary(value: String): Self = StObject.set(x, "colorSecondary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorSecondaryUndefined: Self = StObject.set(x, "colorSecondary", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
