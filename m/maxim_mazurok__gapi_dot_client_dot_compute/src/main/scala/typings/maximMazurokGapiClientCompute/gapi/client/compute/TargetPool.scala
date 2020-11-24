package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetPool extends js.Object {
  
  /**
    * The server-defined URL for the resource. This field is applicable only when the containing target pool is serving a forwarding rule as the primary pool, and its failoverRatio field
    * is properly set to a value between [0, 1].
    *
    * backupPool and failoverRatio together define the fallback behavior of the primary target pool: if the ratio of the healthy instances in the primary pool is at or below
    * failoverRatio, traffic arriving at the load-balanced IP will be directed to the backup pool.
    *
    * In case where failoverRatio and backupPool are not set, or all the instances in the backup pool are unhealthy, the traffic will be directed back to the primary pool in the "force"
    * mode, where traffic will be spread to the healthy instances with the best effort, or to all instances when no instance is healthy.
    */
  var backupPool: js.UndefOr[String] = js.native
  
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[String] = js.native
  
  /** An optional description of this resource. Provide this property when you create the resource. */
  var description: js.UndefOr[String] = js.native
  
  /**
    * This field is applicable only when the containing target pool is serving a forwarding rule as the primary pool (i.e., not as a backup pool to some other target pool). The value of
    * the field must be in [0, 1].
    *
    * If set, backupPool must also be set. They together define the fallback behavior of the primary target pool: if the ratio of the healthy instances in the primary pool is at or below
    * this number, traffic arriving at the load-balanced IP will be directed to the backup pool.
    *
    * In case where failoverRatio is not set or all the instances in the backup pool are unhealthy, the traffic will be directed back to the primary pool in the "force" mode, where
    * traffic will be spread to the healthy instances with the best effort, or to all instances when no instance is healthy.
    */
  var failoverRatio: js.UndefOr[Double] = js.native
  
  /**
    * The URL of the HttpHealthCheck resource. A member instance in this pool is considered healthy if and only if the health checks pass. An empty list means all member instances will be
    * considered healthy at all times. Only legacy HttpHealthChecks are supported. Only one health check may be specified.
    */
  var healthChecks: js.UndefOr[js.Array[String]] = js.native
  
  /** [Output Only] The unique identifier for the resource. This identifier is defined by the server. */
  var id: js.UndefOr[String] = js.native
  
  /** A list of resource URLs to the virtual machine instances serving this pool. They must live in zones contained in the same region as this pool. */
  var instances: js.UndefOr[js.Array[String]] = js.native
  
  /** [Output Only] Type of the resource. Always compute#targetPool for target pools. */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63
    * characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a
    * dash, lowercase letter, or digit, except the last character, which cannot be a dash.
    */
  var name: js.UndefOr[String] = js.native
  
  /** [Output Only] URL of the region where the target pool resides. */
  var region: js.UndefOr[String] = js.native
  
  /** [Output Only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[String] = js.native
  
  /**
    * Session affinity option, must be one of the following values:
    * NONE: Connections from the same client IP may go to any instance in the pool.
    * CLIENT_IP: Connections from the same client IP will go to the same instance in the pool while that instance remains healthy.
    * CLIENT_IP_PROTO: Connections from the same client IP with the same IP protocol will go to the same instance in the pool while that instance remains healthy.
    */
  var sessionAffinity: js.UndefOr[String] = js.native
}
object TargetPool {
  
  @scala.inline
  def apply(): TargetPool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetPool]
  }
  
  @scala.inline
  implicit class TargetPoolOps[Self <: TargetPool] (val x: Self) extends AnyVal {
    
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
    def setBackupPool(value: String): Self = this.set("backupPool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackupPool: Self = this.set("backupPool", js.undefined)
    
    @scala.inline
    def setCreationTimestamp(value: String): Self = this.set("creationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTimestamp: Self = this.set("creationTimestamp", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setFailoverRatio(value: Double): Self = this.set("failoverRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailoverRatio: Self = this.set("failoverRatio", js.undefined)
    
    @scala.inline
    def setHealthChecksVarargs(value: String*): Self = this.set("healthChecks", js.Array(value :_*))
    
    @scala.inline
    def setHealthChecks(value: js.Array[String]): Self = this.set("healthChecks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealthChecks: Self = this.set("healthChecks", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setInstancesVarargs(value: String*): Self = this.set("instances", js.Array(value :_*))
    
    @scala.inline
    def setInstances(value: js.Array[String]): Self = this.set("instances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstances: Self = this.set("instances", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    
    @scala.inline
    def setSessionAffinity(value: String): Self = this.set("sessionAffinity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionAffinity: Self = this.set("sessionAffinity", js.undefined)
  }
}
