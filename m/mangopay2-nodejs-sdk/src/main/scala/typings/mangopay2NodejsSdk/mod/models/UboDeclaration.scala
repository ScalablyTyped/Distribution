package typings.mangopay2NodejsSdk.mod.models

import typings.mangopay2NodejsSdk.mod.kycDocument.DocumentStatus
import typings.mangopay2NodejsSdk.mod.uboDeclaration.CreateUboDeclaration
import typings.mangopay2NodejsSdk.mod.uboDeclaration.UboDeclarationData
import typings.mangopay2NodejsSdk.mod.uboDeclaration.UpdateUboDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mangopay2-nodejs-sdk", "models.UboDeclaration")
@js.native
class UboDeclaration protected ()
  extends EntityBase[UboDeclarationData]
     with UboDeclarationData {
  def this(data: CreateUboDeclaration) = this()
  def this(data: UpdateUboDeclaration) = this()
  /* CompleteClass */
  override var CreationDate: Double = js.native
  /**
    * An array of UserIDs declared as Ultimate Beneficial Owners of a BUSINESS Legal User.
    */
  /* CompleteClass */
  override var DeclaredUBOs: js.Array[String] = js.native
  /* CompleteClass */
  override var Id: String = js.native
  /**
    * Refused Reason Message for a UBO Declaration
    */
  /* CompleteClass */
  override var RefusedReasonMessage: String = js.native
  /**
    * Reason types for a UBO Declaration
    */
  /* CompleteClass */
  override var RefusedReasonTypes: js.Array[String] = js.native
  /**
    * Status of a UBO Declaration
    */
  /* CompleteClass */
  override var Status: DocumentStatus = js.native
  /* CompleteClass */
  override var Tag: String = js.native
  /**
    * The object owner's UserId
    */
  /* CompleteClass */
  override var UserId: String = js.native
}

