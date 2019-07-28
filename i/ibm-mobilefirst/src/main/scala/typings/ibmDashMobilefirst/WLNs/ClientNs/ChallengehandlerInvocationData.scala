package typings.ibmDashMobilefirst.WLNs.ClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChallengehandlerInvocationData extends js.Object {
  var adapter: String
  var parameters: js.Array[_]
  var procedure: String
}

object ChallengehandlerInvocationData {
  @scala.inline
  def apply(adapter: String, parameters: js.Array[_], procedure: String): ChallengehandlerInvocationData = {
    val __obj = js.Dynamic.literal(adapter = adapter, parameters = parameters, procedure = procedure)
  
    __obj.asInstanceOf[ChallengehandlerInvocationData]
  }
}

