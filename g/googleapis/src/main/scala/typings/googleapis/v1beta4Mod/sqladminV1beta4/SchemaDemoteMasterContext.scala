package typings.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Database instance demote master context.
  */
@js.native
trait SchemaDemoteMasterContext extends js.Object {
  
  /**
    * This is always sql#demoteMasterContext.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The name of the instance which will act as on-premises master in the
    * replication setup.
    */
  var masterInstanceName: js.UndefOr[String] = js.native
  
  /**
    * Configuration specific to read-replicas replicating from the on-premises
    * master.
    */
  var replicaConfiguration: js.UndefOr[SchemaDemoteMasterConfiguration] = js.native
  
  /**
    * Verify GTID consistency for demote operation. Default value: True. Second
    * Generation instances only. Setting this flag to false enables you to
    * bypass GTID consistency check between on-premises master and Cloud SQL
    * instance during the demotion operation but also exposes you to the risk
    * of future replication failures. Change the value only if you know the
    * reason for the GTID divergence and are confident that doing so will not
    * cause any replication issues.
    */
  var verifyGtidConsistency: js.UndefOr[Boolean] = js.native
}
object SchemaDemoteMasterContext {
  
  @scala.inline
  def apply(): SchemaDemoteMasterContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDemoteMasterContext]
  }
  
  @scala.inline
  implicit class SchemaDemoteMasterContextOps[Self <: SchemaDemoteMasterContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setMasterInstanceName(value: String): Self = this.set("masterInstanceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMasterInstanceName: Self = this.set("masterInstanceName", js.undefined)
    
    @scala.inline
    def setReplicaConfiguration(value: SchemaDemoteMasterConfiguration): Self = this.set("replicaConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicaConfiguration: Self = this.set("replicaConfiguration", js.undefined)
    
    @scala.inline
    def setVerifyGtidConsistency(value: Boolean): Self = this.set("verifyGtidConsistency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerifyGtidConsistency: Self = this.set("verifyGtidConsistency", js.undefined)
  }
}
