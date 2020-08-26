package typings.mangopay2NodejsSdk.mod.models

import typings.mangopay2NodejsSdk.anon.PartialAddressData
import typings.mangopay2NodejsSdk.mod.address.AddressData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mangopay2NodejsSdk.mod.address._AddressType because Already inherited */ @JSImport("mangopay2-nodejs-sdk", "models.Address")
@js.native
class Address protected ()
  extends EntityBase[AddressData]
     with AddressData {
  def this(data: PartialAddressData) = this()
}

