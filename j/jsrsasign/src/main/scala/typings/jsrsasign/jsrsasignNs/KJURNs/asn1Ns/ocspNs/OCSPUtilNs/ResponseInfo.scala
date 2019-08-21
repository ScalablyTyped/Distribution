package typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.ocspNs.OCSPUtilNs

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
    val __obj = js.Dynamic.literal(certStatus = certStatus, nextUpdate = nextUpdate, responseStatus = responseStatus, thisUpdate = thisUpdate)
  
    __obj.asInstanceOf[ResponseInfo]
  }
}

