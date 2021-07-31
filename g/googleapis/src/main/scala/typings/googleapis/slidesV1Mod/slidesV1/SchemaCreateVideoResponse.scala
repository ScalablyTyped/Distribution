package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The result of creating a video.
  */
trait SchemaCreateVideoResponse extends StObject {
  
  /**
    * The object ID of the created video.
    */
  var objectId: js.UndefOr[String] = js.undefined
}
object SchemaCreateVideoResponse {
  
  @scala.inline
  def apply(): SchemaCreateVideoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateVideoResponse]
  }
  
  @scala.inline
  implicit class SchemaCreateVideoResponseMutableBuilder[Self <: SchemaCreateVideoResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
  }
}
