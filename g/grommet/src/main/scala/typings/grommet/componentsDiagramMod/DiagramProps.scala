package typings.grommet.componentsDiagramMod

import typings.grommet.Anon_Anchor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramProps extends js.Object {
  var connections: js.Array[Anon_Anchor]
}

object DiagramProps {
  @scala.inline
  def apply(connections: js.Array[Anon_Anchor]): DiagramProps = {
    val __obj = js.Dynamic.literal(connections = connections.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DiagramProps]
  }
}

