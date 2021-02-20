package typings.googleapis.redisV1Mod.redisV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request for Failover.
  */
@js.native
trait SchemaFailoverInstanceRequest extends StObject {
  
  /**
    * Optional. Available data protection modes that the user can choose. If
    * it&#39;s unspecified, data protection mode will be LIMITED_DATA_LOSS by
    * default.
    */
  var dataProtectionMode: js.UndefOr[String] = js.native
}
object SchemaFailoverInstanceRequest {
  
  @scala.inline
  def apply(): SchemaFailoverInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFailoverInstanceRequest]
  }
  
  @scala.inline
  implicit class SchemaFailoverInstanceRequestMutableBuilder[Self <: SchemaFailoverInstanceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataProtectionMode(value: String): Self = StObject.set(x, "dataProtectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataProtectionModeUndefined: Self = StObject.set(x, "dataProtectionMode", js.undefined)
  }
}
