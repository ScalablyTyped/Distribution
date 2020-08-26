package typings.ibmMobilefirst.WL.Client

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChallengehandlerInvocationData extends js.Object {
  var adapter: String = js.native
  var parameters: js.Array[_] = js.native
  var procedure: String = js.native
}

object ChallengehandlerInvocationData {
  @scala.inline
  def apply(adapter: String, parameters: js.Array[_], procedure: String): ChallengehandlerInvocationData = {
    val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], procedure = procedure.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChallengehandlerInvocationData]
  }
  @scala.inline
  implicit class ChallengehandlerInvocationDataOps[Self <: ChallengehandlerInvocationData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdapter(value: String): Self = this.set("adapter", value.asInstanceOf[js.Any])
    @scala.inline
    def setParametersVarargs(value: js.Any*): Self = this.set("parameters", js.Array(value :_*))
    @scala.inline
    def setParameters(value: js.Array[_]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setProcedure(value: String): Self = this.set("procedure", value.asInstanceOf[js.Any])
  }
  
}

