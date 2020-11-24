package typings.maximMazurokGapiClientAppengine.gapi.client.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BasicScaling extends js.Object {
  
  /** Duration of time after the last request that an instance must wait before the instance is shut down. */
  var idleTimeout: js.UndefOr[String] = js.native
  
  /** Maximum number of instances to create for this version. */
  var maxInstances: js.UndefOr[Double] = js.native
}
object BasicScaling {
  
  @scala.inline
  def apply(): BasicScaling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasicScaling]
  }
  
  @scala.inline
  implicit class BasicScalingOps[Self <: BasicScaling] (val x: Self) extends AnyVal {
    
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
    def setIdleTimeout(value: String): Self = this.set("idleTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdleTimeout: Self = this.set("idleTimeout", js.undefined)
    
    @scala.inline
    def setMaxInstances(value: Double): Self = this.set("maxInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxInstances: Self = this.set("maxInstances", js.undefined)
  }
}
