package typings.googleapis.sqladminV1Mod.sqladminV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDemoteMasterConfiguration extends StObject {
  
  /**
    * This is always `sql#demoteMasterConfiguration`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * MySQL specific configuration when replicating from a MySQL on-premises primary instance. Replication configuration information such as the username, password, certificates, and keys are not stored in the instance metadata. The configuration information is used only to set up the replication connection and is stored by MySQL in a file named `master.info` in the data directory.
    */
  var mysqlReplicaConfiguration: js.UndefOr[SchemaDemoteMasterMySqlReplicaConfiguration] = js.undefined
}
object SchemaDemoteMasterConfiguration {
  
  inline def apply(): SchemaDemoteMasterConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDemoteMasterConfiguration]
  }
  
  extension [Self <: SchemaDemoteMasterConfiguration](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMysqlReplicaConfiguration(value: SchemaDemoteMasterMySqlReplicaConfiguration): Self = StObject.set(x, "mysqlReplicaConfiguration", value.asInstanceOf[js.Any])
    
    inline def setMysqlReplicaConfigurationUndefined: Self = StObject.set(x, "mysqlReplicaConfiguration", js.undefined)
  }
}
