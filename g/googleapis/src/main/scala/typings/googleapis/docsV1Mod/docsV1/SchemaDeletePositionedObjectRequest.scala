package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Deletes a PositionedObject from the document.
  */
trait SchemaDeletePositionedObjectRequest extends StObject {
  
  /**
    * The ID of the positioned object to delete.
    */
  var objectId: js.UndefOr[String] = js.undefined
}
object SchemaDeletePositionedObjectRequest {
  
  @scala.inline
  def apply(): SchemaDeletePositionedObjectRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeletePositionedObjectRequest]
  }
  
  @scala.inline
  implicit class SchemaDeletePositionedObjectRequestMutableBuilder[Self <: SchemaDeletePositionedObjectRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
  }
}
