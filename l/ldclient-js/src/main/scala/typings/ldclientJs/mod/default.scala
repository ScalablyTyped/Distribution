package typings.ldclientJs.mod

import typings.ldclientJsCommon.mod.LDUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// This is @ignored because TypeDoc does not show default exports correctly. We'll just explain
// the export situation in the comment for initialize().
/** @ignore */
@JSImport("ldclient-js", JSImport.Default)
@js.native
object default extends js.Object {
  
  def initialize(envKey: String, user: LDUser): LDClient = js.native
  def initialize(envKey: String, user: LDUser, options: LDOptions): LDClient = js.native
  
  var version: String = js.native
}
