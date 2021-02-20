package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Updates the alt text title and/or description of a page element.
  */
@js.native
trait SchemaUpdatePageElementAltTextRequest extends StObject {
  
  /**
    * The updated alt text description of the page element. If unset the
    * existing value will be maintained. The description is exposed to screen
    * readers and other accessibility interfaces. Only use human readable
    * values related to the content of the page element.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The object ID of the page element the updates are applied to.
    */
  var objectId: js.UndefOr[String] = js.native
  
  /**
    * The updated alt text title of the page element. If unset the existing
    * value will be maintained. The title is exposed to screen readers and
    * other accessibility interfaces. Only use human readable values related to
    * the content of the page element.
    */
  var title: js.UndefOr[String] = js.native
}
object SchemaUpdatePageElementAltTextRequest {
  
  @scala.inline
  def apply(): SchemaUpdatePageElementAltTextRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdatePageElementAltTextRequest]
  }
  
  @scala.inline
  implicit class SchemaUpdatePageElementAltTextRequestMutableBuilder[Self <: SchemaUpdatePageElementAltTextRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
