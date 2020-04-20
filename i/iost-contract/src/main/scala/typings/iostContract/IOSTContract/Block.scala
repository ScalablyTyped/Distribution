package typings.iostContract.IOSTContract

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Block extends js.Object {
  var number: Double
  var parent_hash: String
  var time: Double
  var witness: String
}

object Block {
  @scala.inline
  def apply(number: Double, parent_hash: String, time: Double, witness: String): Block = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any], parent_hash = parent_hash.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], witness = witness.asInstanceOf[js.Any])
    __obj.asInstanceOf[Block]
  }
}

