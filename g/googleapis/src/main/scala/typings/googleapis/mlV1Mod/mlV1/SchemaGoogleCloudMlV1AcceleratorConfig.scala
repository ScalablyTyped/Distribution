package typings.googleapis.mlV1Mod.mlV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a hardware accelerator request config.
  */
@js.native
trait SchemaGoogleCloudMlV1AcceleratorConfig extends js.Object {
  
  /**
    * The number of accelerators to attach to each machine running the job.
    */
  var count: js.UndefOr[String] = js.native
  
  /**
    * The type of accelerator to use.
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaGoogleCloudMlV1AcceleratorConfig {
  
  @scala.inline
  def apply(): SchemaGoogleCloudMlV1AcceleratorConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1AcceleratorConfig]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudMlV1AcceleratorConfigOps[Self <: SchemaGoogleCloudMlV1AcceleratorConfig] (val x: Self) extends AnyVal {
    
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
    def setCount(value: String): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
