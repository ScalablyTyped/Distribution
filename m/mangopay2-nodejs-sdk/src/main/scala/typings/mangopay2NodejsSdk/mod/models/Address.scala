package typings.mangopay2NodejsSdk.mod.models

import typings.mangopay2NodejsSdk.anon.PartialAddressData
import typings.mangopay2NodejsSdk.typingsModelsAddressMod.address.AddressData
import typings.mangopay2NodejsSdk.typingsTypesMod.CountryISO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mangopay2-nodejs-sdk", "models.Address")
@js.native
open class Address protected ()
  extends EntityBase[AddressData]
     with AddressData {
  def this(data: PartialAddressData) = this()
  
  /**
    * The first line of the address
    */
  /* CompleteClass */
  var AddressLine1: String = js.native
  
  /**
    * The second line of the address
    */
  /* CompleteClass */
  var AddressLine2: String = js.native
  
  /**
    * The city of the address
    */
  /* CompleteClass */
  var City: String = js.native
  
  /**
    * The Country of the Address
    */
  /* CompleteClass */
  var Country: CountryISO = js.native
  
  /**
    * The postal code of the address - can be alphanumeric, dashes or spaces
    */
  /* CompleteClass */
  var PostalCode: String = js.native
  
  /**
    * The region of the address - this is optional except if the Country is US, CA or MX
    */
  /* CompleteClass */
  var Region: String = js.native
}
