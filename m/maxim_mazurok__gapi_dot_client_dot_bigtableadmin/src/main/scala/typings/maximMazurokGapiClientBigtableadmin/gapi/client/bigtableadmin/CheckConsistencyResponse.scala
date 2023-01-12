package typings.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckConsistencyResponse extends StObject {
  
  /** True only if the token is consistent. A token is consistent if replication has caught up with the restrictions specified in the request. */
  var consistent: js.UndefOr[Boolean] = js.undefined
}
object CheckConsistencyResponse {
  
  inline def apply(): CheckConsistencyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckConsistencyResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CheckConsistencyResponse] (val x: Self) extends AnyVal {
    
    inline def setConsistent(value: Boolean): Self = StObject.set(x, "consistent", value.asInstanceOf[js.Any])
    
    inline def setConsistentUndefined: Self = StObject.set(x, "consistent", js.undefined)
  }
}
