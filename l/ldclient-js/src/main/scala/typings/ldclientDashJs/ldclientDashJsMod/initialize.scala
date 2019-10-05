package typings.ldclientDashJs.ldclientDashJsMod

import typings.ldclientDashJsDashCommon.ldclientDashJsDashCommonMod.LDUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ldclient-js", "initialize")
@js.native
object initialize extends js.Object {
  def apply(envKey: String, user: LDUser): LDClient = js.native
  def apply(envKey: String, user: LDUser, options: LDOptions): LDClient = js.native
}

