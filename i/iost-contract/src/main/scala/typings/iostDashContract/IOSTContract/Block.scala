package typings.iostDashContract.IOSTContract

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
    val __obj = js.Dynamic.literal(number = number, parent_hash = parent_hash, time = time, witness = witness)
  
    __obj.asInstanceOf[Block]
  }
}

