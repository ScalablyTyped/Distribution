package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Computer extends StObject {
  
  var computer: js.UndefOr[String] = js.undefined
  
  var phone: js.UndefOr[String] = js.undefined
  
  var tablet: js.UndefOr[String] = js.undefined
}
object Computer {
  
  @scala.inline
  def apply(): Computer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Computer]
  }
  
  @scala.inline
  implicit class ComputerMutableBuilder[Self <: Computer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComputer(value: String): Self = StObject.set(x, "computer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputerUndefined: Self = StObject.set(x, "computer", js.undefined)
    
    @scala.inline
    def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
    
    @scala.inline
    def setTablet(value: String): Self = StObject.set(x, "tablet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabletUndefined: Self = StObject.set(x, "tablet", js.undefined)
  }
}
