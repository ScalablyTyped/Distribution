package typings.lowdb.mod.lodashAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringChain extends js.Object {
  def write(): String with js.Promise[String]
}

object StringChain {
  @scala.inline
  def apply(write: () => String with js.Promise[String]): StringChain = {
    val __obj = js.Dynamic.literal(write = js.Any.fromFunction0(write))
    __obj.asInstanceOf[StringChain]
  }
}

