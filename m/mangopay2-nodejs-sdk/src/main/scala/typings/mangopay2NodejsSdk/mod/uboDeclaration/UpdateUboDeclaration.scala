package typings.mangopay2NodejsSdk.mod.uboDeclaration

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALIDATION_ASKED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateUboDeclaration extends js.Object {
  /**
    * An array of UserIDs declared as Ultimate Beneficial Owners of a BUSINESS Legal User.
    */
  var DeclaredUBOs: js.UndefOr[js.Array[String]] = js.undefined
  var Id: String
  var Status: js.UndefOr[VALIDATION_ASKED] = js.undefined
  var Tag: js.UndefOr[String] = js.undefined
}

object UpdateUboDeclaration {
  @scala.inline
  def apply(
    Id: String,
    DeclaredUBOs: js.Array[String] = null,
    Status: VALIDATION_ASKED = null,
    Tag: String = null
  ): UpdateUboDeclaration = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    if (DeclaredUBOs != null) __obj.updateDynamic("DeclaredUBOs")(DeclaredUBOs.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (Tag != null) __obj.updateDynamic("Tag")(Tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUboDeclaration]
  }
}

