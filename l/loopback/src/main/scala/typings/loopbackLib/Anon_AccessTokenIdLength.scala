package typings
package loopbackLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccessTokenIdLength extends js.Object {
  var accessTokenIdLength: scala.Double
  var acls: js.Array[loopbackLib.loopbackMod.lNs.ACL]
  var http: Anon_Path
}

object Anon_AccessTokenIdLength {
  @scala.inline
  def apply(
    accessTokenIdLength: scala.Double,
    acls: js.Array[loopbackLib.loopbackMod.lNs.ACL],
    http: Anon_Path
  ): Anon_AccessTokenIdLength = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accessTokenIdLength")(accessTokenIdLength)
    __obj.updateDynamic("acls")(acls)
    __obj.updateDynamic("http")(http)
    __obj.asInstanceOf[Anon_AccessTokenIdLength]
  }
}

