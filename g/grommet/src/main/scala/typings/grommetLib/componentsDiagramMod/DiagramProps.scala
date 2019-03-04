package typings
package grommetLib.componentsDiagramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramProps extends js.Object {
  var connections: js.Array[grommetLib.Anon_Anchor]
}

object DiagramProps {
  @scala.inline
  def apply(connections: js.Array[grommetLib.Anon_Anchor]): DiagramProps = {
    val __obj = js.Dynamic.literal(connections = connections)
  
    __obj.asInstanceOf[DiagramProps]
  }
}

