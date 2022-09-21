package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlurEventUIParam extends StObject {
  
  /**
    * Gets a reference to the igDialog widget.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object BlurEventUIParam {
  
  inline def apply(): BlurEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlurEventUIParam]
  }
  
  extension [Self <: BlurEventUIParam](x: Self) {
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
