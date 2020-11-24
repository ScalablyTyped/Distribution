package typings.googleapis.loggingV2Mod.loggingV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies a set of log entries that are not to be stored in Logging. If
  * your project receives a large volume of logs, you might be able to use
  * exclusions to reduce your chargeable logs. Exclusions are processed after
  * log sinks, so you can export log entries before they are excluded. Audit
  * log entries and log entries from Amazon Web Services are never excluded.
  */
@js.native
trait SchemaLogExclusion extends js.Object {
  
  /**
    * Output only. The creation timestamp of the exclusion.This field may not
    * be present for older exclusions.
    */
  var createTime: js.UndefOr[String] = js.native
  
  /**
    * Optional. A description of this exclusion.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Optional. If set to True, then this exclusion is disabled and it does not
    * exclude any log entries. You can update an exclusion to change the value
    * of this field.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Required. An advanced logs filter that matches the log entries to be
    * excluded. By using the sample function, you can exclude less than 100% of
    * the matching log entries. For example, the following filter matches 99%
    * of low-severity log entries from load
    * balancers:&quot;resource.type=http_load_balancer severity&lt;ERROR
    * sample(insertId, 0.99)&quot;
    */
  var filter: js.UndefOr[String] = js.native
  
  /**
    * Required. A client-assigned identifier, such as
    * &quot;load-balancer-exclusion&quot;. Identifiers are limited to 100
    * characters and can include only letters, digits, underscores, hyphens,
    * and periods.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Output only. The last update timestamp of the exclusion.This field may
    * not be present for older exclusions.
    */
  var updateTime: js.UndefOr[String] = js.native
}
object SchemaLogExclusion {
  
  @scala.inline
  def apply(): SchemaLogExclusion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLogExclusion]
  }
  
  @scala.inline
  implicit class SchemaLogExclusionOps[Self <: SchemaLogExclusion] (val x: Self) extends AnyVal {
    
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
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
  }
}
