package typings.maquette.distInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Component extends js.Object {
  def renderMaquette(): js.UndefOr[VNode | Null]
}

object Component {
  @scala.inline
  def apply(renderMaquette: () => js.UndefOr[VNode | Null]): Component = {
    val __obj = js.Dynamic.literal(renderMaquette = js.Any.fromFunction0(renderMaquette))
  
    __obj.asInstanceOf[Component]
  }
}

