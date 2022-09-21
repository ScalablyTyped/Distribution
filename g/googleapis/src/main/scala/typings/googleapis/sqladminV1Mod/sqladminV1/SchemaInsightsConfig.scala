package typings.googleapis.sqladminV1Mod.sqladminV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInsightsConfig extends StObject {
  
  /**
    * Whether Query Insights feature is enabled.
    */
  var queryInsightsEnabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Number of query execution plans captured by Insights per minute for all queries combined. Default is 5.
    */
  var queryPlansPerMinute: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Maximum query length stored in bytes. Default value: 1024 bytes. Range: 256-4500 bytes. Query length more than this field value will be truncated to this value. When unset, query length will be the default value. Changing query length will restart the database.
    */
  var queryStringLength: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Whether Query Insights will record application tags from query when enabled.
    */
  var recordApplicationTags: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether Query Insights will record client address when enabled.
    */
  var recordClientAddress: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaInsightsConfig {
  
  inline def apply(): SchemaInsightsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInsightsConfig]
  }
  
  extension [Self <: SchemaInsightsConfig](x: Self) {
    
    inline def setQueryInsightsEnabled(value: Boolean): Self = StObject.set(x, "queryInsightsEnabled", value.asInstanceOf[js.Any])
    
    inline def setQueryInsightsEnabledNull: Self = StObject.set(x, "queryInsightsEnabled", null)
    
    inline def setQueryInsightsEnabledUndefined: Self = StObject.set(x, "queryInsightsEnabled", js.undefined)
    
    inline def setQueryPlansPerMinute(value: Double): Self = StObject.set(x, "queryPlansPerMinute", value.asInstanceOf[js.Any])
    
    inline def setQueryPlansPerMinuteNull: Self = StObject.set(x, "queryPlansPerMinute", null)
    
    inline def setQueryPlansPerMinuteUndefined: Self = StObject.set(x, "queryPlansPerMinute", js.undefined)
    
    inline def setQueryStringLength(value: Double): Self = StObject.set(x, "queryStringLength", value.asInstanceOf[js.Any])
    
    inline def setQueryStringLengthNull: Self = StObject.set(x, "queryStringLength", null)
    
    inline def setQueryStringLengthUndefined: Self = StObject.set(x, "queryStringLength", js.undefined)
    
    inline def setRecordApplicationTags(value: Boolean): Self = StObject.set(x, "recordApplicationTags", value.asInstanceOf[js.Any])
    
    inline def setRecordApplicationTagsNull: Self = StObject.set(x, "recordApplicationTags", null)
    
    inline def setRecordApplicationTagsUndefined: Self = StObject.set(x, "recordApplicationTags", js.undefined)
    
    inline def setRecordClientAddress(value: Boolean): Self = StObject.set(x, "recordClientAddress", value.asInstanceOf[js.Any])
    
    inline def setRecordClientAddressNull: Self = StObject.set(x, "recordClientAddress", null)
    
    inline def setRecordClientAddressUndefined: Self = StObject.set(x, "recordClientAddress", js.undefined)
  }
}
