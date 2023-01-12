package typings.maximMazurokGapiClientArea120tables.gapi.client.area120tables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Table extends StObject {
  
  /** List of columns in this table. Order of columns matches the display order. */
  var columns: js.UndefOr[js.Array[ColumnDescription]] = js.undefined
  
  /** Time when the table was created. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** The human readable title of the table. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** The resource name of the table. Table names have the form `tables/{table}`. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Saved views for this table. */
  var savedViews: js.UndefOr[js.Array[SavedView]] = js.undefined
  
  /** The time zone of the table. IANA Time Zone Database time zone, e.g. "America/New_York". */
  var timeZone: js.UndefOr[String] = js.undefined
  
  /** Time when the table was last updated excluding updates to individual rows */
  var updateTime: js.UndefOr[String] = js.undefined
}
object Table {
  
  inline def apply(): Table = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Table]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Table] (val x: Self) extends AnyVal {
    
    inline def setColumns(value: js.Array[ColumnDescription]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: ColumnDescription*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSavedViews(value: js.Array[SavedView]): Self = StObject.set(x, "savedViews", value.asInstanceOf[js.Any])
    
    inline def setSavedViewsUndefined: Self = StObject.set(x, "savedViews", js.undefined)
    
    inline def setSavedViewsVarargs(value: SavedView*): Self = StObject.set(x, "savedViews", js.Array(value*))
    
    inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
