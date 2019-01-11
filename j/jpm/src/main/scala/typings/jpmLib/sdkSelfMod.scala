package typings
package jpmLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Access data that is bundled with the add-on, and add-on metadata
  */
@JSImport("sdk/self", JSImport.Namespace)
@js.native
object sdkSelfMod extends js.Object {
  val id: java.lang.String = js.native
  val isPrivateBrowsingSupported: scala.Boolean = js.native
  val loadReason: jpmLib.jpmLibStrings.install | jpmLib.jpmLibStrings.enable | jpmLib.jpmLibStrings.startup | jpmLib.jpmLibStrings.upgrade | jpmLib.jpmLibStrings.downgrade = js.native
  val name: java.lang.String = js.native
  val uri: java.lang.String = js.native
  val version: java.lang.String = js.native
  @JSName("data")
  @js.native
  object dataNs extends js.Object {
    def load(name: java.lang.String): java.lang.String = js.native
    def url(name: java.lang.String): java.lang.String = js.native
  }
  
}

