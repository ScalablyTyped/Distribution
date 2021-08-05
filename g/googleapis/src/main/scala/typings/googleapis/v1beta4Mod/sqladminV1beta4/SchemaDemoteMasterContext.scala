package typings.googleapis.v1beta4Mod.sqladminV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Database instance demote master context.
  */
trait SchemaDemoteMasterContext extends StObject {
  
  /**
    * This is always sql#demoteMasterContext.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the instance which will act as on-premises master in the
    * replication setup.
    */
  var masterInstanceName: js.UndefOr[String] = js.undefined
  
  /**
    * Configuration specific to read-replicas replicating from the on-premises
    * master.
    */
  var replicaConfiguration: js.UndefOr[SchemaDemoteMasterConfiguration] = js.undefined
  
  /**
    * Verify GTID consistency for demote operation. Default value: True. Second
    * Generation instances only. Setting this flag to false enables you to
    * bypass GTID consistency check between on-premises master and Cloud SQL
    * instance during the demotion operation but also exposes you to the risk
    * of future replication failures. Change the value only if you know the
    * reason for the GTID divergence and are confident that doing so will not
    * cause any replication issues.
    */
  var verifyGtidConsistency: js.UndefOr[Boolean] = js.undefined
}
object SchemaDemoteMasterContext {
  
  inline def apply(): SchemaDemoteMasterContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDemoteMasterContext]
  }
  
  extension [Self <: SchemaDemoteMasterContext](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMasterInstanceName(value: String): Self = StObject.set(x, "masterInstanceName", value.asInstanceOf[js.Any])
    
    inline def setMasterInstanceNameUndefined: Self = StObject.set(x, "masterInstanceName", js.undefined)
    
    inline def setReplicaConfiguration(value: SchemaDemoteMasterConfiguration): Self = StObject.set(x, "replicaConfiguration", value.asInstanceOf[js.Any])
    
    inline def setReplicaConfigurationUndefined: Self = StObject.set(x, "replicaConfiguration", js.undefined)
    
    inline def setVerifyGtidConsistency(value: Boolean): Self = StObject.set(x, "verifyGtidConsistency", value.asInstanceOf[js.Any])
    
    inline def setVerifyGtidConsistencyUndefined: Self = StObject.set(x, "verifyGtidConsistency", js.undefined)
  }
}
