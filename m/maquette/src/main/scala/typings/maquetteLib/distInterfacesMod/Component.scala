package typings
package maquetteLib.distInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Component extends js.Object {
  def renderMaquette(): js.UndefOr[VNode | scala.Null]
}

object Component {
  @scala.inline
  def apply(renderMaquette: js.Function0[js.UndefOr[VNode | scala.Null]]): Component = {
    val __obj = js.Dynamic.literal(renderMaquette = renderMaquette)
  
    __obj.asInstanceOf[Component]
  }
}

