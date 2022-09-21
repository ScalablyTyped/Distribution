package typings.googleapis.v1beta4Mod.sqladminV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstancesRotateServerCaRequest extends StObject {
  
  /**
    * Contains details about the rotate server CA operation.
    */
  var rotateServerCaContext: js.UndefOr[SchemaRotateServerCaContext] = js.undefined
}
object SchemaInstancesRotateServerCaRequest {
  
  inline def apply(): SchemaInstancesRotateServerCaRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstancesRotateServerCaRequest]
  }
  
  extension [Self <: SchemaInstancesRotateServerCaRequest](x: Self) {
    
    inline def setRotateServerCaContext(value: SchemaRotateServerCaContext): Self = StObject.set(x, "rotateServerCaContext", value.asInstanceOf[js.Any])
    
    inline def setRotateServerCaContextUndefined: Self = StObject.set(x, "rotateServerCaContext", js.undefined)
  }
}
