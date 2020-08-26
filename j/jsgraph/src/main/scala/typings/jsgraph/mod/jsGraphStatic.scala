package typings.jsgraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait jsGraphStatic extends js.Object {
  var directed: Directed = js.native
}

object jsGraphStatic {
  @scala.inline
  def apply(directed: Directed): jsGraphStatic = {
    val __obj = js.Dynamic.literal(directed = directed.asInstanceOf[js.Any])
    __obj.asInstanceOf[jsGraphStatic]
  }
  @scala.inline
  implicit class jsGraphStaticOps[Self <: jsGraphStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDirected(value: Directed): Self = this.set("directed", value.asInstanceOf[js.Any])
  }
  
}

