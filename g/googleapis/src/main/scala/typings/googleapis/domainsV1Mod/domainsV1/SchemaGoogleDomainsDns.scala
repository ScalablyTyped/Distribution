package typings.googleapis.domainsV1Mod.domainsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleDomainsDns extends StObject {
  
  /**
    * Output only. The list of DS records published for this domain. The list is automatically populated when `ds_state` is `DS_RECORDS_PUBLISHED`, otherwise it remains empty.
    */
  var dsRecords: js.UndefOr[js.Array[SchemaDsRecord]] = js.undefined
  
  /**
    * Required. The state of DS records for this domain. Used to enable or disable automatic DNSSEC.
    */
  var dsState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. A list of name servers that store the DNS zone for this domain. Each name server is a domain name, with Unicode domain names expressed in Punycode format. This field is automatically populated with the name servers assigned to the Google Domains DNS zone.
    */
  var nameServers: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGoogleDomainsDns {
  
  inline def apply(): SchemaGoogleDomainsDns = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDomainsDns]
  }
  
  extension [Self <: SchemaGoogleDomainsDns](x: Self) {
    
    inline def setDsRecords(value: js.Array[SchemaDsRecord]): Self = StObject.set(x, "dsRecords", value.asInstanceOf[js.Any])
    
    inline def setDsRecordsUndefined: Self = StObject.set(x, "dsRecords", js.undefined)
    
    inline def setDsRecordsVarargs(value: SchemaDsRecord*): Self = StObject.set(x, "dsRecords", js.Array(value*))
    
    inline def setDsState(value: String): Self = StObject.set(x, "dsState", value.asInstanceOf[js.Any])
    
    inline def setDsStateNull: Self = StObject.set(x, "dsState", null)
    
    inline def setDsStateUndefined: Self = StObject.set(x, "dsState", js.undefined)
    
    inline def setNameServers(value: js.Array[String]): Self = StObject.set(x, "nameServers", value.asInstanceOf[js.Any])
    
    inline def setNameServersNull: Self = StObject.set(x, "nameServers", null)
    
    inline def setNameServersUndefined: Self = StObject.set(x, "nameServers", js.undefined)
    
    inline def setNameServersVarargs(value: String*): Self = StObject.set(x, "nameServers", js.Array(value*))
  }
}
