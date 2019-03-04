package typings
package loopbackLib.loopbackMod.lNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var acls: js.Array[ACL]
  var http: loopbackLib.Anon_Path
}

object Settings {
  @scala.inline
  def apply(acls: js.Array[ACL], http: loopbackLib.Anon_Path): Settings = {
    val __obj = js.Dynamic.literal(acls = acls, http = http)
  
    __obj.asInstanceOf[Settings]
  }
}

