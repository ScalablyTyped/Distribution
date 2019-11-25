package typings.atJupyterlabServices.libSessionSessionMod.Session

import typings.atPhosphorCoreutils.libJsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The session model used by the server.
  *
  * #### Notes
  * See the [Jupyter Notebook API](http://petstore.swagger.io/?url=https://raw.githubusercontent.com/jupyter/notebook/master/notebook/services/api/api.yaml#!/sessions).
  */
trait IModel extends JSONObject {
  /**
    * The unique identifier for the session client.
    */
  val id: String
  val kernel: typings.atJupyterlabServices.libKernelKernelMod.Kernel.IModel
  val name: String
  val path: String
  val `type`: String
}

object IModel {
  @scala.inline
  def apply(
    id: String,
    kernel: typings.atJupyterlabServices.libKernelKernelMod.Kernel.IModel,
    name: String,
    path: String,
    `type`: String
  ): IModel = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], kernel = kernel.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModel]
  }
}

