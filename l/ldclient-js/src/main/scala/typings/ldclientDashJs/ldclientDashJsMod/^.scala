package typings.ldclientDashJs.ldclientDashJsMod

import typings.ldclientDashJsDashCommon.ldclientDashJsDashCommonMod.LDLogger
import typings.ldclientDashJsDashCommon.ldclientDashJsDashCommonMod.LDUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ldclient-js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val version: String = js.native
  def createConsoleLogger(minimumLevel: String): LDLogger = js.native
  def initialize(envKey: String, user: LDUser): LDClient = js.native
  def initialize(envKey: String, user: LDUser, options: LDOptions): LDClient = js.native
}

