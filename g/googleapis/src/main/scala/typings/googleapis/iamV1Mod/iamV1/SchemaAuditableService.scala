package typings.googleapis.iamV1Mod.iamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAuditableService extends StObject {
  
  /**
    * Public name of the service. For example, the service name for Cloud IAM is 'iam.googleapis.com'.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaAuditableService {
  
  inline def apply(): SchemaAuditableService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAuditableService]
  }
  
  extension [Self <: SchemaAuditableService](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
