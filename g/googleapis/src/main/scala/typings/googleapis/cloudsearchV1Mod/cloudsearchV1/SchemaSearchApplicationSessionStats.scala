package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSearchApplicationSessionStats extends StObject {
  
  /**
    * The date for which session stats were calculated. Stats are calculated on the following day, close to midnight PST, and then returned.
    */
  var date: js.UndefOr[SchemaDate] = js.undefined
  
  /**
    * The count of search sessions on the day
    */
  var searchSessionsCount: js.UndefOr[String | Null] = js.undefined
}
object SchemaSearchApplicationSessionStats {
  
  inline def apply(): SchemaSearchApplicationSessionStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearchApplicationSessionStats]
  }
  
  extension [Self <: SchemaSearchApplicationSessionStats](x: Self) {
    
    inline def setDate(value: SchemaDate): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setSearchSessionsCount(value: String): Self = StObject.set(x, "searchSessionsCount", value.asInstanceOf[js.Any])
    
    inline def setSearchSessionsCountNull: Self = StObject.set(x, "searchSessionsCount", null)
    
    inline def setSearchSessionsCountUndefined: Self = StObject.set(x, "searchSessionsCount", js.undefined)
  }
}
