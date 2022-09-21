package typings.googleapis.privatecaV1beta1Mod.privatecaV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReusableConfigValues extends StObject {
  
  /**
    * Optional. Describes custom X.509 extensions.
    */
  var additionalExtensions: js.UndefOr[js.Array[SchemaX509Extension]] = js.undefined
  
  /**
    * Optional. Describes Online Certificate Status Protocol (OCSP) endpoint addresses that appear in the "Authority Information Access" extension in the certificate.
    */
  var aiaOcspServers: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Optional. Describes options in this ReusableConfigValues that are relevant in a CA certificate.
    */
  var caOptions: js.UndefOr[SchemaCaOptions] = js.undefined
  
  /**
    * Optional. Indicates the intended use for keys that correspond to a certificate.
    */
  var keyUsage: js.UndefOr[SchemaKeyUsage] = js.undefined
  
  /**
    * Optional. Describes the X.509 certificate policy object identifiers, per https://tools.ietf.org/html/rfc5280#section-4.2.1.4.
    */
  var policyIds: js.UndefOr[js.Array[SchemaObjectId]] = js.undefined
}
object SchemaReusableConfigValues {
  
  inline def apply(): SchemaReusableConfigValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReusableConfigValues]
  }
  
  extension [Self <: SchemaReusableConfigValues](x: Self) {
    
    inline def setAdditionalExtensions(value: js.Array[SchemaX509Extension]): Self = StObject.set(x, "additionalExtensions", value.asInstanceOf[js.Any])
    
    inline def setAdditionalExtensionsUndefined: Self = StObject.set(x, "additionalExtensions", js.undefined)
    
    inline def setAdditionalExtensionsVarargs(value: SchemaX509Extension*): Self = StObject.set(x, "additionalExtensions", js.Array(value*))
    
    inline def setAiaOcspServers(value: js.Array[String]): Self = StObject.set(x, "aiaOcspServers", value.asInstanceOf[js.Any])
    
    inline def setAiaOcspServersNull: Self = StObject.set(x, "aiaOcspServers", null)
    
    inline def setAiaOcspServersUndefined: Self = StObject.set(x, "aiaOcspServers", js.undefined)
    
    inline def setAiaOcspServersVarargs(value: String*): Self = StObject.set(x, "aiaOcspServers", js.Array(value*))
    
    inline def setCaOptions(value: SchemaCaOptions): Self = StObject.set(x, "caOptions", value.asInstanceOf[js.Any])
    
    inline def setCaOptionsUndefined: Self = StObject.set(x, "caOptions", js.undefined)
    
    inline def setKeyUsage(value: SchemaKeyUsage): Self = StObject.set(x, "keyUsage", value.asInstanceOf[js.Any])
    
    inline def setKeyUsageUndefined: Self = StObject.set(x, "keyUsage", js.undefined)
    
    inline def setPolicyIds(value: js.Array[SchemaObjectId]): Self = StObject.set(x, "policyIds", value.asInstanceOf[js.Any])
    
    inline def setPolicyIdsUndefined: Self = StObject.set(x, "policyIds", js.undefined)
    
    inline def setPolicyIdsVarargs(value: SchemaObjectId*): Self = StObject.set(x, "policyIds", js.Array(value*))
  }
}
