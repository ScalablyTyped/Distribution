package typings.lokijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: js.Any
  var message: String
  var timestamp: Double
}

object Anon_Data {
  @scala.inline
  def apply(data: js.Any, message: String, timestamp: Double): Anon_Data = {
    val __obj = js.Dynamic.literal(data = data, message = message, timestamp = timestamp)
  
    __obj.asInstanceOf[Anon_Data]
  }
}

