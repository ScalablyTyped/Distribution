package typings.grommet.diagramMod

import typings.grommet.anon.Anchor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiagramProps extends js.Object {
  var connections: js.Array[Anchor] = js.native
}

object DiagramProps {
  @scala.inline
  def apply(connections: js.Array[Anchor]): DiagramProps = {
    val __obj = js.Dynamic.literal(connections = connections.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramProps]
  }
  @scala.inline
  implicit class DiagramPropsOps[Self <: DiagramProps] (val x: Self) extends AnyVal {
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
    def setConnectionsVarargs(value: Anchor*): Self = this.set("connections", js.Array(value :_*))
    @scala.inline
    def setConnections(value: js.Array[Anchor]): Self = this.set("connections", value.asInstanceOf[js.Any])
  }
  
}

