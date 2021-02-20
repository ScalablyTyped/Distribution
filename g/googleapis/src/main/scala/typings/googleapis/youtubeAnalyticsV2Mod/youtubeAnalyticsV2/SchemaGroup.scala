package typings.googleapis.youtubeAnalyticsV2Mod.youtubeAnalyticsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A group.
  */
@js.native
trait SchemaGroup extends StObject {
  
  /**
    * The `contentDetails` object contains additional information about the
    * group, such as the number and type of items that it contains.
    */
  var contentDetails: js.UndefOr[SchemaGroupContentDetails] = js.native
  
  /**
    * Apiary error details
    */
  var errors: js.UndefOr[SchemaErrors] = js.native
  
  /**
    * The Etag of this resource.
    */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * The ID that YouTube uses to uniquely identify the group.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Identifies the API resource&#39;s type. The value will be
    * `youtube#group`.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The `snippet` object contains basic information about the group,
    * including its creation date and name.
    */
  var snippet: js.UndefOr[SchemaGroupSnippet] = js.native
}
object SchemaGroup {
  
  @scala.inline
  def apply(): SchemaGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGroup]
  }
  
  @scala.inline
  implicit class SchemaGroupMutableBuilder[Self <: SchemaGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentDetails(value: SchemaGroupContentDetails): Self = StObject.set(x, "contentDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentDetailsUndefined: Self = StObject.set(x, "contentDetails", js.undefined)
    
    @scala.inline
    def setErrors(value: SchemaErrors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setSnippet(value: SchemaGroupSnippet): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
  }
}
