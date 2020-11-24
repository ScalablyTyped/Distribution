package typings.googleapis.monitoringV3Mod.monitoringV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A single data point from a collectd-based plugin.
  */
@js.native
trait SchemaCollectdValue extends js.Object {
  
  /**
    * The data source for the collectd value. For example there are two data
    * sources for network measurements: &quot;rx&quot; and &quot;tx&quot;.
    */
  var dataSourceName: js.UndefOr[String] = js.native
  
  /**
    * The type of measurement.
    */
  var dataSourceType: js.UndefOr[String] = js.native
  
  /**
    * The measurement value.
    */
  var value: js.UndefOr[SchemaTypedValue] = js.native
}
object SchemaCollectdValue {
  
  @scala.inline
  def apply(): SchemaCollectdValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCollectdValue]
  }
  
  @scala.inline
  implicit class SchemaCollectdValueOps[Self <: SchemaCollectdValue] (val x: Self) extends AnyVal {
    
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
    def setDataSourceName(value: String): Self = this.set("dataSourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSourceName: Self = this.set("dataSourceName", js.undefined)
    
    @scala.inline
    def setDataSourceType(value: String): Self = this.set("dataSourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSourceType: Self = this.set("dataSourceType", js.undefined)
    
    @scala.inline
    def setValue(value: SchemaTypedValue): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
