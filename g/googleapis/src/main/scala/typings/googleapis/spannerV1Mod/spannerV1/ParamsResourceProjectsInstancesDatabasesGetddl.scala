package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsInstancesDatabasesGetddl
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The database whose schema we wish to get. Values are of the form `projects//instances//databases/`
    */
  var database: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsInstancesDatabasesGetddl {
  
  inline def apply(): ParamsResourceProjectsInstancesDatabasesGetddl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsInstancesDatabasesGetddl]
  }
  
  extension [Self <: ParamsResourceProjectsInstancesDatabasesGetddl](x: Self) {
    
    inline def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
    
    inline def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
  }
}
