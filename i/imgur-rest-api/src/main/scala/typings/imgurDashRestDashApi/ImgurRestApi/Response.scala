package typings.imgurDashRestDashApi.ImgurRestApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response[T] extends js.Object {
  var data: js.Any
   //T|Error;
  var status: Double
  var success: Boolean
}

object Response {
  @scala.inline
  def apply[T](data: js.Any, status: Double, success: Boolean): Response[T] = {
    val __obj = js.Dynamic.literal(data = data, status = status, success = success)
  
    __obj.asInstanceOf[Response[T]]
  }
}

