package typings.materialUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@material-ui/core.@material-ui/core/styles/props.ComponentsPropsList['MuiBreadcrumbs'], 'expandText'> */
trait PickComponentsPropsListMu extends StObject {
  
  var expandText: js.UndefOr[Any] = js.undefined
}
object PickComponentsPropsListMu {
  
  inline def apply(): PickComponentsPropsListMu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickComponentsPropsListMu]
  }
  
  extension [Self <: PickComponentsPropsListMu](x: Self) {
    
    inline def setExpandText(value: Any): Self = StObject.set(x, "expandText", value.asInstanceOf[js.Any])
    
    inline def setExpandTextUndefined: Self = StObject.set(x, "expandText", js.undefined)
  }
}
