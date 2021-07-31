package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestOrderPickupDetailsPickupPerson extends StObject {
  
  /** Required. Full name of the pickup person. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Required. The phone number of the person picking up the items. */
  var phoneNumber: js.UndefOr[String] = js.undefined
}
object TestOrderPickupDetailsPickupPerson {
  
  @scala.inline
  def apply(): TestOrderPickupDetailsPickupPerson = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestOrderPickupDetailsPickupPerson]
  }
  
  @scala.inline
  implicit class TestOrderPickupDetailsPickupPersonMutableBuilder[Self <: TestOrderPickupDetailsPickupPerson] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
  }
}
