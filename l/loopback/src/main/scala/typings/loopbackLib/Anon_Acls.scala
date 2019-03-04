package typings
package loopbackLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Acls extends js.Object {
  var acls: js.Array[loopbackLib.loopbackMod.lNs.ACL]
  var defaultPermission: loopbackLib.loopbackLibStrings.DENY
  var http: Anon_Path
}

object Anon_Acls {
  @scala.inline
  def apply(
    acls: js.Array[loopbackLib.loopbackMod.lNs.ACL],
    defaultPermission: loopbackLib.loopbackLibStrings.DENY,
    http: Anon_Path
  ): Anon_Acls = {
    val __obj = js.Dynamic.literal(acls = acls, defaultPermission = defaultPermission, http = http)
  
    __obj.asInstanceOf[Anon_Acls]
  }
}

