package typings.jupyterlabServices.kernelKernelMod.Kernel

import typings.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The kernel model provided by the server.
  *
  * #### Notes
  * See the [Jupyter Notebook API](http://petstore.swagger.io/?url=https://raw.githubusercontent.com/jupyter/notebook/master/notebook/services/api/api.yaml#!/kernels).
  */
trait IModel extends JSONObject {
  /**
    * Unique identifier of the kernel server session.
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

