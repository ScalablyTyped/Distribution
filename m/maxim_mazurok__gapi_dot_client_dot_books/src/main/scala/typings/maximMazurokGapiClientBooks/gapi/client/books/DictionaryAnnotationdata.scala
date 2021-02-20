package typings.maximMazurokGapiClientBooks.gapi.client.books

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DictionaryAnnotationdata extends StObject {
  
  /** The type of annotation this data is for. */
  var annotationType: js.UndefOr[String] = js.native
  
  /** JSON encoded data for this dictionary annotation data. Emitted with name 'data' in JSON output. Either this or geo_data will be populated. */
  var data: js.UndefOr[Dictlayerdata] = js.native
  
  /** Base64 encoded data for this annotation data. */
  var encodedData: js.UndefOr[String] = js.native
  
  /** Unique id for this annotation data. */
  var id: js.UndefOr[String] = js.native
  
  /** Resource Type */
  var kind: js.UndefOr[String] = js.native
  
  /** The Layer id for this data. * */
  var layerId: js.UndefOr[String] = js.native
  
  /** URL for this resource. * */
  var selfLink: js.UndefOr[String] = js.native
  
  /** Timestamp for the last time this data was updated. (RFC 3339 UTC date-time format). */
  var updated: js.UndefOr[String] = js.native
  
  /** The volume id for this data. * */
  var volumeId: js.UndefOr[String] = js.native
}
object DictionaryAnnotationdata {
  
  @scala.inline
  def apply(): DictionaryAnnotationdata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DictionaryAnnotationdata]
  }
  
  @scala.inline
  implicit class DictionaryAnnotationdataMutableBuilder[Self <: DictionaryAnnotationdata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotationType(value: String): Self = StObject.set(x, "annotationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationTypeUndefined: Self = StObject.set(x, "annotationType", js.undefined)
    
    @scala.inline
    def setData(value: Dictlayerdata): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setEncodedData(value: String): Self = StObject.set(x, "encodedData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodedDataUndefined: Self = StObject.set(x, "encodedData", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLayerId(value: String): Self = StObject.set(x, "layerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerIdUndefined: Self = StObject.set(x, "layerId", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    @scala.inline
    def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
    
    @scala.inline
    def setVolumeId(value: String): Self = StObject.set(x, "volumeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeIdUndefined: Self = StObject.set(x, "volumeId", js.undefined)
  }
}
