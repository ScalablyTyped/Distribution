package typings.atJupyterlabLogconsole

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTokensMod {
  import typings.atJupyterlabCoreutils.libInterfacesMod.IChangedArgs
  import typings.atJupyterlabLogconsole.atJupyterlabLogconsoleStrings.append
  import typings.atJupyterlabLogconsole.atJupyterlabLogconsoleStrings.level
  import typings.atJupyterlabLogconsole.atJupyterlabLogconsoleStrings.rendermime
  import typings.atJupyterlabRendermime.libTokensMod.IRenderMimeRegistry

  type ILoggerRegistryChange = append
  type IStateChange = IChangedArgs[IRenderMimeRegistry | LogLevel, rendermime | level]
}
