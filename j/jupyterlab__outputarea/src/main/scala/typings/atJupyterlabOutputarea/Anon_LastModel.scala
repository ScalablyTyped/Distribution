package typings.atJupyterlabOutputarea

import typings.atJupyterlabCoreutils.libNbformatMod.nbformat.IOutput
import typings.atJupyterlabRendermime.libOutputmodelMod.IOutputModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LastModel extends js.Object {
  var lastModel: IOutputModel
  var value: IOutput
}

object Anon_LastModel {
  @scala.inline
  def apply(lastModel: IOutputModel, value: IOutput): Anon_LastModel = {
    val __obj = js.Dynamic.literal(lastModel = lastModel, value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_LastModel]
  }
}

