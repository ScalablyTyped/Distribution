package typings
package lowdbLib.lowdbMod.lodashMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringChain extends js.Object {
  def write(): java.lang.String with js.Promise[java.lang.String]
}

object StringChain {
  @scala.inline
  def apply(write: () => java.lang.String with js.Promise[java.lang.String]): StringChain = {
    val __obj = js.Dynamic.literal(write = js.Any.fromFunction0(write))
  
    __obj.asInstanceOf[StringChain]
  }
}

