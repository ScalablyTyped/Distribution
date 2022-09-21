package typings.googleapis.contactcenterinsightsV1Mod.contactcenterinsightsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudContactcenterinsightsV1ConversationDataSource extends StObject {
  
  /**
    * The source when the conversation comes from Dialogflow.
    */
  var dialogflowSource: js.UndefOr[SchemaGoogleCloudContactcenterinsightsV1DialogflowSource] = js.undefined
  
  /**
    * A Cloud Storage location specification for the audio and transcript.
    */
  var gcsSource: js.UndefOr[SchemaGoogleCloudContactcenterinsightsV1GcsSource] = js.undefined
}
object SchemaGoogleCloudContactcenterinsightsV1ConversationDataSource {
  
  inline def apply(): SchemaGoogleCloudContactcenterinsightsV1ConversationDataSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudContactcenterinsightsV1ConversationDataSource]
  }
  
  extension [Self <: SchemaGoogleCloudContactcenterinsightsV1ConversationDataSource](x: Self) {
    
    inline def setDialogflowSource(value: SchemaGoogleCloudContactcenterinsightsV1DialogflowSource): Self = StObject.set(x, "dialogflowSource", value.asInstanceOf[js.Any])
    
    inline def setDialogflowSourceUndefined: Self = StObject.set(x, "dialogflowSource", js.undefined)
    
    inline def setGcsSource(value: SchemaGoogleCloudContactcenterinsightsV1GcsSource): Self = StObject.set(x, "gcsSource", value.asInstanceOf[js.Any])
    
    inline def setGcsSourceUndefined: Self = StObject.set(x, "gcsSource", js.undefined)
  }
}
