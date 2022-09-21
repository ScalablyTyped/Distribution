package typings.googleapis.domainsV1Mod.domainsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDnsSettings extends StObject {
  
  /**
    * An arbitrary DNS provider identified by its name servers.
    */
  var customDns: js.UndefOr[SchemaCustomDns] = js.undefined
  
  /**
    * The list of glue records for this `Registration`. Commonly empty.
    */
  var glueRecords: js.UndefOr[js.Array[SchemaGlueRecord]] = js.undefined
  
  /**
    * The free DNS zone provided by [Google Domains](https://domains.google/).
    */
  var googleDomainsDns: js.UndefOr[SchemaGoogleDomainsDns] = js.undefined
}
object SchemaDnsSettings {
  
  inline def apply(): SchemaDnsSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDnsSettings]
  }
  
  extension [Self <: SchemaDnsSettings](x: Self) {
    
    inline def setCustomDns(value: SchemaCustomDns): Self = StObject.set(x, "customDns", value.asInstanceOf[js.Any])
    
    inline def setCustomDnsUndefined: Self = StObject.set(x, "customDns", js.undefined)
    
    inline def setGlueRecords(value: js.Array[SchemaGlueRecord]): Self = StObject.set(x, "glueRecords", value.asInstanceOf[js.Any])
    
    inline def setGlueRecordsUndefined: Self = StObject.set(x, "glueRecords", js.undefined)
    
    inline def setGlueRecordsVarargs(value: SchemaGlueRecord*): Self = StObject.set(x, "glueRecords", js.Array(value*))
    
    inline def setGoogleDomainsDns(value: SchemaGoogleDomainsDns): Self = StObject.set(x, "googleDomainsDns", value.asInstanceOf[js.Any])
    
    inline def setGoogleDomainsDnsUndefined: Self = StObject.set(x, "googleDomainsDns", js.undefined)
  }
}
