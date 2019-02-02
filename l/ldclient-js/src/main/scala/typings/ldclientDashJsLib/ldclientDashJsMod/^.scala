package typings
package ldclientDashJsLib.ldclientDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ldclient-js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val default: ldclientDashJsLib.Anon_EnvKey = js.native
  val version: java.lang.String = js.native
  def createConsoleLogger(minimumLevel: java.lang.String): ldclientDashJsDashCommonLib.ldclientDashJsDashCommonMod.LDLogger = js.native
  def initialize(envKey: java.lang.String, user: ldclientDashJsDashCommonLib.ldclientDashJsDashCommonMod.LDUser): ldclientDashJsLib.ldclientDashJsMod.LDClient = js.native
  def initialize(
    envKey: java.lang.String,
    user: ldclientDashJsDashCommonLib.ldclientDashJsDashCommonMod.LDUser,
    options: ldclientDashJsLib.ldclientDashJsMod.LDOptions
  ): ldclientDashJsLib.ldclientDashJsMod.LDClient = js.native
}

