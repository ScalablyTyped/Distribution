package typings.maximMazurokGapiClientBooks.gapi.client.books

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Layersummary extends js.Object {
  
  /** The number of annotations for this layer. */
  var annotationCount: js.UndefOr[Double] = js.native
  
  /** The list of annotation types contained for this layer. */
  var annotationTypes: js.UndefOr[js.Array[String]] = js.native
  
  /** Link to get data for this annotation. */
  var annotationsDataLink: js.UndefOr[String] = js.native
  
  /** The link to get the annotations for this layer. */
  var annotationsLink: js.UndefOr[String] = js.native
  
  /** The content version this resource is for. */
  var contentVersion: js.UndefOr[String] = js.native
  
  /** The number of data items for this layer. */
  var dataCount: js.UndefOr[Double] = js.native
  
  /** Unique id of this layer summary. */
  var id: js.UndefOr[String] = js.native
  
  /** Resource Type */
  var kind: js.UndefOr[String] = js.native
  
  /** The layer id for this summary. */
  var layerId: js.UndefOr[String] = js.native
  
  /** URL to this resource. */
  var selfLink: js.UndefOr[String] = js.native
  
  /** Timestamp for the last time an item in this layer was updated. (RFC 3339 UTC date-time format). */
  var updated: js.UndefOr[String] = js.native
  
  /**
    * The current version of this layer's volume annotations. Note that this version applies only to the data in the books.layers.volumeAnnotations.* responses. The actual annotation data
    * is versioned separately.
    */
  var volumeAnnotationsVersion: js.UndefOr[String] = js.native
  
  /** The volume id this resource is for. */
  var volumeId: js.UndefOr[String] = js.native
}
object Layersummary {
  
  @scala.inline
  def apply(): Layersummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Layersummary]
  }
  
  @scala.inline
  implicit class LayersummaryOps[Self <: Layersummary] (val x: Self) extends AnyVal {
    
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
    def setAnnotationCount(value: Double): Self = this.set("annotationCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotationCount: Self = this.set("annotationCount", js.undefined)
    
    @scala.inline
    def setAnnotationTypesVarargs(value: String*): Self = this.set("annotationTypes", js.Array(value :_*))
    
    @scala.inline
    def setAnnotationTypes(value: js.Array[String]): Self = this.set("annotationTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotationTypes: Self = this.set("annotationTypes", js.undefined)
    
    @scala.inline
    def setAnnotationsDataLink(value: String): Self = this.set("annotationsDataLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotationsDataLink: Self = this.set("annotationsDataLink", js.undefined)
    
    @scala.inline
    def setAnnotationsLink(value: String): Self = this.set("annotationsLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotationsLink: Self = this.set("annotationsLink", js.undefined)
    
    @scala.inline
    def setContentVersion(value: String): Self = this.set("contentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentVersion: Self = this.set("contentVersion", js.undefined)
    
    @scala.inline
    def setDataCount(value: Double): Self = this.set("dataCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataCount: Self = this.set("dataCount", js.undefined)
    
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
    def setVolumeAnnotationsVersion(value: String): Self = this.set("volumeAnnotationsVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumeAnnotationsVersion: Self = this.set("volumeAnnotationsVersion", js.undefined)
    
    @scala.inline
    def setVolumeId(value: String): Self = this.set("volumeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumeId: Self = this.set("volumeId", js.undefined)
  }
}
