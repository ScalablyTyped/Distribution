package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A single data point from a collectd-based plugin.
  */
trait SchemaCollectdValue extends StObject {
  
  /**
    * The data source for the collectd value. For example there are two data
    * sources for network measurements: &quot;rx&quot; and &quot;tx&quot;.
    */
  var dataSourceName: js.UndefOr[String] = js.undefined
  
  /**
    * The type of measurement.
    */
  var dataSourceType: js.UndefOr[String] = js.undefined
  
  /**
    * The measurement value.
    */
  var value: js.UndefOr[SchemaTypedValue] = js.undefined
}
object SchemaCollectdValue {
  
  @scala.inline
  def apply(): SchemaCollectdValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCollectdValue]
  }
  
  @scala.inline
  implicit class SchemaCollectdValueMutableBuilder[Self <: SchemaCollectdValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataSourceName(value: String): Self = StObject.set(x, "dataSourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceNameUndefined: Self = StObject.set(x, "dataSourceName", js.undefined)
    
    @scala.inline
    def setDataSourceType(value: String): Self = StObject.set(x, "dataSourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceTypeUndefined: Self = StObject.set(x, "dataSourceType", js.undefined)
    
    @scala.inline
    def setValue(value: SchemaTypedValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
