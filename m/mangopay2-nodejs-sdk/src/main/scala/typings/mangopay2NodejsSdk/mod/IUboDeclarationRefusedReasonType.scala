package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.INVALID_DECLARED_UBO
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.INVALID_UBO_DETAILS
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MISSING_UBO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUboDeclarationRefusedReasonType extends js.Object {
  /**
    * When at least one natural user should not be declared as UBO
    */
  var InvalidDeclaredUbo: INVALID_DECLARED_UBO
  /**
    * When at least one natural user declared as UBO has been created
    * with wrong details (i.e. date of birth, country of residence)
    */
  var InvalidUboDetails: INVALID_UBO_DETAILS
  /**
    * When at least one natural user is missing on the declaration
    */
  var MissingUbo: MISSING_UBO
}

object IUboDeclarationRefusedReasonType {
  @scala.inline
  def apply(
    InvalidDeclaredUbo: INVALID_DECLARED_UBO,
    InvalidUboDetails: INVALID_UBO_DETAILS,
    MissingUbo: MISSING_UBO
  ): IUboDeclarationRefusedReasonType = {
    val __obj = js.Dynamic.literal(InvalidDeclaredUbo = InvalidDeclaredUbo.asInstanceOf[js.Any], InvalidUboDetails = InvalidUboDetails.asInstanceOf[js.Any], MissingUbo = MissingUbo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IUboDeclarationRefusedReasonType]
  }
}

