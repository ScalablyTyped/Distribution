package typings.googleapis.streetviewpublishV1Mod.streetviewpublishV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Identifier for a Photo.
  */
trait SchemaPhotoId extends StObject {
  
  /**
    * Required. A unique identifier for a photo.
    */
  var id: js.UndefOr[String] = js.undefined
}
object SchemaPhotoId {
  
  inline def apply(): SchemaPhotoId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPhotoId]
  }
  
  extension [Self <: SchemaPhotoId](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
