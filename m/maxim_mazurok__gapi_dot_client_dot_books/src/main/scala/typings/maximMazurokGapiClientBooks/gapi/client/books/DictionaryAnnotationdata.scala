package typings.maximMazurokGapiClientBooks.gapi.client.books

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DictionaryAnnotationdata extends js.Object {
  
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
  implicit class DictionaryAnnotationdataOps[Self <: DictionaryAnnotationdata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnnotationType(value: String): Self = this.set("annotationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotationType: Self = this.set("annotationType", js.undefined)
    
    @scala.inline
    def setData(value: Dictlayerdata): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setEncodedData(value: String): Self = this.set("encodedData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncodedData: Self = this.set("encodedData", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLayerId(value: String): Self = this.set("layerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayerId: Self = this.set("layerId", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    
    @scala.inline
    def setUpdated(value: String): Self = this.set("updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdated: Self = this.set("updated", js.undefined)
    
    @scala.inline
    def setVolumeId(value: String): Self = this.set("volumeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumeId: Self = this.set("volumeId", js.undefined)
  }
}
