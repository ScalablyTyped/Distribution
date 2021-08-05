package typings.googleapis.iamV1Mod.iamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information about an auditable service.
  */
trait SchemaAuditableService extends StObject {
  
  /**
    * Public name of the service. For example, the service name for Cloud IAM
    * is &#39;iam.googleapis.com&#39;.
    */
  var name: js.UndefOr[String] = js.undefined
}
object SchemaAuditableService {
  
  inline def apply(): SchemaAuditableService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAuditableService]
  }
  
  extension [Self <: SchemaAuditableService](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
