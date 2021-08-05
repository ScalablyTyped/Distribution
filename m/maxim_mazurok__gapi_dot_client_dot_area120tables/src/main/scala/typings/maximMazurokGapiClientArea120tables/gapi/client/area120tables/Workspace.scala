package typings.maximMazurokGapiClientArea120tables.gapi.client.area120tables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Workspace extends StObject {
  
  /** The human readable title of the workspace. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** The resource name of the workspace. Workspace names have the form `workspaces/{workspace}`. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The list of tables in the workspace. */
  var tables: js.UndefOr[js.Array[Table]] = js.undefined
}
object Workspace {
  
  inline def apply(): Workspace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Workspace]
  }
  
  extension [Self <: Workspace](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTables(value: js.Array[Table]): Self = StObject.set(x, "tables", value.asInstanceOf[js.Any])
    
    inline def setTablesUndefined: Self = StObject.set(x, "tables", js.undefined)
    
    inline def setTablesVarargs(value: Table*): Self = StObject.set(x, "tables", js.Array(value :_*))
  }
}
