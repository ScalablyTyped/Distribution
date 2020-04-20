package typings.grommet.diagramMod

import typings.grommet.AnonAnchor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramProps extends js.Object {
  var connections: js.Array[AnonAnchor]
}

object DiagramProps {
  @scala.inline
  def apply(connections: js.Array[AnonAnchor]): DiagramProps = {
    val __obj = js.Dynamic.literal(connections = connections.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramProps]
  }
}

