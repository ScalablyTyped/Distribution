package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about a resource that received a positive (like) rating.
  */
@js.native
trait SchemaActivityContentDetailsLike extends StObject {
  
  /**
    * The resourceId object contains information that identifies the rated
    * resource.
    */
  var resourceId: js.UndefOr[SchemaResourceId] = js.native
}
object SchemaActivityContentDetailsLike {
  
  @scala.inline
  def apply(): SchemaActivityContentDetailsLike = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaActivityContentDetailsLike]
  }
  
  @scala.inline
  implicit class SchemaActivityContentDetailsLikeMutableBuilder[Self <: SchemaActivityContentDetailsLike] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceId(value: SchemaResourceId): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
  }
}
