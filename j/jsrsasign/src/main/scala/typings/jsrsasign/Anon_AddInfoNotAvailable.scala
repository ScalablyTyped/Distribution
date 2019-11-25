package typings.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddInfoNotAvailable extends js.Object {
  var addInfoNotAvailable: Double
  var badAlg: Double
  var badDataFormat: Double
  var badRequest: Double
  var systemFailure: Double
  var timeNotAvailable: Double
  var unacceptedExtension: Double
  var unacceptedPolicy: Double
}

object Anon_AddInfoNotAvailable {
  @scala.inline
  def apply(
    addInfoNotAvailable: Double,
    badAlg: Double,
    badDataFormat: Double,
    badRequest: Double,
    systemFailure: Double,
    timeNotAvailable: Double,
    unacceptedExtension: Double,
    unacceptedPolicy: Double
  ): Anon_AddInfoNotAvailable = {
    val __obj = js.Dynamic.literal(addInfoNotAvailable = addInfoNotAvailable.asInstanceOf[js.Any], badAlg = badAlg.asInstanceOf[js.Any], badDataFormat = badDataFormat.asInstanceOf[js.Any], badRequest = badRequest.asInstanceOf[js.Any], systemFailure = systemFailure.asInstanceOf[js.Any], timeNotAvailable = timeNotAvailable.asInstanceOf[js.Any], unacceptedExtension = unacceptedExtension.asInstanceOf[js.Any], unacceptedPolicy = unacceptedPolicy.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AddInfoNotAvailable]
  }
}

