package typings.googleapis.sqlV1beta4Mod.sqlV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceFlagsList
  extends StObject
     with StandardParameters {
  
  /**
    * Database type and version you want to retrieve flags for. By default, this method returns flags for all database types and versions.
    */
  var databaseVersion: js.UndefOr[String] = js.undefined
}
object ParamsResourceFlagsList {
  
  inline def apply(): ParamsResourceFlagsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFlagsList]
  }
  
  extension [Self <: ParamsResourceFlagsList](x: Self) {
    
    inline def setDatabaseVersion(value: String): Self = StObject.set(x, "databaseVersion", value.asInstanceOf[js.Any])
    
    inline def setDatabaseVersionUndefined: Self = StObject.set(x, "databaseVersion", js.undefined)
  }
}
