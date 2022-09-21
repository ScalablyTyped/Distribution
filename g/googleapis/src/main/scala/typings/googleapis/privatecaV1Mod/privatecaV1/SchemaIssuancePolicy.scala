package typings.googleapis.privatecaV1Mod.privatecaV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIssuancePolicy extends StObject {
  
  /**
    * Optional. If specified, then only methods allowed in the IssuanceModes may be used to issue Certificates.
    */
  var allowedIssuanceModes: js.UndefOr[SchemaIssuanceModes] = js.undefined
  
  /**
    * Optional. If any AllowedKeyType is specified, then the certificate request's public key must match one of the key types listed here. Otherwise, any key may be used.
    */
  var allowedKeyTypes: js.UndefOr[js.Array[SchemaAllowedKeyType]] = js.undefined
  
  /**
    * Optional. A set of X.509 values that will be applied to all certificates issued through this CaPool. If a certificate request includes conflicting values for the same properties, they will be overwritten by the values defined here. If a certificate request uses a CertificateTemplate that defines conflicting predefined_values for the same properties, the certificate issuance request will fail.
    */
  var baselineValues: js.UndefOr[SchemaX509Parameters] = js.undefined
  
  /**
    * Optional. Describes constraints on identities that may appear in Certificates issued through this CaPool. If this is omitted, then this CaPool will not add restrictions on a certificate's identity.
    */
  var identityConstraints: js.UndefOr[SchemaCertificateIdentityConstraints] = js.undefined
  
  /**
    * Optional. The maximum lifetime allowed for issued Certificates. Note that if the issuing CertificateAuthority expires before a Certificate's requested maximum_lifetime, the effective lifetime will be explicitly truncated to match it.
    */
  var maximumLifetime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Describes the set of X.509 extensions that may appear in a Certificate issued through this CaPool. If a certificate request sets extensions that don't appear in the passthrough_extensions, those extensions will be dropped. If a certificate request uses a CertificateTemplate with predefined_values that don't appear here, the certificate issuance request will fail. If this is omitted, then this CaPool will not add restrictions on a certificate's X.509 extensions. These constraints do not apply to X.509 extensions set in this CaPool's baseline_values.
    */
  var passthroughExtensions: js.UndefOr[SchemaCertificateExtensionConstraints] = js.undefined
}
object SchemaIssuancePolicy {
  
  inline def apply(): SchemaIssuancePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIssuancePolicy]
  }
  
  extension [Self <: SchemaIssuancePolicy](x: Self) {
    
    inline def setAllowedIssuanceModes(value: SchemaIssuanceModes): Self = StObject.set(x, "allowedIssuanceModes", value.asInstanceOf[js.Any])
    
    inline def setAllowedIssuanceModesUndefined: Self = StObject.set(x, "allowedIssuanceModes", js.undefined)
    
    inline def setAllowedKeyTypes(value: js.Array[SchemaAllowedKeyType]): Self = StObject.set(x, "allowedKeyTypes", value.asInstanceOf[js.Any])
    
    inline def setAllowedKeyTypesUndefined: Self = StObject.set(x, "allowedKeyTypes", js.undefined)
    
    inline def setAllowedKeyTypesVarargs(value: SchemaAllowedKeyType*): Self = StObject.set(x, "allowedKeyTypes", js.Array(value*))
    
    inline def setBaselineValues(value: SchemaX509Parameters): Self = StObject.set(x, "baselineValues", value.asInstanceOf[js.Any])
    
    inline def setBaselineValuesUndefined: Self = StObject.set(x, "baselineValues", js.undefined)
    
    inline def setIdentityConstraints(value: SchemaCertificateIdentityConstraints): Self = StObject.set(x, "identityConstraints", value.asInstanceOf[js.Any])
    
    inline def setIdentityConstraintsUndefined: Self = StObject.set(x, "identityConstraints", js.undefined)
    
    inline def setMaximumLifetime(value: String): Self = StObject.set(x, "maximumLifetime", value.asInstanceOf[js.Any])
    
    inline def setMaximumLifetimeNull: Self = StObject.set(x, "maximumLifetime", null)
    
    inline def setMaximumLifetimeUndefined: Self = StObject.set(x, "maximumLifetime", js.undefined)
    
    inline def setPassthroughExtensions(value: SchemaCertificateExtensionConstraints): Self = StObject.set(x, "passthroughExtensions", value.asInstanceOf[js.Any])
    
    inline def setPassthroughExtensionsUndefined: Self = StObject.set(x, "passthroughExtensions", js.undefined)
  }
}
