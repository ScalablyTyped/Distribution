package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The result of updating an embedded object&#39;s position.
  */
@js.native
trait SchemaUpdateEmbeddedObjectPositionResponse extends StObject {
  
  /**
    * The new position of the embedded object.
    */
  var position: js.UndefOr[SchemaEmbeddedObjectPosition] = js.native
}
object SchemaUpdateEmbeddedObjectPositionResponse {
  
  @scala.inline
  def apply(): SchemaUpdateEmbeddedObjectPositionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateEmbeddedObjectPositionResponse]
  }
  
  @scala.inline
  implicit class SchemaUpdateEmbeddedObjectPositionResponseMutableBuilder[Self <: SchemaUpdateEmbeddedObjectPositionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPosition(value: SchemaEmbeddedObjectPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
