package typings.materializecssMaterialize.anon

import typings.materializecssMaterialize.materializecssMaterializeStrings.buttom
import typings.materializecssMaterialize.materializecssMaterializeStrings.left
import typings.materializecssMaterialize.materializecssMaterializeStrings.right
import typings.materializecssMaterialize.materializecssMaterializeStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@materializecss/materialize.M.FloatingActionButtonOptions> */
trait PartialFloatingActionButt extends StObject {
  
  var direction: js.UndefOr[top | right | buttom | left] = js.undefined
  
  var hoverEnabled: js.UndefOr[Boolean] = js.undefined
  
  var toolbarEnabled: js.UndefOr[Boolean] = js.undefined
}
object PartialFloatingActionButt {
  
  inline def apply(): PartialFloatingActionButt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialFloatingActionButt]
  }
  
  extension [Self <: PartialFloatingActionButt](x: Self) {
    
    inline def setDirection(value: top | right | buttom | left): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setHoverEnabled(value: Boolean): Self = StObject.set(x, "hoverEnabled", value.asInstanceOf[js.Any])
    
    inline def setHoverEnabledUndefined: Self = StObject.set(x, "hoverEnabled", js.undefined)
    
    inline def setToolbarEnabled(value: Boolean): Self = StObject.set(x, "toolbarEnabled", value.asInstanceOf[js.Any])
    
    inline def setToolbarEnabledUndefined: Self = StObject.set(x, "toolbarEnabled", js.undefined)
  }
}
