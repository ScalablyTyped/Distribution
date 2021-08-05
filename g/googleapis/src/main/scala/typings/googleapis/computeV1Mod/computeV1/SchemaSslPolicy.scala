package typings.googleapis.computeV1Mod.computeV1

import typings.googleapis.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A SSL policy specifies the server-side support for SSL features. This can
  * be attached to a TargetHttpsProxy or a TargetSslProxy. This affects
  * connections between clients and the HTTPS or SSL proxy load balancer. They
  * do not affect the connection between the load balancers and the backends.
  */
trait SchemaSslPolicy extends StObject {
  
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.undefined
  
  /**
    * A list of features enabled when the selected profile is CUSTOM. The -
    * method returns the set of features that can be specified in this list.
    * This field must be empty if the profile is not CUSTOM.
    */
  var customFeatures: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * An optional description of this resource. Provide this property when you
    * create the resource.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] The list of features enabled in the SSL policy.
    */
  var enabledFeatures: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Fingerprint of this resource. A hash of the contents stored in this
    * object. This field is used in optimistic locking. This field will be
    * ignored when inserting a SslPolicy. An up-to-date fingerprint must be
    * provided in order to update the SslPolicy, otherwise the request will
    * fail with error 412 conditionNotMet.  To see the latest fingerprint, make
    * a get() request to retrieve an SslPolicy.
    */
  var fingerprint: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * [Output only] Type of the resource. Always compute#sslPolicyfor SSL
    * policies.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The minimum version of SSL protocol that can be used by the clients to
    * establish a connection with the load balancer. This can be one of
    * TLS_1_0, TLS_1_1, TLS_1_2.
    */
  var minTlsVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the resource. The name must be 1-63 characters long, and comply
    * with RFC1035. Specifically, the name must be 1-63 characters long and
    * match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the
    * first character must be a lowercase letter, and all following characters
    * must be a dash, lowercase letter, or digit, except the last character,
    * which cannot be a dash.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Profile specifies the set of SSL features that can be used by the load
    * balancer when negotiating SSL with clients. This can be one of
    * COMPATIBLE, MODERN, RESTRICTED, or CUSTOM. If using CUSTOM, the set of
    * SSL features to enable must be specified in the customFeatures field.
    */
  var profile: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] If potential misconfigurations are detected for this SSL
    * policy, this field will be populated with warning messages.
    */
  var warnings: js.UndefOr[js.Array[Code]] = js.undefined
}
object SchemaSslPolicy {
  
  inline def apply(): SchemaSslPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSslPolicy]
  }
  
  extension [Self <: SchemaSslPolicy](x: Self) {
    
    inline def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    inline def setCustomFeatures(value: js.Array[String]): Self = StObject.set(x, "customFeatures", value.asInstanceOf[js.Any])
    
    inline def setCustomFeaturesUndefined: Self = StObject.set(x, "customFeatures", js.undefined)
    
    inline def setCustomFeaturesVarargs(value: String*): Self = StObject.set(x, "customFeatures", js.Array(value :_*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEnabledFeatures(value: js.Array[String]): Self = StObject.set(x, "enabledFeatures", value.asInstanceOf[js.Any])
    
    inline def setEnabledFeaturesUndefined: Self = StObject.set(x, "enabledFeatures", js.undefined)
    
    inline def setEnabledFeaturesVarargs(value: String*): Self = StObject.set(x, "enabledFeatures", js.Array(value :_*))
    
    inline def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    inline def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMinTlsVersion(value: String): Self = StObject.set(x, "minTlsVersion", value.asInstanceOf[js.Any])
    
    inline def setMinTlsVersionUndefined: Self = StObject.set(x, "minTlsVersion", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProfile(value: String): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setWarnings(value: js.Array[Code]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    inline def setWarningsVarargs(value: Code*): Self = StObject.set(x, "warnings", js.Array(value :_*))
  }
}
