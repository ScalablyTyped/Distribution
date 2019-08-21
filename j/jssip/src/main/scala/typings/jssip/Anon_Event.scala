package typings.jssip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Event extends js.Object {
  var event: String
  var params: js.Any
}

object Anon_Event {
  @scala.inline
  def apply(event: String, params: js.Any): Anon_Event = {
    val __obj = js.Dynamic.literal(event = event, params = params)
  
    __obj.asInstanceOf[Anon_Event]
  }
}

