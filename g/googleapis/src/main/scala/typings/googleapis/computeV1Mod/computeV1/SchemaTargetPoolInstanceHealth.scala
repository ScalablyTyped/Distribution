package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaTargetPoolInstanceHealth extends js.Object {
  
  var healthStatus: js.UndefOr[js.Array[SchemaHealthStatus]] = js.native
  
  /**
    * [Output Only] Type of resource. Always compute#targetPoolInstanceHealth
    * when checking the health of an instance.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaTargetPoolInstanceHealth {
  
  @scala.inline
  def apply(): SchemaTargetPoolInstanceHealth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetPoolInstanceHealth]
  }
  
  @scala.inline
  implicit class SchemaTargetPoolInstanceHealthOps[Self <: SchemaTargetPoolInstanceHealth] (val x: Self) extends AnyVal {
    
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
    def setHealthStatusVarargs(value: SchemaHealthStatus*): Self = this.set("healthStatus", js.Array(value :_*))
    
    @scala.inline
    def setHealthStatus(value: js.Array[SchemaHealthStatus]): Self = this.set("healthStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealthStatus: Self = this.set("healthStatus", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
}
