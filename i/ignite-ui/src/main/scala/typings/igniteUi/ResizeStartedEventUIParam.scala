package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResizeStartedEventUIParam extends StObject {
  
  /**
    * Used to get a reference to the splitter instance.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object ResizeStartedEventUIParam {
  
  inline def apply(): ResizeStartedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResizeStartedEventUIParam]
  }
  
  extension [Self <: ResizeStartedEventUIParam](x: Self) {
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
