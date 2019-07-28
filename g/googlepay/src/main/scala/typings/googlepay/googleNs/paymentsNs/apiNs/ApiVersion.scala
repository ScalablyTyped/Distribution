package typings.googlepay.googleNs.paymentsNs.apiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiVersion extends js.Object {
  var apiVersion: Double
  var apiVersionMinor: Double
}

object ApiVersion {
  @scala.inline
  def apply(apiVersion: Double, apiVersionMinor: Double): ApiVersion = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion, apiVersionMinor = apiVersionMinor)
  
    __obj.asInstanceOf[ApiVersion]
  }
}

