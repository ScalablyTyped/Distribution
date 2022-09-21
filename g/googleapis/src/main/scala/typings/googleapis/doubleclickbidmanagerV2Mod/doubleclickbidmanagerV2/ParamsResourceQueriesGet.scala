package typings.googleapis.doubleclickbidmanagerV2Mod.doubleclickbidmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceQueriesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. ID of query to retrieve.
    */
  var queryId: js.UndefOr[String] = js.undefined
}
object ParamsResourceQueriesGet {
  
  inline def apply(): ParamsResourceQueriesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceQueriesGet]
  }
  
  extension [Self <: ParamsResourceQueriesGet](x: Self) {
    
    inline def setQueryId(value: String): Self = StObject.set(x, "queryId", value.asInstanceOf[js.Any])
    
    inline def setQueryIdUndefined: Self = StObject.set(x, "queryId", js.undefined)
  }
}
