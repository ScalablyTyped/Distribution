package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Updates the category of a line.
  */
@js.native
trait SchemaUpdateLineCategoryRequest extends StObject {
  
  /**
    * The line category to update to.  The exact line type is determined based
    * on the category to update to and how it&#39;s routed to connect to other
    * page elements.
    */
  var lineCategory: js.UndefOr[String] = js.native
  
  /**
    * The object ID of the line the update is applied to.  Only a line with a
    * category indicating it is a &quot;connector&quot; can be updated.  The
    * line may be rerouted after updating its category.
    */
  var objectId: js.UndefOr[String] = js.native
}
object SchemaUpdateLineCategoryRequest {
  
  @scala.inline
  def apply(): SchemaUpdateLineCategoryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateLineCategoryRequest]
  }
  
  @scala.inline
  implicit class SchemaUpdateLineCategoryRequestMutableBuilder[Self <: SchemaUpdateLineCategoryRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLineCategory(value: String): Self = StObject.set(x, "lineCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineCategoryUndefined: Self = StObject.set(x, "lineCategory", js.undefined)
    
    @scala.inline
    def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
  }
}
