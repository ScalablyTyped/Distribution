package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Updates the transform of a page element.  Updating the transform of a group
  * will change the absolute transform of the page elements in that group,
  * which can change their visual appearance. See the documentation for
  * PageElement.transform for more details.
  */
@js.native
trait SchemaUpdatePageElementTransformRequest extends StObject {
  
  /**
    * The apply mode of the transform update.
    */
  var applyMode: js.UndefOr[String] = js.native
  
  /**
    * The object ID of the page element to update.
    */
  var objectId: js.UndefOr[String] = js.native
  
  /**
    * The input transform matrix used to update the page element.
    */
  var transform: js.UndefOr[SchemaAffineTransform] = js.native
}
object SchemaUpdatePageElementTransformRequest {
  
  @scala.inline
  def apply(): SchemaUpdatePageElementTransformRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdatePageElementTransformRequest]
  }
  
  @scala.inline
  implicit class SchemaUpdatePageElementTransformRequestMutableBuilder[Self <: SchemaUpdatePageElementTransformRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplyMode(value: String): Self = StObject.set(x, "applyMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplyModeUndefined: Self = StObject.set(x, "applyMode", js.undefined)
    
    @scala.inline
    def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    @scala.inline
    def setTransform(value: SchemaAffineTransform): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
  }
}
