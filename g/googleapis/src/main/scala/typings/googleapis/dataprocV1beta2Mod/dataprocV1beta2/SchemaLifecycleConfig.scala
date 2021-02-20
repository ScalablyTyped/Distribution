package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies the cluster auto-delete schedule configuration.
  */
@js.native
trait SchemaLifecycleConfig extends StObject {
  
  /**
    * Optional. The time when cluster will be auto-deleted.
    */
  var autoDeleteTime: js.UndefOr[String] = js.native
  
  /**
    * Optional. The lifetime duration of cluster. The cluster will be
    * auto-deleted at the end of this period. Valid range: 10m, 14d.Example:
    * &quot;1d&quot;, to delete the cluster 1 day after its creation..
    */
  var autoDeleteTtl: js.UndefOr[String] = js.native
  
  /**
    * Optional. The duration to keep the cluster alive while idling. Passing
    * this threshold will cause the cluster to be deleted. Valid range: 10m,
    * 14d.Example: &quot;10m&quot;, the minimum value, to delete the cluster
    * when it has had no jobs running for 10 minutes.
    */
  var idleDeleteTtl: js.UndefOr[String] = js.native
}
object SchemaLifecycleConfig {
  
  @scala.inline
  def apply(): SchemaLifecycleConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLifecycleConfig]
  }
  
  @scala.inline
  implicit class SchemaLifecycleConfigMutableBuilder[Self <: SchemaLifecycleConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoDeleteTime(value: String): Self = StObject.set(x, "autoDeleteTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoDeleteTimeUndefined: Self = StObject.set(x, "autoDeleteTime", js.undefined)
    
    @scala.inline
    def setAutoDeleteTtl(value: String): Self = StObject.set(x, "autoDeleteTtl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoDeleteTtlUndefined: Self = StObject.set(x, "autoDeleteTtl", js.undefined)
    
    @scala.inline
    def setIdleDeleteTtl(value: String): Self = StObject.set(x, "idleDeleteTtl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdleDeleteTtlUndefined: Self = StObject.set(x, "idleDeleteTtl", js.undefined)
  }
}
