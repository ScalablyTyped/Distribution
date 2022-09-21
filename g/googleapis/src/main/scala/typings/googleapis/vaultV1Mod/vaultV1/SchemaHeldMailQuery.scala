package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHeldMailQuery extends StObject {
  
  /**
    * The end time for the query. Specify in GMT. The value is rounded to 12 AM on the specified date.
    */
  var endTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The start time for the query. Specify in GMT. The value is rounded to 12 AM on the specified date.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The [search operators](https://support.google.com/vault/answer/2474474) used to refine the messages covered by the hold.
    */
  var terms: js.UndefOr[String | Null] = js.undefined
}
object SchemaHeldMailQuery {
  
  inline def apply(): SchemaHeldMailQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHeldMailQuery]
  }
  
  extension [Self <: SchemaHeldMailQuery](x: Self) {
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setTerms(value: String): Self = StObject.set(x, "terms", value.asInstanceOf[js.Any])
    
    inline def setTermsNull: Self = StObject.set(x, "terms", null)
    
    inline def setTermsUndefined: Self = StObject.set(x, "terms", js.undefined)
  }
}
