package typings.googleapis.datastreamV1alpha1Mod.datastreamV1alpha1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStream extends StObject {
  
  /**
    * Automatically backfill objects included in the stream source configuration. Specific objects can be excluded.
    */
  var backfillAll: js.UndefOr[SchemaBackfillAllStrategy] = js.undefined
  
  /**
    * Do not automatically backfill any objects.
    */
  var backfillNone: js.UndefOr[SchemaBackfillNoneStrategy] = js.undefined
  
  /**
    * Output only. The creation time of the stream.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Immutable. A reference to a KMS encryption key. If provided, it will be used to encrypt the data. If left blank, data will be encrypted using an internal Stream-specific encryption key provisioned through KMS.
    */
  var customerManagedEncryptionKey: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Destination connection profile configuration.
    */
  var destinationConfig: js.UndefOr[SchemaDestinationConfig] = js.undefined
  
  /**
    * Required. Display name.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Errors on the Stream.
    */
  var errors: js.UndefOr[js.Array[SchemaError]] = js.undefined
  
  /**
    * Labels.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Output only. The stream's name.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Source connection profile configuration.
    */
  var sourceConfig: js.UndefOr[SchemaSourceConfig] = js.undefined
  
  /**
    * The state of the stream.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The last update time of the stream.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaStream {
  
  inline def apply(): SchemaStream = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStream]
  }
  
  extension [Self <: SchemaStream](x: Self) {
    
    inline def setBackfillAll(value: SchemaBackfillAllStrategy): Self = StObject.set(x, "backfillAll", value.asInstanceOf[js.Any])
    
    inline def setBackfillAllUndefined: Self = StObject.set(x, "backfillAll", js.undefined)
    
    inline def setBackfillNone(value: SchemaBackfillNoneStrategy): Self = StObject.set(x, "backfillNone", value.asInstanceOf[js.Any])
    
    inline def setBackfillNoneUndefined: Self = StObject.set(x, "backfillNone", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setCustomerManagedEncryptionKey(value: String): Self = StObject.set(x, "customerManagedEncryptionKey", value.asInstanceOf[js.Any])
    
    inline def setCustomerManagedEncryptionKeyNull: Self = StObject.set(x, "customerManagedEncryptionKey", null)
    
    inline def setCustomerManagedEncryptionKeyUndefined: Self = StObject.set(x, "customerManagedEncryptionKey", js.undefined)
    
    inline def setDestinationConfig(value: SchemaDestinationConfig): Self = StObject.set(x, "destinationConfig", value.asInstanceOf[js.Any])
    
    inline def setDestinationConfigUndefined: Self = StObject.set(x, "destinationConfig", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setErrors(value: js.Array[SchemaError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: SchemaError*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSourceConfig(value: SchemaSourceConfig): Self = StObject.set(x, "sourceConfig", value.asInstanceOf[js.Any])
    
    inline def setSourceConfigUndefined: Self = StObject.set(x, "sourceConfig", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
