package typings.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * OAuth scopes are a way to define data and permissions on data. For example,
  * there are scopes defined for &quot;Read-only access to Google
  * Calendar&quot; and &quot;Access to Cloud Platform&quot;. Users can consent
  * to a scope for an application, giving it permission to access that data on
  * their behalf.  OAuth scope specifications should be fairly coarse grained;
  * a user will need to see and understand the text description of what your
  * scope means.  In most cases: use one or at most two OAuth scopes for an
  * entire family of products. If your product has multiple APIs, you should
  * probably be sharing the OAuth scope across all of those APIs.  When you
  * need finer grained OAuth consent screens: talk with your product management
  * about how developers will use them in practice.  Please note that even
  * though each of the canonical scopes is enough for a request to be accepted
  * and passed to the backend, a request can still fail due to the backend
  * requiring additional scopes or permissions.
  */
@js.native
trait SchemaOAuthRequirements extends js.Object {
  
  /**
    * The list of publicly documented OAuth scopes that are allowed access. An
    * OAuth token containing any of these scopes will be accepted.  Example:
    * canonical_scopes: https://www.googleapis.com/auth/calendar,
    * https://www.googleapis.com/auth/calendar.read
    */
  var canonicalScopes: js.UndefOr[String] = js.native
}
object SchemaOAuthRequirements {
  
  @scala.inline
  def apply(): SchemaOAuthRequirements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOAuthRequirements]
  }
  
  @scala.inline
  implicit class SchemaOAuthRequirementsOps[Self <: SchemaOAuthRequirements] (val x: Self) extends AnyVal {
    
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
    def setCanonicalScopes(value: String): Self = this.set("canonicalScopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanonicalScopes: Self = this.set("canonicalScopes", js.undefined)
  }
}
