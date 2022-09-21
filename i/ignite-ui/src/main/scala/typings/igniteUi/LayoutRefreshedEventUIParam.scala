package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayoutRefreshedEventUIParam extends StObject {
  
  /**
    * Used to get a reference to the splitter instance.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object LayoutRefreshedEventUIParam {
  
  inline def apply(): LayoutRefreshedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayoutRefreshedEventUIParam]
  }
  
  extension [Self <: LayoutRefreshedEventUIParam](x: Self) {
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
