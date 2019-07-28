package typings.loopback

import typings.loopback.loopbackMod.ACL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccessTokenIdLength extends js.Object {
  var accessTokenIdLength: Double
  var acls: js.Array[ACL]
  var http: Anon_Path
}

object Anon_AccessTokenIdLength {
  @scala.inline
  def apply(accessTokenIdLength: Double, acls: js.Array[ACL], http: Anon_Path): Anon_AccessTokenIdLength = {
    val __obj = js.Dynamic.literal(accessTokenIdLength = accessTokenIdLength, acls = acls, http = http)
  
    __obj.asInstanceOf[Anon_AccessTokenIdLength]
  }
}

