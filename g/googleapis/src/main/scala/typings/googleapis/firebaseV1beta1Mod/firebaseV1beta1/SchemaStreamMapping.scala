package typings.googleapis.firebaseV1beta1Mod.firebaseV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStreamMapping extends StObject {
  
  /**
    * The resource name of the Firebase App associated with the Google Analytics data stream, in the format: projects/PROJECT_IDENTIFIER/androidApps/APP_ID or projects/PROJECT_IDENTIFIER/iosApps/APP_ID or projects/PROJECT_IDENTIFIER /webApps/APP_ID Refer to the `FirebaseProject` [`name`](../projects#FirebaseProject.FIELDS.name) field for details about PROJECT_IDENTIFIER values.
    */
  var app: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Applicable for Firebase Web Apps only. The unique Google-assigned identifier of the Google Analytics web stream associated with the Firebase Web App. Firebase SDKs use this ID to interact with Google Analytics APIs. Learn more about this ID and Google Analytics web streams in the [Analytics documentation](https://support.google.com/analytics/answer/9304153).
    */
  var measurementId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The unique Google-assigned identifier of the Google Analytics data stream associated with the Firebase App. Learn more about Google Analytics data streams in the [Analytics documentation](https://support.google.com/analytics/answer/9303323).
    */
  var streamId: js.UndefOr[String | Null] = js.undefined
}
object SchemaStreamMapping {
  
  inline def apply(): SchemaStreamMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStreamMapping]
  }
  
  extension [Self <: SchemaStreamMapping](x: Self) {
    
    inline def setApp(value: String): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    inline def setAppNull: Self = StObject.set(x, "app", null)
    
    inline def setAppUndefined: Self = StObject.set(x, "app", js.undefined)
    
    inline def setMeasurementId(value: String): Self = StObject.set(x, "measurementId", value.asInstanceOf[js.Any])
    
    inline def setMeasurementIdNull: Self = StObject.set(x, "measurementId", null)
    
    inline def setMeasurementIdUndefined: Self = StObject.set(x, "measurementId", js.undefined)
    
    inline def setStreamId(value: String): Self = StObject.set(x, "streamId", value.asInstanceOf[js.Any])
    
    inline def setStreamIdNull: Self = StObject.set(x, "streamId", null)
    
    inline def setStreamIdUndefined: Self = StObject.set(x, "streamId", js.undefined)
  }
}
