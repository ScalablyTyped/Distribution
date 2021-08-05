package typings.googleapis.iamV1Mod.iamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The patch service account request.
  */
trait SchemaPatchServiceAccountRequest extends StObject {
  
  var serviceAccount: js.UndefOr[SchemaServiceAccount] = js.undefined
  
  var updateMask: js.UndefOr[String] = js.undefined
}
object SchemaPatchServiceAccountRequest {
  
  inline def apply(): SchemaPatchServiceAccountRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPatchServiceAccountRequest]
  }
  
  extension [Self <: SchemaPatchServiceAccountRequest](x: Self) {
    
    inline def setServiceAccount(value: SchemaServiceAccount): Self = StObject.set(x, "serviceAccount", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountUndefined: Self = StObject.set(x, "serviceAccount", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
