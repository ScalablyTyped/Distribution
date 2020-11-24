package typings.jupyterlabLogconsole.loggerMod.LogOutputModel

import typings.jupyterlabNbformat.mod.IOutput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOptions
  extends typings.jupyterlabRendermime.outputmodelMod.IOutputModel.IOptions
object IOptions {
  
  @scala.inline
  def apply(value: IOutput): IOptions = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}
