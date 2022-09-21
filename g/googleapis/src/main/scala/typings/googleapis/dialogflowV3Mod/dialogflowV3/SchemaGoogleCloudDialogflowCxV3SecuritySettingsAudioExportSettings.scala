package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3SecuritySettingsAudioExportSettings extends StObject {
  
  /**
    * Filename pattern for exported audio.
    */
  var audioExportPattern: js.UndefOr[String | Null] = js.undefined
  
  /**
    * File format for exported audio file. Currently only in telephony recordings.
    */
  var audioFormat: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Enable audio redaction if it is true.
    */
  var enableAudioRedaction: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Cloud Storage bucket to export audio record to. You need to grant `service-@gcp-sa-dialogflow.iam.gserviceaccount.com` the `Storage Object Admin` role in this bucket.
    */
  var gcsBucket: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3SecuritySettingsAudioExportSettings {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3SecuritySettingsAudioExportSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3SecuritySettingsAudioExportSettings]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3SecuritySettingsAudioExportSettings](x: Self) {
    
    inline def setAudioExportPattern(value: String): Self = StObject.set(x, "audioExportPattern", value.asInstanceOf[js.Any])
    
    inline def setAudioExportPatternNull: Self = StObject.set(x, "audioExportPattern", null)
    
    inline def setAudioExportPatternUndefined: Self = StObject.set(x, "audioExportPattern", js.undefined)
    
    inline def setAudioFormat(value: String): Self = StObject.set(x, "audioFormat", value.asInstanceOf[js.Any])
    
    inline def setAudioFormatNull: Self = StObject.set(x, "audioFormat", null)
    
    inline def setAudioFormatUndefined: Self = StObject.set(x, "audioFormat", js.undefined)
    
    inline def setEnableAudioRedaction(value: Boolean): Self = StObject.set(x, "enableAudioRedaction", value.asInstanceOf[js.Any])
    
    inline def setEnableAudioRedactionNull: Self = StObject.set(x, "enableAudioRedaction", null)
    
    inline def setEnableAudioRedactionUndefined: Self = StObject.set(x, "enableAudioRedaction", js.undefined)
    
    inline def setGcsBucket(value: String): Self = StObject.set(x, "gcsBucket", value.asInstanceOf[js.Any])
    
    inline def setGcsBucketNull: Self = StObject.set(x, "gcsBucket", null)
    
    inline def setGcsBucketUndefined: Self = StObject.set(x, "gcsBucket", js.undefined)
  }
}
