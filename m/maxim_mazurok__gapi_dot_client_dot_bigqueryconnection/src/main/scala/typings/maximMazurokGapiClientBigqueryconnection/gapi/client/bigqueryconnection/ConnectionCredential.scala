package typings.maximMazurokGapiClientBigqueryconnection.gapi.client.bigqueryconnection

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionCredential extends StObject {
  
  /** Credential for Cloud SQL database. */
  var cloudSql: js.UndefOr[CloudSqlCredential] = js.undefined
}
object ConnectionCredential {
  
  inline def apply(): ConnectionCredential = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionCredential]
  }
  
  extension [Self <: ConnectionCredential](x: Self) {
    
    inline def setCloudSql(value: CloudSqlCredential): Self = StObject.set(x, "cloudSql", value.asInstanceOf[js.Any])
    
    inline def setCloudSqlUndefined: Self = StObject.set(x, "cloudSql", js.undefined)
  }
}
