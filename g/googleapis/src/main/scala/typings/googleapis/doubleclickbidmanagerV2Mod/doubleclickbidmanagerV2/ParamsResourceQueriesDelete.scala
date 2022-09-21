package typings.googleapis.doubleclickbidmanagerV2Mod.doubleclickbidmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceQueriesDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. ID of query to delete.
    */
  var queryId: js.UndefOr[String] = js.undefined
}
object ParamsResourceQueriesDelete {
  
  inline def apply(): ParamsResourceQueriesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceQueriesDelete]
  }
  
  extension [Self <: ParamsResourceQueriesDelete](x: Self) {
    
    inline def setQueryId(value: String): Self = StObject.set(x, "queryId", value.asInstanceOf[js.Any])
    
    inline def setQueryIdUndefined: Self = StObject.set(x, "queryId", js.undefined)
  }
}
