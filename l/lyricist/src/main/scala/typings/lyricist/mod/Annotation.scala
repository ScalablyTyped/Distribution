package typings.lyricist.mod

import typings.lyricist.anon.Interactions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Annotation extends StObject {
  
  var api_path: String = js.native
  
  var authors: js.Array[Author] = js.native
  
  var body: Description = js.native
  
  var comment_count: Double = js.native
  
  var community: Boolean = js.native
  
  var cosigned_by: js.Array[_] = js.native
  
  var current_user_metadata: Interactions = js.native
  
  var custom_preview: js.UndefOr[js.Any] = js.native
  
  var has_voters: Boolean = js.native
  
  var id: Double = js.native
  
  var pinned: Boolean = js.native
  
  var rejection_comment: js.UndefOr[js.Any] = js.native
  
  var share_url: String = js.native
  
  var source: js.UndefOr[js.Any] = js.native
  
  var state: String = js.native
  
  var url: String = js.native
  
  var verified: Boolean = js.native
  
  var verified_by: js.UndefOr[js.Any] = js.native
  
  var votes_total: Double = js.native
}
object Annotation {
  
  @scala.inline
  def apply(
    api_path: String,
    authors: js.Array[Author],
    body: Description,
    comment_count: Double,
    community: Boolean,
    cosigned_by: js.Array[_],
    current_user_metadata: Interactions,
    has_voters: Boolean,
    id: Double,
    pinned: Boolean,
    share_url: String,
    state: String,
    url: String,
    verified: Boolean,
    votes_total: Double
  ): Annotation = {
    val __obj = js.Dynamic.literal(api_path = api_path.asInstanceOf[js.Any], authors = authors.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], comment_count = comment_count.asInstanceOf[js.Any], community = community.asInstanceOf[js.Any], cosigned_by = cosigned_by.asInstanceOf[js.Any], current_user_metadata = current_user_metadata.asInstanceOf[js.Any], has_voters = has_voters.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], pinned = pinned.asInstanceOf[js.Any], share_url = share_url.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any], votes_total = votes_total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Annotation]
  }
  
  @scala.inline
  implicit class AnnotationMutableBuilder[Self <: Annotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApi_path(value: String): Self = StObject.set(x, "api_path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthors(value: js.Array[Author]): Self = StObject.set(x, "authors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorsVarargs(value: Author*): Self = StObject.set(x, "authors", js.Array(value :_*))
    
    @scala.inline
    def setBody(value: Description): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment_count(value: Double): Self = StObject.set(x, "comment_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommunity(value: Boolean): Self = StObject.set(x, "community", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCosigned_by(value: js.Array[_]): Self = StObject.set(x, "cosigned_by", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCosigned_byVarargs(value: js.Any*): Self = StObject.set(x, "cosigned_by", js.Array(value :_*))
    
    @scala.inline
    def setCurrent_user_metadata(value: Interactions): Self = StObject.set(x, "current_user_metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustom_preview(value: js.Any): Self = StObject.set(x, "custom_preview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustom_previewUndefined: Self = StObject.set(x, "custom_preview", js.undefined)
    
    @scala.inline
    def setHas_voters(value: Boolean): Self = StObject.set(x, "has_voters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinned(value: Boolean): Self = StObject.set(x, "pinned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRejection_comment(value: js.Any): Self = StObject.set(x, "rejection_comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRejection_commentUndefined: Self = StObject.set(x, "rejection_comment", js.undefined)
    
    @scala.inline
    def setShare_url(value: String): Self = StObject.set(x, "share_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: js.Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerified(value: Boolean): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerified_by(value: js.Any): Self = StObject.set(x, "verified_by", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerified_byUndefined: Self = StObject.set(x, "verified_by", js.undefined)
    
    @scala.inline
    def setVotes_total(value: Double): Self = StObject.set(x, "votes_total", value.asInstanceOf[js.Any])
  }
}
