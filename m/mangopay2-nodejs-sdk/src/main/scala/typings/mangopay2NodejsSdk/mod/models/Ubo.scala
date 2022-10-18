package typings.mangopay2NodejsSdk.mod.models

import typings.mangopay2NodejsSdk.typingsModelsAddressMod.address.AddressType
import typings.mangopay2NodejsSdk.typingsModelsUboDeclarationMod.uboDeclaration.UboData
import typings.mangopay2NodejsSdk.typingsTypesMod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mangopay2-nodejs-sdk", "models.Ubo")
@js.native
open class Ubo protected ()
  extends EntityBase[UboData]
     with UboData {
  def this(data: UboData) = this()
  
  /* CompleteClass */
  var Address: AddressType = js.native
  
  /* CompleteClass */
  var Birthday: Timestamp = js.native
  
  /* CompleteClass */
  var Birthplace: typings.mangopay2NodejsSdk.typingsModelsBirthplaceMod.birthplace.Birthplace = js.native
  
  /* CompleteClass */
  var CreationDate: Double = js.native
  
  /* CompleteClass */
  var FirstName: String = js.native
  
  /* CompleteClass */
  var Id: String = js.native
  
  /* CompleteClass */
  var LastName: String = js.native
  
  /* CompleteClass */
  var Nationality: String = js.native
  
  /* CompleteClass */
  var Tag: String = js.native
  
  /* CompleteClass */
  var isActive: Boolean = js.native
}
