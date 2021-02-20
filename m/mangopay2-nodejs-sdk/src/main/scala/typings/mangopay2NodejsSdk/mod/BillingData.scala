package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.mod.address.AddressData
import typings.mangopay2NodejsSdk.mod.models.Address
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BillingData extends StObject {
  
  var Address: typings.mangopay2NodejsSdk.mod.models.Address | AddressData | String = js.native
}
object BillingData {
  
  @scala.inline
  def apply(Address: Address | AddressData | String): BillingData = {
    val __obj = js.Dynamic.literal(Address = Address.asInstanceOf[js.Any])
    __obj.asInstanceOf[BillingData]
  }
  
  @scala.inline
  implicit class BillingDataMutableBuilder[Self <: BillingData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: Address | AddressData | String): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
  }
}
