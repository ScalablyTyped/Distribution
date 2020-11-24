package typings.jestCore

import typings.jestTypes.configMod.GlobalConfig
import typings.jestTypes.configMod.ProjectConfig
import typings.node.processMod.global.NodeJS.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jest/core/build/lib/logDebugMessages", JSImport.Namespace)
@js.native
object logDebugMessagesMod extends js.Object {
  
  def default(globalConfig: GlobalConfig, configs: js.Array[ProjectConfig], outputStream: WriteStream): Unit = js.native
  def default(globalConfig: GlobalConfig, configs: ProjectConfig, outputStream: WriteStream): Unit = js.native
}
