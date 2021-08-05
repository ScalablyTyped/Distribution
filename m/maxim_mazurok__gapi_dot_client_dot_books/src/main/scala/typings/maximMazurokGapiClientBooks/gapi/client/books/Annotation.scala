package typings.maximMazurokGapiClientBooks.gapi.client.books

import typings.maximMazurokGapiClientBooks.anon.AllowedCharacterCount
import typings.maximMazurokGapiClientBooks.anon.CfiRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Annotation extends StObject {
  
  /** Anchor text after excerpt. For requests, if the user bookmarked a screen that has no flowing text on it, then this field should be empty. */
  var afterSelectedText: js.UndefOr[String] = js.undefined
  
  /** Anchor text before excerpt. For requests, if the user bookmarked a screen that has no flowing text on it, then this field should be empty. */
  var beforeSelectedText: js.UndefOr[String] = js.undefined
  
  /** Selection ranges sent from the client. */
  var clientVersionRanges: js.UndefOr[CfiRange] = js.undefined
  
  /** Timestamp for the created time of this annotation. */
  var created: js.UndefOr[String] = js.undefined
  
  /** Selection ranges for the most recent content version. */
  var currentVersionRanges: js.UndefOr[CfiRange] = js.undefined
  
  /** User-created data for this annotation. */
  var data: js.UndefOr[String] = js.undefined
  
  /** Indicates that this annotation is deleted. */
  var deleted: js.UndefOr[Boolean] = js.undefined
  
  /** The highlight style for this annotation. */
  var highlightStyle: js.UndefOr[String] = js.undefined
  
  /** Id of this annotation, in the form of a GUID. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Resource type. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The layer this annotation is for. */
  var layerId: js.UndefOr[String] = js.undefined
  
  var layerSummary: js.UndefOr[AllowedCharacterCount] = js.undefined
  
  /** Pages that this annotation spans. */
  var pageIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Excerpt from the volume. */
  var selectedText: js.UndefOr[String] = js.undefined
  
  /** URL to this resource. */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /** Timestamp for the last time this annotation was modified. */
  var updated: js.UndefOr[String] = js.undefined
  
  /** The volume that this annotation belongs to. */
  var volumeId: js.UndefOr[String] = js.undefined
}
object Annotation {
  
  inline def apply(): Annotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Annotation]
  }
  
  extension [Self <: Annotation](x: Self) {
    
    inline def setAfterSelectedText(value: String): Self = StObject.set(x, "afterSelectedText", value.asInstanceOf[js.Any])
    
    inline def setAfterSelectedTextUndefined: Self = StObject.set(x, "afterSelectedText", js.undefined)
    
    inline def setBeforeSelectedText(value: String): Self = StObject.set(x, "beforeSelectedText", value.asInstanceOf[js.Any])
    
    inline def setBeforeSelectedTextUndefined: Self = StObject.set(x, "beforeSelectedText", js.undefined)
    
    inline def setClientVersionRanges(value: CfiRange): Self = StObject.set(x, "clientVersionRanges", value.asInstanceOf[js.Any])
    
    inline def setClientVersionRangesUndefined: Self = StObject.set(x, "clientVersionRanges", js.undefined)
    
    inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setCurrentVersionRanges(value: CfiRange): Self = StObject.set(x, "currentVersionRanges", value.asInstanceOf[js.Any])
    
    inline def setCurrentVersionRangesUndefined: Self = StObject.set(x, "currentVersionRanges", js.undefined)
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    inline def setHighlightStyle(value: String): Self = StObject.set(x, "highlightStyle", value.asInstanceOf[js.Any])
    
    inline def setHighlightStyleUndefined: Self = StObject.set(x, "highlightStyle", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLayerId(value: String): Self = StObject.set(x, "layerId", value.asInstanceOf[js.Any])
    
    inline def setLayerIdUndefined: Self = StObject.set(x, "layerId", js.undefined)
    
    inline def setLayerSummary(value: AllowedCharacterCount): Self = StObject.set(x, "layerSummary", value.asInstanceOf[js.Any])
    
    inline def setLayerSummaryUndefined: Self = StObject.set(x, "layerSummary", js.undefined)
    
    inline def setPageIds(value: js.Array[String]): Self = StObject.set(x, "pageIds", value.asInstanceOf[js.Any])
    
    inline def setPageIdsUndefined: Self = StObject.set(x, "pageIds", js.undefined)
    
    inline def setPageIdsVarargs(value: String*): Self = StObject.set(x, "pageIds", js.Array(value :_*))
    
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
