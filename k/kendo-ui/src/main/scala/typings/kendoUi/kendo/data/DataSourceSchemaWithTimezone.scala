package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceSchemaWithTimezone
  extends StObject
     with DataSourceSchema {
  
  var timezone: js.UndefOr[String] = js.undefined
}
object DataSourceSchemaWithTimezone {
  
  @scala.inline
  def apply(): DataSourceSchemaWithTimezone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceSchemaWithTimezone]
  }
  
  @scala.inline
  implicit class DataSourceSchemaWithTimezoneMutableBuilder[Self <: DataSourceSchemaWithTimezone] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
  }
}
