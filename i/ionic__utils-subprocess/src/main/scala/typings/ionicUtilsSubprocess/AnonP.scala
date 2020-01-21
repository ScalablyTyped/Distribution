package typings.ionicUtilsSubprocess

import typings.node.childProcessMod.ChildProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonP extends js.Object {
  var p: ChildProcess
}

object AnonP {
  @scala.inline
  def apply(p: ChildProcess): AnonP = {
    val __obj = js.Dynamic.literal(p = p.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonP]
  }
}

