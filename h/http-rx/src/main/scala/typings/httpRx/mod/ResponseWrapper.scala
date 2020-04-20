package typings.httpRx.mod

import typings.request.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseWrapper extends js.Object {
  var body: js.Any
  var response: Response
}

object ResponseWrapper {
  @scala.inline
  def apply(body: js.Any, response: Response): ResponseWrapper = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseWrapper]
  }
}

