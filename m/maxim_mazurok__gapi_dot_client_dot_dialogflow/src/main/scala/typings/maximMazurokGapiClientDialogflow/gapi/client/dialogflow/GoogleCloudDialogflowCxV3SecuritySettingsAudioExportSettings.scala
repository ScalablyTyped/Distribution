package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3SecuritySettingsAudioExportSettings extends StObject {
  
  /** Filename pattern for exported audio. */
  var audioExportPattern: js.UndefOr[String] = js.undefined
  
  /** File format for exported audio file. Currently only in telephony recordings. */
  var audioFormat: js.UndefOr[String] = js.undefined
  
  /** Enable audio redaction if it is true. */
  var enableAudioRedaction: js.UndefOr[Boolean] = js.undefined
  
  /** Cloud Storage bucket to export audio record to. You need to grant `service-@gcp-sa-dialogflow.iam.gserviceaccount.com` the `Storage Object Admin` role in this bucket. */
  var gcsBucket: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowCxV3SecuritySettingsAudioExportSettings {
  
  inline def apply(): GoogleCloudDialogflowCxV3SecuritySettingsAudioExportSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3SecuritySettingsAudioExportSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDialogflowCxV3SecuritySettingsAudioExportSettings] (val x: Self) extends AnyVal {
    
    inline def setAudioExportPattern(value: String): Self = StObject.set(x, "audioExportPattern", value.asInstanceOf[js.Any])
    
    inline def setAudioExportPatternUndefined: Self = StObject.set(x, "audioExportPattern", js.undefined)
    
    inline def setAudioFormat(value: String): Self = StObject.set(x, "audioFormat", value.asInstanceOf[js.Any])
    
    inline def setAudioFormatUndefined: Self = StObject.set(x, "audioFormat", js.undefined)
    
    inline def setEnableAudioRedaction(value: Boolean): Self = StObject.set(x, "enableAudioRedaction", value.asInstanceOf[js.Any])
    
    inline def setEnableAudioRedactionUndefined: Self = StObject.set(x, "enableAudioRedaction", js.undefined)
    
    inline def setGcsBucket(value: String): Self = StObject.set(x, "gcsBucket", value.asInstanceOf[js.Any])
    
    inline def setGcsBucketUndefined: Self = StObject.set(x, "gcsBucket", js.undefined)
  }
}
