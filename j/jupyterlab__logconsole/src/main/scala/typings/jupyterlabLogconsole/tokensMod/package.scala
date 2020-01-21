package typings.jupyterlabLogconsole

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tokensMod {
  type ILoggerRegistryChange = typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.append
  type IStateChange = typings.jupyterlabCoreutils.interfacesMod.IChangedArgs[
    typings.jupyterlabRendermime.tokensMod.IRenderMimeRegistry | typings.jupyterlabLogconsole.tokensMod.LogLevel, 
    typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.rendermime | typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.level
  ]
}
