package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DIRECT
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WEB
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPayInExecutionType extends js.Object {
  var Direct: DIRECT
  var Web: WEB
}

object IPayInExecutionType {
  @scala.inline
  def apply(Direct: DIRECT, Web: WEB): IPayInExecutionType = {
    val __obj = js.Dynamic.literal(Direct = Direct.asInstanceOf[js.Any], Web = Web.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IPayInExecutionType]
  }
}

