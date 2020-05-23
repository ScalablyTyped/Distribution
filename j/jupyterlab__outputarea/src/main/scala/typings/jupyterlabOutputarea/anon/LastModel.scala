package typings.jupyterlabOutputarea.anon

import typings.jupyterlabNbformat.mod.IOutput
import typings.jupyterlabRendermime.outputmodelMod.IOutputModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LastModel extends js.Object {
  var lastModel: IOutputModel
  var value: IOutput
}

object LastModel {
  @scala.inline
  def apply(lastModel: IOutputModel, value: IOutput): LastModel = {
    val __obj = js.Dynamic.literal(lastModel = lastModel.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[LastModel]
  }
}

