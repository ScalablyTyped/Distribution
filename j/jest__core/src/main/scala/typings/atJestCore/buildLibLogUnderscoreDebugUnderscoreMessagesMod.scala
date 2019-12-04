package typings.atJestCore

import typings.atJestTypes.buildConfigMod.GlobalConfig
import typings.atJestTypes.buildConfigMod.ProjectConfig
import typings.node.processMod._Global_.NodeJS.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/core/build/lib/log_debug_messages", JSImport.Namespace)
@js.native
object buildLibLogUnderscoreDebugUnderscoreMessagesMod extends js.Object {
  def default(globalConfig: GlobalConfig, configs: js.Array[ProjectConfig], outputStream: WriteStream): Unit = js.native
  def default(globalConfig: GlobalConfig, configs: ProjectConfig, outputStream: WriteStream): Unit = js.native
}

