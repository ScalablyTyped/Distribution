package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAccountStatusProducts extends StObject {
  
  /**
    * The channel the data applies to. Acceptable values are: - "`local`" - "`online`"
    */
  var channel: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The country the data applies to.
    */
  var country: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The destination the data applies to.
    */
  var destination: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of item-level issues.
    */
  var itemLevelIssues: js.UndefOr[js.Array[SchemaAccountStatusItemLevelIssue]] = js.undefined
  
  /**
    * Aggregated product statistics.
    */
  var statistics: js.UndefOr[SchemaAccountStatusStatistics] = js.undefined
}
object SchemaAccountStatusProducts {
  
  inline def apply(): SchemaAccountStatusProducts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountStatusProducts]
  }
  
  extension [Self <: SchemaAccountStatusProducts](x: Self) {
    
    inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setChannelNull: Self = StObject.set(x, "channel", null)
    
    inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryNull: Self = StObject.set(x, "country", null)
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationNull: Self = StObject.set(x, "destination", null)
    
    inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    inline def setItemLevelIssues(value: js.Array[SchemaAccountStatusItemLevelIssue]): Self = StObject.set(x, "itemLevelIssues", value.asInstanceOf[js.Any])
    
    inline def setItemLevelIssuesUndefined: Self = StObject.set(x, "itemLevelIssues", js.undefined)
    
    inline def setItemLevelIssuesVarargs(value: SchemaAccountStatusItemLevelIssue*): Self = StObject.set(x, "itemLevelIssues", js.Array(value*))
    
    inline def setStatistics(value: SchemaAccountStatusStatistics): Self = StObject.set(x, "statistics", value.asInstanceOf[js.Any])
    
    inline def setStatisticsUndefined: Self = StObject.set(x, "statistics", js.undefined)
  }
}
