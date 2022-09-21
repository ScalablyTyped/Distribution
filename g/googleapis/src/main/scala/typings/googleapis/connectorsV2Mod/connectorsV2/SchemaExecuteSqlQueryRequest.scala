package typings.googleapis.connectorsV2Mod.connectorsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaExecuteSqlQueryRequest extends StObject {
  
  /**
    * Required. SQL statement passed by clients like Integration Platform, the query is passed as-is to the driver used for interfacing with external systems.
    */
  var query: js.UndefOr[SchemaQuery] = js.undefined
}
object SchemaExecuteSqlQueryRequest {
  
  inline def apply(): SchemaExecuteSqlQueryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExecuteSqlQueryRequest]
  }
  
  extension [Self <: SchemaExecuteSqlQueryRequest](x: Self) {
    
    inline def setQuery(value: SchemaQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
