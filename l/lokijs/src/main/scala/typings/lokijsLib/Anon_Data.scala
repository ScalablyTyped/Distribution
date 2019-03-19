package typings
package lokijsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: js.Any
  var message: java.lang.String
  var timestamp: scala.Double
}

object Anon_Data {
  @scala.inline
  def apply(data: js.Any, message: java.lang.String, timestamp: scala.Double): Anon_Data = {
    val __obj = js.Dynamic.literal(data = data, message = message, timestamp = timestamp)
  
    __obj.asInstanceOf[Anon_Data]
  }
}

