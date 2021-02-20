package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Details about a channel bulletin post.
  */
@js.native
trait SchemaActivityContentDetailsBulletin extends StObject {
  
  /**
    * The resourceId object contains information that identifies the resource
    * associated with a bulletin post.
    */
  var resourceId: js.UndefOr[SchemaResourceId] = js.native
}
object SchemaActivityContentDetailsBulletin {
  
  @scala.inline
  def apply(): SchemaActivityContentDetailsBulletin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaActivityContentDetailsBulletin]
  }
  
  @scala.inline
  implicit class SchemaActivityContentDetailsBulletinMutableBuilder[Self <: SchemaActivityContentDetailsBulletin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceId(value: SchemaResourceId): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
  }
}
