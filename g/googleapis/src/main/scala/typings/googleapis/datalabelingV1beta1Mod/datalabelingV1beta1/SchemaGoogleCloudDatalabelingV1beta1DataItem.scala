package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1beta1DataItem extends StObject {
  
  /**
    * The image payload, a container of the image bytes/uri.
    */
  var imagePayload: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1ImagePayload] = js.undefined
  
  /**
    * Output only. Name of the data item, in format of: projects/{project_id\}/datasets/{dataset_id\}/dataItems/{data_item_id\}
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The text payload, a container of text content.
    */
  var textPayload: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1TextPayload] = js.undefined
  
  /**
    * The video payload, a container of the video uri.
    */
  var videoPayload: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1VideoPayload] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1beta1DataItem {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1beta1DataItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1beta1DataItem]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1beta1DataItem](x: Self) {
    
    inline def setImagePayload(value: SchemaGoogleCloudDatalabelingV1beta1ImagePayload): Self = StObject.set(x, "imagePayload", value.asInstanceOf[js.Any])
    
    inline def setImagePayloadUndefined: Self = StObject.set(x, "imagePayload", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTextPayload(value: SchemaGoogleCloudDatalabelingV1beta1TextPayload): Self = StObject.set(x, "textPayload", value.asInstanceOf[js.Any])
    
    inline def setTextPayloadUndefined: Self = StObject.set(x, "textPayload", js.undefined)
    
    inline def setVideoPayload(value: SchemaGoogleCloudDatalabelingV1beta1VideoPayload): Self = StObject.set(x, "videoPayload", value.asInstanceOf[js.Any])
    
    inline def setVideoPayloadUndefined: Self = StObject.set(x, "videoPayload", js.undefined)
  }
}
