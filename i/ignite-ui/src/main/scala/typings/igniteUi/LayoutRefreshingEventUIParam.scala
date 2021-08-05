package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayoutRefreshingEventUIParam extends StObject {
  
  /**
    * Used to get a reference to the splitter instance.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}
object LayoutRefreshingEventUIParam {
  
  inline def apply(): LayoutRefreshingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayoutRefreshingEventUIParam]
  }
  
  extension [Self <: LayoutRefreshingEventUIParam](x: Self) {
    
    inline def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
