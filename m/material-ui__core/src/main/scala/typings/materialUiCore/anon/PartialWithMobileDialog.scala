package typings.materialUiCore.anon

import typings.materialUiCore.stylesCreateBreakpointsMod.Breakpoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/withMobileDialog/withMobileDialog.WithMobileDialog> */
trait PartialWithMobileDialog extends StObject {
  
  var fullScreen: js.UndefOr[Boolean] = js.undefined
  
  var width: js.UndefOr[Breakpoint] = js.undefined
}
object PartialWithMobileDialog {
  
  inline def apply(): PartialWithMobileDialog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialWithMobileDialog]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialWithMobileDialog] (val x: Self) extends AnyVal {
    
    inline def setFullScreen(value: Boolean): Self = StObject.set(x, "fullScreen", value.asInstanceOf[js.Any])
    
    inline def setFullScreenUndefined: Self = StObject.set(x, "fullScreen", js.undefined)
    
    inline def setWidth(value: Breakpoint): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
