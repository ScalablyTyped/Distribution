package typings.jupyterlabServices.sessionSessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IModel extends js.Object {
  /**
    * The unique identifier for the session client.
    */
  val id: String
  val kernel: typings.jupyterlabServices.kernelRestapiMod.IModel | Null
  val name: String
  val path: String
  val `type`: String
}

object IModel {
  @scala.inline
  def apply(
    id: String,
    name: String,
    path: String,
    `type`: String,
    kernel: typings.jupyterlabServices.kernelRestapiMod.IModel = null
  ): IModel = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (kernel != null) __obj.updateDynamic("kernel")(kernel.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModel]
  }
}

