package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResizeEndedEventUIParam extends StObject {
  
  /**
    * Used to get a reference to the splitter instance.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object ResizeEndedEventUIParam {
  
  inline def apply(): ResizeEndedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResizeEndedEventUIParam]
  }
  
  extension [Self <: ResizeEndedEventUIParam](x: Self) {
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
