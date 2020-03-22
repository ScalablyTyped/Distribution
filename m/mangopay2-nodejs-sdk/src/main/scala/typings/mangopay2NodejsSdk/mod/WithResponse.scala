package typings.mangopay2NodejsSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithResponse[T] extends js.Object {
  var body: T
  var headers: Headers
  var statusCode: Double
}

object WithResponse {
  @scala.inline
  def apply[T](body: T, headers: Headers, statusCode: Double): WithResponse[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WithResponse[T]]
  }
}

