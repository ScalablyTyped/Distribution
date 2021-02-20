package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The result of creating an image.
  */
@js.native
trait SchemaCreateImageResponse extends StObject {
  
  /**
    * The object ID of the created image.
    */
  var objectId: js.UndefOr[String] = js.native
}
object SchemaCreateImageResponse {
  
  @scala.inline
  def apply(): SchemaCreateImageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateImageResponse]
  }
  
  @scala.inline
  implicit class SchemaCreateImageResponseMutableBuilder[Self <: SchemaCreateImageResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
  }
}
