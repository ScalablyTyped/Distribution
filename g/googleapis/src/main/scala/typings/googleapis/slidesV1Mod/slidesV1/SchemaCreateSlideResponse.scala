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
  
  @scala.inline
  def apply(): SchemaCreateSlideResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateSlideResponse]
  }
  
  @scala.inline
  implicit class SchemaCreateSlideResponseMutableBuilder[Self <: SchemaCreateSlideResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
  }
}
