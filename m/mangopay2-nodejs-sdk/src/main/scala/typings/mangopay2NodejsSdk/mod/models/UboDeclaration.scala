package typings.mangopay2NodejsSdk.mod.models

import typings.mangopay2NodejsSdk.enumsMod.enums.IUboDeclarationRefusedReasonType
import typings.mangopay2NodejsSdk.enumsMod.enums.IUboDeclarationStatus
import typings.mangopay2NodejsSdk.typesMod.Timestamp
import typings.mangopay2NodejsSdk.typesMod.ValueOf
import typings.mangopay2NodejsSdk.uboDeclarationMod.uboDeclaration.UboDeclarationData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mangopay2-nodejs-sdk", "models.UboDeclaration")
@js.native
open class UboDeclaration protected ()
  extends EntityBase[UboDeclarationData]
     with UboDeclarationData {
  def this(data: UboDeclarationData) = this()
  
  /* CompleteClass */
  var CreationDate: Double = js.native
  
  /* CompleteClass */
  var Id: String = js.native
  
  /**
    * Explanation of why the declaration was refused.
    */
  /* CompleteClass */
  var Message: String = js.native
  
  /**
    * cannot be modified by clients
    */
  /* CompleteClass */
  var ProcessedDate: Timestamp = js.native
  
  /**
    * Array of reasons why the declaration was refused
    * Values as declared in UboDeclarationRefusedReasonType.
    */
  /* CompleteClass */
  var Reason: ValueOf[IUboDeclarationRefusedReasonType] = js.native
  
  /**
    * Declaration status (one of UboDeclarationStatus)
    */
  /* CompleteClass */
  var Status: ValueOf[IUboDeclarationStatus] = js.native
  
  /* CompleteClass */
  var Tag: String = js.native
  
  /**
    * Table of ubos (declared in Ubo)
    */
  /* CompleteClass */
  var Ubos: js.Array[Any] = js.native
}
