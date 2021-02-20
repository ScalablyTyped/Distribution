package typings.maximMazurokGapiClientBooks.gapi.client.books

import typings.maximMazurokGapiClientBooks.anon.AllowedCharacterCount
import typings.maximMazurokGapiClientBooks.anon.CfiRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Annotation extends StObject {
  
  /** Anchor text after excerpt. For requests, if the user bookmarked a screen that has no flowing text on it, then this field should be empty. */
  var afterSelectedText: js.UndefOr[String] = js.native
  
  /** Anchor text before excerpt. For requests, if the user bookmarked a screen that has no flowing text on it, then this field should be empty. */
  var beforeSelectedText: js.UndefOr[String] = js.native
  
  /** Selection ranges sent from the client. */
  var clientVersionRanges: js.UndefOr[CfiRange] = js.native
  
  /** Timestamp for the created time of this annotation. */
  var created: js.UndefOr[String] = js.native
  
  /** Selection ranges for the most recent content version. */
  var currentVersionRanges: js.UndefOr[CfiRange] = js.native
  
  /** User-created data for this annotation. */
  var data: js.UndefOr[String] = js.native
  
  /** Indicates that this annotation is deleted. */
  var deleted: js.UndefOr[Boolean] = js.native
  
  /** The highlight style for this annotation. */
  var highlightStyle: js.UndefOr[String] = js.native
  
  /** Id of this annotation, in the form of a GUID. */
  var id: js.UndefOr[String] = js.native
  
  /** Resource type. */
  var kind: js.UndefOr[String] = js.native
  
  /** The layer this annotation is for. */
  var layerId: js.UndefOr[String] = js.native
  
  var layerSummary: js.UndefOr[AllowedCharacterCount] = js.native
  
  /** Pages that this annotation spans. */
  var pageIds: js.UndefOr[js.Array[String]] = js.native
  
  /** Excerpt from the volume. */
  var selectedText: js.UndefOr[String] = js.native
  
  /** URL to this resource. */
  var selfLink: js.UndefOr[String] = js.native
  
  /** Timestamp for the last time this annotation was modified. */
  var updated: js.UndefOr[String] = js.native
  
  /** The volume that this annotation belongs to. */
  var volumeId: js.UndefOr[String] = js.native
}
object Annotation {
  
  @scala.inline
  def apply(): Annotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Annotation]
  }
  
  @scala.inline
  implicit class AnnotationMutableBuilder[Self <: Annotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfterSelectedText(value: String): Self = StObject.set(x, "afterSelectedText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterSelectedTextUndefined: Self = StObject.set(x, "afterSelectedText", js.undefined)
    
    @scala.inline
    def setBeforeSelectedText(value: String): Self = StObject.set(x, "beforeSelectedText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeSelectedTextUndefined: Self = StObject.set(x, "beforeSelectedText", js.undefined)
    
    @scala.inline
    def setClientVersionRanges(value: CfiRange): Self = StObject.set(x, "clientVersionRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientVersionRangesUndefined: Self = StObject.set(x, "clientVersionRanges", js.undefined)
    
    @scala.inline
    def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    @scala.inline
    def setCurrentVersionRanges(value: CfiRange): Self = StObject.set(x, "currentVersionRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentVersionRangesUndefined: Self = StObject.set(x, "currentVersionRanges", js.undefined)
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    @scala.inline
    def setHighlightStyle(value: String): Self = StObject.set(x, "highlightStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightStyleUndefined: Self = StObject.set(x, "highlightStyle", js.undefined)
    
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
    def setLayerSummary(value: AllowedCharacterCount): Self = StObject.set(x, "layerSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerSummaryUndefined: Self = StObject.set(x, "layerSummary", js.undefined)
    
    @scala.inline
    def setPageIds(value: js.Array[String]): Self = StObject.set(x, "pageIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageIdsUndefined: Self = StObject.set(x, "pageIds", js.undefined)
    
    @scala.inline
    def setPageIdsVarargs(value: String*): Self = StObject.set(x, "pageIds", js.Array(value :_*))
    
    @scala.inline
    def setSelectedText(value: String): Self = StObject.set(x, "selectedText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedTextUndefined: Self = StObject.set(x, "selectedText", js.undefined)
    
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
