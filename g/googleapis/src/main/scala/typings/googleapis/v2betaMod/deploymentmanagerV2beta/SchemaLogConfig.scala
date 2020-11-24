package typings.googleapis.v2betaMod.deploymentmanagerV2beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies what kind of log the caller must write
  */
@js.native
trait SchemaLogConfig extends js.Object {
  
  /**
    * Cloud audit options.
    */
  var cloudAudit: js.UndefOr[SchemaLogConfigCloudAuditOptions] = js.native
  
  /**
    * Counter options.
    */
  var counter: js.UndefOr[SchemaLogConfigCounterOptions] = js.native
  
  /**
    * Data access options.
    */
  var dataAccess: js.UndefOr[SchemaLogConfigDataAccessOptions] = js.native
}
object SchemaLogConfig {
  
  @scala.inline
  def apply(): SchemaLogConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLogConfig]
  }
  
  @scala.inline
  implicit class SchemaLogConfigOps[Self <: SchemaLogConfig] (val x: Self) extends AnyVal {
    
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
    def setCloudAudit(value: SchemaLogConfigCloudAuditOptions): Self = this.set("cloudAudit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudAudit: Self = this.set("cloudAudit", js.undefined)
    
    @scala.inline
    def setCounter(value: SchemaLogConfigCounterOptions): Self = this.set("counter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCounter: Self = this.set("counter", js.undefined)
    
    @scala.inline
    def setDataAccess(value: SchemaLogConfigDataAccessOptions): Self = this.set("dataAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataAccess: Self = this.set("dataAccess", js.undefined)
  }
}
