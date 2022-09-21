package typings.googleapis.v1alpha1Mod.area120tablesV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTable extends StObject {
  
  /**
    * List of columns in this table. Order of columns matches the display order.
    */
  var columns: js.UndefOr[js.Array[SchemaColumnDescription]] = js.undefined
  
  /**
    * Time when the table was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The human readable title of the table.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The resource name of the table. Table names have the form `tables/{table\}`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Saved views for this table.
    */
  var savedViews: js.UndefOr[js.Array[SchemaSavedView]] = js.undefined
  
  /**
    * The time zone of the table. IANA Time Zone Database time zone, e.g. "America/New_York".
    */
  var timeZone: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Time when the table was last updated excluding updates to individual rows
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaTable {
  
  inline def apply(): SchemaTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTable]
  }
  
  extension [Self <: SchemaTable](x: Self) {
    
    inline def setColumns(value: js.Array[SchemaColumnDescription]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: SchemaColumnDescription*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSavedViews(value: js.Array[SchemaSavedView]): Self = StObject.set(x, "savedViews", value.asInstanceOf[js.Any])
    
    inline def setSavedViewsUndefined: Self = StObject.set(x, "savedViews", js.undefined)
    
    inline def setSavedViewsVarargs(value: SchemaSavedView*): Self = StObject.set(x, "savedViews", js.Array(value*))
    
    inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneNull: Self = StObject.set(x, "timeZone", null)
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
