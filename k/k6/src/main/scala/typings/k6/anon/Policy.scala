package typings.k6.anon

import typings.k6.k6Strings.any
import typings.k6.k6Strings.first
import typings.k6.k6Strings.onlyIPv4
import typings.k6.k6Strings.onlyIPv6
import typings.k6.k6Strings.preferIPv4
import typings.k6.k6Strings.preferIPv6
import typings.k6.k6Strings.random
import typings.k6.k6Strings.roundRobin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Policy extends StObject {
  
  var policy: preferIPv4 | preferIPv6 | onlyIPv4 | onlyIPv6 | any
  
  var select: first | random | roundRobin
  
  /** 0, inf, or any time duration(60s, 5m30s, 10m, 2h). */
  var ttl: String
}
object Policy {
  
  inline def apply(
    policy: preferIPv4 | preferIPv6 | onlyIPv4 | onlyIPv6 | any,
    select: first | random | roundRobin,
    ttl: String
  ): Policy = {
    val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Policy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Policy] (val x: Self) extends AnyVal {
    
    inline def setPolicy(value: preferIPv4 | preferIPv6 | onlyIPv4 | onlyIPv6 | any): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setSelect(value: first | random | roundRobin): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    
    inline def setTtl(value: String): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
  }
}
