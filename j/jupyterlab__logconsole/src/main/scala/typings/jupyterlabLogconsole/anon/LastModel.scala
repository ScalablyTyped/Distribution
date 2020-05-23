package typings.jupyterlabLogconsole.anon

import typings.jupyterlabLogconsole.loggerMod.ILogOutput
import typings.jupyterlabLogconsole.loggerMod.ILogOutputModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LastModel extends js.Object {
  var lastModel: ILogOutputModel
  var value: ILogOutput
}

object LastModel {
  @scala.inline
  def apply(lastModel: ILogOutputModel, value: ILogOutput): LastModel = {
    val __obj = js.Dynamic.literal(lastModel = lastModel.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[LastModel]
  }
}

