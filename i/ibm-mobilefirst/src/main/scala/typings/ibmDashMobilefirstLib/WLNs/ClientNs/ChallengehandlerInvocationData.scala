package typings
package ibmDashMobilefirstLib.WLNs.ClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChallengehandlerInvocationData extends js.Object {
  var adapter: java.lang.String
  var parameters: js.Array[_]
  var procedure: java.lang.String
}

object ChallengehandlerInvocationData {
  @scala.inline
  def apply(adapter: java.lang.String, parameters: js.Array[_], procedure: java.lang.String): ChallengehandlerInvocationData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("adapter")(adapter)
    __obj.updateDynamic("parameters")(parameters)
    __obj.updateDynamic("procedure")(procedure)
    __obj.asInstanceOf[ChallengehandlerInvocationData]
  }
}

