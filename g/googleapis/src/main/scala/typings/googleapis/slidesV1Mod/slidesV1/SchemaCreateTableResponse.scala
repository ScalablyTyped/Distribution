package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The result of creating a table.
  */
trait SchemaCreateTableResponse extends StObject {
  
  /**
    * The object ID of the created table.
    */
  var objectId: js.UndefOr[String] = js.undefined
}
object SchemaCreateTableResponse {
  
  @scala.inline
  def apply(): SchemaCreateTableResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateTableResponse]
  }
  
  @scala.inline
  implicit class SchemaCreateTableResponseMutableBuilder[Self <: SchemaCreateTableResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
  }
}
