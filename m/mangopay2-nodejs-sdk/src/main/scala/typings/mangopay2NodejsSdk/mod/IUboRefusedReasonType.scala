package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.INVALID_DECLARED_UBO
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.INVALID_UBO_DETAILS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUboRefusedReasonType extends js.Object {
  /**
    * When user should not be declared as UBO
    */
  var InvalidDeclaredUbo: INVALID_DECLARED_UBO
  /**
    * When user declared as UBO was created with wrong
    * details (i.e. date of birth, country of residence)
    */
  var InvalidUboDetails: INVALID_UBO_DETAILS
}

object IUboRefusedReasonType {
  @scala.inline
  def apply(InvalidDeclaredUbo: INVALID_DECLARED_UBO, InvalidUboDetails: INVALID_UBO_DETAILS): IUboRefusedReasonType = {
    val __obj = js.Dynamic.literal(InvalidDeclaredUbo = InvalidDeclaredUbo.asInstanceOf[js.Any], InvalidUboDetails = InvalidUboDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUboRefusedReasonType]
  }
}

