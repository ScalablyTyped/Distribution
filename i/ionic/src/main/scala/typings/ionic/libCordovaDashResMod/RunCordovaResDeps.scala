package typings.ionic.libCordovaDashResMod

import typings.ionic.definitionsMod.IConfig
import typings.ionic.definitionsMod.ILogger
import typings.ionic.definitionsMod.IShell
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunCordovaResDeps extends js.Object {
  val config: IConfig
  val log: ILogger
  val shell: IShell
}

object RunCordovaResDeps {
  @scala.inline
  def apply(config: IConfig, log: ILogger, shell: IShell): RunCordovaResDeps = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RunCordovaResDeps]
  }
}

