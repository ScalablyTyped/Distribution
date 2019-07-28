package typings.ionic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Address extends js.Object {
  var address: String
  var broadcast: String
}

object Anon_Address {
  @scala.inline
  def apply(address: String, broadcast: String): Anon_Address = {
    val __obj = js.Dynamic.literal(address = address, broadcast = broadcast)
  
    __obj.asInstanceOf[Anon_Address]
  }
}

