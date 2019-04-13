package typings
package ldclientDashJsLib.ldclientDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ldclient-js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val version: java.lang.String = js.native
  def createConsoleLogger(minimumLevel: java.lang.String): ldclientDashJsDashCommonLib.ldclientDashJsDashCommonMod.LDLogger = js.native
  def initialize(envKey: java.lang.String, user: ldclientDashJsDashCommonLib.ldclientDashJsDashCommonMod.LDUser): LDClient = js.native
  def initialize(
    envKey: java.lang.String,
    user: ldclientDashJsDashCommonLib.ldclientDashJsDashCommonMod.LDUser,
    options: LDOptions
  ): LDClient = js.native
}

