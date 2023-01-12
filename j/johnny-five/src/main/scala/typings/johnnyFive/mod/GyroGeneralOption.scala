package typings.johnnyFive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GyroGeneralOption extends StObject {
  
  var controller: js.UndefOr[String] = js.undefined
}
object GyroGeneralOption {
  
  inline def apply(): GyroGeneralOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GyroGeneralOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GyroGeneralOption] (val x: Self) extends AnyVal {
    
    inline def setController(value: String): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
    
    inline def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
  }
}
