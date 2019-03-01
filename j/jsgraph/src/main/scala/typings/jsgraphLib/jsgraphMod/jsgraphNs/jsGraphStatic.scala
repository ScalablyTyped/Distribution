package typings
package jsgraphLib.jsgraphMod.jsgraphNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait jsGraphStatic extends js.Object {
  var directed: Directed
}

object jsGraphStatic {
  @scala.inline
  def apply(directed: Directed): jsGraphStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("directed")(directed)
    __obj.asInstanceOf[jsGraphStatic]
  }
}

