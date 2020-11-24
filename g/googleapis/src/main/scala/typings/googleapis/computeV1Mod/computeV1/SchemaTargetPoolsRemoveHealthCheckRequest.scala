package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaTargetPoolsRemoveHealthCheckRequest extends js.Object {
  
  /**
    * Health check URL to be removed. This can be a full or valid partial URL.
    * For example, the following are valid URLs:   -
    * https://www.googleapis.com/compute/beta/projects/project/global/httpHealthChecks/health-check
    * - projects/project/global/httpHealthChecks/health-check  -
    * global/httpHealthChecks/health-check
    */
  var healthChecks: js.UndefOr[js.Array[SchemaHealthCheckReference]] = js.native
}
object SchemaTargetPoolsRemoveHealthCheckRequest {
  
  @scala.inline
  def apply(): SchemaTargetPoolsRemoveHealthCheckRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetPoolsRemoveHealthCheckRequest]
  }
  
  @scala.inline
  implicit class SchemaTargetPoolsRemoveHealthCheckRequestOps[Self <: SchemaTargetPoolsRemoveHealthCheckRequest] (val x: Self) extends AnyVal {
    
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
    def setHealthChecksVarargs(value: SchemaHealthCheckReference*): Self = this.set("healthChecks", js.Array(value :_*))
    
    @scala.inline
    def setHealthChecks(value: js.Array[SchemaHealthCheckReference]): Self = this.set("healthChecks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealthChecks: Self = this.set("healthChecks", js.undefined)
  }
}
