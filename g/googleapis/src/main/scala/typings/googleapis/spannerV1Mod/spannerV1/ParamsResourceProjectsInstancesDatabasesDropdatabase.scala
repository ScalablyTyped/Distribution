package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsInstancesDatabasesDropdatabase
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The database to be dropped.
    */
  var database: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsInstancesDatabasesDropdatabase {
  
  inline def apply(): ParamsResourceProjectsInstancesDatabasesDropdatabase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsInstancesDatabasesDropdatabase]
  }
  
  extension [Self <: ParamsResourceProjectsInstancesDatabasesDropdatabase](x: Self) {
    
    inline def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
    
    inline def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
  }
}
