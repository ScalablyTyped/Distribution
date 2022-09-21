package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAnalyticsAdminV1alphaDataStream extends StObject {
  
  /**
    * Data specific to Android app streams. Must be populated if type is ANDROID_APP_DATA_STREAM.
    */
  var androidAppStreamData: js.UndefOr[SchemaGoogleAnalyticsAdminV1alphaDataStreamAndroidAppStreamData] = js.undefined
  
  /**
    * Output only. Time when this stream was originally created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Human-readable display name for the Data Stream. Required for web data streams. The max allowed display name length is 255 UTF-16 code units.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Data specific to iOS app streams. Must be populated if type is IOS_APP_DATA_STREAM.
    */
  var iosAppStreamData: js.UndefOr[SchemaGoogleAnalyticsAdminV1alphaDataStreamIosAppStreamData] = js.undefined
  
  /**
    * Output only. Resource name of this Data Stream. Format: properties/{property_id\}/dataStreams/{stream_id\} Example: "properties/1000/dataStreams/2000"
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Immutable. The type of this DataStream resource.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Time when stream payload fields were last updated.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Data specific to web streams. Must be populated if type is WEB_DATA_STREAM.
    */
  var webStreamData: js.UndefOr[SchemaGoogleAnalyticsAdminV1alphaDataStreamWebStreamData] = js.undefined
}
object SchemaGoogleAnalyticsAdminV1alphaDataStream {
  
  inline def apply(): SchemaGoogleAnalyticsAdminV1alphaDataStream = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAnalyticsAdminV1alphaDataStream]
  }
  
  extension [Self <: SchemaGoogleAnalyticsAdminV1alphaDataStream](x: Self) {
    
    inline def setAndroidAppStreamData(value: SchemaGoogleAnalyticsAdminV1alphaDataStreamAndroidAppStreamData): Self = StObject.set(x, "androidAppStreamData", value.asInstanceOf[js.Any])
    
    inline def setAndroidAppStreamDataUndefined: Self = StObject.set(x, "androidAppStreamData", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setIosAppStreamData(value: SchemaGoogleAnalyticsAdminV1alphaDataStreamIosAppStreamData): Self = StObject.set(x, "iosAppStreamData", value.asInstanceOf[js.Any])
    
    inline def setIosAppStreamDataUndefined: Self = StObject.set(x, "iosAppStreamData", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    inline def setWebStreamData(value: SchemaGoogleAnalyticsAdminV1alphaDataStreamWebStreamData): Self = StObject.set(x, "webStreamData", value.asInstanceOf[js.Any])
    
    inline def setWebStreamDataUndefined: Self = StObject.set(x, "webStreamData", js.undefined)
  }
}
