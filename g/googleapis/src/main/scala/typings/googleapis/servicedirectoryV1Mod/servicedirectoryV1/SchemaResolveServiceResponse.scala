package typings.googleapis.servicedirectoryV1Mod.servicedirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResolveServiceResponse extends StObject {
  
  var service: js.UndefOr[SchemaService] = js.undefined
}
object SchemaResolveServiceResponse {
  
  inline def apply(): SchemaResolveServiceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResolveServiceResponse]
  }
  
  extension [Self <: SchemaResolveServiceResponse](x: Self) {
    
    inline def setService(value: SchemaService): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
