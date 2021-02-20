package typings.johnnyFive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GyroGeneralOption extends StObject {
  
  var controller: js.UndefOr[String] = js.native
}
object GyroGeneralOption {
  
  @scala.inline
  def apply(): GyroGeneralOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GyroGeneralOption]
  }
  
  @scala.inline
  implicit class GyroGeneralOptionMutableBuilder[Self <: GyroGeneralOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setController(value: String): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
  }
}
