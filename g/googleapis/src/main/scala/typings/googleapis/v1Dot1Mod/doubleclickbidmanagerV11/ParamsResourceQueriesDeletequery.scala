package typings.googleapis.v1Dot1Mod.doubleclickbidmanagerV11

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceQueriesDeletequery
  extends StObject
     with StandardParameters {
  
  /**
    * Query ID to delete.
    */
  var queryId: js.UndefOr[String] = js.undefined
}
object ParamsResourceQueriesDeletequery {
  
  inline def apply(): ParamsResourceQueriesDeletequery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceQueriesDeletequery]
  }
  
  extension [Self <: ParamsResourceQueriesDeletequery](x: Self) {
    
    inline def setQueryId(value: String): Self = StObject.set(x, "queryId", value.asInstanceOf[js.Any])
    
    inline def setQueryIdUndefined: Self = StObject.set(x, "queryId", js.undefined)
  }
}
