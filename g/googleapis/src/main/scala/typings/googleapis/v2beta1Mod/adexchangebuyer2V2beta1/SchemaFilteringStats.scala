package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @OutputOnly Filtering reasons for this creative during a period of a single
  * day (from midnight to midnight Pacific).
  */
trait SchemaFilteringStats extends StObject {
  
  /**
    * The day during which the data was collected. The data is collected from
    * 00:00:00 to 23:59:59 PT. During switches from PST to PDT and back, the
    * day may contain 23 or 25 hours of data instead of the usual 24.
    */
  var date: js.UndefOr[SchemaDate] = js.undefined
  
  /**
    * The set of filtering reasons for this date.
    */
  var reasons: js.UndefOr[js.Array[SchemaReason]] = js.undefined
}
object SchemaFilteringStats {
  
  inline def apply(): SchemaFilteringStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFilteringStats]
  }
  
  extension [Self <: SchemaFilteringStats](x: Self) {
    
    inline def setDate(value: SchemaDate): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setReasons(value: js.Array[SchemaReason]): Self = StObject.set(x, "reasons", value.asInstanceOf[js.Any])
    
    inline def setReasonsUndefined: Self = StObject.set(x, "reasons", js.undefined)
    
    inline def setReasonsVarargs(value: SchemaReason*): Self = StObject.set(x, "reasons", js.Array(value :_*))
  }
}
