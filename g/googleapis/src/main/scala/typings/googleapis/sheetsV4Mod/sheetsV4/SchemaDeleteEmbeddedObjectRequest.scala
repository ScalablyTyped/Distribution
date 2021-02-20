package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Deletes the embedded object with the given ID.
  */
@js.native
trait SchemaDeleteEmbeddedObjectRequest extends StObject {
  
  /**
    * The ID of the embedded object to delete.
    */
  var objectId: js.UndefOr[Double] = js.native
}
object SchemaDeleteEmbeddedObjectRequest {
  
  @scala.inline
  def apply(): SchemaDeleteEmbeddedObjectRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeleteEmbeddedObjectRequest]
  }
  
  @scala.inline
  implicit class SchemaDeleteEmbeddedObjectRequestMutableBuilder[Self <: SchemaDeleteEmbeddedObjectRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectId(value: Double): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
  }
}
