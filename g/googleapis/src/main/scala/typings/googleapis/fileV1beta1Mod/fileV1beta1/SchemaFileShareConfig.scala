package typings.googleapis.fileV1beta1Mod.fileV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * File share configuration for the instance.
  */
@js.native
trait SchemaFileShareConfig extends js.Object {
  
  /**
    * File share capacity in gigabytes (GB). Cloud Filestore defines 1 GB as
    * 1024^3 bytes.
    */
  var capacityGb: js.UndefOr[String] = js.native
  
  /**
    * The name of the file share (must be 16 characters or less).
    */
  var name: js.UndefOr[String] = js.native
}
object SchemaFileShareConfig {
  
  @scala.inline
  def apply(): SchemaFileShareConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFileShareConfig]
  }
  
  @scala.inline
  implicit class SchemaFileShareConfigOps[Self <: SchemaFileShareConfig] (val x: Self) extends AnyVal {
    
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
    def setCapacityGb(value: String): Self = this.set("capacityGb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapacityGb: Self = this.set("capacityGb", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
