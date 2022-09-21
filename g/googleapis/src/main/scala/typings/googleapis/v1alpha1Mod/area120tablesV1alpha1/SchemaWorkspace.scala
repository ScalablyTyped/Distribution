package typings.googleapis.v1alpha1Mod.area120tablesV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWorkspace extends StObject {
  
  /**
    * Time when the workspace was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The human readable title of the workspace.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The resource name of the workspace. Workspace names have the form `workspaces/{workspace\}`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of tables in the workspace.
    */
  var tables: js.UndefOr[js.Array[SchemaTable]] = js.undefined
  
  /**
    * Time when the workspace was last updated.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaWorkspace {
  
  inline def apply(): SchemaWorkspace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWorkspace]
  }
  
  extension [Self <: SchemaWorkspace](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTables(value: js.Array[SchemaTable]): Self = StObject.set(x, "tables", value.asInstanceOf[js.Any])
    
    inline def setTablesUndefined: Self = StObject.set(x, "tables", js.undefined)
    
    inline def setTablesVarargs(value: SchemaTable*): Self = StObject.set(x, "tables", js.Array(value*))
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
