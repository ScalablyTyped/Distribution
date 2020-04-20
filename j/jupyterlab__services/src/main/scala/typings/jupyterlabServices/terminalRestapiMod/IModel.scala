package typings.jupyterlabServices.terminalRestapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IModel extends js.Object {
  /**
    * The name of the terminal session.
    */
  val name: String
}

object IModel {
  @scala.inline
  def apply(name: String): IModel = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModel]
  }
}

