package typings.johnnyFive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccelerometerGeneralOption extends StObject {
  
  var controller: js.UndefOr[String] = js.undefined
}
object AccelerometerGeneralOption {
  
  @scala.inline
  def apply(): AccelerometerGeneralOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccelerometerGeneralOption]
  }
  
  @scala.inline
  implicit class AccelerometerGeneralOptionMutableBuilder[Self <: AccelerometerGeneralOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setController(value: String): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
  }
}
