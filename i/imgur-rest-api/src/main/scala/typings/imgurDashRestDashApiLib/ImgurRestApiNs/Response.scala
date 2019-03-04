package typings
package imgurDashRestDashApiLib.ImgurRestApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response[T] extends js.Object {
  var data: js.Any
   //T|Error;
  var status: scala.Double
  var success: scala.Boolean
}

object Response {
  @scala.inline
  def apply[T](data: js.Any, status: scala.Double, success: scala.Boolean): Response[T] = {
    val __obj = js.Dynamic.literal(data = data, status = status, success = success)
  
    __obj.asInstanceOf[Response[T]]
  }
}

