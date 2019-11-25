package typings.jsrsasign.jsrsasign.KJUR.asn1.ocsp.OCSPUtil

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseInfo extends js.Object {
  var certStatus: String
  var nextUpdate: String
  var responseStatus: Double
  var thisUpdate: String
}

object ResponseInfo {
  @scala.inline
  def apply(certStatus: String, nextUpdate: String, responseStatus: Double, thisUpdate: String): ResponseInfo = {
    val __obj = js.Dynamic.literal(certStatus = certStatus.asInstanceOf[js.Any], nextUpdate = nextUpdate.asInstanceOf[js.Any], responseStatus = responseStatus.asInstanceOf[js.Any], thisUpdate = thisUpdate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResponseInfo]
  }
}

