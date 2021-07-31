package typings.mangopay2NodejsSdk.mod.models

import typings.mangopay2NodejsSdk.anon.PartialAddressData
import typings.mangopay2NodejsSdk.mod.address.AddressData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mangopay2NodejsSdk.mod.address._AddressType because Already inherited */ @JSImport("mangopay2-nodejs-sdk", "models.Address")
@js.native
class Address protected ()
  extends EntityBase[AddressData]
     with AddressData {
  def this(data: PartialAddressData) = this()
  
  /* CompleteClass */
  var AddressLine1: String = js.native
  
  /* CompleteClass */
  var AddressLine2: String = js.native
  
  /* CompleteClass */
  var City: String = js.native
  
  /* CompleteClass */
  var Country: String = js.native
  
  /* CompleteClass */
  var PostalCode: String = js.native
  
  /* CompleteClass */
  var Region: String = js.native
}
