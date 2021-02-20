package typings.maximMazurokGapiClientBooks.gapi.client.books

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bookshelf extends StObject {
  
  /** Whether this bookshelf is PUBLIC or PRIVATE. */
  var access: js.UndefOr[String] = js.native
  
  /** Created time for this bookshelf (formatted UTC timestamp with millisecond resolution). */
  var created: js.UndefOr[String] = js.native
  
  /** Description of this bookshelf. */
  var description: js.UndefOr[String] = js.native
  
  /** Id of this bookshelf, only unique by user. */
  var id: js.UndefOr[Double] = js.native
  
  /** Resource type for bookshelf metadata. */
  var kind: js.UndefOr[String] = js.native
  
  /** URL to this resource. */
  var selfLink: js.UndefOr[String] = js.native
  
  /** Title of this bookshelf. */
  var title: js.UndefOr[String] = js.native
  
  /** Last modified time of this bookshelf (formatted UTC timestamp with millisecond resolution). */
  var updated: js.UndefOr[String] = js.native
  
  /** Number of volumes in this bookshelf. */
  var volumeCount: js.UndefOr[Double] = js.native
  
  /** Last time a volume was added or removed from this bookshelf (formatted UTC timestamp with millisecond resolution). */
  var volumesLastUpdated: js.UndefOr[String] = js.native
}
object Bookshelf {
  
  @scala.inline
  def apply(): Bookshelf = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bookshelf]
  }
  
  @scala.inline
  implicit class BookshelfMutableBuilder[Self <: Bookshelf] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccess(value: String): Self = StObject.set(x, "access", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessUndefined: Self = StObject.set(x, "access", js.undefined)
    
    @scala.inline
    def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
    
    @scala.inline
    def setVolumeCount(value: Double): Self = StObject.set(x, "volumeCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeCountUndefined: Self = StObject.set(x, "volumeCount", js.undefined)
    
    @scala.inline
    def setVolumesLastUpdated(value: String): Self = StObject.set(x, "volumesLastUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumesLastUpdatedUndefined: Self = StObject.set(x, "volumesLastUpdated", js.undefined)
  }
}
