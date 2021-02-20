package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The result of creating a shape.
  */
@js.native
trait SchemaCreateShapeResponse extends StObject {
  
  /**
    * The object ID of the created shape.
    */
  var objectId: js.UndefOr[String] = js.native
}
object SchemaCreateShapeResponse {
  
  @scala.inline
  def apply(): SchemaCreateShapeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateShapeResponse]
  }
  
  @scala.inline
  implicit class SchemaCreateShapeResponseMutableBuilder[Self <: SchemaCreateShapeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
  }
}
