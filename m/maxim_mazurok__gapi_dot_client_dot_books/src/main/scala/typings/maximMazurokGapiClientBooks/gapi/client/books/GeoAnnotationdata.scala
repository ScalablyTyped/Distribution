package typings.maximMazurokGapiClientBooks.gapi.client.books

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoAnnotationdata extends StObject {
  
  /** The type of annotation this data is for. */
  var annotationType: js.UndefOr[String] = js.undefined
  
  /** JSON encoded data for this geo annotation data. Emitted with name 'data' in JSON output. Either this or dict_data will be populated. */
  var data: js.UndefOr[Geolayerdata] = js.undefined
  
  /** Base64 encoded data for this annotation data. */
  var encodedData: js.UndefOr[String] = js.undefined
  
  /** Unique id for this annotation data. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Resource Type */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The Layer id for this data. * */
  var layerId: js.UndefOr[String] = js.undefined
  
  /** URL for this resource. * */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /** Timestamp for the last time this data was updated. (RFC 3339 UTC date-time format). */
  var updated: js.UndefOr[String] = js.undefined
  
  /** The volume id for this data. * */
  var volumeId: js.UndefOr[String] = js.undefined
}
object GeoAnnotationdata {
  
  inline def apply(): GeoAnnotationdata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeoAnnotationdata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeoAnnotationdata] (val x: Self) extends AnyVal {
    
    inline def setAnnotationType(value: String): Self = StObject.set(x, "annotationType", value.asInstanceOf[js.Any])
    
    inline def setAnnotationTypeUndefined: Self = StObject.set(x, "annotationType", js.undefined)
    
    inline def setData(value: Geolayerdata): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setEncodedData(value: String): Self = StObject.set(x, "encodedData", value.asInstanceOf[js.Any])
    
    inline def setEncodedDataUndefined: Self = StObject.set(x, "encodedData", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLayerId(value: String): Self = StObject.set(x, "layerId", value.asInstanceOf[js.Any])
    
    inline def setLayerIdUndefined: Self = StObject.set(x, "layerId", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    inline def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
    
    inline def setVolumeId(value: String): Self = StObject.set(x, "volumeId", value.asInstanceOf[js.Any])
    
    inline def setVolumeIdUndefined: Self = StObject.set(x, "volumeId", js.undefined)
  }
}
