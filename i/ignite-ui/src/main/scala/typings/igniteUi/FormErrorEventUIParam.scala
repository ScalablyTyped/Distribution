package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormErrorEventUIParam extends StObject {
  
  /**
    * Gets reference to the igValidator widget.
    */
  var owner: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets reference to the event target form.
    */
  var target: js.UndefOr[String] = js.undefined
}
object FormErrorEventUIParam {
  
  inline def apply(): FormErrorEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormErrorEventUIParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FormErrorEventUIParam] (val x: Self) extends AnyVal {
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
