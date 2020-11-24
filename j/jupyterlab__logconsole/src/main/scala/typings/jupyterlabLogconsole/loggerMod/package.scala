package typings.jupyterlabLogconsole

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object loggerMod {
  
  /**
    * Custom Notebook Output with log info.
    */
  type ILogOutput = typings.jupyterlabNbformat.mod.IOutput with typings.jupyterlabLogconsole.anon.Level
  
  type LogOutputModel = typings.jupyterlabLogconsole.loggerMod.LogOutputModel_
  
  type Logger = typings.jupyterlabLogconsole.loggerMod.Logger_
  
  type LoggerOutputAreaModel = typings.jupyterlabLogconsole.loggerMod.LoggerOutputAreaModel_
}
