package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaScan extends StObject {
  
  /**
    * Additional information provided by the implementer.
    */
  var details: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
  
  /**
    * The upper bound for when the scan is defined.
    */
  var endTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The unique name of the scan, specific to the Database service implementing this interface.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Cloud Key Visualizer scan data. Note, this field is not available to the ListScans method.
    */
  var scanData: js.UndefOr[SchemaScanData] = js.undefined
  
  /**
    * A range of time (inclusive) for when the scan is defined. The lower bound for when the scan is defined.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaScan {
  
  inline def apply(): SchemaScan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaScan]
  }
  
  extension [Self <: SchemaScan](x: Self) {
    
    inline def setDetails(value: StringDictionary[Any]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsNull: Self = StObject.set(x, "details", null)
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setScanData(value: SchemaScanData): Self = StObject.set(x, "scanData", value.asInstanceOf[js.Any])
    
    inline def setScanDataUndefined: Self = StObject.set(x, "scanData", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
