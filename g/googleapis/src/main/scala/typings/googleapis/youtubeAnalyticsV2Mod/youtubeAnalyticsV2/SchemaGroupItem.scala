package typings.googleapis.youtubeAnalyticsV2Mod.youtubeAnalyticsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A group item.
  */
trait SchemaGroupItem extends StObject {
  
  /**
    * Apiary error details
    */
  var errors: js.UndefOr[SchemaErrors] = js.undefined
  
  /**
    * The Etag of this resource.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * The ID that YouTube uses to uniquely identify the group that contains the
    * item.
    */
  var groupId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID that YouTube uses to uniquely identify the `channel`, `video`,
    * `playlist`, or `asset` resource that is included in the group. Note that
    * this ID refers specifically to the inclusion of that resource in a
    * particular group and is different than the channel ID, video ID, playlist
    * ID, or asset ID that uniquely identifies the resource itself. The
    * `resource.id` property&#39;s value specifies the unique channel, video,
    * playlist, or asset ID.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies the API resource&#39;s type. The value will be
    * `youtube#groupItem`.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The `resource` object contains information that identifies the item being
    * added to the group.
    */
  var resource: js.UndefOr[SchemaGroupItemResource] = js.undefined
}
object SchemaGroupItem {
  
  @scala.inline
  def apply(): SchemaGroupItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGroupItem]
  }
  
  @scala.inline
  implicit class SchemaGroupItemMutableBuilder[Self <: SchemaGroupItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrors(value: SchemaErrors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setResource(value: SchemaGroupItemResource): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
