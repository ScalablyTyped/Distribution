package typings.jsrsasign

import typings.jsrsasign.jsrsasign.KJUR.asn1.x509.UriParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAccessLocation extends js.Object {
  var accessLocation: UriParam
  var accessMethod: AnonOidString
}

object AnonAccessLocation {
  @scala.inline
  def apply(accessLocation: UriParam, accessMethod: AnonOidString): AnonAccessLocation = {
    val __obj = js.Dynamic.literal(accessLocation = accessLocation.asInstanceOf[js.Any], accessMethod = accessMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAccessLocation]
  }
}

