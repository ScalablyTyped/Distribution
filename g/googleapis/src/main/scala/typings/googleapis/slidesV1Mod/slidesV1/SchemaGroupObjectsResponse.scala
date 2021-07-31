package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The result of grouping objects.
  */
trait SchemaGroupObjectsResponse extends StObject {
  
  /**
    * The object ID of the created group.
    */
  var objectId: js.UndefOr[String] = js.undefined
}
object SchemaGroupObjectsResponse {
  
  @scala.inline
  def apply(): SchemaGroupObjectsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGroupObjectsResponse]
  }
  
  @scala.inline
  implicit class SchemaGroupObjectsResponseMutableBuilder[Self <: SchemaGroupObjectsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
  }
}
