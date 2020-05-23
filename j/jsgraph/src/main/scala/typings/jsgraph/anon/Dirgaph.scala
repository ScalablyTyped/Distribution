package typings.jsgraph.anon

import typings.jsgraph.mod.DirectedGraph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dirgaph extends js.Object {
  var dirgaph: DirectedGraph
}

object Dirgaph {
  @scala.inline
  def apply(dirgaph: DirectedGraph): Dirgaph = {
    val __obj = js.Dynamic.literal(dirgaph = dirgaph.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dirgaph]
  }
}

