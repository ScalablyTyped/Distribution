package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Remove extends StObject {
  
  var remove: js.UndefOr[Any] = js.undefined
}
object Remove {
  
  inline def apply(): Remove = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Remove]
  }
  
  extension [Self <: Remove](x: Self) {
    
    inline def setRemove(value: Any): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    
    inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
  }
}
