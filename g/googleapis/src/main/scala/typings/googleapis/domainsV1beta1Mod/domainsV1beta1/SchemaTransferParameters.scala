package typings.googleapis.domainsV1beta1Mod.domainsV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTransferParameters extends StObject {
  
  /**
    * The registrar that currently manages the domain.
    */
  var currentRegistrar: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The URL of registrar that currently manages the domain.
    */
  var currentRegistrarUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The domain name. Unicode domain names are expressed in Punycode format.
    */
  var domainName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name servers that currently store the configuration of the domain.
    */
  var nameServers: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Contact privacy options that the domain supports.
    */
  var supportedPrivacy: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Indicates whether the domain is protected by a transfer lock. For a transfer to succeed, this must show `UNLOCKED`. To unlock a domain, go to its current registrar.
    */
  var transferLockState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Price to transfer or renew the domain for one year.
    */
  var yearlyPrice: js.UndefOr[SchemaMoney] = js.undefined
}
object SchemaTransferParameters {
  
  inline def apply(): SchemaTransferParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTransferParameters]
  }
  
  extension [Self <: SchemaTransferParameters](x: Self) {
    
    inline def setCurrentRegistrar(value: String): Self = StObject.set(x, "currentRegistrar", value.asInstanceOf[js.Any])
    
    inline def setCurrentRegistrarNull: Self = StObject.set(x, "currentRegistrar", null)
    
    inline def setCurrentRegistrarUndefined: Self = StObject.set(x, "currentRegistrar", js.undefined)
    
    inline def setCurrentRegistrarUri(value: String): Self = StObject.set(x, "currentRegistrarUri", value.asInstanceOf[js.Any])
    
    inline def setCurrentRegistrarUriNull: Self = StObject.set(x, "currentRegistrarUri", null)
    
    inline def setCurrentRegistrarUriUndefined: Self = StObject.set(x, "currentRegistrarUri", js.undefined)
    
    inline def setDomainName(value: String): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    
    inline def setDomainNameNull: Self = StObject.set(x, "domainName", null)
    
    inline def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
    
    inline def setNameServers(value: js.Array[String]): Self = StObject.set(x, "nameServers", value.asInstanceOf[js.Any])
    
    inline def setNameServersNull: Self = StObject.set(x, "nameServers", null)
    
    inline def setNameServersUndefined: Self = StObject.set(x, "nameServers", js.undefined)
    
    inline def setNameServersVarargs(value: String*): Self = StObject.set(x, "nameServers", js.Array(value*))
    
    inline def setSupportedPrivacy(value: js.Array[String]): Self = StObject.set(x, "supportedPrivacy", value.asInstanceOf[js.Any])
    
    inline def setSupportedPrivacyNull: Self = StObject.set(x, "supportedPrivacy", null)
    
    inline def setSupportedPrivacyUndefined: Self = StObject.set(x, "supportedPrivacy", js.undefined)
    
    inline def setSupportedPrivacyVarargs(value: String*): Self = StObject.set(x, "supportedPrivacy", js.Array(value*))
    
    inline def setTransferLockState(value: String): Self = StObject.set(x, "transferLockState", value.asInstanceOf[js.Any])
    
    inline def setTransferLockStateNull: Self = StObject.set(x, "transferLockState", null)
    
    inline def setTransferLockStateUndefined: Self = StObject.set(x, "transferLockState", js.undefined)
    
    inline def setYearlyPrice(value: SchemaMoney): Self = StObject.set(x, "yearlyPrice", value.asInstanceOf[js.Any])
    
    inline def setYearlyPriceUndefined: Self = StObject.set(x, "yearlyPrice", js.undefined)
  }
}
