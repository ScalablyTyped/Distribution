package typings.materialUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/CardActionArea/CardActionArea.CardActionAreaClassKey>> */
@js.native
trait PartialClassNameMapCardAc extends StObject {
  
  var focusHighlight: js.UndefOr[String] = js.native
  
  var focusVisible: js.UndefOr[String] = js.native
  
  var root: js.UndefOr[String] = js.native
}
object PartialClassNameMapCardAc {
  
  @scala.inline
  def apply(): PartialClassNameMapCardAc = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapCardAc]
  }
  
  @scala.inline
  implicit class PartialClassNameMapCardAcMutableBuilder[Self <: PartialClassNameMapCardAc] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFocusHighlight(value: String): Self = StObject.set(x, "focusHighlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusHighlightUndefined: Self = StObject.set(x, "focusHighlight", js.undefined)
    
    @scala.inline
    def setFocusVisible(value: String): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusVisibleUndefined: Self = StObject.set(x, "focusVisible", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
