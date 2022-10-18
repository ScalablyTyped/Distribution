package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `36` extends StObject {
  
  var hover: js.UndefOr[BackgroundExtend] = js.undefined
}
object `36` {
  
  inline def apply(): `36` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`36`]
  }
  
  extension [Self <: `36`](x: Self) {
    
    inline def setHover(value: BackgroundExtend): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    inline def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
  }
}
