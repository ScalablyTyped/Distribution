package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSearchApplicationQueryStats extends StObject {
  
  /**
    * The date for which query stats were calculated. Stats calculated on the next day close to midnight are returned.
    */
  var date: js.UndefOr[SchemaDate] = js.undefined
  
  var queryCountByStatus: js.UndefOr[js.Array[SchemaQueryCountByStatus]] = js.undefined
}
object SchemaSearchApplicationQueryStats {
  
  inline def apply(): SchemaSearchApplicationQueryStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearchApplicationQueryStats]
  }
  
  extension [Self <: SchemaSearchApplicationQueryStats](x: Self) {
    
    inline def setDate(value: SchemaDate): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setQueryCountByStatus(value: js.Array[SchemaQueryCountByStatus]): Self = StObject.set(x, "queryCountByStatus", value.asInstanceOf[js.Any])
    
    inline def setQueryCountByStatusUndefined: Self = StObject.set(x, "queryCountByStatus", js.undefined)
    
    inline def setQueryCountByStatusVarargs(value: SchemaQueryCountByStatus*): Self = StObject.set(x, "queryCountByStatus", js.Array(value*))
  }
}
