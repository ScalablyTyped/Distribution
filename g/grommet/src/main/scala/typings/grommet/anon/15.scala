package typings.grommet.anon

import typings.grommet.componentsBoxMod.BoxProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `15` extends StObject {
  
  var container: js.UndefOr[BoxProps] = js.undefined
}
object `15` {
  
  inline def apply(): `15` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`15`]
  }
  
  extension [Self <: `15`](x: Self) {
    
    inline def setContainer(value: BoxProps): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
  }
}
