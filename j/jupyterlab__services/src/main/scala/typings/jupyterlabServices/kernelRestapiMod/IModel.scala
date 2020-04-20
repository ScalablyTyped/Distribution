package typings.jupyterlabServices.kernelRestapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IModel extends js.Object {
  /**
    * Unique identifier of the kernel on the server.
    */
  val id: String
  /**
    * The name of the kernel.
    */
  val name: String
}

object IModel {
  @scala.inline
  def apply(id: String, name: String): IModel = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModel]
  }
}

