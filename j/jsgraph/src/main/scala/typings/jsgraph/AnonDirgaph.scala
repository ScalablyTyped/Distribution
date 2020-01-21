package typings.jsgraph

import typings.jsgraph.mod.DirectedGraph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDirgaph extends js.Object {
  var dirgaph: DirectedGraph
}

object AnonDirgaph {
  @scala.inline
  def apply(dirgaph: DirectedGraph): AnonDirgaph = {
    val __obj = js.Dynamic.literal(dirgaph = dirgaph.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDirgaph]
  }
}

