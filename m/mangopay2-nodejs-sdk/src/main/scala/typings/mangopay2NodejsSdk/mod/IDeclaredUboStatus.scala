package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREATED
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REFUSED
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALIDATED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDeclaredUboStatus extends js.Object {
  var Created: CREATED
  var Refused: REFUSED
  var Validated: VALIDATED
}

object IDeclaredUboStatus {
  @scala.inline
  def apply(Created: CREATED, Refused: REFUSED, Validated: VALIDATED): IDeclaredUboStatus = {
    val __obj = js.Dynamic.literal(Created = Created.asInstanceOf[js.Any], Refused = Refused.asInstanceOf[js.Any], Validated = Validated.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IDeclaredUboStatus]
  }
}

