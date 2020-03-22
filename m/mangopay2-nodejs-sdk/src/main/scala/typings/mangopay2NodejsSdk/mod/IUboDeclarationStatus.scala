package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREATED
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REFUSED
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALIDATED
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALIDATION_ASKED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUboDeclarationStatus extends js.Object {
  /**
    * When the UBO declaration was created
    */
  var Created: CREATED
  /**
    * When the UBO declaration was refused
    */
  var Refused: REFUSED
  /**
    * When the UBO declaration was validated
    */
  var Validated: VALIDATED
  /**
    * When validation has been requested for the UBO declaration
    */
  var ValidationAsked: VALIDATION_ASKED
}

object IUboDeclarationStatus {
  @scala.inline
  def apply(Created: CREATED, Refused: REFUSED, Validated: VALIDATED, ValidationAsked: VALIDATION_ASKED): IUboDeclarationStatus = {
    val __obj = js.Dynamic.literal(Created = Created.asInstanceOf[js.Any], Refused = Refused.asInstanceOf[js.Any], Validated = Validated.asInstanceOf[js.Any], ValidationAsked = ValidationAsked.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IUboDeclarationStatus]
  }
}

