package typings.atJupyterlabLogconsole

import typings.atJupyterlabLogconsole.libLoggerMod.ILogOutput
import typings.atJupyterlabLogconsole.libLoggerMod.ILogOutputModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LastModel extends js.Object {
  var lastModel: ILogOutputModel
  var value: ILogOutput
}

object Anon_LastModel {
  @scala.inline
  def apply(lastModel: ILogOutputModel, value: ILogOutput): Anon_LastModel = {
    val __obj = js.Dynamic.literal(lastModel = lastModel.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_LastModel]
  }
}

