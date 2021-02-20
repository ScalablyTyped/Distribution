package typings.googleapis.pubsubV1Mod.pubsubV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A policy that specifies the conditions for resource expiration (i.e.,
  * automatic resource deletion).
  */
@js.native
trait SchemaExpirationPolicy extends StObject {
  
  /**
    * Specifies the &quot;time-to-live&quot; duration for an associated
    * resource. The resource expires if it is not active for a period of `ttl`.
    * The definition of &quot;activity&quot; depends on the type of the
    * associated resource. The minimum and maximum allowed values for `ttl`
    * depend on the type of the associated resource, as well. If `ttl` is not
    * set, the associated resource never expires.
    */
  var ttl: js.UndefOr[String] = js.native
}
object SchemaExpirationPolicy {
  
  @scala.inline
  def apply(): SchemaExpirationPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExpirationPolicy]
  }
  
  @scala.inline
  implicit class SchemaExpirationPolicyMutableBuilder[Self <: SchemaExpirationPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTtl(value: String): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
  }
}
