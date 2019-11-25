package typings.atMapboxMapboxDashSdk.servicesTokensMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenDetail extends js.Object {
  var code: String
  var token: Token
}

object TokenDetail {
  @scala.inline
  def apply(code: String, token: Token): TokenDetail = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TokenDetail]
  }
}

