package typings.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddInfoNotAvailableBadAlg extends js.Object {
  var addInfoNotAvailable: Double
  var badAlg: Double
  var badDataFormat: Double
  var badRequest: Double
  var systemFailure: Double
  var timeNotAvailable: Double
  var unacceptedExtension: Double
  var unacceptedPolicy: Double
}

object Anon_AddInfoNotAvailableBadAlg {
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
  ): Anon_AddInfoNotAvailableBadAlg = {
    val __obj = js.Dynamic.literal(addInfoNotAvailable = addInfoNotAvailable, badAlg = badAlg, badDataFormat = badDataFormat, badRequest = badRequest, systemFailure = systemFailure, timeNotAvailable = timeNotAvailable, unacceptedExtension = unacceptedExtension, unacceptedPolicy = unacceptedPolicy)
  
    __obj.asInstanceOf[Anon_AddInfoNotAvailableBadAlg]
  }
}

