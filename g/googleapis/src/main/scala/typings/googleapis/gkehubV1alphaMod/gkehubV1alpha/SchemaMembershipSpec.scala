package typings.googleapis.gkehubV1alphaMod.gkehubV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMembershipSpec extends StObject {
  
  /**
    * Specifies workload certificate management.
    */
  var certificateManagement: js.UndefOr[String | Null] = js.undefined
}
object SchemaMembershipSpec {
  
  inline def apply(): SchemaMembershipSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMembershipSpec]
  }
  
  extension [Self <: SchemaMembershipSpec](x: Self) {
    
    inline def setCertificateManagement(value: String): Self = StObject.set(x, "certificateManagement", value.asInstanceOf[js.Any])
    
    inline def setCertificateManagementNull: Self = StObject.set(x, "certificateManagement", null)
    
    inline def setCertificateManagementUndefined: Self = StObject.set(x, "certificateManagement", js.undefined)
  }
}
