package typings.mangopay2NodejsSdk.mod.models

import typings.mangopay2NodejsSdk.PartialAddressData
import typings.mangopay2NodejsSdk.mod.address.AddressData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.mangopay2NodejsSdk.mod.address._AddressType because Already inherited */ @JSImport("mangopay2-nodejs-sdk", "models.Address")
@js.native
class Address protected ()
  extends EntityBase[AddressData]
     with AddressData {
  def this(data: PartialAddressData) = this()
  /* CompleteClass */
  override var AddressLine1: String = js.native
  /* CompleteClass */
  override var AddressLine2: String = js.native
  /* CompleteClass */
  override var City: String = js.native
  /* CompleteClass */
  override var Country: String = js.native
  /* CompleteClass */
  override var PostalCode: String = js.native
  /* CompleteClass */
  override var Region: String = js.native
}

