package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response of duplicating an object.
  */
trait SchemaDuplicateObjectResponse extends StObject {
  
  /**
    * The ID of the new duplicate object.
    */
  var objectId: js.UndefOr[String] = js.undefined
}
object SchemaDuplicateObjectResponse {
  
  @scala.inline
  def apply(): SchemaDuplicateObjectResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDuplicateObjectResponse]
  }
  
  @scala.inline
  implicit class SchemaDuplicateObjectResponseMutableBuilder[Self <: SchemaDuplicateObjectResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
  }
}
