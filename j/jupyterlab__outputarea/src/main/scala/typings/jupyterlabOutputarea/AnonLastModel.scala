package typings.jupyterlabOutputarea

import typings.jupyterlabCoreutils.nbformatMod.nbformat.IOutput
import typings.jupyterlabRendermime.outputmodelMod.IOutputModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLastModel extends js.Object {
  var lastModel: IOutputModel
  var value: IOutput
}

object AnonLastModel {
  @scala.inline
  def apply(lastModel: IOutputModel, value: IOutput): AnonLastModel = {
    val __obj = js.Dynamic.literal(lastModel = lastModel.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLastModel]
  }
}

