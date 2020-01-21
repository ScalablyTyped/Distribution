package typings.iotaLibJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTrytes extends js.Object {
  var trytes: js.Array[String]
}

object AnonTrytes {
  @scala.inline
  def apply(trytes: js.Array[String]): AnonTrytes = {
    val __obj = js.Dynamic.literal(trytes = trytes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTrytes]
  }
}

