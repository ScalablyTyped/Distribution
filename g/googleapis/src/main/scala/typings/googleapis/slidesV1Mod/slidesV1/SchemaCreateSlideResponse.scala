package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The result of creating a slide.
  */
trait SchemaCreateSlideResponse extends StObject {
  
  /**
    * The object ID of the created slide.
    */
  var objectId: js.UndefOr[String] = js.undefined
}
object SchemaCreateSlideResponse {
  
  inline def apply(): SchemaCreateSlideResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateSlideResponse]
  }
  
  extension [Self <: SchemaCreateSlideResponse](x: Self) {
    
    inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
  }
}
