package typings
package googlepayLib.googleNs.paymentsNs.apiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiVersion extends js.Object {
  var apiVersion: scala.Double
  var apiVersionMinor: scala.Double
}

object ApiVersion {
  @scala.inline
  def apply(apiVersion: scala.Double, apiVersionMinor: scala.Double): ApiVersion = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion, apiVersionMinor = apiVersionMinor)
  
    __obj.asInstanceOf[ApiVersion]
  }
}

