package typings.johnnyFive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMUGeneralOption extends StObject {
  
  var controller: js.UndefOr[String] = js.native
  
  var freq: js.UndefOr[Double] = js.native
}
object IMUGeneralOption {
  
  @scala.inline
  def apply(): IMUGeneralOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMUGeneralOption]
  }
  
  @scala.inline
  implicit class IMUGeneralOptionMutableBuilder[Self <: IMUGeneralOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setController(value: String): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
    
    @scala.inline
    def setFreq(value: Double): Self = StObject.set(x, "freq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFreqUndefined: Self = StObject.set(x, "freq", js.undefined)
  }
}
