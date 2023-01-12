package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IpsInfoResponse extends StObject {
  
  /** the date and time that the dedicated IP was created as a UTC string in YYYY-MM-DD HH:MM:SS format */
  var created_at: String
  
  /** information about the ip's custom dns, if it has been configured */
  var custom_dns: js.UndefOr[IpsCustomDns | Null] = js.undefined
  
  /** the domain name (reverse dns) of this dedicated IP */
  var domain: js.UndefOr[String | Null] = js.undefined
  
  /** the ip address */
  var ip: String
  
  /** the name of the pool that this dedicated IP belongs to */
  var pool: js.UndefOr[String | Null] = js.undefined
  
  /** information about the ip's warmup status */
  var warmup: js.UndefOr[IpsWarmup | Null] = js.undefined
}
object IpsInfoResponse {
  
  inline def apply(created_at: String, ip: String): IpsInfoResponse = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpsInfoResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IpsInfoResponse] (val x: Self) extends AnyVal {
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setCustom_dns(value: IpsCustomDns): Self = StObject.set(x, "custom_dns", value.asInstanceOf[js.Any])
    
    inline def setCustom_dnsNull: Self = StObject.set(x, "custom_dns", null)
    
    inline def setCustom_dnsUndefined: Self = StObject.set(x, "custom_dns", js.undefined)
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainNull: Self = StObject.set(x, "domain", null)
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
    
    inline def setPool(value: String): Self = StObject.set(x, "pool", value.asInstanceOf[js.Any])
    
    inline def setPoolNull: Self = StObject.set(x, "pool", null)
    
    inline def setPoolUndefined: Self = StObject.set(x, "pool", js.undefined)
    
    inline def setWarmup(value: IpsWarmup): Self = StObject.set(x, "warmup", value.asInstanceOf[js.Any])
    
    inline def setWarmupNull: Self = StObject.set(x, "warmup", null)
    
    inline def setWarmupUndefined: Self = StObject.set(x, "warmup", js.undefined)
  }
}
