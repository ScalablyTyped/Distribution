package typings.googleapis.computeV1Mod.computeV1

import typings.googleapis.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A SSL policy specifies the server-side support for SSL features. This can
  * be attached to a TargetHttpsProxy or a TargetSslProxy. This affects
  * connections between clients and the HTTPS or SSL proxy load balancer. They
  * do not affect the connection between the load balancers and the backends.
  */
@js.native
trait SchemaSslPolicy extends js.Object {
  
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.native
  
  /**
    * A list of features enabled when the selected profile is CUSTOM. The -
    * method returns the set of features that can be specified in this list.
    * This field must be empty if the profile is not CUSTOM.
    */
  var customFeatures: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * An optional description of this resource. Provide this property when you
    * create the resource.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] The list of features enabled in the SSL policy.
    */
  var enabledFeatures: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Fingerprint of this resource. A hash of the contents stored in this
    * object. This field is used in optimistic locking. This field will be
    * ignored when inserting a SslPolicy. An up-to-date fingerprint must be
    * provided in order to update the SslPolicy, otherwise the request will
    * fail with error 412 conditionNotMet.  To see the latest fingerprint, make
    * a get() request to retrieve an SslPolicy.
    */
  var fingerprint: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * [Output only] Type of the resource. Always compute#sslPolicyfor SSL
    * policies.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The minimum version of SSL protocol that can be used by the clients to
    * establish a connection with the load balancer. This can be one of
    * TLS_1_0, TLS_1_1, TLS_1_2.
    */
  var minTlsVersion: js.UndefOr[String] = js.native
  
  /**
    * Name of the resource. The name must be 1-63 characters long, and comply
    * with RFC1035. Specifically, the name must be 1-63 characters long and
    * match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the
    * first character must be a lowercase letter, and all following characters
    * must be a dash, lowercase letter, or digit, except the last character,
    * which cannot be a dash.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Profile specifies the set of SSL features that can be used by the load
    * balancer when negotiating SSL with clients. This can be one of
    * COMPATIBLE, MODERN, RESTRICTED, or CUSTOM. If using CUSTOM, the set of
    * SSL features to enable must be specified in the customFeatures field.
    */
  var profile: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] If potential misconfigurations are detected for this SSL
    * policy, this field will be populated with warning messages.
    */
  var warnings: js.UndefOr[js.Array[Code]] = js.native
}
object SchemaSslPolicy {
  
  @scala.inline
  def apply(): SchemaSslPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSslPolicy]
  }
  
  @scala.inline
  implicit class SchemaSslPolicyOps[Self <: SchemaSslPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreationTimestamp(value: String): Self = this.set("creationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTimestamp: Self = this.set("creationTimestamp", js.undefined)
    
    @scala.inline
    def setCustomFeaturesVarargs(value: String*): Self = this.set("customFeatures", js.Array(value :_*))
    
    @scala.inline
    def setCustomFeatures(value: js.Array[String]): Self = this.set("customFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomFeatures: Self = this.set("customFeatures", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setEnabledFeaturesVarargs(value: String*): Self = this.set("enabledFeatures", js.Array(value :_*))
    
    @scala.inline
    def setEnabledFeatures(value: js.Array[String]): Self = this.set("enabledFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabledFeatures: Self = this.set("enabledFeatures", js.undefined)
    
    @scala.inline
    def setFingerprint(value: String): Self = this.set("fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFingerprint: Self = this.set("fingerprint", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setMinTlsVersion(value: String): Self = this.set("minTlsVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinTlsVersion: Self = this.set("minTlsVersion", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setProfile(value: String): Self = this.set("profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfile: Self = this.set("profile", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    
    @scala.inline
    def setWarningsVarargs(value: Code*): Self = this.set("warnings", js.Array(value :_*))
    
    @scala.inline
    def setWarnings(value: js.Array[Code]): Self = this.set("warnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarnings: Self = this.set("warnings", js.undefined)
  }
}
