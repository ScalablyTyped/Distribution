package typings.mangopay2NodejsSdk.mod.uboDeclaration

import typings.mangopay2NodejsSdk.mod.entityBase.EntityBaseData
import typings.mangopay2NodejsSdk.mod.kycDocument.DocumentStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UboDeclarationData extends EntityBaseData {
  /**
    * An array of UserIDs declared as Ultimate Beneficial Owners of a BUSINESS Legal User.
    */
  var DeclaredUBOs: js.Array[String]
  /**
    * Refused Reason Message for a UBO Declaration
    */
  var RefusedReasonMessage: String
  /**
    * Reason types for a UBO Declaration
    */
  var RefusedReasonTypes: js.Array[String]
  /**
    * Status of a UBO Declaration
    */
  var Status: DocumentStatus
  /**
    * The object owner's UserId
    */
  var UserId: String
}

object UboDeclarationData {
  @scala.inline
  def apply(
    CreationDate: Double,
    DeclaredUBOs: js.Array[String],
    Id: String,
    RefusedReasonMessage: String,
    RefusedReasonTypes: js.Array[String],
    Status: DocumentStatus,
    Tag: String,
    UserId: String
  ): UboDeclarationData = {
    val __obj = js.Dynamic.literal(CreationDate = CreationDate.asInstanceOf[js.Any], DeclaredUBOs = DeclaredUBOs.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], RefusedReasonMessage = RefusedReasonMessage.asInstanceOf[js.Any], RefusedReasonTypes = RefusedReasonTypes.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UboDeclarationData]
  }
}

