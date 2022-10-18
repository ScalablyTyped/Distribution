package typings.mangopay2NodejsSdk.mod.models

import typings.mangopay2NodejsSdk.anon.PartialShippingAddressDat
import typings.mangopay2NodejsSdk.typingsModelsAddressMod.address.AddressType
import typings.mangopay2NodejsSdk.typingsModelsShippingAddressMod.shippingAddress.ShippingAddressData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mangopay2-nodejs-sdk", "models.ShippingAddress")
@js.native
open class ShippingAddress protected ()
  extends EntityBase[ShippingAddressData]
     with ShippingAddressData {
  def this(data: PartialShippingAddressDat) = this()
  
  /**
    * The shipping address
    */
  /* CompleteClass */
  var Address: AddressType = js.native
  
  /**
    * Name of the shipping recipient
    */
  /* CompleteClass */
  var RecipientName: String = js.native
}
