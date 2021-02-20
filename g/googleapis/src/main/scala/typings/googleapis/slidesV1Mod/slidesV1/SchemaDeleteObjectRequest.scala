package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Deletes an object, either pages or page elements, from the presentation.
  */
@js.native
trait SchemaDeleteObjectRequest extends StObject {
  
  /**
    * The object ID of the page or page element to delete.  If after a delete
    * operation a group contains only 1 or no page elements, the group is also
    * deleted.  If a placeholder is deleted on a layout, any empty inheriting
    * shapes are also deleted.
    */
  var objectId: js.UndefOr[String] = js.native
}
object SchemaDeleteObjectRequest {
  
  @scala.inline
  def apply(): SchemaDeleteObjectRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeleteObjectRequest]
  }
  
  @scala.inline
  implicit class SchemaDeleteObjectRequestMutableBuilder[Self <: SchemaDeleteObjectRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
  }
}
