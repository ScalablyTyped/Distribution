package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaQueryCountByStatus extends StObject {
  
  var count: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This represents the http status code.
    */
  var statusCode: js.UndefOr[Double | Null] = js.undefined
}
object SchemaQueryCountByStatus {
  
  inline def apply(): SchemaQueryCountByStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQueryCountByStatus]
  }
  
  extension [Self <: SchemaQueryCountByStatus](x: Self) {
    
    inline def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountNull: Self = StObject.set(x, "count", null)
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setStatusCodeNull: Self = StObject.set(x, "statusCode", null)
    
    inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
  }
}
