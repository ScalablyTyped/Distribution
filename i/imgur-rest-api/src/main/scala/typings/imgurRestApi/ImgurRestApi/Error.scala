package typings.imgurRestApi.ImgurRestApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends js.Object {
  var error: String
  var method: String
  var request: String
}

object Error {
  @scala.inline
  def apply(error: String, method: String, request: String): Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Error]
  }
}

