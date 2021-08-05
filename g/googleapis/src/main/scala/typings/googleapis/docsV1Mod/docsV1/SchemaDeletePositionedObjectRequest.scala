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
  
  inline def apply(): SchemaDeletePositionedObjectRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeletePositionedObjectRequest]
  }
  
  extension [Self <: SchemaDeletePositionedObjectRequest](x: Self) {
    
    inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
  }
}
