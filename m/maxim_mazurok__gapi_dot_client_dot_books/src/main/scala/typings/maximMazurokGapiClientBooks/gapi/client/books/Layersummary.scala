package typings.maximMazurokGapiClientBooks.gapi.client.books

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Layersummary extends StObject {
  
  /** The number of annotations for this layer. */
  var annotationCount: js.UndefOr[Double] = js.undefined
  
  /** The list of annotation types contained for this layer. */
  var annotationTypes: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Link to get data for this annotation. */
  var annotationsDataLink: js.UndefOr[String] = js.undefined
  
  /** The link to get the annotations for this layer. */
  var annotationsLink: js.UndefOr[String] = js.undefined
  
  /** The content version this resource is for. */
  var contentVersion: js.UndefOr[String] = js.undefined
  
  /** The number of data items for this layer. */
  var dataCount: js.UndefOr[Double] = js.undefined
  
  /** Unique id of this layer summary. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Resource Type */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The layer id for this summary. */
  var layerId: js.UndefOr[String] = js.undefined
  
  /** URL to this resource. */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /** Timestamp for the last time an item in this layer was updated. (RFC 3339 UTC date-time format). */
  var updated: js.UndefOr[String] = js.undefined
  
  /**
    * The current version of this layer's volume annotations. Note that this version applies only to the data in the books.layers.volumeAnnotations.* responses. The actual annotation data
    * is versioned separately.
    */
  var volumeAnnotationsVersion: js.UndefOr[String] = js.undefined
  
  /** The volume id this resource is for. */
  var volumeId: js.UndefOr[String] = js.undefined
}
object Layersummary {
  
  inline def apply(): Layersummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Layersummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Layersummary] (val x: Self) extends AnyVal {
    
    inline def setAnnotationCount(value: Double): Self = StObject.set(x, "annotationCount", value.asInstanceOf[js.Any])
    
    inline def setAnnotationCountUndefined: Self = StObject.set(x, "annotationCount", js.undefined)
    
    inline def setAnnotationTypes(value: js.Array[String]): Self = StObject.set(x, "annotationTypes", value.asInstanceOf[js.Any])
    
    inline def setAnnotationTypesUndefined: Self = StObject.set(x, "annotationTypes", js.undefined)
    
    inline def setAnnotationTypesVarargs(value: String*): Self = StObject.set(x, "annotationTypes", js.Array(value*))
    
    inline def setAnnotationsDataLink(value: String): Self = StObject.set(x, "annotationsDataLink", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsDataLinkUndefined: Self = StObject.set(x, "annotationsDataLink", js.undefined)
    
    inline def setAnnotationsLink(value: String): Self = StObject.set(x, "annotationsLink", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsLinkUndefined: Self = StObject.set(x, "annotationsLink", js.undefined)
    
    inline def setContentVersion(value: String): Self = StObject.set(x, "contentVersion", value.asInstanceOf[js.Any])
    
    inline def setContentVersionUndefined: Self = StObject.set(x, "contentVersion", js.undefined)
    
    inline def setDataCount(value: Double): Self = StObject.set(x, "dataCount", value.asInstanceOf[js.Any])
    
    inline def setDataCountUndefined: Self = StObject.set(x, "dataCount", js.undefined)
    
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
    
    inline def setVolumeAnnotationsVersion(value: String): Self = StObject.set(x, "volumeAnnotationsVersion", value.asInstanceOf[js.Any])
    
    inline def setVolumeAnnotationsVersionUndefined: Self = StObject.set(x, "volumeAnnotationsVersion", js.undefined)
    
    inline def setVolumeId(value: String): Self = StObject.set(x, "volumeId", value.asInstanceOf[js.Any])
    
    inline def setVolumeIdUndefined: Self = StObject.set(x, "volumeId", js.undefined)
  }
}
