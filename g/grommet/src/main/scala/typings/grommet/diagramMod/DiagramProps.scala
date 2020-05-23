package typings.grommet.diagramMod

import typings.grommet.anon.Anchor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramProps extends js.Object {
  var connections: js.Array[Anchor]
}

object DiagramProps {
  @scala.inline
  def apply(connections: js.Array[Anchor]): DiagramProps = {
    val __obj = js.Dynamic.literal(connections = connections.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramProps]
  }
}

