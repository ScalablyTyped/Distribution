package typings.googleapis

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import typings.googleapis.googleapisStrings.v1beta1
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iapV1beta1Mod {
  
  object iapV1beta1 {
    
    /**
      * Cloud Identity-Aware Proxy API
      *
      * Controls access to cloud applications running on Google Cloud Platform.
      *
      * @example
      * const {google} = require('googleapis');
      * const iap = google.iap('v1beta1');
      *
      * @namespace iap
      * @type {Function}
      * @version v1beta1
      * @variation v1beta1
      * @param {object=} options Options for Iap
      */
    @JSImport("googleapis/build/src/apis/iap/v1beta1", "iap_v1beta1.Iap")
    @js.native
    class Iap protected () extends StObject {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
      
      var context: APIRequestContext = js.native
      
      var v1beta1: ResourceV1beta1 = js.native
    }
    
    @JSImport("googleapis/build/src/apis/iap/v1beta1", "iap_v1beta1.Resource$V1beta1")
    @js.native
    class ResourceV1beta1 protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      /**
        * iap.getIamPolicy
        * @desc Gets the access control policy for an Identity-Aware Proxy
        * protected resource. More information about managing access via IAP can be
        * found at:
        * https://cloud.google.com/iap/docs/managing-access#managing_access_via_the_api
        * @alias iap.getIamPolicy
        * @memberOf! ()
        *
        * @param {object} params Parameters for request
        * @param {string} params.resource_ REQUIRED: The resource for which the policy is being requested. See the operation documentation for the appropriate value for this field.
        * @param {().GetIamPolicyRequest} params.resource Request body data
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
      def getIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
      def getIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
      def getIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
      def getIamPolicy(params: ParamsResourceV1beta1Getiampolicy): GaxiosPromise[SchemaPolicy] = js.native
      def getIamPolicy(params: ParamsResourceV1beta1Getiampolicy, callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
      def getIamPolicy(
        params: ParamsResourceV1beta1Getiampolicy,
        options: BodyResponseCallback[SchemaPolicy],
        callback: BodyResponseCallback[SchemaPolicy]
      ): Unit = js.native
      def getIamPolicy(params: ParamsResourceV1beta1Getiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
      def getIamPolicy(
        params: ParamsResourceV1beta1Getiampolicy,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaPolicy]
      ): Unit = js.native
      
      /**
        * iap.setIamPolicy
        * @desc Sets the access control policy for an Identity-Aware Proxy
        * protected resource. Replaces any existing policy. More information about
        * managing access via IAP can be found at:
        * https://cloud.google.com/iap/docs/managing-access#managing_access_via_the_api
        * @alias iap.setIamPolicy
        * @memberOf! ()
        *
        * @param {object} params Parameters for request
        * @param {string} params.resource_ REQUIRED: The resource for which the policy is being specified. See the operation documentation for the appropriate value for this field.
        * @param {().SetIamPolicyRequest} params.resource Request body data
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
      def setIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
      def setIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
      def setIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
      def setIamPolicy(params: ParamsResourceV1beta1Setiampolicy): GaxiosPromise[SchemaPolicy] = js.native
      def setIamPolicy(params: ParamsResourceV1beta1Setiampolicy, callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
      def setIamPolicy(
        params: ParamsResourceV1beta1Setiampolicy,
        options: BodyResponseCallback[SchemaPolicy],
        callback: BodyResponseCallback[SchemaPolicy]
      ): Unit = js.native
      def setIamPolicy(params: ParamsResourceV1beta1Setiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
      def setIamPolicy(
        params: ParamsResourceV1beta1Setiampolicy,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaPolicy]
      ): Unit = js.native
      
      /**
        * iap.testIamPermissions
        * @desc Returns permissions that a caller has on the Identity-Aware Proxy
        * protected resource. If the resource does not exist or the caller does not
        * have Identity-Aware Proxy permissions a
        * [google.rpc.Code.PERMISSION_DENIED] will be returned. More information
        * about managing access via IAP can be found at:
        * https://cloud.google.com/iap/docs/managing-access#managing_access_via_the_api
        * @alias iap.testIamPermissions
        * @memberOf! ()
        *
        * @param {object} params Parameters for request
        * @param {string} params.resource_ REQUIRED: The resource for which the policy detail is being requested. See the operation documentation for the appropriate value for this field.
        * @param {().TestIamPermissionsRequest} params.resource Request body data
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
      def testIamPermissions(): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
      def testIamPermissions(callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]): Unit = js.native
      def testIamPermissions(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
      def testIamPermissions(params: ParamsResourceV1beta1Testiampermissions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
      def testIamPermissions(
        params: ParamsResourceV1beta1Testiampermissions,
        callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
      ): Unit = js.native
      def testIamPermissions(
        params: ParamsResourceV1beta1Testiampermissions,
        options: BodyResponseCallback[SchemaTestIamPermissionsResponse],
        callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
      ): Unit = js.native
      def testIamPermissions(params: ParamsResourceV1beta1Testiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
      def testIamPermissions(
        params: ParamsResourceV1beta1Testiampermissions,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
      ): Unit = js.native
    }
    
    trait Options
      extends StObject
         with GlobalOptions {
      
      var version: v1beta1
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal(version = "v1beta1")
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setVersion(value: v1beta1): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      }
    }
    
    trait ParamsResourceV1beta1Getiampolicy
      extends StObject
         with StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
      
      /**
        * Request body metadata
        */
      var requestBody: js.UndefOr[SchemaGetIamPolicyRequest] = js.undefined
      
      /**
        * REQUIRED: The resource for which the policy is being requested. See the
        * operation documentation for the appropriate value for this field.
        */
      var resource: js.UndefOr[String] = js.undefined
    }
    object ParamsResourceV1beta1Getiampolicy {
      
      inline def apply(): ParamsResourceV1beta1Getiampolicy = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceV1beta1Getiampolicy]
      }
      
      extension [Self <: ParamsResourceV1beta1Getiampolicy](x: Self) {
        
        inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        inline def setRequestBody(value: SchemaGetIamPolicyRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
        
        inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
        
        inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
        
        inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      }
    }
    
    trait ParamsResourceV1beta1Setiampolicy
      extends StObject
         with StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
      
      /**
        * Request body metadata
        */
      var requestBody: js.UndefOr[SchemaSetIamPolicyRequest] = js.undefined
      
      /**
        * REQUIRED: The resource for which the policy is being specified. See the
        * operation documentation for the appropriate value for this field.
        */
      var resource: js.UndefOr[String] = js.undefined
    }
    object ParamsResourceV1beta1Setiampolicy {
      
      inline def apply(): ParamsResourceV1beta1Setiampolicy = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceV1beta1Setiampolicy]
      }
      
      extension [Self <: ParamsResourceV1beta1Setiampolicy](x: Self) {
        
        inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        inline def setRequestBody(value: SchemaSetIamPolicyRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
        
        inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
        
        inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
        
        inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      }
    }
    
    trait ParamsResourceV1beta1Testiampermissions
      extends StObject
         with StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
      
      /**
        * Request body metadata
        */
      var requestBody: js.UndefOr[SchemaTestIamPermissionsRequest] = js.undefined
      
      /**
        * REQUIRED: The resource for which the policy detail is being requested.
        * See the operation documentation for the appropriate value for this field.
        */
      var resource: js.UndefOr[String] = js.undefined
    }
    object ParamsResourceV1beta1Testiampermissions {
      
      inline def apply(): ParamsResourceV1beta1Testiampermissions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceV1beta1Testiampermissions]
      }
      
      extension [Self <: ParamsResourceV1beta1Testiampermissions](x: Self) {
        
        inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        inline def setRequestBody(value: SchemaTestIamPermissionsRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
        
        inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
        
        inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
        
        inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      }
    }
    
    /**
      * Associates `members` with a `role`.
      */
    trait SchemaBinding extends StObject {
      
      /**
        * The condition that is associated with this binding. NOTE: an unsatisfied
        * condition will not allow user access via current binding. Different
        * bindings, including their conditions, are examined independently.
        */
      var condition: js.UndefOr[SchemaExpr] = js.undefined
      
      /**
        * Specifies the identities requesting access for a Cloud Platform resource.
        * `members` can have the following values:  * `allUsers`: A special
        * identifier that represents anyone who is    on the internet; with or
        * without a Google account.  * `allAuthenticatedUsers`: A special
        * identifier that represents anyone    who is authenticated with a Google
        * account or a service account.  * `user:{emailid}`: An email address that
        * represents a specific Google    account. For example, `alice@gmail.com` .
        * * `serviceAccount:{emailid}`: An email address that represents a service
        * account. For example, `my-other-app@appspot.gserviceaccount.com`.  *
        * `group:{emailid}`: An email address that represents a Google group. For
        * example, `admins@example.com`.   * `domain:{domain}`: The G Suite domain
        * (primary) that represents all the    users of that domain. For example,
        * `google.com` or `example.com`.
        */
      var members: js.UndefOr[js.Array[String]] = js.undefined
      
      /**
        * Role that is assigned to `members`. For example, `roles/viewer`,
        * `roles/editor`, or `roles/owner`.
        */
      var role: js.UndefOr[String] = js.undefined
    }
    object SchemaBinding {
      
      inline def apply(): SchemaBinding = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaBinding]
      }
      
      extension [Self <: SchemaBinding](x: Self) {
        
        inline def setCondition(value: SchemaExpr): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
        
        inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
        
        inline def setMembers(value: js.Array[String]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
        
        inline def setMembersUndefined: Self = StObject.set(x, "members", js.undefined)
        
        inline def setMembersVarargs(value: String*): Self = StObject.set(x, "members", js.Array(value :_*))
        
        inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
        
        inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      }
    }
    
    /**
      * Represents an expression text. Example:      title: &quot;User account
      * presence&quot;     description: &quot;Determines whether the request has a
      * user account&quot;     expression: &quot;size(request.user) &gt; 0&quot;
      */
    trait SchemaExpr extends StObject {
      
      /**
        * An optional description of the expression. This is a longer text which
        * describes the expression, e.g. when hovered over it in a UI.
        */
      var description: js.UndefOr[String] = js.undefined
      
      /**
        * Textual representation of an expression in Common Expression Language
        * syntax.  The application context of the containing message determines
        * which well-known feature set of CEL is supported.
        */
      var expression: js.UndefOr[String] = js.undefined
      
      /**
        * An optional string indicating the location of the expression for error
        * reporting, e.g. a file name and a position in the file.
        */
      var location: js.UndefOr[String] = js.undefined
      
      /**
        * An optional title for the expression, i.e. a short string describing its
        * purpose. This can be used e.g. in UIs which allow to enter the
        * expression.
        */
      var title: js.UndefOr[String] = js.undefined
    }
    object SchemaExpr {
      
      inline def apply(): SchemaExpr = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaExpr]
      }
      
      extension [Self <: SchemaExpr](x: Self) {
        
        inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        inline def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
        
        inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
        
        inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
        
        inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    /**
      * Request message for `GetIamPolicy` method.
      */
    trait SchemaGetIamPolicyRequest extends StObject
    
    /**
      * Defines an Identity and Access Management (IAM) policy. It is used to
      * specify access control policies for Cloud Platform resources.   A `Policy`
      * consists of a list of `bindings`. A `binding` binds a list of `members` to
      * a `role`, where the members can be user accounts, Google groups, Google
      * domains, and service accounts. A `role` is a named list of permissions
      * defined by IAM.  **JSON Example**      {       &quot;bindings&quot;: [ {
      * &quot;role&quot;: &quot;roles/owner&quot;,           &quot;members&quot;: [
      * &quot;user:mike@example.com&quot;, &quot;group:admins@example.com&quot;,
      * &quot;domain:google.com&quot;,
      * &quot;serviceAccount:my-other-app@appspot.gserviceaccount.com&quot; ] }, {
      * &quot;role&quot;: &quot;roles/viewer&quot;,           &quot;members&quot;:
      * [&quot;user:sean@example.com&quot;]         }       ]     }  **YAML
      * Example**      bindings:     - members:       - user:mike@example.com -
      * group:admins@example.com       - domain:google.com       -
      * serviceAccount:my-other-app@appspot.gserviceaccount.com       role:
      * roles/owner     - members:       - user:sean@example.com       role:
      * roles/viewer   For a description of IAM and its features, see the [IAM
      * developer&#39;s guide](https://cloud.google.com/iam/docs).
      */
    trait SchemaPolicy extends StObject {
      
      /**
        * Associates a list of `members` to a `role`. `bindings` with no members
        * will result in an error.
        */
      var bindings: js.UndefOr[js.Array[SchemaBinding]] = js.undefined
      
      /**
        * `etag` is used for optimistic concurrency control as a way to help
        * prevent simultaneous updates of a policy from overwriting each other. It
        * is strongly suggested that systems make use of the `etag` in the
        * read-modify-write cycle to perform policy updates in order to avoid race
        * conditions: An `etag` is returned in the response to `getIamPolicy`, and
        * systems are expected to put that etag in the request to `setIamPolicy` to
        * ensure that their change will be applied to the same version of the
        * policy.  If no `etag` is provided in the call to `setIamPolicy`, then the
        * existing policy is overwritten blindly.
        */
      var etag: js.UndefOr[String] = js.undefined
      
      /**
        * Deprecated.
        */
      var version: js.UndefOr[Double] = js.undefined
    }
    object SchemaPolicy {
      
      inline def apply(): SchemaPolicy = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaPolicy]
      }
      
      extension [Self <: SchemaPolicy](x: Self) {
        
        inline def setBindings(value: js.Array[SchemaBinding]): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
        
        inline def setBindingsUndefined: Self = StObject.set(x, "bindings", js.undefined)
        
        inline def setBindingsVarargs(value: SchemaBinding*): Self = StObject.set(x, "bindings", js.Array(value :_*))
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
        
        inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      }
    }
    
    /**
      * Request message for `SetIamPolicy` method.
      */
    trait SchemaSetIamPolicyRequest extends StObject {
      
      /**
        * REQUIRED: The complete policy to be applied to the `resource`. The size
        * of the policy is limited to a few 10s of KB. An empty policy is a valid
        * policy but certain Cloud Platform services (such as Projects) might
        * reject them.
        */
      var policy: js.UndefOr[SchemaPolicy] = js.undefined
    }
    object SchemaSetIamPolicyRequest {
      
      inline def apply(): SchemaSetIamPolicyRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaSetIamPolicyRequest]
      }
      
      extension [Self <: SchemaSetIamPolicyRequest](x: Self) {
        
        inline def setPolicy(value: SchemaPolicy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
        
        inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
      }
    }
    
    /**
      * Request message for `TestIamPermissions` method.
      */
    trait SchemaTestIamPermissionsRequest extends StObject {
      
      /**
        * The set of permissions to check for the `resource`. Permissions with
        * wildcards (such as &#39;*&#39; or &#39;storage.*&#39;) are not allowed.
        * For more information see [IAM
        * Overview](https://cloud.google.com/iam/docs/overview#permissions).
        */
      var permissions: js.UndefOr[js.Array[String]] = js.undefined
    }
    object SchemaTestIamPermissionsRequest {
      
      inline def apply(): SchemaTestIamPermissionsRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaTestIamPermissionsRequest]
      }
      
      extension [Self <: SchemaTestIamPermissionsRequest](x: Self) {
        
        inline def setPermissions(value: js.Array[String]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
        
        inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
        
        inline def setPermissionsVarargs(value: String*): Self = StObject.set(x, "permissions", js.Array(value :_*))
      }
    }
    
    /**
      * Response message for `TestIamPermissions` method.
      */
    trait SchemaTestIamPermissionsResponse extends StObject {
      
      /**
        * A subset of `TestPermissionsRequest.permissions` that the caller is
        * allowed.
        */
      var permissions: js.UndefOr[js.Array[String]] = js.undefined
    }
    object SchemaTestIamPermissionsResponse {
      
      inline def apply(): SchemaTestIamPermissionsResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaTestIamPermissionsResponse]
      }
      
      extension [Self <: SchemaTestIamPermissionsResponse](x: Self) {
        
        inline def setPermissions(value: js.Array[String]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
        
        inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
        
        inline def setPermissionsVarargs(value: String*): Self = StObject.set(x, "permissions", js.Array(value :_*))
      }
    }
    
    trait StandardParameters extends StObject {
      
      /**
        * V1 error format.
        */
      @JSName("$.xgafv")
      var $Dotxgafv: js.UndefOr[String] = js.undefined
      
      /**
        * OAuth access token.
        */
      var access_token: js.UndefOr[String] = js.undefined
      
      /**
        * Data format for response.
        */
      var alt: js.UndefOr[String] = js.undefined
      
      /**
        * JSONP
        */
      var callback: js.UndefOr[String] = js.undefined
      
      /**
        * Selector specifying which fields to include in a partial response.
        */
      var fields: js.UndefOr[String] = js.undefined
      
      /**
        * API key. Your API key identifies your project and provides you with API
        * access, quota, and reports. Required unless you provide an OAuth 2.0
        * token.
        */
      var key: js.UndefOr[String] = js.undefined
      
      /**
        * OAuth 2.0 token for the current user.
        */
      var oauth_token: js.UndefOr[String] = js.undefined
      
      /**
        * Returns response with indentations and line breaks.
        */
      var prettyPrint: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Available to use for quota purposes for server-side applications. Can be
        * any arbitrary string assigned to a user, but should not exceed 40
        * characters.
        */
      var quotaUser: js.UndefOr[String] = js.undefined
      
      /**
        * Legacy upload protocol for media (e.g. "media", "multipart").
        */
      var uploadType: js.UndefOr[String] = js.undefined
      
      /**
        * Upload protocol for media (e.g. "raw", "multipart").
        */
      var upload_protocol: js.UndefOr[String] = js.undefined
    }
    object StandardParameters {
      
      inline def apply(): StandardParameters = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[StandardParameters]
      }
      
      extension [Self <: StandardParameters](x: Self) {
        
        inline def set$Dotxgafv(value: String): Self = StObject.set(x, "$.xgafv", value.asInstanceOf[js.Any])
        
        inline def set$DotxgafvUndefined: Self = StObject.set(x, "$.xgafv", js.undefined)
        
        inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
        
        inline def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
        
        inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
        
        inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
        
        inline def setCallback(value: String): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
        
        inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
        
        inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
        
        inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
        
        inline def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
        
        inline def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
        
        inline def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
        
        inline def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
        
        inline def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
        
        inline def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
        
        inline def setUploadType(value: String): Self = StObject.set(x, "uploadType", value.asInstanceOf[js.Any])
        
        inline def setUploadTypeUndefined: Self = StObject.set(x, "uploadType", js.undefined)
        
        inline def setUpload_protocol(value: String): Self = StObject.set(x, "upload_protocol", value.asInstanceOf[js.Any])
        
        inline def setUpload_protocolUndefined: Self = StObject.set(x, "upload_protocol", js.undefined)
      }
    }
  }
}
