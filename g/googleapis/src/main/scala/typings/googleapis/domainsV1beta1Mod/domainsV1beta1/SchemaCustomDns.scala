package typings.googleapis.domainsV1beta1Mod.domainsV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCustomDns extends StObject {
  
  /**
    * The list of DS records for this domain, which are used to enable DNSSEC. The domain's DNS provider can provide the values to set here. If this field is empty, DNSSEC is disabled.
    */
  var dsRecords: js.UndefOr[js.Array[SchemaDsRecord]] = js.undefined
  
  /**
    * Required. A list of name servers that store the DNS zone for this domain. Each name server is a domain name, with Unicode domain names expressed in Punycode format.
    */
  var nameServers: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaCustomDns {
  
  inline def apply(): SchemaCustomDns = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomDns]
  }
  
  extension [Self <: SchemaCustomDns](x: Self) {
    
    inline def setDsRecords(value: js.Array[SchemaDsRecord]): Self = StObject.set(x, "dsRecords", value.asInstanceOf[js.Any])
    
    inline def setDsRecordsUndefined: Self = StObject.set(x, "dsRecords", js.undefined)
    
    inline def setDsRecordsVarargs(value: SchemaDsRecord*): Self = StObject.set(x, "dsRecords", js.Array(value*))
    
    inline def setNameServers(value: js.Array[String]): Self = StObject.set(x, "nameServers", value.asInstanceOf[js.Any])
    
    inline def setNameServersNull: Self = StObject.set(x, "nameServers", null)
    
    inline def setNameServersUndefined: Self = StObject.set(x, "nameServers", js.undefined)
    
    inline def setNameServersVarargs(value: String*): Self = StObject.set(x, "nameServers", js.Array(value*))
  }
}
