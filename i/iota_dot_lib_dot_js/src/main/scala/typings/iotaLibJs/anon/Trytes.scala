package typings.iotaLibJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Trytes extends js.Object {
  var trytes: js.Array[String]
}

object Trytes {
  @scala.inline
  def apply(trytes: js.Array[String]): Trytes = {
    val __obj = js.Dynamic.literal(trytes = trytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Trytes]
  }
}

