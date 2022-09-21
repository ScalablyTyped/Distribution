package typings.maximMazurokGapiClientBooks.gapi.client.books

import typings.maximMazurokGapiClientBooks.anon.ContentVersion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Volumeannotation extends StObject {
  
  /** The annotation data id for this volume annotation. */
  var annotationDataId: js.UndefOr[String] = js.undefined
  
  /** Link to get data for this annotation. */
  var annotationDataLink: js.UndefOr[String] = js.undefined
  
  /** The type of annotation this is. */
  var annotationType: js.UndefOr[String] = js.undefined
  
  /** The content ranges to identify the selected text. */
  var contentRanges: js.UndefOr[ContentVersion] = js.undefined
  
  /** Data for this annotation. */
  var data: js.UndefOr[String] = js.undefined
  
  /** Indicates that this annotation is deleted. */
  var deleted: js.UndefOr[Boolean] = js.undefined
  
  /** Unique id of this volume annotation. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Resource Type */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The Layer this annotation is for. */
  var layerId: js.UndefOr[String] = js.undefined
  
  /** Pages the annotation spans. */
  var pageIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Excerpt from the volume. */
  var selectedText: js.UndefOr[String] = js.undefined
  
  /** URL to this resource. */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /** Timestamp for the last time this anntoation was updated. (RFC 3339 UTC date-time format). */
  var updated: js.UndefOr[String] = js.undefined
  
  /** The Volume this annotation is for. */
  var volumeId: js.UndefOr[String] = js.undefined
}
object Volumeannotation {
  
  inline def apply(): Volumeannotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Volumeannotation]
  }
  
  extension [Self <: Volumeannotation](x: Self) {
    
    inline def setAnnotationDataId(value: String): Self = StObject.set(x, "annotationDataId", value.asInstanceOf[js.Any])
    
    inline def setAnnotationDataIdUndefined: Self = StObject.set(x, "annotationDataId", js.undefined)
    
    inline def setAnnotationDataLink(value: String): Self = StObject.set(x, "annotationDataLink", value.asInstanceOf[js.Any])
    
    inline def setAnnotationDataLinkUndefined: Self = StObject.set(x, "annotationDataLink", js.undefined)
    
    inline def setAnnotationType(value: String): Self = StObject.set(x, "annotationType", value.asInstanceOf[js.Any])
    
    inline def setAnnotationTypeUndefined: Self = StObject.set(x, "annotationType", js.undefined)
    
    inline def setContentRanges(value: ContentVersion): Self = StObject.set(x, "contentRanges", value.asInstanceOf[js.Any])
    
    inline def setContentRangesUndefined: Self = StObject.set(x, "contentRanges", js.undefined)
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLayerId(value: String): Self = StObject.set(x, "layerId", value.asInstanceOf[js.Any])
    
    inline def setLayerIdUndefined: Self = StObject.set(x, "layerId", js.undefined)
    
    inline def setPageIds(value: js.Array[String]): Self = StObject.set(x, "pageIds", value.asInstanceOf[js.Any])
    
    inline def setPageIdsUndefined: Self = StObject.set(x, "pageIds", js.undefined)
    
    inline def setPageIdsVarargs(value: String*): Self = StObject.set(x, "pageIds", js.Array(value*))
    
    inline def setSelectedText(value: String): Self = StObject.set(x, "selectedText", value.asInstanceOf[js.Any])
    
    inline def setSelectedTextUndefined: Self = StObject.set(x, "selectedText", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    inline def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
    
    inline def setVolumeId(value: String): Self = StObject.set(x, "volumeId", value.asInstanceOf[js.Any])
    
    inline def setVolumeIdUndefined: Self = StObject.set(x, "volumeId", js.undefined)
  }
}
