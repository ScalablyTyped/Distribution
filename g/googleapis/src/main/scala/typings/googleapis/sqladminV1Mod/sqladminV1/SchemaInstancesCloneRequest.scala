package typings.googleapis.sqladminV1Mod.sqladminV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstancesCloneRequest extends StObject {
  
  /**
    * Contains details about the clone operation.
    */
  var cloneContext: js.UndefOr[SchemaCloneContext] = js.undefined
}
object SchemaInstancesCloneRequest {
  
  inline def apply(): SchemaInstancesCloneRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstancesCloneRequest]
  }
  
  extension [Self <: SchemaInstancesCloneRequest](x: Self) {
    
    inline def setCloneContext(value: SchemaCloneContext): Self = StObject.set(x, "cloneContext", value.asInstanceOf[js.Any])
    
    inline def setCloneContextUndefined: Self = StObject.set(x, "cloneContext", js.undefined)
  }
}
