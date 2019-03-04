package typings
package heremapsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Address extends js.Object {
  var address: Anon_City
  var position: js.Array[scala.Double]
}

object Anon_Address {
  @scala.inline
  def apply(address: Anon_City, position: js.Array[scala.Double]): Anon_Address = {
    val __obj = js.Dynamic.literal(address = address, position = position)
  
    __obj.asInstanceOf[Anon_Address]
  }
}

