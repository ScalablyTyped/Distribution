package typings
package ldclientDashJsLib.ldclientDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// This is @ignored because TypeDoc does not show default exports correctly. We'll just explain
// the export situation in the comment for initialize().
/** @ignore */
@JSImport("ldclient-js", JSImport.Default)
@js.native
object default extends js.Object {
  var version: java.lang.String = js.native
  def initialize(envKey: java.lang.String, user: ldclientDashJsDashCommonLib.ldclientDashJsDashCommonMod.LDUser): ldclientDashJsLib.ldclientDashJsMod.LDClient = js.native
  def initialize(
    envKey: java.lang.String,
    user: ldclientDashJsDashCommonLib.ldclientDashJsDashCommonMod.LDUser,
    options: ldclientDashJsLib.ldclientDashJsMod.LDOptions
  ): ldclientDashJsLib.ldclientDashJsMod.LDClient = js.native
}

