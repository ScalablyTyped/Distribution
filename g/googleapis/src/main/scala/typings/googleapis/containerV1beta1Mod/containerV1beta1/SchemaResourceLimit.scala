package typings.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information about amount of some resource in the cluster. For
  * memory, value should be in GB.
  */
@js.native
trait SchemaResourceLimit extends js.Object {
  
  /**
    * Maximum amount of the resource in the cluster.
    */
  var maximum: js.UndefOr[String] = js.native
  
  /**
    * Minimum amount of the resource in the cluster.
    */
  var minimum: js.UndefOr[String] = js.native
  
  /**
    * Resource name &quot;cpu&quot;, &quot;memory&quot; or gpu-specific string.
    */
  var resourceType: js.UndefOr[String] = js.native
}
object SchemaResourceLimit {
  
  @scala.inline
  def apply(): SchemaResourceLimit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourceLimit]
  }
  
  @scala.inline
  implicit class SchemaResourceLimitOps[Self <: SchemaResourceLimit] (val x: Self) extends AnyVal {
    
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
    def setMaximum(value: String): Self = this.set("maximum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximum: Self = this.set("maximum", js.undefined)
    
    @scala.inline
    def setMinimum(value: String): Self = this.set("minimum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimum: Self = this.set("minimum", js.undefined)
    
    @scala.inline
    def setResourceType(value: String): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceType: Self = this.set("resourceType", js.undefined)
  }
}
