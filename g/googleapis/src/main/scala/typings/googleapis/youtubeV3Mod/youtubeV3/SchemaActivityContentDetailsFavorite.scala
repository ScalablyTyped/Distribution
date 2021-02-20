package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about a video that was marked as a favorite video.
  */
@js.native
trait SchemaActivityContentDetailsFavorite extends StObject {
  
  /**
    * The resourceId object contains information that identifies the resource
    * that was marked as a favorite.
    */
  var resourceId: js.UndefOr[SchemaResourceId] = js.native
}
object SchemaActivityContentDetailsFavorite {
  
  @scala.inline
  def apply(): SchemaActivityContentDetailsFavorite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaActivityContentDetailsFavorite]
  }
  
  @scala.inline
  implicit class SchemaActivityContentDetailsFavoriteMutableBuilder[Self <: SchemaActivityContentDetailsFavorite] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceId(value: SchemaResourceId): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
  }
}
