package typings.iobroker

import typings.iobroker.iobrokerMod._Global_.ioBroker.Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdValue extends js.Object {
  var id: String
  var value: Object
}

object Anon_IdValue {
  @scala.inline
  def apply(id: String, value: Object): Anon_IdValue = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_IdValue]
  }
}

