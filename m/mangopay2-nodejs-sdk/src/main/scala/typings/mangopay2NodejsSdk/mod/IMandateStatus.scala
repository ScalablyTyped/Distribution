package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ACTIVE
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREATED
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FAILED
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SUBMITTED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMandateStatus extends js.Object {
  var Active: ACTIVE
  var Created: CREATED
  var Failed: FAILED
  var Submitted: SUBMITTED
}

object IMandateStatus {
  @scala.inline
  def apply(Active: ACTIVE, Created: CREATED, Failed: FAILED, Submitted: SUBMITTED): IMandateStatus = {
    val __obj = js.Dynamic.literal(Active = Active.asInstanceOf[js.Any], Created = Created.asInstanceOf[js.Any], Failed = Failed.asInstanceOf[js.Any], Submitted = Submitted.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IMandateStatus]
  }
}

