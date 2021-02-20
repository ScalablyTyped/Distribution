package typings.googleapis.v1beta4Mod.sqladminV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Rotate Server CA request.
  */
@js.native
trait SchemaInstancesRotateServerCaRequest extends StObject {
  
  /**
    * Contains details about the rotate server CA operation.
    */
  var rotateServerCaContext: js.UndefOr[SchemaRotateServerCaContext] = js.native
}
object SchemaInstancesRotateServerCaRequest {
  
  @scala.inline
  def apply(): SchemaInstancesRotateServerCaRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstancesRotateServerCaRequest]
  }
  
  @scala.inline
  implicit class SchemaInstancesRotateServerCaRequestMutableBuilder[Self <: SchemaInstancesRotateServerCaRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRotateServerCaContext(value: SchemaRotateServerCaContext): Self = StObject.set(x, "rotateServerCaContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotateServerCaContextUndefined: Self = StObject.set(x, "rotateServerCaContext", js.undefined)
  }
}
