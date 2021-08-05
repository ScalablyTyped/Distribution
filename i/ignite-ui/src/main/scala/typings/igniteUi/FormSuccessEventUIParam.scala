package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormSuccessEventUIParam extends StObject {
  
  /**
    * Gets reference to the igValidator widget.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets reference to the event target form.
    */
  var target: js.UndefOr[String] = js.undefined
}
object FormSuccessEventUIParam {
  
  inline def apply(): FormSuccessEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormSuccessEventUIParam]
  }
  
  extension [Self <: FormSuccessEventUIParam](x: Self) {
    
    inline def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
