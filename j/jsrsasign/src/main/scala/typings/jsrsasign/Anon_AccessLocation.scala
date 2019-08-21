package typings.jsrsasign

import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.x509Ns.UriParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccessLocation extends js.Object {
  var accessLocation: UriParam
  var accessMethod: Anon_Oid
}

object Anon_AccessLocation {
  @scala.inline
  def apply(accessLocation: UriParam, accessMethod: Anon_Oid): Anon_AccessLocation = {
    val __obj = js.Dynamic.literal(accessLocation = accessLocation, accessMethod = accessMethod)
  
    __obj.asInstanceOf[Anon_AccessLocation]
  }
}

